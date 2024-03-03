package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author vikingar
 * @time 2024/3/1 13:47
 * @description
 */
@Mapper
public interface IActivityDao {

    /**
     * 插入数据
     * @param req 入参
     */
    void insert(Activity req);

    /**
     * 根据活动号查询活动信息
     *
     * @param activityId 活动号
     * @return           活动信息
     */
    Activity queryActivityById(Long activityId);

}
