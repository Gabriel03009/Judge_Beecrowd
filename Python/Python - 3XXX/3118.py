# https://www.beecrowd.com.br/judge/pt/problems/view/3118

import re

def duplicateBacteria(bacteria, rule):
    separed = re.findall(r"A+|B+", bacteria)
    newSepared = []
    for i in separed:
        if i in rule:
            newSepared.append(rule[i])
        else:
            newSepared.append(i)
    newBacteria = "".join(newSepared)
    return newBacteria


seconds, rules = map(int, input().split())
rule = {}
for i in range(rules):
    key, value = input().split()
    rule[key] = value

bacteria = "A"
for i in range(seconds):
    bacteria = duplicateBacteria(bacteria, rule)

print(bacteria.count("A"), bacteria.count("B"))