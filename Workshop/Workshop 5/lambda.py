def square(number):
    return number**2

lista = [1, 3, 4, 5, 6, 9]

list1 = list(map(lambda number:number**2, lista))
print(list1)