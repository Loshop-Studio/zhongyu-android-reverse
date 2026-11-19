package com.xuexiang.xui.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;

/* renamed from: com.xuexiang.xui.utils.g */
/* loaded from: classes5.dex */
public abstract class AbstractC8041g {
    /* renamed from: a */
    public static int m12214a(int i10, int i11, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i11);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static boolean m12215b(Context context, int i10) {
        return m12216c(context, i10, false);
    }

    /* renamed from: c */
    public static boolean m12216c(Context context, int i10, boolean z10) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            return typedArrayObtainStyledAttributes.getBoolean(0, z10);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public static int m12217d(Context context, int i10) {
        return m12218e(context, i10, 0);
    }

    /* renamed from: e */
    public static int m12218e(Context context, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i11);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: f */
    public static int m12219f(Context context, int i10) {
        return m12220g(context, i10, -1);
    }

    /* renamed from: g */
    public static int m12220g(Context context, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            return typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i11);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: h */
    public static Drawable m12221h(Context context, int i10) {
        return m12222i(context, i10, null);
    }

    /* renamed from: i */
    public static Drawable m12222i(Context context, int i10, Drawable drawable) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(0);
            if (drawable2 != null || drawable == null) {
                drawable = drawable2;
            }
            return drawable;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: j */
    public static float m12223j(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.getFloat();
    }

    /* renamed from: k */
    public static float m12224k(Context context, int i10, float f10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        try {
            return typedArrayObtainStyledAttributes.getFloat(0, f10);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: l */
    public static int m12225l(Context context, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        try {
            return typedArrayObtainStyledAttributes.getInt(0, i11);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: m */
    public static void m12226m(View view, Drawable drawable) {
        view.setBackground(drawable);
    }
}
