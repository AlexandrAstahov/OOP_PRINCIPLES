public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "1234 № 123456";
        post.patronymic = "Иванович";
        post.phone = "+7 (777)-666-55-44";
        post.surname = "Астахов";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 2;
        post.birthday.month = 1;
        post.birthday.year = 1985;

        System.out.println("ФИО -" + post.surname +" "+ post.name
                +" "+ post.patronymic+". "  +"Дата рождения: "+ post.birthday.day+"."+post.birthday.month+"."+post.birthday.year+".г");

    }

}