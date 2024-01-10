def calculate_sum (numbers):
    sum = 0
    for number in numbers:
        sum += number
    return sum

numList = [10, 30, 20, 50]

result = calculate_sum(numList)

print("sum of all element is:" + str(result))
