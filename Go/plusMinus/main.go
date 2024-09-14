package main

import "fmt"

func plusMinus(arr []int32) {
	k := len(arr)
	counts := []int32{0, 0, 0}

	for i := range arr {
		switch {
		case arr[i] > 0:
			counts[0] += 1
			break
		case arr[i] < 0:
			counts[1] += 1
			break
		case arr[i] == 0:
			counts[2] += 1
			break
		}
	}

	for _, count := range counts {
		fmt.Printf("%.6f\n", float64(count)/float64(k))
	}
}

func main() {
	arr := []int32{1, 1, 0, -1, -1}
	plusMinus(arr)
}
