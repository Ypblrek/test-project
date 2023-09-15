package KlassZadachka;

public class Klass {
    public static void main(String[] args){
        System.out.println("Hello world");
        String s = "Egor";
        String s2 = "Egor";
        System.out.println(s==s2);

        String email="egorss@list.ru";
        String emailMailRu= email.replace("list.ru","mail.ru");




        System.out.println("email - " + email);
        System.out.println("emailMailRu - " + emailMailRu);

        StringBuilder str = new StringBuilder("Egor");
        str.append("  ");
        str.append("Pozniak");
        String egor = str.toString();
    }
}
