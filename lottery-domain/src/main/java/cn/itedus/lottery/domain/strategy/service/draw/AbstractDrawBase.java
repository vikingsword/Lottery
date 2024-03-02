package cn.itedus.lottery.domain.strategy.service.draw;

import cn.itedus.lottery.domain.strategy.model.aggregrates.StrategyRich;
import cn.itedus.lottery.domain.strategy.model.req.DrawReq;
import cn.itedus.lottery.domain.strategy.model.res.DrawResult;
import cn.itedus.lottery.domain.strategy.repo.IStrategyRepository;
import cn.itedus.lottery.domain.strategy.service.algorithm.IDrawAlgorithm;
import cn.itedus.lottery.domain.strategy.service.draw.impl.DrawExecImpl;
import cn.itedus.lottery.infrastructure.po.Award;
import cn.itedus.lottery.infrastructure.po.Strategy;
import cn.itedus.lottery.infrastructure.po.StrategyDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author vikingar
 * @time 2024/3/2 16:48
 * @description 定义抽象抽奖过程，模板模式
 */
public abstract class AbstractDrawBase extends DrawStrategySupport implements IDrawExec{

    private Logger logger = LoggerFactory.getLogger(DrawExecImpl.class);

    @Override
    public DrawResult doDrawExec(DrawReq req) {
        logger.info("执行策略抽奖开始，strategyId：{}", req.getStrategyId());

        return null;
    }
}
