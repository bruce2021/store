package com.marvel.web.mapper;

import com.marvel.web.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by dell on 2017/7/1.
 */
@Mapper
public interface StudentDao {

    public List<Student> getAll();
    public Student findById(int id);



}
