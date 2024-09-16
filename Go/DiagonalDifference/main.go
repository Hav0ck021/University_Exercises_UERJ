package main

import (
	"fmt"
)

func diagonalDifference(arr [][]int32) int32 {
	var leftRight, rightLeft int32
	for i := range arr {
		leftRight += arr[i][i]
		rightLeft += arr[i][len(arr)-1-i]
	}

	if leftRight-rightLeft < 0 {
		return rightLeft - leftRight
	}
	return leftRight - rightLeft
}

func main() {
	arr := [][]int32{
		{1, 2, 3},
		{4, 5, 6},
		{9, 8, 9},
	}
	result := diagonalDifference(arr)
	fmt.Printf("the result is -> %d!\n", result)
}
