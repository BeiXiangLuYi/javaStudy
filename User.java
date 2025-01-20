package JanStudy;

import java.time.LocalDate;

public class User {
    private long id;
    private String gender;
    private LocalDate birthday;
    private String name;

    public User() {
    }

    public User(String gender, long id, LocalDate birthday, String name) {
        this.gender = gender;
        this.id = id;
        this.birthday = birthday;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", name='" + name + '\'' +
                '}';
    }
}
