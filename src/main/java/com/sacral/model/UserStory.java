@Entity
@Table(name = "user_story")
public class UserStory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "format")
    private String format;

    @Column(name = "income")
    private String income;

    @Column(name = "employment_status")
    private String employmentStatus;

    @Column(name = "age")
    private int age;

    @Column(name = "score")
    private int score;

    @Column(name = "amount")
    private int amount;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "bank_account_details")
    private String bankAccountDetails;
    
    // Getters and Setters
}