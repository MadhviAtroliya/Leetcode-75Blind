def findelement(n: int) -> int:
    count = 0
    for i in range(32):
        if ((n>>i)&1) == 1:
            count+=1
    return count

print(findelement(11))