def longNum(n):
    if(n == 0):
        return 0;
    if(n < 10):
        return 1;
    else:
        return 1 + longNum(n//10)
