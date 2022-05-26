package com.library.books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class BooksController {

    @GetMapping("/books")
    public List<Books> booksList(){

        return Collections.singletonList(
                new Books(1L, "Revolution 2020", "Chetan Bhagat")
        );
    }
}
