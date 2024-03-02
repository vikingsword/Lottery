package cn.itedus.lottery.domain.strategy.service.draw;

import cn.itedus.lottery.domain.strategy.repo.IStrategyRepository;

import javax.annotation.Resource;

/**
 * @author vikingar
 * @time 2024/3/2 16:48
 * @description
 */
public class DrawStrategySupport extends DrawConfig{

    @Resource
    private IStrategyRepository strategyRepository;

}
