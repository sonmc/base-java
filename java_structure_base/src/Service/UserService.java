package Service;

import Interface.IUser;

public class UserService implements IUser {

    @Override
    public String get() {
        return "hello user service";
    }

    @Override
    public void create() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void deletes() {

    }

    @Override
    public void updateAfterAuth() {

    }
}
