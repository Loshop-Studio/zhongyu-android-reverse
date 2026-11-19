package com.xuexiang.xui.utils;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.app.AbstractC0103d;
import androidx.core.content.C0332a;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class ThemeUtils {
    public static final int DARK_MODE = 2;
    public static final int DEFAULT_MODE = 0;
    public static final int LIGHT_MODE = 1;

    /* renamed from: com.xuexiang.xui.utils.ThemeUtils$1 */
    static /* synthetic */ class C20541 {

        /* renamed from: $SwitchMap$com$xuexiang$xui$widget$dialog$materialdialog$GravityEnum */
        static final /* synthetic */ int[] f9680x65f71c2e;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f9680x65f71c2e = iArr;
            try {
                iArr[GravityEnum.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9680x65f71c2e[GravityEnum.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Theme {
    }

    private ThemeUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static int adjustAlpha(int i4, float f4) {
        return Color.argb(Math.round(Color.alpha(i4) * f4), Color.red(i4), Color.green(i4), Color.blue(i4));
    }

    @SuppressLint({"WrongConstant"})
    public static void applyTheme(int i4) {
        if (i4 == 0) {
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC0103d.m272E(-1);
                return;
            } else {
                AbstractC0103d.m272E(3);
                return;
            }
        }
        if (i4 == 1) {
            AbstractC0103d.m272E(1);
        } else {
            if (i4 != 2) {
                return;
            }
            AbstractC0103d.m272E(2);
        }
    }

    public static ColorStateList getActionTextColorStateList(Context context, int i4) throws Resources.NotFoundException {
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i4, typedValue, true);
        int i5 = typedValue.type;
        return (i5 < 28 || i5 > 31) ? Build.VERSION.SDK_INT <= 22 ? context.getResources().getColorStateList(i4) : context.getColorStateList(i4) : getActionTextStateList(context, typedValue.data);
    }

    public static ColorStateList getActionTextStateList(Context context, int i4) {
        int iResolveColor = resolveColor(context, R.attr.textColorPrimary);
        if (i4 == 0) {
            i4 = iResolveColor;
        }
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{adjustAlpha(i4, 0.4f), i4});
    }

    public static int getColor(Context context, int i4) {
        return C0332a.m1804b(context, i4);
    }

    public static int[] getColorArray(Context context, int i4) throws Resources.NotFoundException {
        if (i4 == 0) {
            return null;
        }
        TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i4);
        int[] iArr = new int[typedArrayObtainTypedArray.length()];
        for (int i5 = 0; i5 < typedArrayObtainTypedArray.length(); i5++) {
            iArr[i5] = typedArrayObtainTypedArray.getColor(i5, 0);
        }
        typedArrayObtainTypedArray.recycle();
        return iArr;
    }

    public static int getColorFromAttrRes(int i4, int i5, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i4});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i5);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int getDisabledColor(Context context) {
        return adjustAlpha(isColorDark(resolveColor(context, R.attr.textColorPrimary)) ? IGoodView.DEFAULT_TEXT_COLOR : -1, 0.3f);
    }

    public static int getMainThemeColor(Context context) {
        return resolveColor(context, C2042R.attr.colorAccent, getColor(context, C2042R.color.xui_config_color_main_theme));
    }

    private static int gravityEnumToAttrInt(GravityEnum gravityEnum) {
        int i4 = C20541.f9680x65f71c2e[gravityEnum.ordinal()];
        int i5 = 1;
        if (i4 != 1) {
            i5 = 2;
            if (i4 != 2) {
                return 0;
            }
        }
        return i5;
    }

    public static boolean isColorDark(int i4) {
        return 1.0d - ((((((double) Color.red(i4)) * 0.299d) + (((double) Color.green(i4)) * 0.587d)) + (((double) Color.blue(i4)) * 0.114d)) / 255.0d) >= 0.5d;
    }

    public static <T> boolean isIn(T t3, T[] tArr) {
        if (tArr != null && tArr.length != 0) {
            for (T t4 : tArr) {
                if (t4.equals(t3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isNightMode() {
        return (ResUtils.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static ColorStateList resolveActionTextColorStateList(Context context, int i4, ColorStateList colorStateList) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i4});
        try {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(0);
            if (typedValuePeekValue == null) {
                return colorStateList;
            }
            int i5 = typedValuePeekValue.type;
            if (i5 >= 28 && i5 <= 31) {
                return getActionTextStateList(context, typedValuePeekValue.data);
            }
            ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(0);
            return colorStateList2 != null ? colorStateList2 : colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static boolean resolveBoolean(Context context, int i4, boolean z3) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i4});
        try {
            return typedArrayObtainStyledAttributes.getBoolean(0, z3);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int resolveColor(Context context, int i4) {
        return resolveColor(context, i4, 0);
    }

    public static int resolveDimension(Context context, int i4) {
        return resolveDimension(context, i4, -1);
    }

    public static Drawable resolveDrawable(Context context, int i4) {
        return resolveDrawable(context, i4, null);
    }

    public static float resolveFloat(Context context, int i4) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i4, typedValue, true);
        return typedValue.getFloat();
    }

    public static GravityEnum resolveGravityEnum(Context context, int i4, GravityEnum gravityEnum) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i4});
        try {
            int i5 = typedArrayObtainStyledAttributes.getInt(0, gravityEnumToAttrInt(gravityEnum));
            return i5 != 1 ? i5 != 2 ? GravityEnum.START : GravityEnum.END : GravityEnum.CENTER;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int resolveInt(Context context, int i4) {
        return resolveInt(context, i4, 0);
    }

    public static String resolveString(Context context, int i4) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i4, typedValue, true);
        return (String) typedValue.string;
    }

    public static void setBackgroundCompat(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static int resolveColor(Context context, int i4, int i5) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i4});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i5);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int resolveDimension(Context context, int i4, int i5) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i4});
        try {
            return typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i5);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static Drawable resolveDrawable(Context context, int i4, Drawable drawable) {
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

    public static int resolveInt(Context context, int i4, int i5) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i4});
        try {
            return typedArrayObtainStyledAttributes.getInt(0, i5);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static float resolveFloat(Context context, int i4, float f4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i4});
        try {
            return typedArrayObtainStyledAttributes.getFloat(0, f4);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static String resolveString(Context context, int i4, String str) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i4, typedValue, true);
        String str2 = (String) typedValue.string;
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    public static boolean resolveBoolean(Context context, int i4) {
        return resolveBoolean(context, i4, false);
    }

    public static String resolveString(Resources.Theme theme, int i4) {
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i4, typedValue, true);
        return (String) typedValue.string;
    }
}
