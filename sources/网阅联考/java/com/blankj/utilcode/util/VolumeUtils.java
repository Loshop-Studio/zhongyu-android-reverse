package com.blankj.utilcode.util;

import android.media.AudioManager;
import android.os.Build;

/* loaded from: classes2.dex */
public class VolumeUtils {
    public static int getMaxVolume(int i4) {
        return ((AudioManager) Utils.getApp().getSystemService("audio")).getStreamMaxVolume(i4);
    }

    public static int getMinVolume(int i4) {
        AudioManager audioManager = (AudioManager) Utils.getApp().getSystemService("audio");
        if (Build.VERSION.SDK_INT >= 28) {
            return audioManager.getStreamMinVolume(i4);
        }
        return 0;
    }

    public static int getVolume(int i4) {
        return ((AudioManager) Utils.getApp().getSystemService("audio")).getStreamVolume(i4);
    }

    public static void setVolume(int i4, int i5, int i6) {
        try {
            ((AudioManager) Utils.getApp().getSystemService("audio")).setStreamVolume(i4, i5, i6);
        } catch (SecurityException unused) {
        }
    }
}
