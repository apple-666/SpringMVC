package com.apple.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Double_apple
 * @Date 2022/1/22 21:59
 * @Version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
