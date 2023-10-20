t = int(input())

for _ in range(t):
    n, k = map(int, input().split())
    a = list(map(int, input().split()))
    
    happy = False
    total = sum(a)
    
    if total >= n and k > 0:
        happy = True
    
    elif total >= n and k == 0:
        if total % n == 0:
            happy = True
    
    if happy:
        print("YES")
    else:
        print("NO")
