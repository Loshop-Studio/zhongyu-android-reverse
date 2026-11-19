package com.blankj.utilcode.util;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.List;

/* renamed from: com.blankj.utilcode.util.a */
/* loaded from: classes3.dex */
public abstract class AbstractC4634a {
    /* renamed from: a */
    public static void m2112a(Class cls) {
        m2113b(cls, false);
    }

    /* renamed from: b */
    public static void m2113b(Class cls, boolean z6) {
        for (Activity activity : AbstractC4663o0.m2327l()) {
            if (activity.getClass().equals(cls)) {
                activity.finish();
                if (!z6) {
                    activity.overridePendingTransition(0, 0);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m2114c() {
        m2115d(false);
    }

    /* renamed from: d */
    public static void m2115d(boolean z6) {
        for (Activity activity : AbstractC4663o0.m2327l()) {
            activity.finish();
            if (!z6) {
                activity.overridePendingTransition(0, 0);
            }
        }
    }

    /* renamed from: e */
    public static String m2116e(String str) {
        if (AbstractC4663o0.m2304G(str)) {
            return "";
        }
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(str);
        List<ResolveInfo> listQueryIntentActivities = AbstractC4657l0.m2250a().getPackageManager().queryIntentActivities(intent, 0);
        return (listQueryIntentActivities == null || listQueryIntentActivities.size() == 0) ? "" : listQueryIntentActivities.get(0).activityInfo.name;
    }

    /* renamed from: f */
    public static Activity m2117f() {
        return AbstractC4663o0.m2340y();
    }

    /* renamed from: g */
    public static Context m2118g() {
        if (!AbstractC4663o0.m2299B()) {
            return AbstractC4657l0.m2250a();
        }
        Activity activityM2117f = m2117f();
        return activityM2117f == null ? AbstractC4657l0.m2250a() : activityM2117f;
    }

    /* renamed from: h */
    public static boolean m2119h(Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    /* renamed from: i */
    public static boolean m2120i(Intent intent) {
        return true;
    }

    /* renamed from: j */
    public static void m2121j(Context context, Bundle bundle, String str, String str2, Bundle bundle2) {
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setComponent(new ComponentName(str, str2));
        m2123l(intent, context, bundle2);
    }

    /* renamed from: k */
    public static void m2122k(Class cls) {
        Context contextM2118g = m2118g();
        m2121j(contextM2118g, null, contextM2118g.getPackageName(), cls.getName(), null);
    }

    /* renamed from: l */
    public static boolean m2123l(Intent intent, Context context, Bundle bundle) {
        if (!m2120i(intent)) {
            Log.e("ActivityUtils", "intent is unavailable");
            return false;
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (bundle != null) {
            context.startActivity(intent, bundle);
            return true;
        }
        context.startActivity(intent);
        return true;
    }
}
