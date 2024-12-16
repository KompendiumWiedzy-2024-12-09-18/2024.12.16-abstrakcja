package com.comarch.szkolenia.abstrakcja;

public class UserRepositoryImplementation implements UserRepositoryInterface {
    @Override
    public String loadUser() {
        //??
        //??
        return "loaded user";
    }

    @Override
    public String loadUserById(int id) {
        //??
        //??
        return "loaded user with id";
    }

    @Override
    public void updateUser(String user) {
        System.out.println(Constants.COS);
    }

    @Override
    public void saveUser(String user) {
        System.out.println("saving user !!!");
    }
}
