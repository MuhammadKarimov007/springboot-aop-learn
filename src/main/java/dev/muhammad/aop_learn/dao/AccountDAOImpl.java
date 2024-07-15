package dev.muhammad.aop_learn.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{
    @Override
    public void addAccount() {
        System.out.println(getClass() + ": DOING MY WORK: ADDING AN ACCOUNT");
    }
}
