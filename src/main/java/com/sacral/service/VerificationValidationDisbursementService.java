Spring Boot Service Class

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.service.VerificationValidationDisbursementRepository;

@Service
public class VerificationValidationDisbursementService {

    @Autowired
    private VerificationValidationDisbursementRepository repository;

    public void verifyFileFormat(String fileFormat) {
        if (!fileFormat.equals("PDF") && !fileFormat.equals("JPEG")) {
            throw new IllegalArgumentException("Invalid file format");
        }
    }

    public void validateCreditEvaluation(String customerType, int income) {
        if (customerType.equals("Salaried") && income < 100000) {
            throw new IllegalArgumentException("Invalid credit evaluation");
        }
    }

    public void checkCustomerAge(int age) {
        if (age < 18 || age > 65) {
            throw new IllegalArgumentException("Invalid customer age");
        }
    }

    public void checkCreditScore(int creditScore) {
        if (creditScore < 600) {
            throw new IllegalArgumentException("Invalid credit score");
        }
    }

    public void verifyVendorBankAccount(String bankAccountNumber, String routingNumber) {
        if (bankAccountNumber.length() != 9 || routingNumber.length() != 9) {
            throw new IllegalArgumentException("Invalid bank account number or routing number");
        }
    }

    public void checkFundsAvailability(float paymentAmount) {
        float availableBalance = repository.getAvailableBalance();
        if (paymentAmount > availableBalance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

    public void determinePaymentApproval(float paymentAmount) {
        if (paymentAmount > 1000.0) {
            throw new IllegalArgumentException("Payment approval required");
        }
    }

    public void processDisbursement() {
        repository.processDisbursement();
    }

    public void displaySuccessMessage(String vendorName, float paymentAmount) {
        System.out.println("Payment of " + paymentAmount + " to " + vendorName + " is successful!");
    }

    public void displayInvalidVendorMessage() {
        System.out.println("Vendor information is invalid!");
    }

    public void displayLackOfFundsMessage() {
        System.out.println("Insufficient funds!");
    }

    public void promptPaymentApproval() {
        System.out.println("Payment approval required!");
    }
}