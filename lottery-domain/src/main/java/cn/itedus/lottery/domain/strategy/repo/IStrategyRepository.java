package cn.itedus.lottery.domain.strategy.repo;

import cn.itedus.lottery.domain.strategy.model.aggregrates.StrategyRich;
import cn.itedus.lottery.infrastructure.po.Award;

import java.util.List;

/**
 * @author vikingar
 * @time 2024/3/2 13:22
 * @description
 */
public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);

    List<String> queryNoStockStrategyAwardList(Long strategyId);

    /**
     * 扣减库存
     * @param strategyId 策略ID
     * @param awardId    奖品ID
     * @return           扣减结果
     */
    boolean deductStock(Long strategyId, String awardId);

}