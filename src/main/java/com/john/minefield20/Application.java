package com.john.minefield20;

import com.john.minefield20.model.Board;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Board board = new Board(2, 2, 0);
		System.out.println(board);
	}

}
