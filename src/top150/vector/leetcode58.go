package main

import "fmt"

func lengthOfLastWord(s string) int {
    if len(s) == 0 {
        return 0
    }

    right := len(s) - 1
    for right >= 0 && s[right] == ' ' {
        right--
    }
    if right < 0 {
        return 0
    }
    left := right
    for left >= 0 && s[left] != ' ' {
        left--
    }

    return right - left
}

func main() {
    result := lengthOfLastWord("hello world!  ")
    fmt.Println(result) // 输出：6
}