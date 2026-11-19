package com.blankj.utilcode.util;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.blankj.utilcode.util.l0 */
/* loaded from: classes3.dex */
public abstract class AbstractC5374l0 {
    /* renamed from: a */
    public static boolean m2575a() {
        return TextUtils.getLayoutDirectionFromLocale(AbstractC5366h0.m2478a().getResources().getConfiguration().getLocales().get(0)) == 1;
    }

    /* renamed from: b */
    public static View m2576b(int i10) {
        return ((LayoutInflater) AbstractC5366h0.m2478a().getSystemService("layout_inflater")).inflate(i10, (ViewGroup) null);
    }
}
