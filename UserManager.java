import java.util.HashMap;
import java.util.Map;

public class UserManager extends Main {
        // Map to store users, with the username as the key and the User object as the value
        private Map<String, User> users;

    public void manager() {
        User admin = new User("admin", "12345");
        users.put("admin", admin);
    }

    public UserManager() {
            // Initialize the users map
            users = new HashMap<>();
        }

        public void registerUser(String username, String password) {
            User user = new User(username, password);
            users.put(username, user);
        }

        public boolean login(String username, String password) {
            // Check if the username exists in the map
            if (users.containsKey(username)) {
                // Get the user object for the username
                User user = users.get(username);
                // Check if the password matches
                return user.getPassword().equals(password);
            }

// Return false if the username does not exist in the map
            return false;
        }
    }
