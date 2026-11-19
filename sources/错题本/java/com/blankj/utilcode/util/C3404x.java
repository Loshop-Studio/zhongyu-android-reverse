package com.blankj.utilcode.util;

import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import java.util.IllegalFormatException;
import p016b0.RunnableC3059a;

/* renamed from: com.blankj.utilcode.util.x */
/* loaded from: classes2.dex */
public final class C3404x {

    /* renamed from: b */
    public static final C3404x f2187b;

    /* renamed from: c */
    public static WeakReference f2188c;

    /* renamed from: a */
    public Drawable[] f2189a;

    static {
        C3404x c3404x = new C3404x();
        c3404x.f2189a = new Drawable[4];
        f2187b = c3404x;
    }

    /* renamed from: a */
    public static void m2356a(String str, Object... objArr) {
        if (str != null && objArr.length > 0) {
            try {
                str = String.format(str, objArr);
            } catch (IllegalFormatException e) {
                e.printStackTrace();
            }
        }
        if (str == null) {
            str = "toast null";
        } else if (str.length() == 0) {
            str = "toast nothing";
        }
        AbstractC3383c0.m2328g(new RunnableC3059a(str));
    }
}
