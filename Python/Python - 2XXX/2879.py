# https://www.beecrowd.com.br/judge/pt/problems/view/2879

games = int(input())
win = 0
for i in range(games):
    carDoor = int(input())
    if carDoor == 1:
        win += 0
    else:
        win += 1
print(win)