package com.kawyang.dao;

import com.kawyang.bean.DepartmentExample;
import com.kawyang.bean.Employee;
import com.kawyang.bean.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    long countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(Integer empId);
    /**
     * 查询with Department
     * @param example
     * @return
     */
    List<Employee> selectByExampleWithDepartment(DepartmentExample example);

    Employee selectByPrimaryKeyWithDepartment(Integer deptId);


    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}