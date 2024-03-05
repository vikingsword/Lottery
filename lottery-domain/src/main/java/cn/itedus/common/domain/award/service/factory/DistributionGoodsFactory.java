package cn.itedus.common.domain.award.service.factory;

import cn.itedus.common.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Service;

/**
 * @author vikingar
 * @time 2024/3/3 23:03
 * @description goods factory
 */
@Service
public class DistributionGoodsFactory extends GoodsConfig {

    public IDistributionGoods getDistributionGoodsService(Integer awardType){
        return goodsMap.get(awardType);
    }

}
