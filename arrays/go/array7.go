package main

import "fmt"

func main(){
	arr:=[]int{0,1,1,0,2,0,1,2}
	// sortIn012(arr)
	sortIn012Optimal(arr)
}
//Brute Force
func sortIn012(arr []int){
	hash:=make([]int, 3)
	n:=len(arr)
	for i:=0;i<n;i++{
		if arr[i]==0 {hash[0]++}
		if arr[i]==1 {hash[1]++}
		if arr[i]==2 {hash[2]++}
	}
	for i:=0; i<n; i++{
		if hash[0]>0{
			arr[i] = 0
			hash[0]--
		} else if hash[1]>0{
			arr[i] = 1
			hash[1]--
		} else {
			arr[i] = 2
			hash[2]--
		}
	}
	fmt.Println(arr)
}
    
//National Dutch Flag Algorithm...
func sortIn012Optimal(arr []int){
	low, high, mid := 0, len(arr)-1, 0
	for mid <= high{
		if arr[mid]==0{
			arr[mid], arr[low]=arr[low], arr[mid]
			mid++
			low++
		}else if arr[mid]==1{
			mid++ 
		}else {
			arr[mid], arr[high] = arr[high], arr[mid]
			high--
		}
	}
	fmt.Println(arr)
}