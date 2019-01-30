package Creational.Builder;

public class Director {

    public static void main(String[] args) {
       Use use = Use.builder()
               .setIdentify("아이디")
               .setPassword("비밀번호")
               .setName("김용현")
               .build();

       NotUse notUse = new NotUse("아이디", "비밀번호", "김용현", null);
    }

}
