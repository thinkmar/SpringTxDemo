package net.thinkmar.mapper;

import net.thinkmar.entity.Emp;

import java.util.List;
import java.util.Map;

public interface EmpMapper {
    void insertEmp(Emp emp);

    List<Emp> getAllEmp();

    Emp getById(String id);

    void deleteEmp(String id);

    void updateEmp(Map<String, Object> map);
}
