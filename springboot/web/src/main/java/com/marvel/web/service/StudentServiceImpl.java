package com.marvel.web.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.marvel.web.domain.Student;
import com.marvel.web.mapper.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by dell on 2017/7/2.
 */
@Transactional(rollbackFor = java.lang.Throwable.class ,timeout = 60)
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getAll(int page,int row) {
        PageHelper.startPage(page,row);
        List<Student> list=studentDao.getAll();


        return list;
    }

    @Override
    public Student findById(int id) {

        return studentDao.findById(id);
    }
}
