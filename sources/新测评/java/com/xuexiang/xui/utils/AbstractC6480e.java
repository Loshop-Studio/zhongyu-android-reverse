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
/* loaded from: classes4.dex */
public abstract class AbstractC6480e {
    /* renamed from: a */
    public static int m5355a(int i10, float f10) {
        return Color.argb(Color.alpha(i10), Math.max((int) (Color.red(i10) * f10), 0), Math.max((int) (Color.green(i10) * f10), 0), Math.max((int) (Color.blue(i10) * f10), 0));
    }

    /* renamed from: b */
    public static Animation m5356b(Context context, int i10) {
        return AnimationUtils.loadAnimation(context, i10);
    }

    /* renamed from: c */
    public static ColorStateList m5357c(Context context, TypedArray typedArray, int i10) {
        return typedArray.getColorStateList(i10);
    }

    /* renamed from: d */
    public static ColorStateList m5358d(Context context, int i10) {
        return ContextCompat.getColorStateList(context, i10);
    }

    /* renamed from: e */
    public static int m5359e(Context context, int i10) {
        return context.getResources().getDimensionPixelSize(i10);
    }

    /* renamed from: f */
    public static Drawable m5360f(Context context, int i10) {
        return context.getDrawable(i10);
    }

    /* renamed from: g */
    public static Drawable m5361g(Context context, TypedArray typedArray, int i10) {
        return typedArray.getDrawable(i10);
    }

    /* renamed from: h */
    public static String m5362h(Context context, int i10) {
        return context.getResources().getString(i10);
    }

    /* renamed from: i */
    public static int m5363i(int i10, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Color.alpha(i10), (int) ((((Color.red(i10) * f11) / 255.0f) + f10) * 255.0f), (int) ((((Color.green(i10) * f11) / 255.0f) + f10) * 255.0f), (int) ((((Color.blue(i10) * f11) / 255.0f) + f10) * 255.0f));
    }
}
