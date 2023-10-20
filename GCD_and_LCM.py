from math import *
t = int(input())
for _ in range(t):
    x,y,k = list(map(int,input().split()))
    for i in range(k):
        g = gcd(x,y)
        if (x,y)==(min(x,y),g):
            break
        x,y = min(x,y),g
    print(x+y)
