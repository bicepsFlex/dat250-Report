import project.dat250.entity.User;
public interface IUserRepository extends PagingAndSortingRepository<User, String> {
	User findByFname(@Param("fname") String fname);
}