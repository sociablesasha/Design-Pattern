package Creational.Builder;

public class NotUse {

    private String identify;
    private String password;
    private String name;
    private Long age;



    public String getIdentify() {
        return identify;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public Long getAge() {
        return age;
    }

    public NotUse(String identify, String password, String name, Long age) {
        this.identify = identify;
        this.password = password;
        this.name = name;
        this.age = age;
    }

}
