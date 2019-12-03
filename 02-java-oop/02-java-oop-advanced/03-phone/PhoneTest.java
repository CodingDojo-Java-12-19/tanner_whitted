public class PhoneTest {
    public static void main (String[] args){
        Galaxy note10 = new Galaxy("Note 10", 66, "Verizon", "zzz zzz");
        IPhone eleven = new IPhone("11", 43, "AT&T", "zzz zzz zzzzz");

        note10.displayInfo();

        eleven.displayInfo();
    }
}