package repetition.oop;

import java.time.LocalDate;

public class UserController {
    // deklaracja tablicy użytkowników
    User users_table [] = new User[100];
    int index = 0;
    // dodawanie użytkownika do tablicy
    public void addUser(String name,
                        String lastame,
                        String email,
                        String phone,
                        String login,
                        String password){
        User u = new User(
                name,
                lastame,
                email,
                phone,
                login,
                password);
        // modyfikacja pól obiektu
        u.setPermission("ROLE_USER");
        u.setId(index+1);
        u.setActivity(true);
        u.setReg_date(LocalDate.now());
        users_table[index] = u;
        // -------------------------
        index++;
        System.out.println("Pomyślnie zarejestrowano: \n"+u);
    }
    // wypisania wszystków użytkowników
    public void getAllUsers(){
        System.out.println("LISTA UŻYTKOWNIKÓW");
        for(int i = 0; i < index; i++){
            System.out.println(users_table[i]);
        }
    }
    public String getUserByLogin(String login_search){
        for(int i = 0; i < index; i++){
            if(users_table[i].getLogin().equals(login_search)){
                return users_table[i].toString();
            }
        }
        return "Brak wyników";
    }

}
