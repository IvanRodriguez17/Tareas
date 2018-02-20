def sumaDig(n):
    if(n == 0):
        return 0;
    if(n < 10):
        return n;
    else:
        return n%10 + sumaDig(n//10)
