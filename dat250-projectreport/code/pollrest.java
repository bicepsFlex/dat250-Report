import project.dat250.entity.Poll;
import project.dat250.entity.User;
import project.dat250.repository.IPollRepository;
import project.dat250.repository.IUserRepository;

@Controller
public class PollRestController {
	@Autowired
	private IPollRepository pollRepository;
	@Autowired
	private IUserRepository userRepository;
	
	@PostMapping("/pollAdd")
	public String pollAdd(@RequestParam String name, @RequestParam String description, @RequestParam String isPublic, @RequestParam String status, Model model) {
		...
	}
	@GetMapping("/polls")
	public String searchPolls(@RequestParam String name, Model model, OAuth2AuthenticationToken authentication) {
		...
	}
}