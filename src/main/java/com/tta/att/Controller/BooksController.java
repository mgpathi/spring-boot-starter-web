package com.tta.att.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tta.att.service.BookServiceImpl;




@RestController
public class BooksController {

	BookServiceImpl bsi = new BookServiceImpl();
	
	@RequestMapping("/getBookById")
	public String getBookNameById(){
		return bsi.getBookNameByID();
	}
}
