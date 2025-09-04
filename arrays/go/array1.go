package main

import (
	"fmt"
    "slices"
)


//Rotating Array by 1 Place...
func main(){
	nums:=[]int{1,2,3,4,5}
	d:=2
	
	//Rotating Array by 1 Place...
	// rotateBy1(nums)
	
	//Rotating Array by D Places....
	// rotateByD(nums, d)
	
	//Optimal Rotating Array by D Places....
	spaceOptimalRotationByD(nums, d)
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

func rotateByD(nums []int, d int){
	n:=len(nums)
	if n<=1 {
		fmt.Println("Invalid Array")
	}
	d%=n
	temp := make([]int, d)
	for i := 0; i < d; i++ {temp[i]=nums[i]}
	for i := d; i < n; i++ {nums[i-d]=nums[i]}
	for i := 0; i < d; i++ {nums[n-d+i]=temp[i]}
	fmt.Println(nums)
}

func spaceOptimalRotationByD(nums []int, d int){
	n:=len(nums)
	if n<=1 {
		fmt.Println("Invalid Array")
	}
	d%=n
	slices.Reverse(nums[0:d])
	slices.Reverse(nums[d:n])
	slices.Reverse(nums[0:n])
	fmt.Println(nums)
}
