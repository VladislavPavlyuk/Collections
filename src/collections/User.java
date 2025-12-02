package collections;


 // User class representing a user with basic information.
 // This class demonstrates how hashCode() and equals() affect HashSet behavior.

public class User implements IUser {
    private String name;
    private int age;  // age
    private String phone;


     // Constructor to create a new User instance.
    public User(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    // Getters
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    // Setters
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

     // Returns a string representation of the User.
    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + ", phone='" + phone + "'}";
    }

    //Compares this user with another object for equality.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        if (age != user.age) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return phone != null ? phone.equals(user.phone) : user.phone == null;
    }

    // Returns a hash code value for the User.
    @Override
    public int hashCode() {
        // Current implementation: uses all fields
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
