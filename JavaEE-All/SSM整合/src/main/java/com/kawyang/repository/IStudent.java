package com.kawyang.repository;

import com.kawyang.entity.Student;

/**
 * @author LiYang
 * @Project Name: SSM整合
 * @Package Name: com.kawyang.repository
 * Created by MacBook Air on 2020/07/24.
 * Copyright © 2020 LiYang. All rights reserved.
 */
public interface IStudent {
    /**
     * asd
     * @param id
     * @return
     */
    Student findById(int id);
}
