package collections;

/**
 * User class representing a user with basic information.
 * This class demonstrates how objects can be stored in collections.
 */
public class User {
    private String name;
    private int age;
    private String email;

    /**
     * Constructor to create a new User instance.
     *
     * @param name  the user's name
     * @param age   the user's age
     * @param email the user's email address
     */
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns a string representation of the User.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + ", email='" + email + "'}";
    }

    /**
     * Compares this user with another object for equality.
     * Two users are equal if they have the same email.
     *
     * @param obj the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return email != null ? email.equals(user.email) : user.email == null;
    }

    /**
     * Returns a hash code value for the User.
     * Uses email for hashing to ensure consistency with equals.
     *
     * @return hash code value
     */
    @Override
    public int hashCode() {
        return email != null ? email.hashCode() : 0;
    }
}
