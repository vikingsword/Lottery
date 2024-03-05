package cn.itedus.lottery.test.domain;

import cn.hutool.core.net.NetUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;

/**
 * @author vikingar
 * @time 2024/3/5 21:33
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SupportTest {

    @Test
    public void test_calendar() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));

        System.out.println(NetUtil.getLocalhostStr());

        long l = NetUtil.ipv4ToLong(NetUtil.getLocalhostStr());
        System.out.println(l);
    }
}
