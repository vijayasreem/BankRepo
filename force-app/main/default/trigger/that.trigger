
trigger CarMortgageLoanTrigger on CarMortgageLoan__c (before insert) {
    for (CarMortgageLoan__c loan : Trigger.new) {
        // Validate required fields
        if (loan.Name == null || loan.Address__c == null || loan.Contact_Details__c == null ||
            loan.Income__c == null || loan.Employment_Details__c == null ||
            loan.Loan_Amount__c == null || loan.Loan_Term__c == null ||
            loan.Vehicle_Make__c == null || loan.Vehicle_Model__c == null ||
            loan.Vehicle_Year__c == null || loan.Vehicle_VIN__c == null) {
            loan.addError('Please fill in all required fields.');
        }
        
        // Validate document uploads
        if (loan.Identification_Document__c == null || loan.Income_Proof_Document__c == null ||
            loan.Credit_History_Document__c == null || loan.Employment_Verification_Document__c == null) {
            loan.addError('Please upload all required documents.');
        }
    }
}

trigger CarMortgageLoanTrigger on CarMortgageLoan__c (after insert) {
    List<EmailMessage> emailMessages = new List<EmailMessage>();
    
    for (CarMortgageLoan__c loan : Trigger.new) {
        // Send confirmation email
        EmailMessage email = new EmailMessage();
        email.Subject = 'Car Mortgage Loan Application Confirmation';
        email.HtmlBody = 'Thank you for submitting your car mortgage loan application. We will review your application and get back to you soon.';
        email.ToAddress = loan.Contact_Details__c;
        emailMessages.add(email);
        
        // Update loan record with confirmation message
        loan.Confirmation_Message__c = 'Your loan application has been submitted successfully.';
    }
    
    // Insert email messages
    insert emailMessages;
}
