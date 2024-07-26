Here is an example of Python Flask API code that can be used to implement the car mortgage loan application functionality:

```python
from flask import Flask, request, jsonify

app = Flask(__name__)

@app.route('/loan-application', methods=['POST'])
def apply_for_loan():
    # Get the loan application data from the request
    loan_application_data = request.json

    # Validate the loan application data
    if not validate_loan_application_data(loan_application_data):
        return jsonify({'error': 'Invalid loan application data'}), 400

    # Process the loan application
    loan_application_id = process_loan_application(loan_application_data)

    # Return a confirmation message
    return jsonify({'message': 'Loan application submitted successfully', 'loan_application_id': loan_application_id}), 200

def validate_loan_application_data(loan_application_data):
    # Perform validation on the loan application data
    # Return True if the data is valid, False otherwise
    # You can implement your own validation logic here
    return True

def process_loan_application(loan_application_data):
    # Process the loan application
    # Save the loan application data to the database or perform any other necessary actions
    # Return the loan application ID or any other relevant information
    # You can implement your own processing logic here
    return '123456'

if __name__ == '__main__':
    app.run()
```

This code sets up a Flask API with a single route `/loan-application` that accepts POST requests for submitting a loan application. The loan application data is expected to be sent in JSON format in the request body.

The `apply_for_loan` function handles the loan application submission. It first validates the loan application data using the `validate_loan_application_data` function. If the data is valid, it then processes the loan application using the `process_loan_application` function. Finally, it returns a JSON response with a confirmation message and the loan application ID.

You can further customize and expand this code to meet your specific requirements, such as adding additional fields to the loan application form, implementing document uploads, and ensuring security and confidentiality.