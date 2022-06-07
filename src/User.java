public class User<T>{

    T id;
    T card_number;

    User(T id, T card_number){
        this.id = id;
        this.card_number = card_number;
    }

    public T getId(){return id;}

    public T getCardNumber(){return card_number;}

    public static void main(String [] args){

        User user1 = new User(10255, "DFH");
        User user2 = new User(10200, 10200);
        User user3 = new User(10256, "ERF14");
        User user4 = new User("10257", "RAHM");


        System.out.println("User1 Id: "+user1.getId());
        System.out.println("User1 card number: "+user1.getCardNumber());
        System.out.println("User1 Id: "+user2.getId());
        System.out.println("User1 card number: "+user2.getCardNumber());
        System.out.println("User1 Id: "+user3.getId());
        System.out.println("User1 card number: "+user3.getCardNumber());
        System.out.println("User1 Id: "+user4.getId());
        System.out.println("User1 card number: "+user4.getCardNumber());

    }
}