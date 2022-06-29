package Blockend_Development.reposateries;

import org.springframework.data.jpa.repository.JpaRepository;

import Blockend_Development.entites.User;

public interface UserRepo extends JpaRepository<User, Integer>
{
	

}
