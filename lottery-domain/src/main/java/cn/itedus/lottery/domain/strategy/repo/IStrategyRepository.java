package cn.itedus.lottery.domain.strategy.repo;

import cn.itedus.lottery.domain.strategy.model.aggregrates.StrategyRich;
import cn.itedus.lottery.infrastructure.po.Award;

/**
 * @author vikingar
 * @time 2024/3/2 13:22
 * @description
 */
public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);

}
