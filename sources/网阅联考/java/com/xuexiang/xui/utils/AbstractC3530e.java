package com.xuexiang.xui.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import p077j0.AbstractC3799b;

/* renamed from: com.xuexiang.xui.utils.e */
/* loaded from: classes2.dex */
public abstract class AbstractC3530e {
    /* renamed from: a */
    public static int m4060a(int i4, float f4) {
        return Color.argb(Color.alpha(i4), Math.max((int) (Color.red(i4) * f4), 0), Math.max((int) (Color.green(i4) * f4), 0), Math.max((int) (Color.blue(i4) * f4), 0));
    }

    /* renamed from: b */
    public static Animation m4061b(int i4) {
        return AnimationUtils.loadAnimation(AbstractC3799b.m4958a(), i4);
    }

    /* renamed from: c */
    public static ColorStateList m4062c(int i4) {
        return m4065f().getColorStateList(i4);
    }

    /* renamed from: d */
    public static Drawable m4063d(Context context, int i4) {
        return context.getDrawable(i4);
    }

    /* renamed from: e */
    public static Drawable m4064e(Context context, TypedArray typedArray, int i4) {
        return typedArray.getDrawable(i4);
    }

    /* renamed from: f */
    public static Resources m4065f() {
        return AbstractC3799b.m4958a().getResources();
    }

    /* renamed from: g */
    public static String m4066g(int i4) {
        return m4065f().getString(i4);
    }

    /* renamed from: h */
    public static int m4067h(int i4, float f4) {
        float f5 = 1.0f - f4;
        return Color.argb(Color.alpha(i4), (int) ((((Color.red(i4) * f5) / 255.0f) + f4) * 255.0f), (int) ((((Color.green(i4) * f5) / 255.0f) + f4) * 255.0f), (int) ((((Color.blue(i4) * f5) / 255.0f) + f4) * 255.0f));
    }
}
