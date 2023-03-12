package com.kienspring.master.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication

public class HelloSpringApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HelloSpringApplication.class, args);
		//ApplicationContext dùng biến này để tương tác với biến context trong container nhằm lấy ra bean tương ứng


		/*container được tạo ra sẽ tìm kiếm tất cả các bean để đưa vào context lưu trữ
		bean thực chất là các object java
		bean được container tạo ra và quản lý còn các object thông thường thì java chính các dev gọi làm new để tạo ra
		và phải tự quản lý cho đến khi destroy*/
		Dress dress = context.getBean(Dress.class);
        // Lấy ra bean có class cụ thể
		Outfit outfit = context.getBean(Outfit.class);
        //Tuy là Outfit.class nhưng Outfit lại là interface
        System.out.println("IntanceO"+outfit);
//		In ra kiểu Outfit
		System.out.println("IntanceD"+dress);
//		In ra kiểu Dress

		dress.wear();
		outfit.wear();
	}

}
