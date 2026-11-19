package io.microshow.rxffmpeg.player;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import androidx.core.view.InputDeviceCompat;
import com.blankj.utilcode.constant.CacheConstants;

/* loaded from: classes5.dex */
public class Helper {
    private static long lastClickTime;

    public static ViewGroup getDecorView(Context context) {
        Activity activityScanForActivity = scanForActivity(context);
        if (activityScanForActivity == null) {
            return null;
        }
        return (ViewGroup) activityScanForActivity.getWindow().getDecorView();
    }

    public static int getFullScreenHeight(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        scanForActivity(context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int getScreenHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static void hideSysBar(Activity activity, ViewGroup viewGroup) {
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | InputDeviceCompat.SOURCE_TOUCHSCREEN);
        activity.getWindow().setFlags(1024, 1024);
    }

    public static synchronized boolean isFastClick() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - lastClickTime < 1000) {
            return true;
        }
        lastClickTime = jCurrentTimeMillis;
        return false;
    }

    public static Activity scanForActivity(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return scanForActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static String secdsToDateFormat(int i9, int i10) {
        String str;
        String str2;
        long j9 = i9 / CacheConstants.HOUR;
        long j10 = (i9 % CacheConstants.HOUR) / 60;
        long j11 = i9 % 60;
        String str3 = "00";
        if (j9 <= 0) {
            str = "00";
        } else if (j9 < 10) {
            str = "0" + j9;
        } else {
            str = j9 + "";
        }
        if (j10 <= 0) {
            str2 = "00";
        } else if (j10 < 10) {
            str2 = "0" + j10;
        } else {
            str2 = j10 + "";
        }
        if (j11 > 0) {
            if (j11 < 10) {
                str3 = "0" + j11;
            } else {
                str3 = j11 + "";
            }
        }
        if (i10 < 3600) {
            return str2 + ":" + str3;
        }
        return str + ":" + str2 + ":" + str3;
    }

    public static ViewGroup setFullScreen(Context context, boolean z9) {
        Activity activityScanForActivity = scanForActivity(context);
        ViewGroup decorView = getDecorView(activityScanForActivity);
        if (decorView == null) {
            return null;
        }
        if (z9) {
            hideSysBar(activityScanForActivity, decorView);
            activityScanForActivity.setRequestedOrientation(0);
            return decorView;
        }
        showSysBar(activityScanForActivity, decorView);
        activityScanForActivity.setRequestedOrientation(1);
        return decorView;
    }

    public static void showSysBar(Activity activity, ViewGroup viewGroup) {
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() & (-4099));
        activity.getWindow().clearFlags(1024);
    }

    public static ViewGroup getDecorView(Activity activity) {
        if (activity == null) {
            return null;
        }
        return (ViewGroup) activity.getWindow().getDecorView();
    }
}
