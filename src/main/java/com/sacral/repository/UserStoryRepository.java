@Repository
public interface UserStoryRepository {
    
    // Method to verify document format
    public boolean verifyDocumentFormat(String doc);
    
    // Method to evaluate customer's creditworthiness
    public boolean evaluateCreditworthiness(int salary, String employmentStatus);
    
    //Method to check customer's age
    public boolean checkCustomerAge(int age);
    
    //Method to check customer's credit score
    public boolean checkCreditScore(int creditScore);
    
    // Method to define logic for disbursement of approved loan amount
    public void disbursementLogic(int approvedLoanAmount);
    
    //Method to define user roles
    public void defineUserRoles(String userRole);
    
    //Method to add/edit/delete recipient profiles
    public void addRecipientProfile(String name, String email, String bankAccountDetails);
    public void editRecipientProfile(String name, String email, String bankAccountDetails);
    public void deleteRecipientProfile(String name);
    
}