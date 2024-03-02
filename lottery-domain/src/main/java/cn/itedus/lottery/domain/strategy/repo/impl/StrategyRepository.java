package cn.itedus.lottery.domain.strategy.repo.impl;

import cn.itedus.lottery.domain.strategy.model.aggregrates.StrategyRich;
import cn.itedus.lottery.domain.strategy.repo.IStrategyRepository;
import cn.itedus.lottery.infrastructure.po.Award;

/**
 * @author vikingar
 * @time 2024/3/2 13:24
 * @description
 */
public class StrategyRepository implements IStrategyRepository {
    @Override
    public StrategyRich queryStrategyRich(Long strategyId) {
        return null;
    }

    @Override
    public Award queryAwardInfo(String awardId) {
        return null;
    }
}
