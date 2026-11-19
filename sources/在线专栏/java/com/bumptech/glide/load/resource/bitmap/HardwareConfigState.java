package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;

/* loaded from: classes.dex */
public final class HardwareConfigState {
    private static final File FD_SIZE_LIST = new File("/proc/self/fd");
    private static final int MAXIMUM_FDS_FOR_HARDWARE_CONFIGS_O = 700;
    private static final int MAXIMUM_FDS_FOR_HARDWARE_CONFIGS_P = 20000;
    private static final int MINIMUM_DECODES_BETWEEN_FD_CHECKS = 50;
    static final int MIN_HARDWARE_DIMENSION_O = 128;
    private static final int MIN_HARDWARE_DIMENSION_P = 0;
    private static volatile HardwareConfigState instance;
    private int decodesSinceLastFdCheck;
    private final int fdCountLimit;
    private boolean isFdSizeBelowHardwareLimit = true;
    private final boolean isHardwareConfigAllowedByDeviceModel = isHardwareConfigAllowedByDeviceModel();
    private final int minHardwareDimension;

    HardwareConfigState() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.fdCountLimit = MAXIMUM_FDS_FOR_HARDWARE_CONFIGS_P;
            this.minHardwareDimension = 0;
        } else {
            this.fdCountLimit = MAXIMUM_FDS_FOR_HARDWARE_CONFIGS_O;
            this.minHardwareDimension = 128;
        }
    }

    public static HardwareConfigState getInstance() {
        if (instance == null) {
            synchronized (HardwareConfigState.class) {
                if (instance == null) {
                    instance = new HardwareConfigState();
                }
            }
        }
        return instance;
    }

    private synchronized boolean isFdSizeBelowHardwareLimit() {
        boolean z3 = true;
        int i4 = this.decodesSinceLastFdCheck + 1;
        this.decodesSinceLastFdCheck = i4;
        if (i4 >= 50) {
            this.decodesSinceLastFdCheck = 0;
            int length = FD_SIZE_LIST.list().length;
            if (length >= this.fdCountLimit) {
                z3 = false;
            }
            this.isFdSizeBelowHardwareLimit = z3;
            if (!z3 && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.fdCountLimit);
            }
        }
        return this.isFdSizeBelowHardwareLimit;
    }

    private static boolean isHardwareConfigAllowedByDeviceModel() {
        String str = Build.MODEL;
        if (str == null || str.length() < 7) {
            return true;
        }
        String strSubstring = str.substring(0, 7);
        strSubstring.hashCode();
        switch (strSubstring) {
            case "SM-A520":
            case "SM-G930":
            case "SM-G935":
            case "SM-G960":
            case "SM-G965":
            case "SM-J720":
            case "SM-N935":
                if (Build.VERSION.SDK_INT != 26) {
                }
                break;
        }
        return true;
    }

    public boolean isHardwareConfigAllowed(int i4, int i5, boolean z3, boolean z4) {
        int i6;
        return z3 && this.isHardwareConfigAllowedByDeviceModel && Build.VERSION.SDK_INT >= 26 && !z4 && i4 >= (i6 = this.minHardwareDimension) && i5 >= i6 && isFdSizeBelowHardwareLimit();
    }

    @TargetApi(26)
    boolean setHardwareConfigIfAllowed(int i4, int i5, BitmapFactory.Options options, boolean z3, boolean z4) {
        boolean zIsHardwareConfigAllowed = isHardwareConfigAllowed(i4, i5, z3, z4);
        if (zIsHardwareConfigAllowed) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zIsHardwareConfigAllowed;
    }
}
