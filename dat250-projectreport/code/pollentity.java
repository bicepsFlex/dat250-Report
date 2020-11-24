@Entity
public class Poll {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pollID;
	private String name;
	...

	@ManyToOne
	private User user;

	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<User> usersVoted = new ArrayList<>();