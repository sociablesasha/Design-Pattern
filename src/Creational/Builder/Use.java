package Creational.Builder;

public class Use {

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



    private Use(Builder builder) {
        this.identify = builder.identify;
        this.password = builder.password;
        this.name = builder.name;
        this.age = builder.age;
    }

    public static Builder builder() {
        return new Builder();
    }

     static class Builder {
        private String identify;
        private String password;
        private String name;
        private Long age;

        public Builder setIdentify(String identify) {
            this.identify = identify;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(Long age) {
            this.age = age;
            return this;
        }

        public Use build() {
            return new Use(this);
        }
    }

}
