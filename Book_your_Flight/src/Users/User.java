package Users;

public class User {
    private String fullName;
    private String email;
    private String phoneNumber;
    private String country;
    private String password;

    public User(String fullName, String email, String phoneNumber, String country, String password) throws UserException {
        if (!fullName.matches("[a-zA-Z\\s]+")) throw new UserException("Invalid full name.");
        if (!email.matches("[a-zA-Z0-9._%+-]+@gmail\\.com")) throw new UserException("Invalid email.");
        if (!phoneNumber.matches("\\+52\\d{10}")) throw new UserException("Invalid phone number.");
        if (!country.equalsIgnoreCase("Mexico")) throw new UserException("Country must be Mexico.");
        if (!password.matches("[a-zA-Z\\\\s]+")) throw new UserException("Invalid password.");
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCountry() {
        return country;
    }
}