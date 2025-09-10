package main

import "fmt"

// 1^1=0
// 0^0=0
// 1^0=1

func main(){
	arr:=[]int{1,1,2,3,3,4,4,5,5}
	// missingOnesInTwin(arr)
	missingOnesInTwinOptimal(arr)
	// fmt.Println(arr[0]^arr[2]);
}

func missingOnesInTwinOptimal(arr []int){
	x:=0
	for i:=0; i<len(arr); i++ {
		x=x^arr[i]
	}
	fmt.Println(x)
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