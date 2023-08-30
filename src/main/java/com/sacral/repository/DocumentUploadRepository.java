@Repository
public interface DocumentUploadRepository extends JpaRepository<Document, Long>{
    Optional<Document> findByIdentification(String identification);
    Optional<Document> findByProofOfIncome(String proofOfIncome);
    Optional<Document> findByCreditHistory(String creditHistory);
    Optional<Document> findByEmploymentDetails(String employmentDetails);

    void validateDocuments(Document document);
    void storeDocumentsSecurely(Document document);
    void provideFeedback(Document document);

}