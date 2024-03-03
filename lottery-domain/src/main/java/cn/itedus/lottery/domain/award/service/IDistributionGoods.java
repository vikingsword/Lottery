package cn.itedus.lottery.domain.award.service;

import cn.itedus.lottery.domain.award.model.req.GoodsReq;
import cn.itedus.lottery.domain.award.model.res.DistributionRes;

public interface IDistributionGoods {

    DistributionRes doDistribution(GoodsReq req);


    Integer getDistributionGoodsName();

}
