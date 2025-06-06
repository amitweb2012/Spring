package org.springorm.dao;

import org.springorm.model.Student;

import java.util.List;

public interface StudentDao {
    int save(Student student);
    Student findById(Long id);
    List<Student> findAll();
    void update(Student student);
    Student delete(Long id);
}
