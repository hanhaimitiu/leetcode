package main
import "fmt"
func merge(nums1 []int, m int, nums2 []int, n int)  {
    res := make([]int, m+n)
    i, j, index := 0, 0, 0

    // 使用for替代while
    for i < m && j < n {
        if nums1[i] < nums2[j] {
            res[index] = nums1[i]  // 存储元素值而非索引
            i++
        } else {
            res[index] = nums2[j]  // 修正为nums2
            j++
        }
        index++
    }

    // 复制剩余元素
    for i < m {
        res[index] = nums1[i]
        i++
        index++
    }
    for j < n {  // 修正为j < n
        res[index] = nums2[j]
        j++
        index++
    }

    copy(nums1, res)
}

func main() {
        nums1 := make([]int, 6) // 创建长度为6的切片（3个预留位置）
        nums1[0] = 0
        nums1[1] = 2
        nums1[2] = 5
        nums2 := []int{-1, 2, 3}

        merge(nums1, 3, nums2, 3)
        fmt.Println(nums1) // 输出合并后的数组
}