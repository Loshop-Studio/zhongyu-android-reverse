package com.xuexiang.xui.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.content.C0332a;
import com.xuexiang.xui.XUI;
import p073d.C2443a;

/* loaded from: classes.dex */
public final class ResUtils {
    private ResUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static int darker(int i4, float f4) {
        return Color.argb(Color.alpha(i4), Math.max((int) (Color.red(i4) * f4), 0), Math.max((int) (Color.green(i4) * f4), 0), Math.max((int) (Color.blue(i4) * f4), 0));
    }

    public static Animation getAnim(int i4) {
        return AnimationUtils.loadAnimation(XUI.getContext(), i4);
    }

    public static int getColor(int i4) {
        return getResources().getColor(i4);
    }

    public static ColorStateList getColorStateListAttrRes(Context context, TypedArray typedArray, int i4) {
        if (Build.VERSION.SDK_INT >= 23) {
            return typedArray.getColorStateList(i4);
        }
        int resourceId = typedArray.getResourceId(i4, -1);
        if (resourceId != -1) {
            return C2443a.m8168c(context, resourceId);
        }
        return null;
    }

    public static ColorStateList getColors(int i4) {
        return getResources().getColorStateList(i4);
    }

    public static float getDimens(int i4) {
        return getResources().getDimension(i4);
    }

    public static int getDimensionPixelOffset(int i4) {
        return getResources().getDimensionPixelOffset(i4);
    }

    public static int getDimensionPixelSize(int i4) {
        return getResources().getDimensionPixelSize(i4);
    }

    public static Drawable getDrawable(int i4) {
        return XUI.getContext().getDrawable(i4);
    }

    public static Drawable[] getDrawableArray(Context context, int i4) throws Resources.NotFoundException {
        TypedArray typedArrayObtainTypedArray = getResources().obtainTypedArray(i4);
        Drawable[] drawableArr = new Drawable[typedArrayObtainTypedArray.length()];
        for (int i5 = 0; i5 < typedArrayObtainTypedArray.length(); i5++) {
            int resourceId = typedArrayObtainTypedArray.getResourceId(i5, 0);
            if (resourceId != 0) {
                drawableArr[i5] = C0332a.m1806d(context, resourceId);
            }
        }
        typedArrayObtainTypedArray.recycle();
        return drawableArr;
    }

    public static Drawable getDrawableAttrRes(Context context, TypedArray typedArray, int i4) {
        return typedArray.getDrawable(i4);
    }

    public static int[] getIntArray(int i4) {
        return getResources().getIntArray(i4);
    }

    public static Resources getResources() {
        return XUI.getContext().getResources();
    }

    public static String getString(int i4) {
        return getResources().getString(i4);
    }

    public static String[] getStringArray(int i4) {
        return getResources().getStringArray(i4);
    }

    public static Drawable getVectorDrawable(Context context, int i4) {
        return context.getDrawable(i4);
    }

    public static boolean isRtl() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static int lighter(int i4, float f4) {
        float f5 = 1.0f - f4;
        return Color.argb(Color.alpha(i4), (int) ((((Color.red(i4) * f5) / 255.0f) + f4) * 255.0f), (int) ((((Color.green(i4) * f5) / 255.0f) + f4) * 255.0f), (int) ((((Color.blue(i4) * f5) / 255.0f) + f4) * 255.0f));
    }

    public static Drawable getDrawable(Context context, int i4) {
        return context.getDrawable(i4);
    }

    public static boolean isRtl(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
