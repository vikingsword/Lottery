package cn.itedus.lottery;

import cn.itedus.lottery.req.DrawReq;
import cn.itedus.lottery.req.QuantificationDrawReq;
import cn.itedus.lottery.res.DrawRes;

/**
 * @author vikingar
 * @time 2024/3/11 21:47
 * @description 抽奖活动展台接口
 */
public interface ILotteryActivityBooth {

    /**
     * 指定活动抽奖
     * @param drawReq 请求参数
     * @return        抽奖结果
     */
    DrawRes doDraw(DrawReq drawReq);

    /**
     * 量化人群抽奖
     * @param quantificationDrawReq 请求参数
     * @return                      抽奖结果
     */
    DrawRes doQuantificationDraw(QuantificationDrawReq quantificationDrawReq);

}
