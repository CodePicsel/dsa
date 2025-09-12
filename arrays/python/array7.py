arr=[0,1,1,0,2,0,1,2]

def sort_in_012(arr):
    hash=[0,0,0]
    n=len(arr)
    for i in range(n):
        if arr[i]==0: hash[0]+=1
        if arr[i]==1: hash[1]+=1
        if arr[i]==2: hash[2]+=1

    for i in range(n):
        if hash[0]>0:
            arr[i]=0
            hash[0]-=1
        elif hash[1]>0:
            arr[i]=1
            hash[1]-=1
        else:
            arr[i]=2
            hash[2]-=1
    print(arr)

def sort_in_012_optimal(arr):
    low, mid, high=0, 0, len(arr)-1
    while mid<=high:
        if arr[mid]==0:
            arr[mid], arr[low] = arr[low], arr[mid]
            low+=1
            mid+=1
        elif arr[mid]==1:
            mid+=1
        else: 
            arr[mid], arr[high] = arr[high], arr[mid]
            high-=1
    print(arr)


# sort_in_012(arr)
sort_in_012_optimal(arr)