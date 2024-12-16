package com.comarch.szkolenia.abstrakcja;

public interface UserRepositoryInterface {
    String loadUser();
    String loadUserById(int id);
    void updateUser(String user);
    void saveUser(String user);

    default boolean cos() {
        k1();
        k2();
        k3();
        return true;
    }

    private void k1() {

    }

    private void k2() {

    }

    private void k3() {

    }
}
