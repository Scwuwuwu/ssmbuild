package com.sc.service;

import com.sc.entity.Books;
import java.util.List;

public interface BookService {

    // 增加一本书
    int addBook(Books book);
    // 删除一本书
    int deleteBookById(Integer bookId);
    // 更新一本书
    int updateBook(Books book);
    // 查询一本书
    Books getBookById(Integer bookId);
    // 查询所有书
    List<Books> getAllBooks();
}
