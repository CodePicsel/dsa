arr1=[1,1,2,3,4,5]
arr2=[2,3,4,4,5,6]

def union_of_array(arr1, arr2):
    n1 = len(arr1)
    n2 = len(arr2)
    union = []
    i, j = 0, 0
    while i<n1 and j<n2:
        if arr1[i]<=arr2[j]:
            if not union or union[-1]!=arr1[i]: union.append(arr1[i])
            i+=1
        else: 
            if not union or union[-1]!=arr2[j]: union.append(arr2[j])
            j+=1
    while i<n1:
        if not union or union[-1]!=arr1[i]: union.append(arr1[i])
        i+=1
    while j<n2:
        if not union or union[-1]!=arr2[j]: union.append(arr2[j])
        j+=1
    print(union)

union_of_array(arr1, arr2)