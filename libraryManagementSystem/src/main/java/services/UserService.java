package services;
import java.util.ArrayList;
import java.util.List;
import models.User;

public class UserService {
	private List<User> users;
	public UserService () {
		users=new ArrayList<>();
	}
	public void registerUser(String username,String role) {
		users.add(new User(username,role));
		System.out.println("User'"+username+"'registered as'"+role+"'.");
	}
	public void updateUser(String username,String newRole) {
		for (User user:users) {
			if(user.getUsername().equals(username)) {
				user.setRole(newRole);
				System.out.println("User'"+username+"'updated to role'"+newRole+"'.");
				return;
			}
		}
		System.out.println("User'"+username+"'not found.");
	}
		public void deleteUser(String username) {
			boolean removed=users.removeIf(user->user.getUsername().equals(username));
			if (removed) {
				System.out.println("User'"+username+"'deleted.");
			}else {
				System.out.println("User'"+username+"'not found.");
			}
		}
		public void listUsers() {
			if(users.isEmpty()) {
				System.out.println("No users found.");
			}else {
				for(User user:users) {
					System.out.println(user);
				}
			}
		}
	}
	


