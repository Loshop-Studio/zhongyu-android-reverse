package com.xuexiang.xui.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.content.ContextCompat;

/* renamed from: com.xuexiang.xui.utils.e */
/* loaded from: classes3.dex */
public abstract class AbstractC5857e {
    /* renamed from: a */
    public static int m4360a(int i6, float f6) {
        return Color.argb(Color.alpha(i6), Math.max((int) (Color.red(i6) * f6), 0), Math.max((int) (Color.green(i6) * f6), 0), Math.max((int) (Color.blue(i6) * f6), 0));
    }

    /* renamed from: b */
    public static Animation m4361b(Context context, int i6) {
        return AnimationUtils.loadAnimation(context, i6);
    }

    /* renamed from: c */
    public static ColorStateList m4362c(Context context, TypedArray typedArray, int i6) {
        return typedArray.getColorStateList(i6);
    }

    /* renamed from: d */
    public static ColorStateList m4363d(Context context, int i6) {
        return ContextCompat.getColorStateList(context, i6);
    }

    /* renamed from: e */
    public static int m4364e(Context context, int i6) {
        return context.getResources().getDimensionPixelSize(i6);
    }

    /* renamed from: f */
    public static Drawable m4365f(Context context, int i6) {
        return context.getDrawable(i6);
    }

    /* renamed from: g */
    public static Drawable m4366g(Context context, TypedArray typedArray, int i6) {
        return typedArray.getDrawable(i6);
    }

    /* renamed from: h */
    public static String m4367h(Context context, int i6) {
        return context.getResources().getString(i6);
    }

    /* renamed from: i */
    public static int m4368i(int i6, float f6) {
        float f7 = 1.0f - f6;
        return Color.argb(Color.alpha(i6), (int) ((((Color.red(i6) * f7) / 255.0f) + f6) * 255.0f), (int) ((((Color.green(i6) * f7) / 255.0f) + f6) * 255.0f), (int) ((((Color.blue(i6) * f7) / 255.0f) + f6) * 255.0f));
    }
}
