public class DogOwner {
    private String name;
    private String sex;
    private Dog dog;

    public DogOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Dog getDog() {
        return dog;
    }
    public void setDog(Dog dog) {
        this.dog = dog;
    }
    public void changeDogName(String name) {
        if (this.dog != null) {
            this.dog.setName(name);
        }
    }
    public void increaseDogAge() {
        if (this.dog != null) {
            this.dog.incrementAge();
        }
    }
    public String toString() {
        if (this.dog != null) {
            return this.name
                    + " heeft een "
                    + this.dog.getSex()
                    + ", deze is "
                    + this.dog.getAge()
                    + " jaar oud en van het soort: "
                    + this.dog.getBreed()
                    + ". De hond heet: "
                    + this.dog.getName();
        } else {
            return this.name
                    + " heeft geen hond.";
        }
    }
}
