package cn.itedus.lottery.req;

import java.io.Serializable;

/**
 * @author vikingar
 * @time 2024/3/1 13:32
 * @description
 */
public class ActivityReq implements Serializable {

    private Integer activateIde;

    public Integer getActivateIde() {
        return activateIde;
    }

    public void setActivateIde(Integer activateIde) {
        this.activateIde = activateIde;
    }
}
