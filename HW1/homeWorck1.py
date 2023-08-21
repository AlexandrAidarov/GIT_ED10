
import random


def func1(arr, arr_len, i):
    root_index = i
    first_index = i * 2 + 1
    second_index = i * 2 + 2

    if first_index < arr_len and arr[root_index] < arr[first_index]:
        root_index = first_index

    if second_index < arr_len and arr[root_index] < arr[second_index]:
        root_index = second_index

    if root_index != i:
        arr[i], arr[root_index] = arr[root_index], arr[i]
        func1(arr, arr_len, root_index)


def heap_sort(arr):
    arr_len = len(arr)
    point_of_sift = arr_len // 2 - 1
    for i in range(point_of_sift, -1, -1):
        func1(arr, arr_len, i)

    for i in range(arr_len - 1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]
        func1(arr, i, 0)


print(list_randint := [random.randint(-100, 100) for _ in range(31)])
heap_sort(list_randint)
print(list_randint)