package com.tms.Repository;

import com.tms.Domain.Role;
import com.tms.Domain.UserInfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<UserInfo, Integer> {

//   @Modifying - если мы изменяем Entity(INSERT, DELETE, UPDATE)
   @Query(nativeQuery = true, value = "SELECT * FROM  user_info WHERE last_name = :fn")
Optional<UserInfo> findUsersByLastName(String fn);

}
