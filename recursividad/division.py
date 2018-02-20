def dividir(dividendo, divisor):
    if(divisor == 0):
        return "no puede dividir por 0"
    elif(dividendo < divisor):
        return 0
    elif(dividendo >= divisor):
        return 1 + dividir(dividendo - divisor, divisor)
    return dividendo
