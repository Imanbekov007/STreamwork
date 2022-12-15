import java.math.BigDecimal;

public class Student {
    private String name;
    private int age;
    private Gender gender;
    private BigDecimal money;
    private String surname;

    public Student(String name, int age, Gender gender, BigDecimal money, String surname) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.money = money;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return
                "name : "+name+"\nage : "+age+"\nGender : "+gender+"\nmoney : "+money+"\n";


    }
}
