package CompareTheTriplets

import "fmt"

func compareTriplets(a []int32, b []int32) []int32 {
	result := []int32{0, 0}
	for i := range a {
		if a[i] > b[i] {
			result[0]++
		} else if a[i] < b[i] {
			result[1]++
		}
	}
	return result
}

func main() {
	a := []int32{1, 2, 3}
	b := []int32{3, 2, 1}
	result := compareTriplets(a, b)
	fmt.Println(result)
}
