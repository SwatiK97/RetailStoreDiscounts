package shopping.Customer;
import java.time.LocalDateTime;

public class User {
	//Attributes
	
	private String userName;
	private LocalDateTime joiningDate;
	private UserType type;
	
	//Constructors
	public User(String userName,UserType type) {
		super();
		this.userName = userName;
		this.type = type;
		joiningDate = LocalDateTime.now();
		
	}

	public User(String userName, LocalDateTime joiningDate, UserType type) {
		super();
		this.userName = userName;
		this.joiningDate = joiningDate;
		this.type = type;
	}

	//Getters
	public String getUserName() {
		return userName;
	}

	public LocalDateTime getJoiningDate() {
		return joiningDate;
	}

	public UserType getType() {
		return type;
	}

}
