package com.example.demo.repositories;
import com.example.demo.models.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository  extends CrudRepository<Users, Integer> {
}
