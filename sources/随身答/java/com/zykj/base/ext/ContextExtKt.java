package com.zykj.base.ext;

// RE note 本类字节码直接引用的读写或显示接口包括偏好设置。

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.Keep;
import androidx.annotation.LayoutRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p161io.FilesKt;

@Metadata(m13412d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0007\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0007\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0007\u001a;\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b*\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0007\u001a\u0014\u0010\u0018\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0016H\u0007\u001a\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0016*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0016H\u0007\u001a\f\u0010\u001c\u001a\u00020\r*\u00020\u0002H\u0007\u001a\f\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\u0007\u001a\f\u0010\u001f\u001a\u00020\r*\u00020\u0002H\u0007\u001a\f\u0010 \u001a\u00020\r*\u00020\u0002H\u0007\u001a\f\u0010!\u001a\u00020\r*\u00020\u0002H\u0007\u001a\u0014\u0010\"\u001a\u00020\u0014*\u00020\u00022\u0006\u0010#\u001a\u00020\u0016H\u0007\u001a\f\u0010$\u001a\u00020\r*\u00020\u0002H\u0007\u001a\f\u0010%\u001a\u00020\u0016*\u00020\u0002H\u0007\u001a\f\u0010&\u001a\u00020'*\u00020\u0002H\u0007¨\u0006("}, m13413d2 = {"alarmManager", "Landroid/app/AlarmManager;", "Landroid/content/Context;", "connectivityManager", "Landroid/net/ConnectivityManager;", "density", "", "getSharedPreferences", "Landroid/content/SharedPreferences;", "inflate", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroid/view/View;", "layoutId", "", "parent", "Landroid/view/ViewGroup;", "attachToRoot", "", "(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;", "installPkg", "", "path", "", "authority", "isGranted", "permission", "metaData", "key", "navigationBarHeight", "notificationManager", "Landroid/app/NotificationManager;", "screenHeight", "screenWidth", "statusBarHeight", "unInstallPkg", "pkg", "versionCode", "versionName", "windowManager", "Landroid/view/WindowManager;", "base_release"}, m13414k = 2, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class ContextExtKt {
    @Keep
    public static final AlarmManager alarmManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (systemService != null) {
            return (AlarmManager) systemService;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
    }

    @Keep
    public static final ConnectivityManager connectivityManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            return (ConnectivityManager) systemService;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    @Keep
    public static final float density(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getDisplayMetrics().density;
    }

    @Keep
    public static final SharedPreferences getSharedPreferences(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        SharedPreferences sharedPreferences = context.getSharedPreferences("art", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(\"art\", Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    @Keep
    public static final <V extends View> V inflate(Context context, @LayoutRes int i9, ViewGroup viewGroup, boolean z9) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        V v9 = (V) LayoutInflater.from(context).inflate(i9, viewGroup, z9);
        if (v9 != null) {
            return v9;
        }
        throw new NullPointerException("null cannot be cast to non-null type V of com.zykj.base.ext.ContextExtKt.inflate");
    }

    @Keep
    public static final void installPkg(Context context, String path, String authority) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(authority, "authority");
        File file = new File(path);
        if (file.isFile() && Intrinsics.areEqual(FilesKt.getExtension(file), "apk")) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.addFlags(1);
            intent.addFlags(2);
            intent.setDataAndType(FileProvider.getUriForFile(context, authority, file), "application/vnd.android.package-archive");
            context.startActivity(intent);
        }
    }

    @Keep
    public static final boolean isGranted(Context context, String permission) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return ContextCompat.checkSelfPermission(context, permission) == 0;
    }

    @Keep
    public static final String metaData(Context context, String key) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Keep
    public static final int navigationBarHeight(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @Keep
    public static final NotificationManager notificationManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("notification");
        if (systemService != null) {
            return (NotificationManager) systemService;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    @Keep
    public static final int screenHeight(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    @Keep
    public static final int screenWidth(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    @Keep
    public static final int statusBarHeight(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @Keep
    public static final void unInstallPkg(Context context, String pkg) throws Exception {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(pkg, "pkg");
        Intent intent = new Intent("android.intent.action.DELETE", Uri.parse(Intrinsics.stringPlus("package:", pkg)));
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @Keep
    public static final int versionCode(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    @Keep
    public static final String versionName(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        Intrinsics.checkNotNullExpressionValue(str, "packageManager.getPackageInfo(packageName, 0).versionName");
        return str;
    }

    @Keep
    public static final WindowManager windowManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            return (WindowManager) systemService;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }
}
