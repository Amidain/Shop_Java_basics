import java.util.ArrayList;
import java.util.List;


public class UsersData {
    List<User> usersList;

    public UsersData() {
        usersList = new ArrayList<>();
        usersList.addAll(List.of(new User("Carl", "Levy", "levy13", "crocodile123", 1),
                                new User("Monica","Tenson", "flower546", "monicaTen09", 2),
                                new User("Sunny", "String", "Sunset", "belieber549", 3),
                                new User("Michael", "Bumblebee", "Transformer", "deceptiCONS12", 4),
                                new User("George", "Bush", "BushJr", "america123", 5),
                                new User("Leesha", "Herbalist", "lovePaintedMan", "mintAndVerbena1", 6),
                                new User("Roy", "Fernandez", "fernando18", "jackpot84", 7),
                                new User("Noelle", "West", "meLody31", "singSingsing", 8),
                                new User("Han", "Solo", "chewbaccaLover", "smuggler876", 9))
        );
    }

    public void addUser(User user){
        if(user == null) {
            throw new IllegalArgumentException("User cannot be null!");
        }
        usersList.add(user);
    }

    public List<User> getUsers (){
        return usersList;
    }

    public void removeUser (User user){
        if(user == null) {
            throw new IllegalArgumentException("User cannot be null!");
        }
        usersList.remove(user);
    }

    public User getUserByLogin(String login){
        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).getLogin().equals(login)) {
                return usersList.get(i);
            }
        }
        throw new IllegalArgumentException("User with given login: '" + login + "' does not exists!");
    }

    public User getUserById(int id){
        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).id == id) {
                return usersList.get(i);
            }
        }
        throw new IllegalArgumentException("User with given id: '" + id + "' does not exists!");
    }


}
