import com.java.dao.UserDao;
import com.java.entity.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao dao = (UserDao) ctx.getBean("userDao");
        User users = dao.queryAll("1");
        System.out.println(users);
    }
}
