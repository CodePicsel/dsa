
nums =[1,2,3,4,5]
d=2
n=len(nums)
#Rotating Array by 1 Place...
def rotation_by_a_place(nums):
    initial =nums[0]
    for i in range(n):
        if i+1<n:
            nums[i]=nums[i+1]
        else:
            nums[n-1]=initial
    print(nums)  
# rotation_by_a_place(nums)


#Pythonic Rotating Array by 1 Place...
def pythonic_rotation(nums):
    nums = nums[1:] + nums[:1]
    print(nums)
# pythonic_rotation(nums)


#Rotating Array by D Place...
def rotation_by_d_places(d, nums):
    if n<=1: print("invalid Array...")
    else:
        d%=n
        temp=[0]*d
        for i in range(d): temp[i]=nums[i]
        for i in range(d, n): nums[i-d]=nums[i]
        for i in range(d): nums[n-d+i]=temp[i]
    
    print(nums)

# rotation_by_d_places(d, nums)

def space_optimal_rotation_by_d_places(d, nums):
    nums[0:d]=nums[0:d][::-1]
    nums[d:n]=nums[d:n][::-1]
    nums[0:n]=nums[0:n][::-1]
    print(nums)

space_optimal_rotation_by_d_places(d, nums)
