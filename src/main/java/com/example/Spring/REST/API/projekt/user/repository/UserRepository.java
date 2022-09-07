package com.example.Spring.REST.API.projekt.user.repository;

import com.example.Spring.REST.API.projekt.user.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Long> {
}
