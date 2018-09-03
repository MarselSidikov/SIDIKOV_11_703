package ru.itis.pizza.models;

import lombok.*;

import java.util.List;
import java.util.Objects;

/**
 * 03.09.2018
 * User
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;

    private String email;
    private String password;

    private String firstName;
    private String lastName;
    private String address;

    private List<Order> orders;

//    private User(Builder builder) {
//        this.email = builder.email;
//        this.password = builder.password;
//        this.address = builder.address;
//        this.firstName = builder.firstName;
//        this.lastName = builder.lastName;
//        this.orders = builder.orders;
//    }
//
//    public static class Builder {
//        private Long id;
//
//        private String email;
//        private String password;
//
//        private String firstName;
//        private String lastName;
//        private String address;
//
//        private List<Order> orders;
//
//        public Builder email(String email) {
//            this.email = email;
//            return this;
//        }
//
//        public Builder password(String password) {
//            this.password = password;
//            return this;
//        }
//
//        public Builder firstName(String firstName) {
//            this.firstName = firstName;
//            return this;
//        }
//
//        public Builder lastName(String lastName) {
//            this.lastName = lastName;
//            return this;
//        }
//
//        public Builder address(String address) {
//            this.address = address;
//            return this;
//        }
//
//        public Builder orders(List<Order> orders) {
//            this.orders = orders;
//            return this;
//        }
//
//        public User build() {
//            return new User(this);
//        }
//    }
//
//    public static Builder builder() {
//        return new Builder();
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public List<Order> getOrders() {
//        return orders;
//    }
//
//    public void setOrders(List<Order> orders) {
//        this.orders = orders;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return Objects.equals(id, user.id) &&
//                Objects.equals(email, user.email) &&
//                Objects.equals(password, user.password) &&
//                Objects.equals(firstName, user.firstName) &&
//                Objects.equals(lastName, user.lastName) &&
//                Objects.equals(address, user.address) &&
//                Objects.equals(orders, user.orders);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, email, password, firstName, lastName, address, orders);
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", address='" + address + '\'' +
//                ", orders=" + orders +
//                '}';
//    }
}
