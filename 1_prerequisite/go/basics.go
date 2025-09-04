package main

import "fmt"

//Main Function... do whatever u want to do in this....
func main(){
   q, r, err := divmod(10, 3)
   //if i dont need quotient i could skip it...
   _, r := divmod(10, 3) // ignore quotient
}

//Void Func
func myFunc(){
   fmt.Println("returns Null")
}

//returning Func
func divmod(a, b int) (quotient, remainder int, err error) {
   if b == 0 {
       return 0, 0, fmt.Errorf("divide by zero")
   }
   return a / b, a % b, nil
}

//You can name the return variables in the signature and then return without arguments..
func splitSum(n int) (even, odd int) {
   even = n / 2
   odd = n - even
   return // returns even, odd
}

/////////////////////////////////**        Arrays And Slice         */////////////////////////////////////////

/* --> Arrays: Fixed Size      */

arr:=[]int{1,2,3,1,2,3} //defining

n:=len(arr)//for length

/* --> Slice: Dynamic Sizing    */

s:=make([]int, 2, 3)//make takes two-three args (type, start, capacity) or (type, capacity)
s=append(s, 2) //adds element "2" at the end of slice


