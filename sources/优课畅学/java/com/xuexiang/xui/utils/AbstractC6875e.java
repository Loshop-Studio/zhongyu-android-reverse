package com.xuexiang.xui.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p150k1.AbstractC9051b;

/* renamed from: com.xuexiang.xui.utils.e */
/* loaded from: classes4.dex */
public abstract class AbstractC6875e {
    /* renamed from: a */
    public static int m6445a(int i10, float f10) {
        return Color.argb(Color.alpha(i10), Math.max((int) (Color.red(i10) * f10), 0), Math.max((int) (Color.green(i10) * f10), 0), Math.max((int) (Color.blue(i10) * f10), 0));
    }

    /* renamed from: b */
    public static Animation m6446b(Context context, int i10) {
        return AnimationUtils.loadAnimation(context, i10);
    }

    /* renamed from: c */
    public static int m6447c(Context context, int i10) {
        return ContextCompat.getColor(context, i10);
    }

    /* renamed from: d */
    public static ColorStateList m6448d(Context context, TypedArray typedArray, int i10) {
        return typedArray.getColorStateList(i10);
    }

    /* renamed from: e */
    public static ColorStateList m6449e(Context context, int i10) {
        return ContextCompat.getColorStateList(context, i10);
    }

    /* renamed from: f */
    public static int m6450f(Context context, int i10) {
        return context.getResources().getDimensionPixelSize(i10);
    }

    /* renamed from: g */
    public static Drawable m6451g(int i10) {
        return AbstractC9051b.m15847b().getDrawable(i10);
    }

    /* renamed from: h */
    public static Drawable m6452h(Context context, int i10) {
        return context.getDrawable(i10);
    }

    /* renamed from: i */
    public static Drawable m6453i(Context context, TypedArray typedArray, int i10) {
        return typedArray.getDrawable(i10);
    }

    /* renamed from: j */
    public static Resources m6454j() {
        return AbstractC9051b.m15847b().getResources();
    }

    /* renamed from: k */
    public static String m6455k(int i10) {
        return m6454j().getString(i10);
    }

    /* renamed from: l */
    public static String m6456l(Context context, int i10) {
        return context.getResources().getString(i10);
    }

    /* renamed from: m */
    public static List m6457m(Context context, int i10) {
        return m6458n(context, i10, 0);
    }

    /* renamed from: n */
    public static List m6458n(Context context, int i10, int i11) throws Resources.NotFoundException {
        ArrayList arrayList = new ArrayList();
        if (i10 != i11) {
            String[] stringArray = context.getResources().getStringArray(i10);
            if (stringArray.length > 0) {
                arrayList.addAll(Arrays.asList(stringArray));
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    public static Drawable m6459o(Context context, int i10) {
        return context.getDrawable(i10);
    }

    /* renamed from: p */
    public static int m6460p(int i10, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Color.alpha(i10), (int) ((((Color.red(i10) * f11) / 255.0f) + f10) * 255.0f), (int) ((((Color.green(i10) * f11) / 255.0f) + f10) * 255.0f), (int) ((((Color.blue(i10) * f11) / 255.0f) + f10) * 255.0f));
    }
}
