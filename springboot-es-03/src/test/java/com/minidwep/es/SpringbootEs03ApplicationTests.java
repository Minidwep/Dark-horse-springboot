package com.minidwep.es;

import com.minidwep.es.bean.Book;
import com.minidwep.es.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootEs03ApplicationTests {

    @Autowired
    BookRepository bookRepository;

    @Test
    void contextLoads() {
        Book book = new Book();
        book.setId(1);
        book.setAuthor("六老师");
        book.setBookName("西游记");

        for (Book book1 : bookRepository.findByBookNameLike("游")) {
            System.out.println(book1.toString());
        }
    }


}
