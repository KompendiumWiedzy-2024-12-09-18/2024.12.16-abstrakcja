package com.comarch.szkolenia.abstrakcja;

public class DummyImpl extends UserRepositoryImplementation {

    @Override
    public void updateUser(String user) {
        System.out.println();
    }

    @Override
    public void saveUser(String user) {
        System.out.println();
    }
}
