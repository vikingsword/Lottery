package cn.itedus.common.req;

import java.io.Serializable;

/**
 * @author vikingar
 * @time 2024/3/1 13:32
 * @description
 */
public class ActivityReq implements Serializable {

    private Long activityId;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

}
