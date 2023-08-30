@Entity
@Table(name="users")
public class User {

  	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
  	@Column(name = "name")
  	private String name;
  
  	@Column(name = "email")
  	private String email;
  
  	@Column(name = "file_format")
  	private String fileFormat;
  
  	@Column(name = "income")
  	private int income;
  
  	@Column(name = "employment_status")
  	private String employmentStatus;
  
  	@Column(name = "age")
  	private int age;
  
  	@Column(name = "credit_score")
  	private int creditScore;
  
  	@Column(name = "loan_amount")
  	private int loanAmount;
  
  	@Column(name = "role")
  	private String role;
  
  	@Column(name = "permission")
  	private String permission;
  
  	@Column(name = "bank_account_details")
  	private String bankAccountDetails;
  
  	public User() {}
  
  	public User(String name, String email, String fileFormat, int income, String employmentStatus, int age, int creditScore, int loanAmount, String role, String permission, String bankAccountDetails) {
    	this.name = name;
    	this.email = email;
    	this.fileFormat = fileFormat;
    	this.income = income;
    	this.employmentStatus = employmentStatus;
    	this.age = age;
    	this.creditScore = creditScore;
    	this.loanAmount = loanAmount;
    	this.role = role;
    	this.permission = permission;
    	this.bankAccountDetails = bankAccountDetails;
  	}
  
  	public Long getId() {
    	return id;
  	}
  
  	public void setId(Long id) {
    	this.id = id;
  	}
  
  	public String getName() {
    	return name;
  	}
  
  	public void setName(String name) {
    	this.name = name;
  	}
  
  	public String getEmail() {
    	return email;
  	}
  
  	public void setEmail(String email) {
    	this.email = email;
  	}
  
  	public String getFileFormat() {
    	return fileFormat;
  	}
  
  	public void setFileFormat(String fileFormat) {
    	this.fileFormat = fileFormat;
  	}
  
  	public int getIncome() {
    	return income;
  	}
  
  	public void setIncome(int income) {
    	this.income = income;
  	}
  
  	public String getEmploymentStatus() {
    	return employmentStatus;
  	}
  
  	public void setEmploymentStatus(String employmentStatus) {
    	this.employmentStatus = employmentStatus;
  	}
  
  	public int getAge() {
    	return age;
  	}
  
  	public void setAge(int age) {
    	this.age = age;
  	}
  
  	public int getCreditScore() {
    	return creditScore;
  	}
  
  	public void setCreditScore(int creditScore) {
    	this.creditScore = creditScore;
  	}
  
  	public int getLoanAmount() {
    	return loanAmount;
  	}
  
  	public void setLoanAmount(int loanAmount) {
    	this.loanAmount = loanAmount;
  	}
  
  	public String getRole() {
    	return role;
  	}
  
  	public void setRole(String role) {
    	this.role = role;
  	}
  
  	public String getPermission() {
    	return permission;
  	}
  
  	public void setPermission(String permission) {
    	this.permission = permission;
  	}
  
  