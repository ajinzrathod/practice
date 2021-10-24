def binarySearch(arr, numberToSearch):
    low = 0
    high = len(arr) - 1

    while(low <= high):
        mid = (high + low) // 2
        if numberToSearch == arr[mid]:
            return mid
        elif numberToSearch > arr[mid]:
            low = mid + 1
        else:
            high = mid - 1
    return -1

if __name__ == '__main__':
    arr = [10, 20, 30, 40, 50]
    numberToSearch = int(input("Enter a number to search: "))
    index = binarySearch(arr, numberToSearch)
    print(index)
