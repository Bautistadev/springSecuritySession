package com.example.springSecurity.part1.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Persona")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name="userName")
    private String userName;
    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="password")
    private String password;
    @Column(name="dateCreated")
    private String dateCreated;
    @Column(name="dateDeletad")
    private String dateDeleted;

    public User(String userName, String firstName, String lastName, String password, String dateCreated, String dateDeleted) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.dateCreated = dateCreated;
        this.dateDeleted = dateDeleted;
    }

    public static class Builder{

        private String userName;
        private String firstName;
        private String lastName;
        private String password;
        private String dateCreated;
        private String dateDeleted;

        public Builder() {

        }

        public User.Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public User.Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public User.Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public User.Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public User.Builder setDateCreated(String dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }

        public User.Builder setDateDeleted(String dateDeleted) {
            this.dateDeleted = dateDeleted;
            return this;
        }

        public User build(){
            return new User(this.userName,this.firstName,this.lastName,this.password,this.dateCreated,this.dateDeleted);
        }
    }


}
