
package enkapsulasi;


public class main {
    public static void main(String[] args) {
        
        User user = new User("aaa","bbb");
        
        user.setUsername("lol");
        user.setPassword("lil");
        user.setStatus(false);
        user.setId(0);
        
        System.out.println("username :"+user.getUsername());
        System.out.println("password :"+user.getPassword());
        
    }
}
