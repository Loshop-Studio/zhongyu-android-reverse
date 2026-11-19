package com.blankj.utilcode.util;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.blankj.utilcode.util.p0 */
/* loaded from: classes3.dex */
public abstract class AbstractC4665p0 {
    /* renamed from: a */
    public static boolean m2347a() {
        return TextUtils.getLayoutDirectionFromLocale(AbstractC4657l0.m2250a().getResources().getConfiguration().getLocales().get(0)) == 1;
    }

    /* renamed from: b */
    public static View m2348b(int i6) {
        return ((LayoutInflater) AbstractC4657l0.m2250a().getSystemService("layout_inflater")).inflate(i6, (ViewGroup) null);
    }
}
