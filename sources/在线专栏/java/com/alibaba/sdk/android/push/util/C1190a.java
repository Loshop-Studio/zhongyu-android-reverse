package com.alibaba.sdk.android.push.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.push.C1152R;
import com.taobao.accs.common.Constants;

/* renamed from: com.alibaba.sdk.android.push.util.a */
/* loaded from: classes.dex */
public class C1190a {
    /* renamed from: a */
    private static String m5364a(Context context) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null || launchIntentForPackage.getComponent() == null) {
                return null;
            }
            return launchIntentForPackage.getComponent().getClassName();
        } catch (Exception unused) {
            AmsLogger.getLogger("BadgeUtils").m5016d(context.getString(C1152R.string.launch_activity_name_fail));
            return null;
        }
    }

    /* renamed from: a */
    public static void m5365a(Context context, int i4) {
        if (context == null) {
            return;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (C1191b.m5370a()) {
            m5366b(context, i4);
            return;
        }
        if (C1191b.m5371b()) {
            m5367c(context, i4);
        } else if (C1191b.m5372c()) {
            m5368d(context, i4);
        } else {
            AmsLogger.getLogger("BadgeUtils").m5016d(context.getString(C1152R.string.not_support_badge_desc));
        }
    }

    /* renamed from: b */
    private static void m5366b(Context context, int i4) {
        String strM5364a = m5364a(context);
        if (TextUtils.isEmpty(strM5364a)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("package", context.getPackageName());
            bundle.putString("class", strM5364a);
            bundle.putInt("badgenumber", i4);
            context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
        } catch (Exception unused) {
            AmsLogger.getLogger("BadgeUtils").m5016d(context.getString(C1152R.string.not_support_badge_desc));
        }
    }

    /* renamed from: c */
    private static void m5367c(Context context, int i4) {
        String strM5364a = m5364a(context);
        if (TextUtils.isEmpty(strM5364a)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("package", context.getPackageName());
            bundle.putString("class", strM5364a);
            bundle.putInt("badgenumber", i4);
            context.getContentResolver().call(Uri.parse("content://com.hihonor.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
        } catch (Exception unused) {
            AmsLogger.getLogger("BadgeUtils").m5016d(context.getString(C1152R.string.not_support_badge_desc));
        }
    }

    /* renamed from: d */
    private static void m5368d(Context context, int i4) {
        String strM5364a = m5364a(context);
        if (TextUtils.isEmpty(strM5364a)) {
            return;
        }
        try {
            Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
            intent.putExtra(Constants.KEY_PACKAGE_NAME, context.getPackageName());
            intent.putExtra("className", strM5364a);
            intent.putExtra("notificationNum", i4);
            context.sendBroadcast(intent);
        } catch (Exception unused) {
            AmsLogger.getLogger("BadgeUtils").m5016d("VIVO机型设置角标失败");
        }
    }
}
