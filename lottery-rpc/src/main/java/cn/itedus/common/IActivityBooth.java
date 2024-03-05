package cn.itedus.common;

import cn.itedus.common.req.ActivityReq;
import cn.itedus.common.res.ActivityRes;

public interface IActivityBooth {

    ActivityRes queryActivityById(ActivityReq req);

}
