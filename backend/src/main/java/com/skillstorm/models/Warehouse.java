@Entity
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Add other fields (e.g., total capacity)

    // Add constructors, getters, and setters
}
