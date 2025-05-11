package web.PP_3_1_1_Spring_Boot.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NotBlank(message = "Null!")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Null!")
    @Column(name = "country")
    private String country;

    @NotBlank(message = "Null!")
    @Column(name = "email")
    private String email;

    public User(String country, String name, long id, String email) {
        this.country = country;
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name)
                && Objects.equals(country, user.country)
                && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country, email);
    }
}

