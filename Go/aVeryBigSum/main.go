package main

import "fmt"

func aVeryBigSum(ar []int64) int64 {
	var sum int64
	for i, _ := range ar {
		sum += ar[i]
	}
	return sum
}

func main() {
	ar := []int64{10, 20, 30, 40, 50}
	result := aVeryBigSum(ar)
	fmt.Printf("the result is -> %d\n!", result)
}
