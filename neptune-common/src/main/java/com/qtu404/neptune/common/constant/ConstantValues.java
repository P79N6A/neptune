package com.qtu404.neptune.common.constant;

import lombok.Data;

@Data
public class ConstantValues {
    /**
     * 当前用户key
     */
    public static final String SESSION_CURRENT_USER_KEY = "CURRENT_USER";

    /**
     * 默认用户头像
     */
    public static final String DEFAULT_AVATAR = "static.qtu404.com/nf4slide/assets/user.png";
    public static final Long MIN_INVENTORY = 0L;
    public static final Long NO_PARENT = -1L;
    public static final Integer ROOT_LEVEL = 1;
    public static final Integer DEFAULT_INDEX = 1;
}
