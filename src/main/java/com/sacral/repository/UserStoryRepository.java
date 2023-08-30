@Repository
public interface UserStoryRepository {

    void verifyDocumentFormat(String format) throws Exception;

    void evaluateCreditWorthiness(String income, String employmentStatus);

    void checkCustomerAge(int age);

    void checkCreditScore(int score);

    void defineDisbursementLogic(int amount);

    void defineUserRolesAndPermissions();

    void addRecipientProfile(String name, String email, String bankAccountDetails);

    void editRecipientProfile(String name, String email, String bankAccountDetails);

    void deleteRecipientProfile(String name, String email, String bankAccountDetails);
}