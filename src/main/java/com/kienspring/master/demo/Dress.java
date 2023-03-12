package com.kienspring.master.demo;

import org.springframework.stereotype.Component;

@Component("dress")
public class Dress implements Outfit {
    @Override
    //Tạo class có methods là wear();
    public void  wear(){
        System.out.println("Đang mặc váy");
    }
}
