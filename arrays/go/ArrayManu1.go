package main

import "fmt"


//Rotating Array by 1 Place...
func main(){
	nums:=[]int{1,2,3,4,5}
	
	//Rotating Array by 1 Place...
	rotateBy1(nums)
}       

func rotateBy1(nums []int){
	initial:=nums[0]
	for i := range nums {
		if i+1<len(nums){
			nums[i]=nums[i+1]
		} else{
			nums[len(nums)-1]=initial
		}
	}
	fmt.Println(nums)
}

