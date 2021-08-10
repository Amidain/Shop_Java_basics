import java.util.Objects;

public class User {
    private String name;
    private String surname;
    private String login;
    private String haslo;
    int id;

    public User() {
    }

    public User(String name, String surname, String login, String haslo, int id) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.haslo = haslo;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", login='" + login + '\'' +
                ", haslo='" + haslo + '\'' +
                ", id=" + id +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o == null) && (o instanceof User));
        User user = (User) o;
        if(this.id == user.id &&
                this.getName().equals(user.getName()) &&
                this.getSurname().equals(user.getSurname()) &&
                this.getLogin().equals(user.getLogin()) &&
                this.getHaslo().equals(user.getHaslo())){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getLogin(), getHaslo(), id);
    }
}
