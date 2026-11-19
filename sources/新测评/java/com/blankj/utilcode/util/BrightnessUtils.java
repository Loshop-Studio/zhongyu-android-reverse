package com.blankj.utilcode.util;

import android.content.ContentResolver;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.collection.ScatterMapKt;

/* loaded from: classes3.dex */
public final class BrightnessUtils {
    private BrightnessUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static int getBrightness() {
        try {
            return Settings.System.getInt(Utils.getApp().getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static int getWindowBrightness(@NonNull Window window) {
        float f10 = window.getAttributes().screenBrightness;
        return f10 < 0.0f ? getBrightness() : (int) (f10 * 255.0f);
    }

    public static boolean isAutoBrightnessEnabled() {
        try {
            return Settings.System.getInt(Utils.getApp().getContentResolver(), "screen_brightness_mode") == 1;
        } catch (Settings.SettingNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean setAutoBrightnessEnabled(boolean z9) {
        return Settings.System.putInt(Utils.getApp().getContentResolver(), "screen_brightness_mode", z9 ? 1 : 0);
    }

    public static boolean setBrightness(@IntRange(from = 0, m488to = ScatterMapKt.Sentinel) int i10) {
        ContentResolver contentResolver = Utils.getApp().getContentResolver();
        boolean zPutInt = Settings.System.putInt(contentResolver, "screen_brightness", i10);
        contentResolver.notifyChange(Settings.System.getUriFor("screen_brightness"), null);
        return zPutInt;
    }

    public static void setWindowBrightness(@NonNull Window window, @IntRange(from = 0, m488to = ScatterMapKt.Sentinel) int i10) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = i10 / 255.0f;
        window.setAttributes(attributes);
    }
}
