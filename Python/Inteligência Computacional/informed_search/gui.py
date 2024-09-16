import tkinter as tk
import tkinter.messagebox as messagebox
from main import Problem, graph
from app.search import astar_search, best_first_graph_search

# Definindo as variáveis start, goal e graph
start = (1, 1, 0)
goal = (4, 7, 0)
problema = Problem(start, goal, graph)

class App:
    def __init__(self, root):
        self.root = root
        self.root.title("Busca Informada para o jogo Bloxorz")
        self.root.geometry("800x600")

        self.canvas = tk.Canvas(self.root, width=800, height=600, bg="white")
        self.canvas.pack()

        self.map = [[1, 1, 1, 0, 0, 0, 0, 0, 0, 0],
                    [1, 1, 1, 1, 1, 1, 0, 0, 0, 0],
                    [1, 1, 1, 1, 1, 1, 1, 1, 1, 0],
                    [0, 1, 1, 1, 1, 1, 1, 1, 1, 1],
                    [0, 0, 0, 0, 0, 1, 1, 1, 1, 1],
                    [0, 0, 0, 0, 0, 0, 1, 1, 1, 0]]

        self.cell_width = 40
        self.cell_height = 40

        self.draw_map()

        # Adicionando objeto azul e objetivo final vermelho ao desenho do mapa
        self.draw_map_objects()

        self.button_frame = tk.Frame(self.root)
        self.button_frame.pack()

        self.astar_button = tk.Button(self.button_frame, text="Executar A*", command=self.run_astar)
        self.astar_button.pack(side=tk.LEFT, padx=10, pady=10)

        self.best_first_button = tk.Button(self.button_frame, text="Executar Busca Gulosa", command=self.run_best_first)
        self.best_first_button.pack(side=tk.LEFT, padx=10, pady=10)

    def draw_map(self):
        # Calculando o centro do mapa
        map_center_x = (len(self.map[0]) * self.cell_width) / 2
        map_center_y = (len(self.map) * self.cell_height) / 2

        for y in range(len(self.map)):
            for x in range(len(self.map[y])):
                if self.map[y][x] == 1:
                    # Desenhar quadrado preto
                    self.canvas.create_rectangle(x * self.cell_width, y * self.cell_height,
                                                (x + 1) * self.cell_width, (y + 1) * self.cell_height,
                                                fill="black")

        # Movendo o mapa para o centro da tela
        self.canvas.move("all", 400 - map_center_x, 300 - map_center_y)

    def draw_map_objects(self):
        # Desenhando o objetivo final em vermelho na coordenada (4, 7)
        self.canvas.create_rectangle(4 * self.cell_width, 7 * self.cell_height, (4 + 1) * self.cell_width, (7 + 1) * self.cell_height, fill="red")

        # Desenhando o objeto em azul na coordenada (1, 1)
        self.canvas.create_oval(1 * self.cell_width + 10, 1 * self.cell_height + 10, (1 + 1) * self.cell_width - 10, (1 + 1) * self.cell_height - 10, fill="blue", tags="object")

    def run_astar(self):
        result_astar = astar_search(problema, problema.h)
        self.display_result(result_astar, "A*")

    def run_best_first(self):
        result_best_first = best_first_graph_search(problema, problema.h)
        self.display_result(result_best_first, "Busca Gulosa")

    def display_result(self, result, search_name):
        if result is not None:
            messagebox.showinfo("Resultado", f"Encontrou uma solução usando {search_name}")
            self.animate_solution(result.solution())
        else:
            messagebox.showinfo("Resultado", f"Não encontrou uma solução usando {search_name}")

    def animate_solution(self, solution):
        for move in solution:
            self.move_object(move[0], move[1], move[2])
            self.root.update_idletasks()
            self.root.after(500)

    def move_object(self, x, y, o):
        self.canvas.delete("object")
        # Calcular coordenadas do centro do retângulo
        center_x = x * self.cell_width + self.cell_width / 2
        center_y = y * self.cell_height + self.cell_height / 2

        # Desenhar objeto em movimento (círculo azul)
        self.canvas.create_oval(center_x - 20, center_y - 20, center_x + 20, center_y + 20, fill="blue", tags="object")

root = tk.Tk()
app = App(root)
root.mainloop()
