package com.umeng.analytics;

import android.content.Context;

/* loaded from: classes4.dex */
public abstract class MobclickAgent {

    public enum PageMode {
        AUTO,
        MANUAL,
        LEGACY_AUTO,
        LEGACY_MANUAL
    }

    /* renamed from: a */
    public static void m5997a(Context context) {
        C6752a.m5999b().m6010l(context);
    }

    /* renamed from: b */
    public static void m5998b(PageMode pageMode) {
        C6752a.m5999b().m6004f(pageMode);
    }
}
