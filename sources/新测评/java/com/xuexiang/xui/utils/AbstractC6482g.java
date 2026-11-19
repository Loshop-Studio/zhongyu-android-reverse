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
/* loaded from: classes4.dex */
public abstract class AbstractC6482g {

    /* renamed from: com.xuexiang.xui.utils.g$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5770a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f5770a = iArr;
            try {
                iArr[GravityEnum.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5770a[GravityEnum.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: a */
    public static int m5370a(int i10, float f10) {
        return Color.argb(Math.round(Color.alpha(i10) * f10), Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    /* renamed from: b */
    public static ColorStateList m5371b(Context context, int i10) {
        int iM5382m = m5382m(context, R.attr.textColorPrimary);
        if (i10 == 0) {
            i10 = iM5382m;
        }
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{m5370a(i10, 0.4f), i10});
    }

    /* renamed from: c */
    public static int m5372c(Context context, int i10) {
        return ContextCompat.getColor(context, i10);
    }

    /* renamed from: d */
    public static int m5373d(int i10, int i11, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i11);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static int m5374e(Context context) {
        return m5370a(m5377h(m5382m(context, R.attr.textColorPrimary)) ? ViewCompat.MEASURED_STATE_MASK : -1, 0.3f);
    }

    /* renamed from: f */
    public static int m5375f(Context context) {
        return m5383n(context, R$attr.colorAccent, m5372c(context, R$color.xui_config_color_main_theme));
    }

    /* renamed from: g */
    public static int m5376g(GravityEnum gravityEnum) {
        int i10 = a.f5770a[gravityEnum.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                return 0;
            }
        }
        return i11;
    }

    /* renamed from: h */
    public static boolean m5377h(int i10) {
        return 1.0d - ((((((double) Color.red(i10)) * 0.299d) + (((double) Color.green(i10)) * 0.587d)) + (((double) Color.blue(i10)) * 0.114d)) / 255.0d) >= 0.5d;
    }

    /* renamed from: i */
    public static boolean m5378i(Object obj, Object[] objArr) {
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
    public static ColorStateList m5379j(Context context, int i10, ColorStateList colorStateList) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(0);
            if (typedValuePeekValue == null) {
                return colorStateList;
            }
            int i11 = typedValuePeekValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return m5371b(context, typedValuePeekValue.data);
            }
            ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(0);
            return colorStateList2 != null ? colorStateList2 : colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: k */
    public static boolean m5380k(Context context, int i10) {
        return m5381l(context, i10, false);
    }

    /* renamed from: l */
    public static boolean m5381l(Context context, int i10, boolean z9) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            return typedArrayObtainStyledAttributes.getBoolean(0, z9);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: m */
    public static int m5382m(Context context, int i10) {
        return m5383n(context, i10, 0);
    }

    /* renamed from: n */
    public static int m5383n(Context context, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i11);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: o */
    public static int m5384o(Context context, int i10) {
        return m5385p(context, i10, -1);
    }

    /* renamed from: p */
    public static int m5385p(Context context, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            return typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i11);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: q */
    public static Drawable m5386q(Context context, int i10) {
        return m5387r(context, i10, null);
    }

    /* renamed from: r */
    public static Drawable m5387r(Context context, int i10, Drawable drawable) {
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

    /* renamed from: s */
    public static float m5388s(Context context, int i10, float f10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        try {
            return typedArrayObtainStyledAttributes.getFloat(0, f10);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: t */
    public static GravityEnum m5389t(Context context, int i10, GravityEnum gravityEnum) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            int i11 = typedArrayObtainStyledAttributes.getInt(0, m5376g(gravityEnum));
            return i11 != 1 ? i11 != 2 ? GravityEnum.START : GravityEnum.END : GravityEnum.CENTER;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: u */
    public static String m5390u(Context context, int i10, String str) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        String str2 = (String) typedValue.string;
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    /* renamed from: v */
    public static void m5391v(View view, Drawable drawable) {
        view.setBackground(drawable);
    }
}
