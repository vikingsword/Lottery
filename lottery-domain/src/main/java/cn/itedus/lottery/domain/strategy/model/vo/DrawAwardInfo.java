package cn.itedus.lottery.domain.strategy.model.vo;

/**
 * @author vikingar
 * @time 2024/3/2 17:20
 * @description
 */
public class DrawAwardInfo {

    private String awardId;

    private String awardName;

    public DrawAwardInfo() {
    }

    public DrawAwardInfo(String awardId, String awardName) {
        this.awardId = awardId;
        this.awardName = awardName;
    }

    public String getAwardId() {
        return awardId;
    }

    public void setAwardId(String awardId) {
        this.awardId = awardId;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }
}
