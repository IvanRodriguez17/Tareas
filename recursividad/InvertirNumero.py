def invertir(n):
    if longNum(n) == 1:
        return n
    else:
        return (n % 10) * 10 ** (longNum(n) - 1) + invertir(n // 10)

def longNum(n):
    if(n == 0):
        return 0;
    if(n < 10):
        return 1;
    else:
        return 1 + longNum(n//10)
