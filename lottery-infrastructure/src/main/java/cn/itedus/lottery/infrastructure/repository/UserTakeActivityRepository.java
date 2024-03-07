package cn.itedus.lottery.infrastructure.repository;

import cn.itedus.lottery.domain.activity.repo.IUserTakeActivityRepository;
import org.springframework.stereotype.Service;

/**
 * @author vikingar
 * @time 2024/3/7 12:53
 * @description
 */
@Service
public class UserTakeActivityRepository implements IUserTakeActivityRepository {


    @Override
    public int subtractionLeftCount(Long activityId, String activityName, Integer takeCount, Integer userTakeLeftCount, String uId, Date partakeDate) {
        return 0;
    }

    @Override
    public void takeActivity(Long activityId, String activityName, Integer takeCount, Integer userTakeLeftCount, String uId, Date takeDate, Long takeId) {

    }
}
