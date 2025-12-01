package collections;

/**
 * Interface representing a user with basic information.
 * This interface defines the contract for user entities.
 */
public interface IUser {
    
    /**
     * Gets the user's name.
     *
     * @return the user's name
     */
    String getName();
    
    /**
     * Gets the user's age.
     *
     * @return the user's age
     */
    int getOld();
    
    /**
     * Gets the user's phone number.
     *
     * @return the user's phone number
     */
    String getPhone();
    
    /**
     * Sets the user's name.
     *
     * @param name the user's name
     */
    void setName(String name);
    
    /**
     * Sets the user's age.
     *
     * @param old the user's age
     */
    void setOld(int old);
    
    /**
     * Sets the user's phone number.
     *
     * @param phone the user's phone number
     */
    void setPhone(String phone);
}

