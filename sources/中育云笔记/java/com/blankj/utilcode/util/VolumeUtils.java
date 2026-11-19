package com.blankj.utilcode.util;

import android.media.AudioManager;
import android.os.Build;

/* loaded from: classes3.dex */
public class VolumeUtils {
    public static int getMaxVolume(int i10) {
        return ((AudioManager) Utils.getApp().getSystemService("audio")).getStreamMaxVolume(i10);
    }

    public static int getMinVolume(int i10) {
        AudioManager audioManager = (AudioManager) Utils.getApp().getSystemService("audio");
        if (Build.VERSION.SDK_INT >= 28) {
            return audioManager.getStreamMinVolume(i10);
        }
        return 0;
    }

    public static int getVolume(int i10) {
        return ((AudioManager) Utils.getApp().getSystemService("audio")).getStreamVolume(i10);
    }

    public static void setVolume(int i10, int i11, int i12) {
        try {
            ((AudioManager) Utils.getApp().getSystemService("audio")).setStreamVolume(i10, i11, i12);
        } catch (SecurityException unused) {
        }
    }
}
