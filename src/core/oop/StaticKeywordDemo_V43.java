package core.oop;

public class StaticKeywordDemo_V43 {
    public static void main(String[] args) {
        // static

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        Friend.showFriends(); //metot bir obje üzerinden değil class üzerinden çağrılıyor.

    }
}
