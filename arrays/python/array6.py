arr=[1,2,3,1,1,1,1,4,2,3]
k=3
s=0
n=len(arr)
maxLen=0

dict ={}
for i in range(n):
    s=s+arr[i]
    dict[s]=i
    diff=s-k
    if s>k:
        if diff in dict:
            maxLen=max(maxLen, i-dict.get(diff))
print(maxLen)

def max(a: int,b: int)->int:
    if a>b: return a
    elif a<b: return b
    return a