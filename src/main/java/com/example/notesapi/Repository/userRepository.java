package com.example.notesapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<String,id>  {
    
    Optional<User> findById(@PathVariable String id);
    
}
