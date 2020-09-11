package vip.efactory.modules.mnt.service.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import vip.efactory.annotation.Query;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author zhanghouying
 * @date 2019-08-24
 */
@Data
public class ServerDeployQueryCriteria {

    /**
     * 模糊
     */
    @Query(blurry = "name,ip,account")
    private String blurry;

    @Query(type = Query.Type.BETWEEN)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private List<LocalDateTime> createTime;
}
