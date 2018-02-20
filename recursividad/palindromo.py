def palindromo(n):
    if n < 10:
        return True
    if n%10 == n//10:
        return True
    else:
        return True == palindromo(n//10) 

def longNum(n):
    if(n == 0):
        return 0;
    if(n < 10):
        return 1;
    else:
        return 1 + longNum(n//10)
