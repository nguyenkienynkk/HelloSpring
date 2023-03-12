package com.kienspring.master.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
@Qualifier("paradox")
public class GirlFriend {
    @Autowired
    /*Khi tạo ra 1 giá trị cho object girlfriend contaner sẽ tự động tạo ra 1 object outfit
    và sau đó inject vào làm thuộc tính
    Cụ thể container sẽ tìm ra bean tương ứng trong context tại đây nó thấy dress thuộc kiểu outfit
    chính vì vậy nó sẽ tạo ra 1 object là dress để trả về và inject cái object đó vào trong đối tượng là girlfrined*/
    public Outfit outfit;
    public GirlFriend(){

    }

    public GirlFriend(Outfit outfit) {
        this.outfit = outfit;
    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }
}
