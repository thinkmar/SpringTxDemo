package net.thinkmar;

import net.thinkmar.entity.Emp;
import net.thinkmar.service.EmpService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        Emp emp = new Emp();
        emp.setId("00000001");
        emp.setName("name");
        emp.setAge(21);
        emp.setSex("Male");
        emp.setPhone("05396775365");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        EmpService service = ctx.getBean(EmpService.class);
        service.insertEmp(emp);
    }
}
