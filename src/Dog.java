public class Dog {
    private String name;
    private final String breed;
    private Integer age;
    private final String sex;

    public Dog(String name, String breed, Integer age, String sex) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.sex = sex;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed(){
        return breed;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void incrementAge() {
        this.age++;
    }
    public String getSex() {
        return sex;
    }
}


