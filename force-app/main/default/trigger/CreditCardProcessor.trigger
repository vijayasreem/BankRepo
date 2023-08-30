trigger ProcessCreditCardPayment on Opportunity (after insert, before update) {

	// Create a list to store the IDs of the opportunities that have been successfully processed
    Set<Id> ProcessedOpportunitiesIds = new Set<Id>();

    // Get the list of Opportunities that were inserted or updated
    List<Opportunity> oppsToProcess = Trigger.new;

    // Loop through the list of Opportunities and process the credit card payment
    for(Opportunity opp : oppsToProcess) {
        if(opp.Payment_Method__c == 'Credit Card') {
            // Process the credit card payment
            // Code to process the credit card payment

            // If the payment was successful, add the Opportunity ID to the ProcessedOpportunities list
            if(/* Payment successful */) {
                ProcessedOpportunitiesIds.add(opp.Id);
            }
        }
    }

    // Send a notification to the user to confirm their purchase
    if(ProcessedOpportunitiesIds.size() > 0) {
        // Code to send the notification to the user
    }
}