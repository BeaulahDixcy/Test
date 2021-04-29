package com.tcs.Userdetails2;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserDetails2Controller {
	

		@GetMapping("/user")
		public List<Userdetails2> getAllUsers() {
		return Userdetails2Fun.getAllUsers();
			}

		@GetMapping("/user/{userId}")
		public Userdetails2 getUserDetails(@PathVariable Long userId) {
			return Userdetails2Fun.getUserDetails(userId);
		}


		@PostMapping("/addUser")
		public Userdetails2 addUser(@RequestBody Userdetails2 user) {
			return Userdetails2Fun.addUser(user);
		}

		@PutMapping("/updateAddress/{userId}")
		public Userdetails2 updateAddress(@PathVariable Long userId, @RequestBody Userdetails2 user) {
			return Userdetails2Fun.updateAddress(userId, user);
		}

		@DeleteMapping("/deleteUser/{userId}")
		public Userdetails2 deleteUser(@PathVariable Long userId) {
			return Userdetails2Fun.deleteUser(userId);
		}
	}


