package net.thinkmar.service.impl;


import net.thinkmar.dao.EmpDao;
import net.thinkmar.entity.Emp;
import net.thinkmar.service.EmpService;

public class EmpServiceImpl implements EmpService {
    private EmpDao empDao;

    @Override
    public void insertEmp(Emp emp) {
        empDao.insertEmp(emp);
    }

    public EmpDao getEmpDao() {
        return empDao;
    }

    public void setEmpDao(EmpDao empDao) {
        this.empDao = empDao;
    }
}
