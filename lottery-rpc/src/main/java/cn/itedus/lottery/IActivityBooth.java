package cn.itedus.lottery;

import cn.itedus.lottery.req.ActivityReq;
import cn.itedus.lottery.res.ActivityRes;

public interface IActivityBooth {

    ActivityRes queryActivityById(ActivityReq req);

}
