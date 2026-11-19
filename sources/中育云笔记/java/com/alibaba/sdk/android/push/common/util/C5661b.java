package com.alibaba.sdk.android.push.common.util;

import android.content.Context;
import android.preference.PreferenceManager;

/* renamed from: com.alibaba.sdk.android.push.common.util.b */
/* loaded from: classes3.dex */
public class C5661b {
    /* renamed from: a */
    public static long m3637a(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong(str, 0L);
    }

    /* renamed from: a */
    public static void m3638a(Context context, String str, long j10) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putLong(str, j10).commit();
    }
}
