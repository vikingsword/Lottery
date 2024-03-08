package cn.itedus.lottery.domain.rule.service.logic.impl;

import cn.itedus.lottery.domain.rule.model.req.DecisionMatterReq;
import cn.itedus.lottery.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;

/**
 * @author vikingar
 * @time 2024/3/8 14:47
 * @description
 */
@Component
public class UserAgeFilter extends BaseLogic {

    @Override
    public String matterValue(DecisionMatterReq decisionMatter) {
        return decisionMatter.getValMap().get("age").toString();
    }

}
