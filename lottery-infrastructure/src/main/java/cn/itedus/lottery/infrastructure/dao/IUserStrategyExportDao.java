package cn.itedus.lottery.infrastructure.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouter;
import cn.bugstack.middleware.db.router.annotation.DBRouterStrategy;
import cn.itedus.lottery.infrastructure.po.UserStrategyExport;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author vikingar
 * @time 2024/3/6 20:16
 * @description
 */
@Mapper
@DBRouterStrategy(splitTable = true)
public interface IUserStrategyExportDao {

    @DBRouter(key = "uid")
    void insert(UserStrategyExport userStrategyExport);


    @DBRouter
    UserStrategyExport queryUserStrategyExportByUId(String uid);

}
