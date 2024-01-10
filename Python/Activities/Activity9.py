numList1 = [10, 21, 30, 40, 55, 65]
numList2 = [11, 20, 33, 50, 67, 89]
print("first list is ", numList1)
print("second list is ", numList2)

numList3 = []

for num in numList1:
    if num % 2 != 0:
        numList3.append(num)

for num in numList2:
    if num % 2 != 0:
        numList3.append(num)

print("resulted third list is", numList3)