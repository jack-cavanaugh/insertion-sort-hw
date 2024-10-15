import numpy
import time

start_time = time.time()

def insertionSort(arr):
    for i in range (1, len(arr)):
        temp = arr[i]
        j = i - 1
        while arr[j] > temp:
            arr[j+1] = arr[j]
            if j == 0:
                arr[j] = temp
            else:
                arr[j] = temp
                j = j - 1

myarr = numpy.full(10000,0)

count = len(myarr)
for index in range(len(myarr)):
    myarr[index] = count
    count -= 1

insertionSort(myarr)

end_time = time.time()
elapsed_time = end_time - start_time
print(f"{elapsed_time} seconds for Python")