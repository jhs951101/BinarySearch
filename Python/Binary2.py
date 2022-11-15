def binarySearch(arr, target, start, end):
    # 원하는 값이 없으면 -1을 return
    if start > end:
        return -1

    mid = (start + end) // 2
    # mid: 검색 범위 중 정 가운데의 위치
    
    # 원하는 값을 찾았으면 위치를 return, 아니면 값의 크기에 따라 범위를 줄임
    if target == arr[mid]:
        return mid
    elif target < arr[mid]:
        return binarySearch(arr, target, start, mid - 1)
    else:
        return binarySearch(arr, target, mid + 1, end)

arr = [1, 2, 3, 4, 5, 6, 7]
target = 5

# arr: 여러 값이 들어있는 배열
# target: 원하는 값

start = 0
end = len(arr) - 1
index = binarySearch(arr, target, start, end)

# start: 검색 범위 중 맨 왼쪽
# end: 검색 범위 중 맨 오른쪽
# index: 원하는 값이 들어있는 위치

print(index)
