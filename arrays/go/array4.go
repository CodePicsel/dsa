package main

import "fmt"

func main(){
	arr1:=[]int{1, 2, 3, 4, 5}
	arr2:=[]int{2, 4, 6, 8} // o/p: 2, 4
    intersectionOfArrays(arr1, arr2)
}

func intersectionOfArrays(arr1 []int, arr2 []int){
	i, j, n1, n2:=0, 0, len(arr1), len(arr2)
	intersection:=make([]int, 0)
	for i<n1 && j<n2{
		if arr1[i]==arr2[j]{
			intersection=append(intersection, arr1[i])
			i++ 
			j++
		}else if arr1[i]<arr2[j] { i++ 
		}else { j++ }
	}
	fmt.Println(intersection)
	}
