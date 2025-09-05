arr1=[1,2,3,4,5]
arr2=[]

def intersection_of_arrays(arr1, arr2):
    i,j,n1, n2=0,0,len(arr1), len(arr2)
    intersection=[]
    while i<n1 and j<n2:
        if arr1[i]==arr2[j]:
            intersection.append(arr1[i])
            i+=1
            j+=1
        elif arr1[i]<arr2[j]: i+=1
        else: j+=1
    print(intersection)

intersection_of_arrays(arr1, arr2)
        