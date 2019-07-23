package com.wildcodeschool.challenge.springHibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wildcodeschool.challenge.springHibernate.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
}
