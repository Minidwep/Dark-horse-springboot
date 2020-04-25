package com.minidwep.es.bean;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "library")
@Data
public class Book {
    private Integer id;
    private String bookName;
    private String author;
}
