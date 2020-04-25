package com.minidwep.es.repository;


import com.minidwep.es.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface BookRepository extends ElasticsearchRepository<Book,Integer> {
    List<Book> findByBookNameLike(String bookName);
}
