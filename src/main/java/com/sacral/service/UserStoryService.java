@Service
public class UserStoryService {
    private final UserStoryRepository userStoryRepository;

    public UserStoryService(UserStoryRepository userStoryRepository) {
        this.userStoryRepository = userStoryRepository;
    }

    public boolean verifyDocumentFormat(String doc) {
        return userStoryRepository.verifyDocumentFormat(doc);
    }

    public boolean evaluateCreditworthiness(int salary, String employmentStatus) {
        return userStoryRepository.evaluateCreditworthiness(salary, employmentStatus);
    }

    public boolean checkCustomerAge(int age) {
        return userStoryRepository.checkCustomerAge(age);
    }

    public boolean checkCreditScore(int creditScore) {
        return userStoryRepository.checkCreditScore(creditScore);
    }

    public void disbursementLogic(int approvedLoanAmount) {
        userStoryRepository.disbursementLogic(approvedLoanAmount);
    }

    public void defineUserRoles(String userRole) {
        userStoryRepository.defineUserRoles(userRole);
    }

    public void addRecipientProfile(String name, String email, String bankAccountDetails) {
        userStoryRepository.addRecipientProfile(name, email, bankAccountDetails);
    }

    public void editRecipientProfile(String name, String email, String bankAccountDetails) {
        userStoryRepository.editRecipientProfile(name, email, bankAccountDetails);
    }

    public void deleteRecipientProfile(String name) {
        userStoryRepository.deleteRecipientProfile(name);
    }
}