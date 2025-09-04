arr=[1,0,2,3,2,0,0,4,5,1]
j=-1
n=len(arr)

def zeros_at_last():
    for i in range(n):
        if arr[i]==0:
            j=i
            break
    
    if j==-1:
        print("No Zeros in given Array")
    else:
        for i in range(j+1, n):
            if arr[i]!=0:
                arr[i], arr[j]=arr[j], arr[i]
                j+=1
    print(arr)

zeros_at_last()