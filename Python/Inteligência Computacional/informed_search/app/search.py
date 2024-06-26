import math
from app.utils import *

class Problem: 
    def __init__(self, initial, goal=None, graph=None):
        self.initial = initial
        self.goal = goal
        self.graph = graph

    def actions(self, state):
        return self.graph[state]
    
    def result(self, state, action):
        return action 
    
    def goal_test(self, state):
        if isinstance(self.goal, list):
            return is_in(state, self.goal)
        else:
            return state == self.goal
        
    def path_cost(self, c, state1, action, state2):
        return c + 1

    def value(self, state):
        raise NotImplementedError

    """
    Heurística euclidiana -> a heurística em questão se baseia na 
    distância entre a posição atual do bloco e a posição final do bloco,
    de modo que a heurística é calculada pela raiz quadrada da soma dos
    quadrados das diferenças entre a posição inicial (x1, y1) e posição 
    final (x2, y2) do bloco. 
    """
    
    def h(state, goal):
        x1, y1, o1 = state
        x2, y2, o2 = goal
        distancia_posicao = math.sqrt(abs((x1 - x2) ** 2) + abs((y1 - y2) ** 2))
        distancia_orientacao = abs(o1 - o2)
        return distancia_posicao + distancia_orientacao
   
    
class Node:
    def __init__(self, state, parent=None, action=None, path_cost=0, g=0, h=0):
        self.state = state
        self.position = state  # assumindo que 'state' e 'position' são a mesma coisa
        self.parent = parent
        self.action = action
        self.path_cost = path_cost
        self.g = g
        self.h = h
        self.f = g + h
        if parent:
            self.path_cost = parent.path_cost + path_cost

    def __repr__(self):
        return "<Node {}>".format(self.state)

    def __lt__(self, node):
        return self.f < node.f

    def expand(self, problem):
        return [self.child_node(problem, action)
                for action in problem.actions(self.state)]

    def child_node(self, problem, action):
        next_state = problem.result(self.state, action)
        next_node = Node(next_state, self, action, g=self.g, h=self.h)
        return next_node

    def solution(self):
        return [node.action for node in self.path()[1:]]

    def path(self):
        node, path_back = self, []
        while node:
            path_back.append(node)
            node = node.parent
        return list(reversed(path_back))

    def __eq__(self, other):
        return isinstance(other, Node) and self.state == other.state

    def __hash__(self):
        return hash(self.state)

# Retorna a sequência de ações que são iniciadas a partir da raiz (estado inicial) até o nó (estado final).
def solution(node):
    if isinstance(node, list):
        return node
    path_back = []
    while node:
        path_back.append(node.state)
        node = node.parent
    return list(reversed(path_back))

# f(n) = h(n).

def best_first_graph_search(problem, f, display=False):
    f = memoize(f, 'f')
    node = Node(problem.initial)
    frontier = PriorityQueue('min', f)
    frontier.append(node)
    explored = set()
    while frontier:
        node = frontier.pop()
        if problem.goal_test(node.state):
            if display:
                print(len(explored), "paths have been expanded and", len(frontier), "paths remain in the frontier")
            return solution(node)
        explored.add(tuple(node.state))
        for child in node.expand(problem):
            if child.state not in explored and child not in frontier:
                frontier.append(child)
            elif child in frontier:
                if f(child) < frontier[child]:
                    del frontier[child]
                    frontier.append(child)
    return None

# f(n) = g(n) + h(n)

def astar_search(problem, h=None, display=False):
    h = memoize(h or problem.h, 'h')
    node = best_first_graph_search(problem, lambda n: n.path_cost + h(n.state, problem.goal), display)
    return solution(node) if node is not None else None
    

def recursive_best_first_search(problem, h=None):
    h = memoize(h or problem.h, 'h')

    def RBFS(problem, node, flimit):
        if problem.goal_test(node.state):
            return node, 0  # (The second value is immaterial)
        successors = node.expand(problem)
        if len(successors) == 0:
            return None, np.inf
        for s in successors:
            s.f = max(s.path_cost + h(s), node.f)
        while True:
            # Order by lowest f value
            successors.sort(key=lambda x: x.f)
            best = successors[0]
            if best.f > flimit:
                return None, best.f
            if len(successors) > 1:
                alternative = successors[1].f
            else:
                alternative = np.inf
            result, best.f = RBFS(problem, best, min(flimit, alternative))
            if result is not None:
                return result, best.f

    node = Node(problem.initial)
    node.f = h(node)
    result, _ = RBFS(problem, node, np.inf)
    return result

greedy_best_first_graph_search = best_first_graph_search