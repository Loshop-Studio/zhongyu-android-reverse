package com.alibaba.sdk.android.push.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.push.C5643R;
import com.taobao.accs.common.Constants;

/* renamed from: com.alibaba.sdk.android.push.util.a */
/* loaded from: classes3.dex */
public class C5689a {
    /* renamed from: a */
    private static String m3816a(Context context) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null || launchIntentForPackage.getComponent() == null) {
                return null;
            }
            return launchIntentForPackage.getComponent().getClassName();
        } catch (Exception unused) {
            AmsLogger.getLogger("BadgeUtils").m3417d(context.getString(C5643R.string.launch_activity_name_fail));
            return null;
        }
    }

    /* renamed from: b */
    private static void m3818b(Context context, int i10) {
        String strM3816a = m3816a(context);
        if (TextUtils.isEmpty(strM3816a)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("package", context.getPackageName());
            bundle.putString("class", strM3816a);
            bundle.putInt("badgenumber", i10);
            context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
        } catch (Exception unused) {
            AmsLogger.getLogger("BadgeUtils").m3417d(context.getString(C5643R.string.not_support_badge_desc));
        }
    }

    /* renamed from: c */
    private static void m3819c(Context context, int i10) {
        String strM3816a = m3816a(context);
        if (TextUtils.isEmpty(strM3816a)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("package", context.getPackageName());
            bundle.putString("class", strM3816a);
            bundle.putInt("badgenumber", i10);
            context.getContentResolver().call(Uri.parse("content://com.hihonor.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
        } catch (Exception unused) {
            AmsLogger.getLogger("BadgeUtils").m3417d(context.getString(C5643R.string.not_support_badge_desc));
        }
    }

    /* renamed from: d */
    private static void m3820d(Context context, int i10) {
        String strM3816a = m3816a(context);
        if (TextUtils.isEmpty(strM3816a)) {
            return;
        }
        try {
            Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
            intent.putExtra(Constants.KEY_PACKAGE_NAME, context.getPackageName());
            intent.putExtra("className", strM3816a);
            intent.putExtra("notificationNum", i10);
            context.sendBroadcast(intent);
        } catch (Exception unused) {
            AmsLogger.getLogger("BadgeUtils").m3417d("VIVO机型设置角标失败");
        }
    }

    /* renamed from: a */
    public static void m3817a(Context context, int i10) {
        if (context == null) {
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (C5690b.m3822a()) {
            m3818b(context, i10);
            return;
        }
        if (C5690b.m3823b()) {
            m3819c(context, i10);
        } else if (C5690b.m3824c()) {
            m3820d(context, i10);
        } else {
            AmsLogger.getLogger("BadgeUtils").m3417d(context.getString(C5643R.string.not_support_badge_desc));
        }
    }
}
