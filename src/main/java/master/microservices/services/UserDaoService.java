package master.microservices.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import master.microservices.bean.UserBean;

@Component
public class UserDaoService {
	
	private static List<UserBean> users = new ArrayList<UserBean>();
	
	private static int userCount = 3;
	
	static {
		users.add(new UserBean(1, "Adam", new Date()));
		users.add(new UserBean(2, "Eve" , new Date()));
		users.add(new UserBean(3, "Jack" , new Date()));

	}
	
	public List<UserBean> findAll(){
		return users;
	}
	
	public UserBean save(UserBean user) {
		user.setId(++userCount);
		users.add(user);		
		return user;		
	}
	
	public UserBean findOne(int id) {
		for (UserBean user : users) {
			if(user.getId() == id) {
				return user;
						
			}
		}
		
		return null;
	}

}
