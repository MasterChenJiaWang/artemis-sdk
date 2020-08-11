package com.daren.chen.sdk.artemis.utils;

/**
 * @Description:
 * @author: chendaren
 * @CreateDate: 2020/3/23 8:38
 */
public class Environment {

    /**
     *
     */
    private static final ThreadLocal<CustomizeArtemisConfig> loginUserThreadLocal = new ThreadLocal<>();

    /**
     *
     * @return
     */
    public static CustomizeArtemisConfig getCurrentUser() {
        return loginUserThreadLocal.get();
    }

    /**
     *
     * @return
     */
    public static String getAppSecret() {
        CustomizeArtemisConfig user = loginUserThreadLocal.get();
        return user == null ? null : user.getAppSecret();
    }

    /**
     *
     * @return
     */
    public static String getHost() {
        CustomizeArtemisConfig customizeArtemisConfig = loginUserThreadLocal.get();
        return customizeArtemisConfig == null ? null : customizeArtemisConfig.getHost();
    }

    /**
     *
     * @return
     */
    public static String getAppKey() {
        CustomizeArtemisConfig customizeArtemisConfig = loginUserThreadLocal.get();
        return customizeArtemisConfig == null ? null : customizeArtemisConfig.getAppKey();
    }

    /**
     *
     * @param customizeArtemisConfig
     */
    public static void setArtemisConfig(CustomizeArtemisConfig customizeArtemisConfig) {
        loginUserThreadLocal.set(customizeArtemisConfig);
    }

}
