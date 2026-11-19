package com.alibaba.sdk.android.push.common.util;

import android.content.Context;
import android.preference.PreferenceManager;

/* renamed from: com.alibaba.sdk.android.push.common.util.b */
/* loaded from: classes.dex */
public class C1170b {
    /* renamed from: a */
    public static long m5186a(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong(str, 0L);
    }

    /* renamed from: a */
    public static void m5187a(Context context, String str, long j4) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putLong(str, j4).commit();
    }
}
