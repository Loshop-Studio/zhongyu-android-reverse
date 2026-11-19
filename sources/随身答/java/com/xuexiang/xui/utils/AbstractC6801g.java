package com.xuexiang.xui.utils;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;

/* renamed from: com.xuexiang.xui.utils.g */
/* loaded from: classes4.dex */
public abstract class AbstractC6801g {

    /* renamed from: com.xuexiang.xui.utils.g$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7025a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f7025a = iArr;
            try {
                iArr[GravityEnum.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7025a[GravityEnum.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: a */
    public static int m6468a(int i9, float f10) {
        return Color.argb(Math.round(Color.alpha(i9) * f10), Color.red(i9), Color.green(i9), Color.blue(i9));
    }

    /* renamed from: b */
    public static ColorStateList m6469b(Context context, int i9) {
        int iM6479l = m6479l(context, R.attr.textColorPrimary);
        if (i9 == 0) {
            i9 = iM6479l;
        }
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{m6468a(i9, 0.4f), i9});
    }

    /* renamed from: c */
    public static int m6470c(Context context, int i9) {
        return ContextCompat.getColor(context, i9);
    }

    /* renamed from: d */
    public static int m6471d(int i9, int i10, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i9});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i10);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static int m6472e(Context context) {
        return m6468a(m6474g(m6479l(context, R.attr.textColorPrimary)) ? ViewCompat.MEASURED_STATE_MASK : -1, 0.3f);
    }

    /* renamed from: f */
    public static int m6473f(GravityEnum gravityEnum) {
        int i9 = a.f7025a[gravityEnum.ordinal()];
        int i10 = 1;
        if (i9 != 1) {
            i10 = 2;
            if (i9 != 2) {
                return 0;
            }
        }
        return i10;
    }

    /* renamed from: g */
    public static boolean m6474g(int i9) {
        return 1.0d - ((((((double) Color.red(i9)) * 0.299d) + (((double) Color.green(i9)) * 0.587d)) + (((double) Color.blue(i9)) * 0.114d)) / 255.0d) >= 0.5d;
    }

    /* renamed from: h */
    public static boolean m6475h(Object obj, Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            for (Object obj2 : objArr) {
                if (obj2.equals(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public static ColorStateList m6476i(Context context, int i9, ColorStateList colorStateList) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i9});
        try {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(0);
            if (typedValuePeekValue == null) {
                return colorStateList;
            }
            int i10 = typedValuePeekValue.type;
            if (i10 >= 28 && i10 <= 31) {
                return m6469b(context, typedValuePeekValue.data);
            }
            ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(0);
            return colorStateList2 != null ? colorStateList2 : colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: j */
    public static boolean m6477j(Context context, int i9) {
        return m6478k(context, i9, false);
    }

    /* renamed from: k */
    public static boolean m6478k(Context context, int i9, boolean z9) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i9});
        try {
            return typedArrayObtainStyledAttributes.getBoolean(0, z9);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: l */
    public static int m6479l(Context context, int i9) {
        return m6480m(context, i9, 0);
    }

    /* renamed from: m */
    public static int m6480m(Context context, int i9, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i9});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i10);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: n */
    public static int m6481n(Context context, int i9) {
        return m6482o(context, i9, -1);
    }

    /* renamed from: o */
    public static int m6482o(Context context, int i9, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i9});
        try {
            return typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i10);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: p */
    public static Drawable m6483p(Context context, int i9) {
        return m6484q(context, i9, null);
    }

    /* renamed from: q */
    public static Drawable m6484q(Context context, int i9, Drawable drawable) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i9});
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

    /* renamed from: r */
    public static float m6485r(Context context, int i9, float f10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i9});
        try {
            return typedArrayObtainStyledAttributes.getFloat(0, f10);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: s */
    public static GravityEnum m6486s(Context context, int i9, GravityEnum gravityEnum) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i9});
        try {
            int i10 = typedArrayObtainStyledAttributes.getInt(0, m6473f(gravityEnum));
            return i10 != 1 ? i10 != 2 ? GravityEnum.START : GravityEnum.END : GravityEnum.CENTER;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: t */
    public static String m6487t(Context context, int i9, String str) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i9, typedValue, true);
        String str2 = (String) typedValue.string;
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    /* renamed from: u */
    public static void m6488u(View view, Drawable drawable) {
        view.setBackground(drawable);
    }
}
