package com.example.notesapi.Repository;

import java.util.Optional;
import com.example.notesapi.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;  

    ic interface userRepository extends JpaRepository

    Optional<User> findById(@PathVariable String id);
    
}
