import random

list1 = [5]*10
list1 += [3]*10
list1 += [1]*10
list1 += [random.randint(0, 10)for _ in range(20)]

print(' '.join([f'{el:04b}' for el in list1]))
