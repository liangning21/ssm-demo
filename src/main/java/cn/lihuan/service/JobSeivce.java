package cn.lihuan.service;

import cn.lihuan.dao.JobsDao;
import cn.lihuan.entity.jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobSeivce {

    @Autowired
    private JobsDao JobsDao;


    public jobs getByList(Integer id){
        jobs jobs = JobsDao.getByList(id);

        return  jobs;
    }
}
