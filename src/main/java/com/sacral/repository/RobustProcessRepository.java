import org.springframework.data.jpa.repository.JpaRepository;

public interface RobustProcessRepository extends JpaRepository<RobustProcess, Integer> {
 
    RobustProcess findByDocumentVerification(String documentVerification);
 
    RobustProcess findByCreditEvaluation(String creditEvaluation);
 
    RobustProcess findByPreQualification(String preQualification);
 
    RobustProcess findByTransparentApprovalProcess(String transparentApprovalProcess);
 
    RobustProcess findByDisbursementFlexibility(String disbursementFlexibility);
 
}