package cn.itedus.lottery.application.process.res;

import cn.itedus.lottery.common.Result;

/**
 * @author vikingar
 * @time 2024/3/11 21:12
 * @description
 */
public class RuleQuantificationCrowdResult extends Result {

    /** 活动ID */
    private Long activityId;

    public RuleQuantificationCrowdResult(String code, String info) {
        super(code, info);
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }
}
