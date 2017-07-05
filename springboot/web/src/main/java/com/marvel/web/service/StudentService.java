package com.marvel.web.service;

import com.marvel.web.domain.Student;

import java.util.List;

/**
 * Created by dell on 2017/7/2.
 */
public interface StudentService {

    public List<Student> getAll(int start,int row);
    public Student findById(int id);

}
