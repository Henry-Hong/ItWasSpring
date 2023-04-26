package heroinie.com.springstudy.domain;

import java.util.List;

public class UserDomain {
    /**
     * Getter Setter Pattern
     * 클래스의 멤버변수를 안전하게 다룰 수 있는 패턴
     */
    private Long id;
    private String name;

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
