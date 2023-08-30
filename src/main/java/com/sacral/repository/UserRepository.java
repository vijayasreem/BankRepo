import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sacral.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	// Method to verify the file format of documents submitted by the customer.
	public void verifyFileFormat(String fileFormat);
	
	// Method to evaluate the customer's creditworthiness based on their income and employment status.
	public void evaluateCreditworthiness(int income, String employmentStatus);
	
	// Method to check the customer's age.
	public void checkAge(int age);
	
	// Method to check the customer's credit score.
	public void checkCreditScore(int creditScore);
	
	// Method to define the logic for disbursement of the approved loan amount.
	public void defineDisbursementLogic(int loanAmount);
	
	// Method to define user roles and permissions for different actions.
	public void defineUserRolesAndPermissions(String role, String permission);
	
	// Method to add, edit, and delete recipient profiles.
	public void addEditDeleteRecipientProfiles(String name, String email, String bankAccountDetails);
	
}