package cn.itedus.lottery.test.domain;

import cn.hutool.core.net.NetUtil;
import cn.itedus.common.Constants;
import cn.itedus.lottery.domain.support.ids.IIdGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Map;

/**
 * @author vikingar
 * @time 2024/3/5 21:33
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SupportTest {

    private Logger logger = LoggerFactory.getLogger(SupportTest.class);

    @Resource
    private Map<Constants.Ids, IIdGenerator> idGeneratorMap;

    @Test
    public void test_calendar() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));

        System.out.println(NetUtil.getLocalhostStr());

        long l = NetUtil.ipv4ToLong(NetUtil.getLocalhostStr());
        System.out.println(l);
    }

    @Test
    public void test_ids() {
        logger.info("雪花算法策略，生成ID：{}", idGeneratorMap.get(Constants.Ids.SnowFlake).nextId());
        logger.info("日期算法策略，生成ID：{}", idGeneratorMap.get(Constants.Ids.ShortCode).nextId());
        logger.info("随机算法策略，生成ID：{}", idGeneratorMap.get(Constants.Ids.RandomNumeric).nextId());
    }


}
