package com.cg.university.dao;

import com.cg.university.bean.Users;
import com.cg.university.exception.ParticipantException;


public interface UserDao {
	

Users validUser(String loginId,String password)throws ParticipantException;


}
