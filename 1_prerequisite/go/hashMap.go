package main

import "fmt"

/**----------------------------{ Synopsis of HashMaping in Csharp }----------------------------

Create: m := make(map[string]int) or var m map[string]int then m = make(...)
Add/Update: m[key] = value
Get + presence check: v, ok := m[key]
Delete: delete(m, key)
Length: len(m)
Iterate: for k, v := range m { ... }
Note: maps have no methods — use builtins len, delete, range.

*/


func main(){

	//Defining of Map
	m:=make(map[string]int) //defining: m := map[string]int{"apple": 0}
	
	//Insertion of in Map
	m["banana"]=2
	m["apple"]=5

	//Print a value of Map...
	if v, ok:= m["apple"];ok { fmt.Println(v) }
	//Printing Length...
	fmt.Println(len(m)) // 2
	//Printing all Values...
	for k, v := range m {
        fmt.Println(k, v)
    }

	//Removing of an ELement...
	delete(m, "apple")


}