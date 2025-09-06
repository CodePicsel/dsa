arr=[1,1,2,3,3,4,4,5,5]

def missing_one_from_twins(arr):
    d={}
    for i in range(len(arr)):
        key = arr[i]
        if key in d:
            temp = d[key]
            temp+=1
            d[key] = temp
        else:
            d[key] = 1
    for k, v in d.items():
        # print(k,"=>",v)
        if v==1:
            print(k)
            break

missing_one_from_twins(arr)