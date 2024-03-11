package cn.itedus.lottery.interfaces.assembler;

import cn.itedus.lottery.domain.strategy.model.vo.DrawAwardVO;
import cn.itedus.lottery.dto.AwardDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

/**
 * @author vikingar
 * @time 2024/3/11 21:41
 * @description 对象转化配置
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface AwardMapping extends IMapping<DrawAwardVO, AwardDTO> {

    @Mapping(target = "userId", source = "uId")
    @Override
    AwardDTO sourceToTarget(DrawAwardVO var1);

    @Override
    DrawAwardVO targetToSource(AwardDTO var1);

}

