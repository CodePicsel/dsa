nums =[1,2,3,4,5]
initial =nums[0]
for i in range(len(nums)):
    if i+1<len(nums):
        nums[i]=nums[i+1]
    else:
        nums[len(nums)-1]=initial
print(nums)

#Pythonic Way
nums = [1,2,3,4,5]
nums = nums[1:] + nums[:1]
print(nums)