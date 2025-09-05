package main

import "fmt"

func main(){
	arr1:=[]int{1,1,2,3,4,5}
	arr2:=[]int{2,3,4,4,5,6}
	unionOfArray(arr1, arr2)
}

//Union using two Pointer method.
func unionOfArray(arr1 []int, arr2 []int){
	n1:=len(arr1)
	n2:=len(arr2)
	j:=0
	i:=0
	union:=make([]int,0)
	
	for i<n1 && j<n2 {
		if arr1[i]<=arr2[j] { 
			if len(union)==0 || union[len(union)-1]!=arr1[i] {
				union=append(union, arr1[i]) 
			}
			i++
		}else{
			if len(union)==0 || union[len(union)-1]!=arr2[j]{
				union=append(union, arr2[j]) 
			}
			j++
		}
	}

	for i<n1{
			if len(union)==0 || union[len(union)-1]!=arr1[i] {
				union=append(union, arr1[i]) 
			}
			i++
		}
		
	for j<n2{
			if len(union)==0 || union[len(union)-1]!=arr2[j]{
				union=append(union, arr2[j]) 
			}
			j++
	}

	fmt.Println(union)
}