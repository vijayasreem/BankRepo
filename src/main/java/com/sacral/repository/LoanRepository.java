@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
 
    // Get the approved loan amount for a specific borrower
    @Query("SELECT l.approvedAmount FROM Loan l WHERE l.borrowerId = ?1")
    Double getApprovedAmountByBorrowerId(Long borrowerId);
 
    // Get the approved loan amount for a specific car dealer
    @Query("SELECT l.approvedAmount FROM Loan l WHERE l.carDealerId = ?1")
    Double getApprovedAmountByCarDealerId(Long carDealerId);
 
    // Get the approved loan amount for a specific vehicle
    @Query("SELECT l.approvedAmount FROM Loan l WHERE l.vehicleId = ?1")
    Double getApprovedAmountByVehicleId(Long vehicleId);
 
    // Get the pre-qualified loan amount for a specific borrower
    @Query("SELECT l.preQualifiedAmount FROM Loan l WHERE l.borrowerId = ?1")
    Double getPreQualifiedAmountByBorrowerId(Long borrowerId);
 
    // Get the pre-approved loan amount for a specific car dealer
    @Query("SELECT l.preApprovedAmount FROM Loan l WHERE l.carDealerId = ?1")
    Double getPreApprovedAmountByCarDealerId(Long carDealerId);
 
    // Get the pre-approved loan amount for a specific vehicle
    @Query("SELECT l.preApprovedAmount FROM Loan l WHERE l.vehicleId = ?1")
    Double getPreApprovedAmountByVehicleId(Long vehicleId);
 
    // Get the approved loan amount for a specific loan
    @Query("SELECT l.approvedAmount FROM Loan l WHERE l.id = ?1")
    Double getApprovedAmountByLoanId(Long loanId);
 
    // Get the disbursed loan amount to either the car dealer or the borrower
    @Query("SELECT l.disbursedAmount FROM Loan l WHERE l.id = ?1")
    Double getDisbursedAmountByLoanId(Long loanId);
 
    // Get the title of the vehicle as collateral
    @Query("SELECT l.titleCollateral FROM Loan l WHERE l.vehicleId = ?1")
    String getTitleCollateralByVehicleId(Long vehicleId);
 
    // Get the loan accounts for a specific borrower
    @Query("SELECT l FROM Loan l WHERE l.borrowerId = ?1")
    List<Loan> getLoanAccountsByBorrowerId(Long borrowerId);
 
    // Get the loan accounts for a specific car dealer
    @Query("SELECT l FROM Loan l WHERE l.carDealerId = ?1")
    List<Loan> getLoanAccountsByCarDealerId(Long carDealerId);
 
    // Get the loan accounts for a specific vehicle
    @Query("SELECT l FROM Loan l WHERE l.vehicleId = ?1")
    List<Loan> getLoanAccountsByVehicleId(Long vehicleId);
 
    // Get the loan accounts with late payments or defaults
    @Query("SELECT l FROM Loan l WHERE l.isLatePayment = true OR l.isDefault = true")
    List<Loan> getLoanAccountsWithLatePaymentsOrDefaults();
 
    // Get the loan accounts with fully paid
    @Query("SELECT l FROM Loan l WHERE l.isFullyPaid = true")
    List<Loan> getLoanAccountsFullyPaid();
}