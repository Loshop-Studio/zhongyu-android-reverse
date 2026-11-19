package com.xuexiang.xui.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: com.xuexiang.xui.utils.f */
/* loaded from: classes2.dex */
public abstract class AbstractC3531f {
    /* renamed from: a */
    public static int m4068a(int i4, int i5, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i4});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i5);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static boolean m4069b(Context context, int i4) {
        return m4070c(context, i4, false);
    }

    /* renamed from: c */
    public static boolean m4070c(Context context, int i4, boolean z3) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i4});
        try {
            return typedArrayObtainStyledAttributes.getBoolean(0, z3);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public static int m4071d(Context context, int i4) {
        return m4072e(context, i4, 0);
    }

    /* renamed from: e */
    public static int m4072e(Context context, int i4, int i5) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i4});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i5);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: f */
    public static int m4073f(Context context, int i4) {
        return m4074g(context, i4, -1);
    }

    /* renamed from: g */
    public static int m4074g(Context context, int i4, int i5) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i4});
        try {
            return typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i5);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: h */
    public static Drawable m4075h(Context context, int i4) {
        return m4076i(context, i4, null);
    }

    /* renamed from: i */
    public static Drawable m4076i(Context context, int i4, Drawable drawable) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i4});
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
    public static float m4077j(Context context, int i4, float f4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i4});
        try {
            return typedArrayObtainStyledAttributes.getFloat(0, f4);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: k */
    public static void m4078k(View view, Drawable drawable) {
        view.setBackground(drawable);
    }
}
