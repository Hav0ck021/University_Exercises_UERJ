from asyncio import sleep
import tkinter as tk
from search import *

grafo = { 
    (0,0):[(4,0),(0,3)],
    (4,0):[(0,0),(1,3),(4,3)],
    (0,3):[(0,0),(3,0),(4,3)],
    (1,3):[(4,0),(0,3),(1,0),(4,3)],
    (4,3):[(0,3),(4,0)],
    (3,0):[(3,3),(0,3),(0,0)],
    (1,0):[(0,1),(4,0),(1,3),(0,0)],
    (3,3):[(4,2),(4,3),(0,3),(3,0)],
    (0,1):[(1,0),(4,1),(0,3),(0,0)],
    (4,2):[(4,3),(3,3),(0,2),(4,0)],
    (4,1):[(2,3),(0,1),(4,0)],
    (0,2):[(2,0),(4,2),(0,3),(0,0)],
    (2,3):[(4,1),(0,3),(2,0)],
    (2,0):[(4,0),(0,2),(2,3),(0,0)]
}

class InterfaceProblemaAgua:
    def __init__(self, raiz):
        self.raiz = raiz
        self.raiz.title("Recipientes com Água (4, 3)")
        self.primeiro_recipiente = 0
        self.segundo_recipiente = 0
        self.solucao = []
        
        # Variáveis para representar o estado dos recipientes
        self.recipiente_4_estado = 0  # Estado inicial do recipiente de 4 litros
        self.recipiente_3_estado = 0  # Estado inicial do recipiente de 3 litros
        
        # Criando o canvas para desenhar as garrafas
        self.canvas = tk.Canvas(raiz, width=500, height=250, bg='lightgreen')
        self.canvas.grid(row=2, column=0, columnspan=2)
        
        self.text_label = tk.Label(raiz,font=('Arial', 12 ), text="  Estado Inicial = (0, 0)                   Estado Final = (2,0) ou (2,3) ", fg="black")
        self.text_label.grid(row = 1, column=0, columnspan=2)

        self.text_labell = tk.Label(raiz,font=('Arial', 12 ), text =  '', fg="black")
        self.text_labell.grid(row = 3, column=0, columnspan=2)

     
        # Desenhar as garrafas
        self.montar_recipiente(170, 50, 60, 200, self.recipiente_4_estado)
        self.montar_recipiente(270, 100, 60, 150, self.recipiente_3_estado)
        
        # Botões para soluções com busca em largura e profundidade
        self.bfs_botao_resolucao = tk.Button(raiz,font=('Arial', 10 ,'bold'), text="Solução Busca em largura", command=self.resolver_bfs)
        self.bfs_botao_resolucao.grid(row=4, column=0)

        self.bfs_botao_resolucao = tk.Button(raiz,font=('Arial', 10 ,'bold'), text="Solução Profundidade interativa", command=self.resolver_ids)
        self.bfs_botao_resolucao.grid(row=6, column=0)

        self.dfs_botao_resolucao = tk.Button(raiz, font=('Arial', 10 ,'bold'),text="Solução Busca em profundidade", command=self.resolver_dfs)
        self.dfs_botao_resolucao.grid(row=6, column=1)

        self.dfs_botao_resolucao = tk.Button(raiz,font=('Arial', 10 ,'bold'), text="Solução  Profundidade limitada", command=self.resolver_dls)
        self.dfs_botao_resolucao.grid(row=4, column=1)
        
        # Botão para executar a solução
        self.botao_executar_solucao = tk.Button(raiz,font=('Arial', 10 ,'bold'), text="Executar Solução", command=self.executar_solucao)
        self.botao_executar_solucao.grid(row=5, column=0, columnspan=2)
        
        # Resultado da solução
        self.solution = []  # Lista vazia para armazenar a solução
        
    def encher_primeiro_recipiente(self, qtd):
        self.primeiro_recipiente = qtd
        if (self.primeiro_recipiente <= 4):
            self.inserir_agua_no_primeiro_recipiente()
        
    def encher_segundo_recipiente(self, qtd):
        self.segundo_recipiente = qtd
        if (self.segundo_recipiente <= 3):
            self.inserir_agua_no_segundo_recipiente()
        
    def montar_recipiente(self, x, y, width, height, water_level):
        self.canvas.create_rectangle(x, y, x + width, y + height, fill="white", outline="black")
        for i in range(water_level):
            self.canvas.create_rectangle(x + 5, y + height - (i + 1) * 20 - i * 2, x + width - 5, y + height - i * 20 - i * 2, fill="blue", outline="")
    
    def inserir_agua_no_primeiro_recipiente(self):
        self.recipiente_4_estado = self.primeiro_recipiente
        self.canvas.delete("jug_4")
        self.montar_recipiente(170, 50, 60, 200, self.recipiente_4_estado)
    
    def inserir_agua_no_segundo_recipiente(self):
        self.recipiente_3_estado = self.segundo_recipiente
        self.canvas.delete("jug_3")
        self.montar_recipiente(270, 100, 60, 150, self.recipiente_3_estado)
    
    def esvaziar_primeiro_recipiente(self):
        self.primeiro_recipiente = 0
        self.recipiente_4_estado = 0
        self.canvas.delete("jug_4")
        self.montar_recipiente(170, 50, 60, 200, self.recipiente_4_estado)
    
    def esvaziar_segundo_recipiente(self):
        self.segundo_recipiente = 0
        self.recipiente_3_estado = 0
        self.canvas.delete("jug_3")
        self.montar_recipiente(270, 100, 60, 150, self.recipiente_3_estado)
    

    def resolver_bfs(self):
        initial_state = (0, 0)
        final_state = [(2,0),(2,3)]
        problem = Problem(initial_state, final_state, grafo)
        resultado, _ = breadth_first_graph_search(problem)
        self.solucao = resultado.solution()
        self.text_labell.config(text=resultado.solution())

    def resolver_ids(self):
        initial_state = (0, 0)
        final_state = [(2,0),(2,3)]
        problem = Problem(initial_state, final_state, grafo)
        resultado = iterative_deepening_search(problem)
        self.solucao = resultado.solution()
        self.text_labell.config(text=resultado.solution())

    def resolver_dls(self):
        initial_state = (0, 0)
        final_state = [(2,0),(2,3)]
        problem = Problem(initial_state, final_state, grafo)
        resultado = depth_limited_search(problem,10)
        self.solucao = resultado.solution()
        self.text_labell.config(text=resultado.solution())

    def resolver_dfs(self):
        initial_state = (0, 0)
        final_state = [(2,0),(2,3)]
        problem = Problem(initial_state, final_state, grafo)
        resultado, _ = depth_first_graph_search(problem)
        self.solucao = resultado.solution()    
        self.text_labell.config(text=resultado.solution())
            
    def executar_solucao(self):
         for i in range(len(self.solucao)):
            tupla = self.solucao[i]
            self.esvaziar_primeiro_recipiente()
            self.raiz.update()  
            self.esvaziar_segundo_recipiente()
            self.raiz.update()  
            self.encher_primeiro_recipiente(tupla[0])
            self.raiz.update()  
            self.encher_segundo_recipiente(tupla[1])
            self.raiz.update()  
            self.raiz.after(1000)

raiz = tk.Tk()
app = InterfaceProblemaAgua(raiz)
raiz.mainloop()