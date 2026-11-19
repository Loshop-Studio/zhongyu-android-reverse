package com.blankj.utilcode.util;

import android.media.AudioManager;
import android.os.Build;

/* loaded from: classes3.dex */
public class VolumeUtils {
    public static int getMaxVolume(int i9) {
        return ((AudioManager) Utils.getApp().getSystemService("audio")).getStreamMaxVolume(i9);
    }

    public static int getMinVolume(int i9) {
        AudioManager audioManager = (AudioManager) Utils.getApp().getSystemService("audio");
        if (Build.VERSION.SDK_INT >= 28) {
            return audioManager.getStreamMinVolume(i9);
        }
        return 0;
    }

    public static int getVolume(int i9) {
        return ((AudioManager) Utils.getApp().getSystemService("audio")).getStreamVolume(i9);
    }

    public static void setVolume(int i9, int i10, int i11) {
        try {
            ((AudioManager) Utils.getApp().getSystemService("audio")).setStreamVolume(i9, i10, i11);
        } catch (SecurityException unused) {
        }
    }
}
