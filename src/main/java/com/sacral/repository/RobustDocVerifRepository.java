@Repository
public interface RobustDocVerifRepository {

  // Method to validate file formats
  public Boolean validateFileFormat(String fileFormat);

  // Method to check customer's age and credit score
  public Boolean checkAgeAndCreditScore(int age, int creditScore);

  // Method to pre-qualify applicant for loan amount and interest rate range
  public Boolean preQualifyApplicant(int loanAmount, double interestRate);

  // Method to approve loan with specific terms and conditions
  public Boolean approveLoan(int loanAmount, double interestRate, int repaymentPeriod);

  // Method to disburse approved loan amount
  public Boolean disburseLoan(String disburseType);

  // Method to authenticate user
  public Boolean authenticateUser(String userName, String password);

  // Method to define user roles and permissions for different actions
  public Boolean defineUserRolesAndPermissions(String roleName, List<String> permissions);

}