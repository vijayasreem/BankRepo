import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.service.VerificationValidationDisbursementService;

@RestController
@RequestMapping("/verification-validation-disbursement")
public class VerificationValidationDisbursementController {

    @Autowired
    private VerificationValidationDisbursementService service;

    @PostMapping
    public void processLoanApplication(@RequestBody LoanApplication application) {
        service.verifyFileFormat(application.getFileFormat());
        service.validateCreditEvaluation(application.getCustomerType(), application.getIncome());
        service.checkCustomerAge(application.getAge());
        service.checkCreditScore(application.getCreditScore());
        service.verifyVendorBankAccount(application.getVendorBankAccountNumber(), application.getVendorRoutingNumber());
        service.checkFundsAvailability(application.getPaymentAmount());
        service.determinePaymentApproval(application.getPaymentAmount());
        service.processDisbursement();
        service.displaySuccessMessage(application.getVendorName(), application.getPaymentAmount());
    }

}