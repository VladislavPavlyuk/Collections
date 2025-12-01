package collections;

/**
 * User class representing a user with basic information.
 * This class demonstrates how hashCode() and equals() affect HashSet behavior.
 */
public class User implements IUser {
    private String name;
    private int old;  // age
    private String phone;

    /**
     * Constructor to create a new User instance.
     *
     * @param name  the user's name
     * @param old   the user's age
     * @param phone the user's phone number
     */
    public User(String name, int old, String phone) {
        this.name = name;
        this.old = old;
        this.phone = phone;
    }

    // Getters
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getOld() {
        return old;
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
    public void setOld(int old) {
        this.old = old;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Returns a string representation of the User.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "User{name='" + name + "', old=" + old + ", phone='" + phone + "'}";
    }

    /**
     * Compares this user with another object for equality.
     * Two users are equal if they have the same name, age, and phone.
     *
     * @param obj the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        if (old != user.old) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return phone != null ? phone.equals(user.phone) : user.phone == null;
    }

    /**
     * Returns a hash code value for the User.
     * Current implementation uses all fields (name, old, phone).
     * 
     * Note: This method can be modified to demonstrate different hashCode() behaviors:
     * - Using only name field: return name != null ? name.hashCode() : 0;
     * - Using all fields: current implementation
     *
     * @return hash code value
     */
    @Override
    public int hashCode() {
        // Current implementation: uses all fields
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + old;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
