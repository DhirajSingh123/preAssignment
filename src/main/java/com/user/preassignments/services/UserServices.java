package com.user.preassignments.services;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.user.preassignments.models.Users;
import com.user.preassignments.repository.DbRepository;

@Component
public class UserServices {

	@Autowired
	DbRepository repository;

	
	/*
	 * Save user services
	 */
	public String saveUsers(Users user) {

		try {
			repository.save(user);

		} catch (Exception e) {
			System.out.println("Something problem in your data or Db connection:::" + e);
		}

		return "User Data Save Successfully";
	}

	/*
	 * update user services
	 */
	public String updateUser(Users user, Integer userId) {
		try {

			List<Users> list = repository.findAll();

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId() == userId) {
					repository.deleteById(userId);
					repository.save(user);
				}

			}

		} catch (Exception e) {
			System.out.println("Please check" + e);
		}

		return "User update Successfully";
	}

	/*
	 * sort user services by date of birth
	 */
	public List<Users> getSorteduser() {

		List<Users> list = repository.findAll();

		/*
		 * Sorting name by using lambda expression using comparator
		 */
		Collections.sort(list, new Comparator<Users>() {

			public int compare(Users o1, Users o2) {
				return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
			}
		});
		return list;

	}

}
