package com.kienspring.master.demo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public interface Outfit {
    public void wear();
    /*Do outfit là interface nên không thể tạo trực tiếp 1 object nên contaner đã
    tìm trong context và thấy bean trong Dress implements Outfit nên nó đã tự động tạo ra 1 object dress để trả về */

}
