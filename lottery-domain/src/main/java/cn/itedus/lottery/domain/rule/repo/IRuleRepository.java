package cn.itedus.lottery.domain.rule.repo;

import cn.itedus.lottery.domain.rule.model.aggregates.TreeRuleRich;

/**
 * @author vikingar
 * @time 2024/3/8 14:44
 * @description
 */
public interface IRuleRepository {

    /**
     * 查询规则决策树配置
     *
     * @param treeId    决策树ID
     * @return          决策树配置
     */
    TreeRuleRich queryTreeRuleRich(Long treeId);

}
