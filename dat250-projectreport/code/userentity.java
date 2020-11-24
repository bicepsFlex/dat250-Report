@Entity
public class User {

	@Id
	private String uID;
	...
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Poll> polls = new ArrayList<>();