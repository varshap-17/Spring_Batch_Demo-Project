package com.example.springbatchdemo.batch;

import com.example.springbatchdemo.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<User, User> {
    private static final Map<String,String> DEPT_NAMES=new HashMap<>();
    public Processor(){
        DEPT_NAMES.put("001","Technology");
        DEPT_NAMES.put("002","Operation");
        DEPT_NAMES.put("003","Accounts");
        DEPT_NAMES.put("004","Sales");
        DEPT_NAMES.put("005","Non-Staffs");
    }
    @Override
    public User process(User user) throws Exception {
        String DeptCode= user.getDepartment();
        String dept=DEPT_NAMES.get(DeptCode);
        user.setDepartment(dept);
        user.setTime(new Date());
        System.out.println(String.format("Converted from [%s] to [%s]",DeptCode,dept));
        return user;
    }
}
