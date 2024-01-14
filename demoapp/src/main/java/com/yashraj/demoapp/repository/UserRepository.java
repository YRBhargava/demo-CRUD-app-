package com.yashraj.demoapp.repository;

import com.yashraj.demoapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
