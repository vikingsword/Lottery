package cn.itedus.common.domain.strategy.service.draw;

import cn.itedus.common.domain.strategy.model.req.DrawReq;
import cn.itedus.common.domain.strategy.model.res.DrawResult;

public interface IDrawExec {
    /**
     * 抽奖方法
     * @param req 抽奖参数；用户ID、策略ID
     * @return    中奖结果
     */
    DrawResult doDrawExec(DrawReq req);
}
