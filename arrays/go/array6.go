package main

import "fmt"

func main(){
	arr:=[]int{1,2,3,1,1,1,1,4,2,3}
	k:=3
	longestSubarrayOfSumKUsingHashing(arr, k)
}
func longestSubarrayOfSumKUsingHashing(arr []int, k int){
	m:=make(map[int]int)
	s,n,maxLen:=0,len(arr), 0
	for i:=0; i<n; i++{
		s+=arr[i]
		m[s]=i
		diff:=s-k
		if s>k{
			if v, ok:=m[diff]; ok{
				maxLen=max(maxLen, i-v)
			}
		}
	}
	fmt.Println(maxLen)
}

func max(i int, j int) int {
	if i>j {return i}
	if i<j {return j}
	return i;
}