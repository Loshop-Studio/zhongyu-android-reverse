package com.shuyu.gsyvideoplayer.cache;

/* loaded from: classes5.dex */
public class CacheFactory {
    private static Class<? extends ICacheManager> sICacheManager;

    public static ICacheManager getCacheManager() {
        if (sICacheManager == null) {
            sICacheManager = ProxyCacheManager.class;
        }
        try {
            return sICacheManager.newInstance();
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
            return null;
        } catch (InstantiationException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static void setCacheManager(Class<? extends ICacheManager> cls) {
        sICacheManager = cls;
    }
}
