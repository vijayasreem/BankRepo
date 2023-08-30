import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationValidationDisbursementRepository extends JpaRepository<VerificationValidationDisbursement, Long> {

    void verifyFileFormat(String fileFormat);

    void validateCreditEvaluation(String customerType, int income);

    void checkCustomerAge(int age);

    void checkCreditScore(int creditScore);

    void verifyVendorBankAccount(String bankAccountNumber, String routingNumber);

    void checkFundsAvailability(float paymentAmount);

    void determinePaymentApproval(float paymentAmount);

    void processDisbursement();

    void displaySuccessMessage(String vendorName, float paymentAmount);

    void displayInvalidVendorMessage();

    void displayLackOfFundsMessage();

    void promptPaymentApproval();

}