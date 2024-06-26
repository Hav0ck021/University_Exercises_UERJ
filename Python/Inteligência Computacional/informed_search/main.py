import heapq
from app.search import *
from collections import deque

def is_valid_move(x, y, p, map):
    if 0 <= x < len(map) and 0 <= y < len(map[0]) and 0 <= p < len(map[0][0]) and map[x][y][p] == 1:
        return True
    return False

def get_neighbors(node, map):
    neighbors = []
    moves = [(1, 0), (-1, 0), (0, 1), (0, -1)]
    for move in moves:
        new_x = node.position[0] + move[0]
        new_y = node.position[1] + move[1]
        new_p = node.position[2]
        if is_valid_move(new_x, new_y, new_p, map) and map[new_x][new_y][new_p] == 1:
            neighbors.append((new_x, new_y, new_p))
    return neighbors

def heuristic(position, goal):
    return abs(position[0] - goal[0]) + abs(position[1] - goal[1])

graph = {
    (1,1,0): [(1,2,2),(3,1,1)],
    (3,1,1): [(3,2,1),(1,1,0)],
    (3,2,1): [(3,3,1),(1,2,0),(3,1,1)],        
    (1,2,0): [(1,3,2),(1,0,2),(3,2,1)],        
    (1,0,2): [(1,2,0),(0,0,2),(2,0,2)],        
    (2,0,2): [(2,2,0),(1,0,2)],
    (2,2,0): [(2,3,2),(1,2,1),(2,0,2)],        
    (1,2,1): [(1,1,1),(2,2,0)],
    (1,1,1): [(1,2,1),(1,0,1),(2,1,0)],        
    (2,1,0): [(2,2,2),(1,1,1)],
    (2,2,2): [(2,4,0),(1,2,2),(2,1,0),(3,2,2)],
    (3,2,2): [(3,4,0),(2,2,2),(3,1,0)],        
    (3,1,0): [(3,2,2),(2,1,1)],
    (2,1,1): [(2,2,1),(0,1,0),(2,0,1),(3,1,0)],
    (2,0,1): [(2,1,1),(0,0,0)],
    (0,0,0): [(0,1,2),(2,0,1)],
    (0,1,2): [(0,0,0),(1,1,2)],
    (1,1,2): [(1,3,0),(0,1,2),(1,0,0),(2,1,2)],
    (2,1,2): [(2,3,0),(1,1,2),(2,0,0),(3,1,2)],
    (3,1,2): [(3,3,0),(2,1,2)],
    (3,3,0): [(3,4,2),(2,3,1),(3,1,2)],
    (2,3,1): [(2,4,1),(2,2,1),(3,3,0)],
    (2,2,1): [(2,3,1),(0,2,0),(2,1,1),(3,2,0)],
    (3,2,0): [(3,3,2),(2,2,1)],
    (3,3,2): [(3,5,0),(2,3,2),(3,2,0)],
    (2,3,2): [(2,5,0),(1,3,2),(2,2,0),(3,3,2)],
    (1,3,2): [(1,5,0),(1,2,0),(2,3,2)],
    (1,5,0): [(1,3,2),(3,5,1)],
    (3,5,1): [(3,6,1),(1,5,0),(3,4,1),(4,5,0)],
    (4,5,0): [(4,6,2),(3,5,1)],
    (4,6,2): [(4,8,0),(3,6,2),(4,5,0),(5,6,2)],
    (5,6,2): [(5,8,0),(4,6,2)],
    (5,8,0): [(4,8,1),(5,6,2)],
    (4,8,1): [(4,9,1),(2,8,0),(4,7,1),(5,8,0)],
    (4,7,1): [(4,8,1),(2,7,0),(4,6,1),(5,7,0)],
    (5,7,0): [(4,7,1)],
    (4,6,1): [(4,7,1),(2,6,0),(4,5,1),(5,6,0)],
    (5,6,0): [(5,7,2),(4,6,1)],
    (5,7,2): [(4,7,2),(5,6,0)],
    (4,7,2): [(4,9,0),(3,7,2),(4,6,0),(5,7,2)],
    (4,6,0): [(4,7,2),(3,6,1)],
    (3,6,1): [(3,7,1),(3,5,1),(4,6,0)],
    (3,7,1): [(3,8,1),(3,6,1),(4,7,0)],
    (4,7,0): [(4,8,2),(3,7,1),(4,5,2)],
    (4,5,2): [(4,7,0),(3,5,2)],
    (3,5,2): [(3,7,0),(2,5,2),(3,4,0),(4,5,2)],
    (3,4,0): [(3,5,2),(2,4,1),(3,2,2)],
    (2,4,1): [(2,5,1),(2,3,1),(3,4,0)],
    (2,5,1): [(2,4,1),(3,5,0)],
    (3,5,0): [(3,6,2),(2,5,1),(3,3,2)],
    (3,6,2): [(3,8,0),(2,6,2),(3,5,0),(4,6,2)],
    (2,6,2): [(2,8,0),(2,5,0),(3,6,2)],
    (2,5,0): [(2,6,2),(2,3,2),(4,5,1)],
    (4,5,1): [(4,6,1),(2,5,0)],
    (2,8,0): [(2,6,2),(4,8,1)],
    (3,8,0): [(3,6,2),(5,8,1)],
    (5,8,1): [(3,8,0),(5,7,1)],
    (5,7,1): [(5,8,1),(3,7,0),(5,6,1)],
    (5,6,1): [(5,7,1),(3,6,0)],
    (3,6,0): [(3,7,2),(3,4,2),(5,6,1)],
    (3,4,2): [(3,6,0),(2,4,2),(3,3,0)],
    (2,4,2): [(2,6,0),(1,4,2),(2,3,0),(3,4,2)],
    (2,3,0): [(2,4,2),(2,1,2)],
    (1,4,2): [(1,3,0),(2,4,2)],
    (1,3,0): [(1,4,2),(1,1,2),(3,3,1)],
    (3,3,1): [(3,4,1),(1,3,0),(3,2,1)],
    (3,4,1): [(3,5,1),(1,4,0),(3,3,1)],
    (1,4,0): [(1,2,2),(3,4,1)],
    (1,2,2): [(1,4,0),(1,1,0),(2,2,2)],
    (2,6,0): [(2,7,2),(2,4,2),(4,6,1)],
    (2,7,2): [(2,6,0),(3,7,2)],
    (3,7,2): [(3,9,0),(2,7,2),(3,6,0),(4,7,2)],
    (3,9,0): [(3,7,2)],
    (3,7,0): [(3,8,2),(3,5,2),(5,7,1)],
    (3,8,2): [(3,7,0),(4,8,2)],
    (4,8,2): [(3,8,2),(4,7,0)],
    (2,5,2): [(2,7,0),(2,4,0),(3,5,2)],
    (2,4,0): [(2,5,2),(2,2,2)],
    (2,7,0): [(2,5,2),(4,7,1)],
    (3,8,1): [(3,7,1),(4,8,0)],
    (4,8,0): [(3,8,1),(4,6,2)],
    (4,9,0): [(4,7,2)],
    (4,9,1): [(4,8,1)],
    (0,2,0): [(0,0,2),(2,2,1)],
    (0,0,2): [(0,2,0),(1,0,2)],
    (2,0,0): [(2,1,2),(1,0,1)],
    (1,0,1): [(1,1,1),(2,0,0)],
    (1,0,0): [(1,1,2)],
    (0,1,0): [(2,1,1)]
}

start = (1,1,0)
goal = (4,7,0)

problema = Problem(start, goal, graph)

result_astar = astar_search(problema, problema.h)
result_best_first = best_first_graph_search(problema, problema.h)

print("Estado final -> ", goal)
print("Solução em A* -> ", result_astar)

print("\nEstado final -> ", goal)
print("Solução em Busca Gulosa -> ", result_best_first)