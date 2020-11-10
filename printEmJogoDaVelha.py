def montar(entrada1, entrada2):
    num = ""
    for x in range(entrada2-1):
        if x == entrada1-1:
            num += "#"
        else:
            num += " "
    num += "#"
    print(num)


def desce(a, b):
    if a == 1 and b == 1:
        return montar(a, b)
    elif a > 1:
        return montar(a, b), desce(a-1, b+1)
    else:
        return montar(a, b), sobe(a+1, b-1)


def sobe(a, b):
    if b == a:
        return montar(a, b)
    else:
        return montar(a, b), sobe(a+1, b-1)


entrada = int(input())

desce(entrada, entrada)
