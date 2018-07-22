package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.services.ItemService;
import com.services.UserService;
import com.services.VaultService;

public class UserSystemTest {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-application.xml");
        UserService userService =
                applicationContext.getBean("userService", UserService.class);
        ItemService itemService =
                applicationContext.getBean("itemService", ItemService.class);
        VaultService vaultService =
                applicationContext.getBean("vaultService", VaultService.class);
        System.out.println("Users:");
        System.out.println(userService.getUserList() );
        System.out.println("Items:");
        System.out.println(itemService.getAllItems() );
        System.out.println("VaultOrg location:");
        System.out.println(vaultService.getLocation() );
    }
}
