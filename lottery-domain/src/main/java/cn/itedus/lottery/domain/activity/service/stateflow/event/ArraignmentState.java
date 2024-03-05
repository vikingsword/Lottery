package cn.itedus.lottery.domain.activity.service.stateflow.event;

import cn.itedus.lottery.Constants;
import cn.itedus.lottery.Result;
import cn.itedus.lottery.domain.activity.service.stateflow.AbstractState;
import org.springframework.stereotype.Component;

/**
 * @author vikingar
 * @time 2024/3/5 17:57
 * @description
 */
@Component
public class ArraignmentState extends AbstractState {

    @Override
    public Result arraignment(Long activityId, Enum<Constants.ActivityState> currentState) {
        return Result.buildResult(Constants.ResponseCode.UN_ERROR, "待审核状态不能提审");
    }

    @Override
    public Result checkPass(Long activityId, Enum<Constants.ActivityState> currentState) {
        return null;
    }

    @Override
    public Result checkRefuse(Long activityId, Enum<Constants.ActivityState> currentState) {
        return null;
    }

    @Override
    public Result checkRevoke(Long activityId, Enum<Constants.ActivityState> currentState) {
        return null;
    }

    @Override
    public Result close(Long activityId, Enum<Constants.ActivityState> currentState) {
        return null;
    }

    @Override
    public Result open(Long activityId, Enum<Constants.ActivityState> currentState) {
        return null;
    }

    @Override
    public Result doing(Long activityId, Enum<Constants.ActivityState> currentState) {
        return null;
    }
}
