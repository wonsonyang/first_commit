package src.test;

import com.efun.pojo.People;
import com.efun.service.PeopleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class PeopleServiceTest {


    @Autowired
    private PeopleService peopleService;

    @Test
    public void testGetById() {
        //测试查询对应的用户
        People people = peopleService.getById(2);
        System.out.println(people.toString());
    }


}
