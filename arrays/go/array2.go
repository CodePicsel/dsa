package main

import (
	"fmt"
)

func main(){
	arr:=[]int{1,0,2,3,2,0,0,4,5,1}
	j:=-1
	n:=len(arr)
	zerosAtLast(arr, j, n)
}

func zerosAtLast(arr []int, j int, n int){
	for i:=0; i<n; i++ {
		if arr[i]==0{
			j=i 
			break
		}
	}
	if j==-1 {fmt.Println("No Zeros in given array")
	} else {
		for i:=j+1; i<n; i++{
			if arr[i]!=0{
				arr[i], arr[j] = arr[j], arr[i]
				j++
			}
		}
	}
	fmt.Println(arr)
}