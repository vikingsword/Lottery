package cn.itedus.lottery.res;

import cn.itedus.lottery.Result;
import cn.itedus.lottery.dto.ActivityDto;

import java.io.Serializable;

/**
 * @author vikingar
 * @time 2024/3/1 13:33
 * @description
 */
public class ActivityRes implements Serializable {

    private Result result;

    private ActivityDto activity;

    public ActivityRes() {
    }

    public ActivityRes(Result result, ActivityDto activity) {
        this.result = result;
        this.activity = activity;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public ActivityDto getActivity() {
        return activity;
    }

    public void setActivity(ActivityDto activity) {
        this.activity = activity;
    }
}
