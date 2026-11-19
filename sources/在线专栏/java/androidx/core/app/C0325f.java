package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* renamed from: androidx.core.app.f */
/* loaded from: classes.dex */
public final class C0325f {
    /* renamed from: a */
    public static Intent m1779a(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String strM1781c = m1781c(activity);
        if (strM1781c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strM1781c);
        try {
            return m1782d(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM1781c + "' in manifest");
            return null;
        }
    }

    /* renamed from: b */
    public static Intent m1780b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM1782d = m1782d(context, componentName);
        if (strM1782d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM1782d);
        return m1782d(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: c */
    public static String m1781c(Activity activity) {
        try {
            return m1782d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    /* renamed from: d */
    public static String m1782d(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 640;
        if (i4 >= 29) {
            i5 = 269222528;
        } else if (i4 >= 24) {
            i5 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i5);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: e */
    public static void m1783e(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    /* renamed from: f */
    public static boolean m1784f(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}
