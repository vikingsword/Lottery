package cn.itedus.common.domain.award.service.goods;

import cn.itedus.common.domain.award.model.req.GoodsReq;
import cn.itedus.common.domain.award.model.res.DistributionRes;

public interface IDistributionGoods {

    DistributionRes doDistribution(GoodsReq req);


    Integer getDistributionGoodsName();

}
