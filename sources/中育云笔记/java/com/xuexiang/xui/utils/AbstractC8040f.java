package com.xuexiang.xui.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import p420y7.AbstractC11916b;

/* renamed from: com.xuexiang.xui.utils.f */
/* loaded from: classes5.dex */
public abstract class AbstractC8040f {
    /* renamed from: a */
    public static int m12200a(int i10, float f10) {
        return Color.argb(Color.alpha(i10), Math.max((int) (Color.red(i10) * f10), 0), Math.max((int) (Color.green(i10) * f10), 0), Math.max((int) (Color.blue(i10) * f10), 0));
    }

    /* renamed from: b */
    public static Animation m12201b(int i10) {
        return AnimationUtils.loadAnimation(AbstractC11916b.m26458b(), i10);
    }

    /* renamed from: c */
    public static int m12202c(int i10) {
        return m12208i().getColor(i10);
    }

    /* renamed from: d */
    public static ColorStateList m12203d(int i10) {
        return m12208i().getColorStateList(i10);
    }

    /* renamed from: e */
    public static int m12204e(int i10) {
        return m12208i().getDimensionPixelSize(i10);
    }

    /* renamed from: f */
    public static Drawable m12205f(Context context, int i10) {
        return context.getDrawable(i10);
    }

    /* renamed from: g */
    public static Drawable m12206g(Context context, TypedArray typedArray, int i10) {
        return typedArray.getDrawable(i10);
    }

    /* renamed from: h */
    public static int[] m12207h(int i10) {
        return m12208i().getIntArray(i10);
    }

    /* renamed from: i */
    public static Resources m12208i() {
        return AbstractC11916b.m26458b().getResources();
    }

    /* renamed from: j */
    public static String m12209j(int i10) {
        return m12208i().getString(i10);
    }

    /* renamed from: k */
    public static String[] m12210k(int i10) {
        return m12208i().getStringArray(i10);
    }

    /* renamed from: l */
    public static Drawable m12211l(Context context, int i10) {
        return context.getDrawable(i10);
    }

    /* renamed from: m */
    public static boolean m12212m() {
        return m12208i().getConfiguration().getLayoutDirection() == 1;
    }

    /* renamed from: n */
    public static int m12213n(int i10, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Color.alpha(i10), (int) ((((Color.red(i10) * f11) / 255.0f) + f10) * 255.0f), (int) ((((Color.green(i10) * f11) / 255.0f) + f10) * 255.0f), (int) ((((Color.blue(i10) * f11) / 255.0f) + f10) * 255.0f));
    }
}
