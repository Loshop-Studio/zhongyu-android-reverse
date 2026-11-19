package com.shuyu.gsyvideoplayer.player;

/* loaded from: classes5.dex */
public class PlayerFactory {
    private static Class<? extends IPlayerManager> sPlayerManager;

    public static IPlayerManager getPlayManager() {
        if (sPlayerManager == null) {
            sPlayerManager = IjkPlayerManager.class;
        }
        try {
            return sPlayerManager.newInstance();
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
            return null;
        } catch (InstantiationException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static void setPlayManager(Class<? extends IPlayerManager> cls) {
        sPlayerManager = cls;
    }
}
