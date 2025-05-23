package com.sc.service.impl;

import com.sc.entity.Books;
import com.sc.mapper.BookMapper;
import com.sc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService {
    // service调dao层,组合Dao
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBookById(Integer bookId) {
        return bookMapper.deleteBookById(bookId);
    }

    @Override
    public int updateBook(Books book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Books getBookById(Integer bookId) {
        return bookMapper.getBookById(bookId);
    }

    @Override
    public List<Books> getAllBooks() {
        return bookMapper.getAllBooks();
    }
}
