package com.infractar.suboptimal.repo;

import com.infractar.suboptimal.models.auth.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, String> {
    User findByUserName(String username);
}
