class Error(Exception):
    pass
class MyExcept(Error):
    pass
string=input("Введите не пустую строку"+'\n')
try:
    if len(string)==0:
        raise MyExcept
except MyExcept:
    print("нельзя вводить пустую строку")
