package com.xuexiang.xui.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import p093e3.AbstractC7843b;

/* renamed from: com.xuexiang.xui.utils.e */
/* loaded from: classes4.dex */
public abstract class AbstractC6799e {
    /* renamed from: a */
    public static int m6456a(int i9, float f10) {
        return Color.argb(Color.alpha(i9), Math.max((int) (Color.red(i9) * f10), 0), Math.max((int) (Color.green(i9) * f10), 0), Math.max((int) (Color.blue(i9) * f10), 0));
    }

    /* renamed from: b */
    public static Animation m6457b(int i9) {
        return AnimationUtils.loadAnimation(AbstractC7843b.m12290a(), i9);
    }

    /* renamed from: c */
    public static ColorStateList m6458c(int i9) {
        return m6462g().getColorStateList(i9);
    }

    /* renamed from: d */
    public static int m6459d(int i9) {
        return m6462g().getDimensionPixelSize(i9);
    }

    /* renamed from: e */
    public static Drawable m6460e(Context context, int i9) {
        return context.getDrawable(i9);
    }

    /* renamed from: f */
    public static Drawable m6461f(Context context, TypedArray typedArray, int i9) {
        return typedArray.getDrawable(i9);
    }

    /* renamed from: g */
    public static Resources m6462g() {
        return AbstractC7843b.m12290a().getResources();
    }

    /* renamed from: h */
    public static String m6463h(int i9) {
        return m6462g().getString(i9);
    }

    /* renamed from: i */
    public static int m6464i(int i9, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Color.alpha(i9), (int) ((((Color.red(i9) * f11) / 255.0f) + f10) * 255.0f), (int) ((((Color.green(i9) * f11) / 255.0f) + f10) * 255.0f), (int) ((((Color.blue(i9) * f11) / 255.0f) + f10) * 255.0f));
    }
}
