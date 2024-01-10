def fibonacci (number):
    if number <= 1:
        return number
    else:
        return fibonacci(number - 1) + fibonacci(number - 2)

nterms = int(input("Enter the number: "))

if nterms <= 0:
    print("Enter positive number: ")
else:
    print("Fibonacci sequence is: ")
    for i in range(nterms):
        print(fibonacci(i))