package com.example.springbatchdemo.batch;

import com.example.springbatchdemo.model.User;
import com.example.springbatchdemo.repository.UserRepo;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<User> {
    @Autowired
    private UserRepo userRepo;

    @Override
    public void write(List<? extends User> users) throws Exception {
        System.out.println("Data saved for users"+users);
        userRepo.saveAll(users);
    }
}
