package org.wetest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.wetest.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
     List<User> getUserListByUsername(String username);
}
