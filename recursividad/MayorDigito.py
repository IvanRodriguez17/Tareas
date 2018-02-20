def mayor(n):
    if n < 10:
        return n
    else :
        if n%10 > (n//10)%10:
            return mayor(arreglo(n//10, n%10))
        else :
            return mayor(arreglo(n//10, (n//10)%10))
                                 
def arreglo(n, m):
    return (n-n%10)+m
