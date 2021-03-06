package com.nhnacademy.minidoorayclientprojectserver.repository;


import com.nhnacademy.minidoorayclientprojectserver.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Long> {

    Optional<Task> findByTaskWriter(String taskWriter);
}
