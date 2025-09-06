package main

import "fmt"

func main(){
	arr:=[]int{1,1,2,3,3,4,4,5,5}
	missingOnesInTwin(arr)
}

func missingOnesInTwin(arr []int){
	m:=make(map[int]int)
	n:=len(arr)
	for i:=0; i<n;i++ {
		key:=arr[i]
		if v, ok:=m[key]; ok{
			v++
			m[key]=v
		}else{
			m[key]=1
		}
	}	
	for k, v := range m {
        if v==1{
			fmt.Println(k)
			break
		}
    }
}