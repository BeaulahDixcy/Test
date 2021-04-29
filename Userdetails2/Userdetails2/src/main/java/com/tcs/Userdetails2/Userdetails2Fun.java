package com.tcs.Userdetails2;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Userdetails2Fun {
	
		private static Map<Long,Userdetails2> users=new HashMap<>();
		public static Long index =2L;
		
		static {
			Userdetails2 user1 = new Userdetails2(1L, "Beaulah" , "9009890098" , "beaulah@gmail.com" , "17/916 A2,JEE COTTAGE,TIRUNELVELI");
			Userdetails2 user2 = new Userdetails2(2L, "Dixcy" , "7878787878" , "dixcy@gmail.com" , "12 east coast,marina nagar,Chennai");
			Userdetails2 user3 = new Userdetails2(3L, "Stella" , "8967896789" , "steklla.mc@gmail.com" , "123 Rahmath nagar,vilupuram");
			Userdetails2 user4 = new Userdetails2(4L, "florine" , "9078563412" , "diflourine@gmail.com" , "12 north street ,apsk flat,viruthunagar");
			users.put(1L, user1);
			users.put(2L, user2);
			users.put(3L, user3);
			users.put(4L, user4);
		
		}
		
		public static List<Userdetails2> getAllUsers(){
			return new ArrayList<>(users.values());
		}
		
		public static Userdetails2 getUserDetails(Long userId){
			return users.get(userId);
		}
		
		public static Userdetails2 addUser(Userdetails2 user)
		{
			index += 1;
			user.setUserId(index);
			users.put(index, user);
			return user;
		}
		
		public static Userdetails2 updateAddress(Long userId, Userdetails2 user)
		{
			user.setUserId(userId);
			users.put(userId, user);
			return user;
		}
		
		public static Userdetails2 deleteUser(Long userId)
		{
			return users.remove(userId);
		}
}
