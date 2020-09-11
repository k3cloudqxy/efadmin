package vip.efactory.modules.system.service.dto;

import lombok.Data;
import vip.efactory.annotation.Query;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Zheng Jie
 * 公共查询类
 */
@Data
public class MenuQueryCriteria {

    @Query(blurry = "name,path,component")
    private String blurry;

    @Query(type = Query.Type.BETWEEN)
    private List<LocalDateTime> createTime;
}
