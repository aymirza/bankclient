package com.example.bankclient.repository;

import com.example.bankclient.model.Schyet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchyetRepository extends JpaRepository<Schyet,Long> {

}
