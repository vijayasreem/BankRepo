Spring Boot Service Class

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.entity.User;
import com.sacral.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	 
	// Method to verify the file format of documents submitted by the customer.
	public void verifyFileFormat(String fileFormat) {
		if (!fileFormat.equals("JPEG") && !fileFormat.equals("PDF")) {
			throw new IllegalArgumentException("Invalid file format");
		}		
	}
	
	// Method to evaluate the customer's creditworthiness based on their income and employment status.
	public void evaluateCreditworthiness(int income, String employmentStatus) {
		if (employmentStatus.equals("Salaried Employee") && income < 100000) {
			throw new IllegalArgumentException("Reject application");
		}
	}
	
	// Method to check the customer's age.
	public void checkAge(int age) {
		if (age < 18 || age > 65) {
			throw new IllegalArgumentException("Reject application");
		} else if (age >= 18 && age <= 25) {
			// Further evaluation
		}
	}
	
	// Method to check the customer's credit score.
	public void checkCreditScore(int creditScore) {
		if (creditScore < 600) {
			throw new IllegalArgumentException("Reject application");
		} else if (creditScore > 700) {
			// Proceed to the next step
		}
	}
	
	// Method to define the logic for disbursement of the approved loan amount.
	public void defineDisbursementLogic(int loanAmount) {
		// Define logic
	}
	
	// Method to define user roles and permissions for different actions.
	public void defineUserRolesAndPermissions(String role, String permission) {
		// Define roles and permissions
	}
	
	// Method to add, edit, and delete recipient profiles.
	public void addEditDeleteRecipientProfiles(String name, String email, String bankAccountDetails) {
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setBankAccountDetails(bankAccountDetails);
		userRepository.save(user);
	}
	
}