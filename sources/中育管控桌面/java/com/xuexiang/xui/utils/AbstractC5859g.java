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
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;

/* renamed from: com.xuexiang.xui.utils.g */
/* loaded from: classes3.dex */
public abstract class AbstractC5859g {

    /* renamed from: com.xuexiang.xui.utils.g$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4491a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f4491a = iArr;
            try {
                iArr[GravityEnum.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4491a[GravityEnum.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: a */
    public static int m4375a(int i6, float f6) {
        return Color.argb(Math.round(Color.alpha(i6) * f6), Color.red(i6), Color.green(i6), Color.blue(i6));
    }

    /* renamed from: b */
    public static ColorStateList m4376b(Context context, int i6) {
        int iM4387m = m4387m(context, R.attr.textColorPrimary);
        if (i6 == 0) {
            i6 = iM4387m;
        }
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{m4375a(i6, 0.4f), i6});
    }

    /* renamed from: c */
    public static int m4377c(Context context, int i6) {
        return ContextCompat.getColor(context, i6);
    }

    /* renamed from: d */
    public static int m4378d(int i6, int i7, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i6});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i7);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static int m4379e(Context context) {
        return m4375a(m4382h(m4387m(context, R.attr.textColorPrimary)) ? ViewCompat.MEASURED_STATE_MASK : -1, 0.3f);
    }

    /* renamed from: f */
    public static int m4380f(Context context) {
        return m4388n(context, R$attr.colorAccent, m4377c(context, R$color.xui_config_color_main_theme));
    }

    /* renamed from: g */
    public static int m4381g(GravityEnum gravityEnum) {
        int i6 = a.f4491a[gravityEnum.ordinal()];
        int i7 = 1;
        if (i6 != 1) {
            i7 = 2;
            if (i6 != 2) {
                return 0;
            }
        }
        return i7;
    }

    /* renamed from: h */
    public static boolean m4382h(int i6) {
        return 1.0d - ((((((double) Color.red(i6)) * 0.299d) + (((double) Color.green(i6)) * 0.587d)) + (((double) Color.blue(i6)) * 0.114d)) / 255.0d) >= 0.5d;
    }

    /* renamed from: i */
    public static boolean m4383i(Object obj, Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            for (Object obj2 : objArr) {
                if (obj2.equals(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public static ColorStateList m4384j(Context context, int i6, ColorStateList colorStateList) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i6});
        try {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(0);
            if (typedValuePeekValue == null) {
                return colorStateList;
            }
            int i7 = typedValuePeekValue.type;
            if (i7 >= 28 && i7 <= 31) {
                return m4376b(context, typedValuePeekValue.data);
            }
            ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(0);
            return colorStateList2 != null ? colorStateList2 : colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: k */
    public static boolean m4385k(Context context, int i6) {
        return m4386l(context, i6, false);
    }

    /* renamed from: l */
    public static boolean m4386l(Context context, int i6, boolean z6) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i6});
        try {
            return typedArrayObtainStyledAttributes.getBoolean(0, z6);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: m */
    public static int m4387m(Context context, int i6) {
        return m4388n(context, i6, 0);
    }

    /* renamed from: n */
    public static int m4388n(Context context, int i6, int i7) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i6});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i7);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: o */
    public static int m4389o(Context context, int i6) {
        return m4390p(context, i6, -1);
    }

    /* renamed from: p */
    public static int m4390p(Context context, int i6, int i7) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i6});
        try {
            return typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i7);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: q */
    public static Drawable m4391q(Context context, int i6) {
        return m4392r(context, i6, null);
    }

    /* renamed from: r */
    public static Drawable m4392r(Context context, int i6, Drawable drawable) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i6});
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

    /* renamed from: s */
    public static float m4393s(Context context, int i6, float f6) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i6});
        try {
            return typedArrayObtainStyledAttributes.getFloat(0, f6);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: t */
    public static GravityEnum m4394t(Context context, int i6, GravityEnum gravityEnum) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i6});
        try {
            int i7 = typedArrayObtainStyledAttributes.getInt(0, m4381g(gravityEnum));
            return i7 != 1 ? i7 != 2 ? GravityEnum.START : GravityEnum.END : GravityEnum.CENTER;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: u */
    public static String m4395u(Context context, int i6, String str) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i6, typedValue, true);
        String str2 = (String) typedValue.string;
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    /* renamed from: v */
    public static void m4396v(View view, Drawable drawable) {
        view.setBackground(drawable);
    }
}
