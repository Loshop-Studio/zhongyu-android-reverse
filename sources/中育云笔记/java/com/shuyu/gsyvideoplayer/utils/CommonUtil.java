package com.shuyu.gsyvideoplayer.utils;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.TintContextWrapper;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.FragmentActivity;
import anet.channel.strategy.dispatch.DispatchConstants;
import java.io.File;
import java.util.Formatter;
import java.util.Locale;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes5.dex */
public class CommonUtil {
    public static void deleteFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            for (String str2 : file.list()) {
                deleteFile(str + File.separator + str2);
            }
            file.delete();
        }
    }

    public static int dip2px(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int getActionBarHeight(Activity activity) {
        TypedValue typedValue = new TypedValue();
        if (activity.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, activity.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static Activity getActivityContext(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof TintContextWrapper) {
            return scanForActivity(((TintContextWrapper) context).getBaseContext());
        }
        if (context instanceof ContextWrapper) {
            return scanForActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static Activity getActivityNestWrapper(Context context) {
        return getActivityContext(context);
    }

    public static AppCompatActivity getAppCompActivity(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof AppCompatActivity) {
            return (AppCompatActivity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            return getAppCompActivity(((ContextThemeWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean getCurrentScreenLand(Activity activity) {
        return activity.getWindowManager().getDefaultDisplay().getRotation() == 1 || activity.getWindowManager().getDefaultDisplay().getRotation() == 3;
    }

    public static int getScreenHeight(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int getScreenWidth(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", DispatchConstants.ANDROID);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static String getTextSpeed(long j10) {
        if (j10 >= 0 && j10 < 1024) {
            return j10 + " KB/s";
        }
        if (j10 >= 1024 && j10 < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return Long.toString(j10 / 1024) + " KB/s";
        }
        if (j10 < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED || j10 >= IjkMediaMeta.AV_CH_STEREO_RIGHT) {
            return "";
        }
        return Long.toString(j10 / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) + " MB/s";
    }

    public static void hideNavKey(Context context) {
        if (getActivityNestWrapper(context) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            getActivityNestWrapper(context).getWindow().getDecorView().setSystemUiVisibility(3074);
        } else {
            getActivityNestWrapper(context).getWindow().getDecorView().setSystemUiVisibility(2562);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public static void hideSupportActionBar(Context context, boolean z10, boolean z11) {
        AppCompatActivity appCompActivity;
        ActionBar supportActionBar;
        if (z10 && (appCompActivity = getAppCompActivity(context)) != null && (supportActionBar = appCompActivity.getSupportActionBar()) != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
            supportActionBar.hide();
        }
        if (z11) {
            if (context instanceof FragmentActivity) {
                ((FragmentActivity) context).getWindow().setFlags(1024, 1024);
            } else if (context instanceof Activity) {
                ((Activity) context).getWindow().setFlags(1024, 1024);
            } else {
                getActivityNestWrapper(context).getWindow().setFlags(1024, 1024);
            }
        }
    }

    public static boolean isEdgeToEdgeEnabled(Context context) {
        Window window = getActivityContext(context).getWindow();
        if (window != null) {
            return ((window.getAttributes().flags & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0 && (window.getAttributes().flags & 134217728) == 0) ? false : true;
        }
        return false;
    }

    public static boolean isWifiConnected(Context context) {
        NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1);
        if (networkInfo == null) {
            return false;
        }
        return networkInfo.isConnected();
    }

    public static int px2dip(Context context, float f10) {
        return (int) ((f10 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Activity scanForActivity(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof TintContextWrapper) {
            return scanForActivity(((TintContextWrapper) context).getBaseContext());
        }
        if (context instanceof ContextWrapper) {
            return scanForActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void showNavKey(Context context, int i10) {
        getActivityNestWrapper(context).getWindow().getDecorView().setSystemUiVisibility(i10);
    }

    @SuppressLint({"RestrictedApi"})
    public static void showSupportActionBar(Context context, boolean z10, boolean z11) {
        AppCompatActivity appCompActivity;
        ActionBar supportActionBar;
        if (z10 && (appCompActivity = getAppCompActivity(context)) != null && (supportActionBar = appCompActivity.getSupportActionBar()) != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
            supportActionBar.show();
        }
        if (z11) {
            if (context instanceof FragmentActivity) {
                ((FragmentActivity) context).getWindow().clearFlags(1024);
            } else if (context instanceof Activity) {
                ((Activity) context).getWindow().clearFlags(1024);
            } else {
                getActivityNestWrapper(context).getWindow().clearFlags(1024);
            }
        }
    }

    public static String stringForTime(long j10) {
        long j11 = j10 / 1000;
        long j12 = j11 % 60;
        long j13 = (j11 / 60) % 60;
        long j14 = j11 / 3600;
        Formatter formatter = new Formatter(new StringBuilder(), Locale.getDefault());
        return j14 > 0 ? formatter.format("%d:%02d:%02d", Long.valueOf(j14), Long.valueOf(j13), Long.valueOf(j12)).toString() : formatter.format("%02d:%02d", Long.valueOf(j13), Long.valueOf(j12)).toString();
    }
}
