package cn.itedus.common.interfaces;

import cn.itedus.common.IActivityBooth;
import cn.itedus.common.Result;
import cn.itedus.common.dto.ActivityDto;
import cn.itedus.common.infrastructure.dao.IActivityDao;
import cn.itedus.common.infrastructure.po.Activity;
import cn.itedus.common.req.ActivityReq;
import cn.itedus.common.res.ActivityRes;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * @author vikingar
 * @time 2024/3/1 13:41
 * @description
 */
@Service
public class ActivityBooth implements IActivityBooth {

    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {

        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(Result.buildSuccessResult(), activityDto);

    }
}
