import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class UsersDataTests {
        UsersData usersData = new UsersData();
        int listSize = usersData.usersList.size();

    @Test
    public void addUser_NewUser_Added(){
        User user1 = new User("Camila", "Cabello", "Camcabby", "Havana19", 12);
        usersData.addUser(user1);

        Assert.assertEquals(listSize + 1, usersData.usersList.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addUser_NullAsParam_IllegalArgumentExceptionThrown() {
        usersData.addUser(null);
    }

    @Test
    public void getUsers_ListOfUsers_Returned(){
        Assert.assertEquals(usersData.usersList, usersData.getUsers());
    }

    @Test
    public void removeUsers_ExistingUser_Removed(){
        usersData.removeUser(new User("Camila", "Cabello", "Camcabby", "Havana19", 12));

        Assert.assertEquals(listSize, usersData.usersList.size());
    }

    @Test
    public void removeUsers_NotExistingUser_ErrorValueReturned(){
        usersData.removeUser(new User("Carl", "Levy", "levy13", "crocodile123", 1));

        Assert.assertEquals(listSize - 1, usersData.usersList.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeUser_NullAsParam_IllegalArgumentExceptionThrown() {
        usersData.removeUser(null);
    }

    @Test
    public void getUSerByLogin_ExistingUserLogin_Returned(){
        User carl = new User("Carl", "Levy", "levy13", "crocodile123", 1);
        Assert.assertEquals(carl, usersData.getUserByLogin("levy13"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getUserById_NotExistingLogin_IllegalExceptionErrorThrown(){
        usersData.getUserByLogin("George");
    }
    @Test
    public void getUserById_ExistingUserId_Returned(){
        User carl = new User("Carl", "Levy", "levy13", "crocodile123", 1);
        Assert.assertEquals(carl, usersData.getUserById(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getUserById_NegativeUserIdAsParam_IllegalExceptionErrorThrown(){
        usersData.getUserById(-1);
    }
}
