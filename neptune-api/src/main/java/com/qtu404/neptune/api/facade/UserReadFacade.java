package com.qtu404.neptune.api.facade;

import com.qtu404.neptune.api.request.user.*;
import com.qtu404.neptune.api.response.user.UserInfoResponse;
import com.qtu404.neptune.util.model.Response;

/**
 * @author DingXing wb-dx470808@alibaba-inc.com
 * @date 2019/2/25 下午1:15
 */
public interface UserReadFacade {
    Response<Long> login(UserLoginRequest request);

    Response<Boolean> existPhone(ExistPhoneRequest request);

    Response<Boolean> existUsername(ExistUsernameRequest request);

    Response<Boolean> existEmail(ExistEmailRequest request);

    Response<Boolean> sendRegisterVerificationSMS(SendRegisterVerificationSmsRequest request);

    Response<UserInfoResponse> findSingleUserInfoById(FindSingleUserInfoRequest request);

    Response<UserInfoResponse> modifyUserInfo(UserModifyInfoRequest request);

    Response<Long> register(UserRegistryRequest request);
}
