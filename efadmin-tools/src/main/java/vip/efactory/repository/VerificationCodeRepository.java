package vip.efactory.repository;

import vip.efactory.ejpa.base.repository.BaseRepository;
import vip.efactory.entity.VerificationCode;

public interface VerificationCodeRepository extends BaseRepository<VerificationCode, Long> {

    /**
     * 获取有效的验证码
     *
     * @param scenes 业务场景，如重置密码，重置邮箱等等
     * @param type
     * @param value
     * @return
     */
    VerificationCode findByScenesAndTypeAndValueAndStatusIsTrue(String scenes, String type, String value);
}
