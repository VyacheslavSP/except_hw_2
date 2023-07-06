string=input("введите дробфывное число"+'\n')
while True:
    try:
        answer=float(string)
        break
    except(ValueError):
        string=input("Введено не число. введите дробное число"+'\n')