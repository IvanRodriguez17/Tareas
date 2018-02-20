def poten(base, exp):
    if(exp == 0):
        return 1
    else:
        return base * poten(base, exp - 1)
