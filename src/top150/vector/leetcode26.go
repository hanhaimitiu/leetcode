package main

import "fmt"

func removeDuplicates(nums []int) int {
    if nums == nil || len(nums) == 0 {
        return 0
    }
    if len(nums) == 1 {
        return 1
    }
    left := 0
    right := 1

    for right < len(nums) {
        // 找到不重复的元素
        for right < len(nums) && nums[left] == nums[right] {
            right++
        }
        // 只有当right还在数组范围内时才进行赋值
        if right < len(nums) {
            left++
            nums[left] = nums[right]
            right++
        }
    }
    return left + 1
}

func main() {
    s := []int{1, 1, 2}
    length := removeDuplicates(s)
    fmt.Printf("处理后的长度: %d, 数组前%d个元素: %v\n", length, length, s[:length])
}