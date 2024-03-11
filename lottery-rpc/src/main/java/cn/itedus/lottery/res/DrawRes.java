package cn.itedus.lottery.res;

import cn.itedus.lottery.common.Result;
import cn.itedus.lottery.dto.AwardDTO;

import java.io.Serializable;

/**
 * @author vikingar
 * @time 2024/3/11 21:54
 * @description
 */
public class DrawRes extends Result implements Serializable {

    private AwardDTO awardDTO;

    public DrawRes(String code, String info) {
        super(code, info);
    }

    public AwardDTO getAwardDTO() {
        return awardDTO;
    }

    public void setAwardDTO(AwardDTO awardDTO) {
        this.awardDTO = awardDTO;
    }

}
