//Salesforce Unit Tests
@isTest
private class BankDisbursementControllerTest {
    static testMethod void testDoInit() {
        // Setup test data
        Account acc = TestUtils.createAccount('Test Account');
        Contact con = TestUtils.createContact('Test Contact', acc.Id);
        // Create a component
        Component bankDisbursementController = TestUtils.createComponent('BankDisbursementController');
        // Initialize the component
        bankDisbursementController.doInit();
        // Verify the results
        System.assertEquals(bankDisbursementController.getApplicantInfo(), con, 'Applicant info was not retrieved correctly.');
        System.assertEquals(bankDisbursementController.preQualifyApplicant(), con, 'Applicant was not pre-qualified correctly.');
        System.assertEquals(bankDisbursementController.approveLoan(), con, 'Loan was not approved correctly.');
        System.assertEquals(bankDisbursementController.assessVehicleValue(), con, 'Vehicle value was not assessed correctly.');
        System.assertEquals(bankDisbursementController.disburseLoan(), con, 'Loan was not disbursed correctly.');
        System.assertEquals(bankDisbursementController.retainTitle(), con, 'Title was not retained correctly.');
        System.assertEquals(bankDisbursementController.providePortal(), con, 'Portal was not provided correctly.');
        System.assertEquals(bankDisbursementController.manageDefaults(), con, 'Defaults were not managed correctly.');
        System.assertEquals(bankDisbursementController.provideSupport(), con, 'Support was not provided correctly.');
        System.assertEquals(bankDisbursementController.releaseTitle(), con, 'Title was not released correctly.');
    }
}