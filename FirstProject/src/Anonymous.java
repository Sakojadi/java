public class Anonymous {
    public static void main(String[] args) {
        User a = new Admin();
        a.getUserInfo();

        //using an interface with anonymous class, implementing the function inside the main
        User u = new User(){
            @Override
            public void getUserInfo() {
                System.out.println("user info with anonymous");
            }
        };
        u.getUserInfo();
    }

}

interface User{
    void getUserInfo();
}
//creating a class for a functional(means interface with one method) interface
class Admin implements User{
    @Override
    public void getUserInfo() {
        System.out.println("user info");
    }
}
