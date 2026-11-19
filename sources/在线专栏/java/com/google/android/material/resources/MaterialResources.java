package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.C0214g0;
import p073d.C2443a;

/* loaded from: classes.dex */
public class MaterialResources {
    private MaterialResources() {
    }

    public static ColorStateList getColorStateList(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        ColorStateList colorStateListM8168c;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (colorStateListM8168c = C2443a.m8168c(context, resourceId)) == null) ? typedArray.getColorStateList(i4) : colorStateListM8168c;
    }

    public static int getDimensionPixelSize(Context context, TypedArray typedArray, int i4, int i5) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i4, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i4, i5);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i5);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable getDrawable(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        Drawable drawableM8169d;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (drawableM8169d = C2443a.m8169d(context, resourceId)) == null) ? typedArray.getDrawable(i4) : drawableM8169d;
    }

    static int getIndexWithValue(TypedArray typedArray, int i4, int i5) {
        return typedArray.hasValue(i4) ? i4 : i5;
    }

    public static TextAppearance getTextAppearance(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        if (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0) {
            return null;
        }
        return new TextAppearance(context, resourceId);
    }

    public static ColorStateList getColorStateList(Context context, C0214g0 c0214g0, int i4) {
        int iM829n;
        ColorStateList colorStateListM8168c;
        return (!c0214g0.m834s(i4) || (iM829n = c0214g0.m829n(i4, 0)) == 0 || (colorStateListM8168c = C2443a.m8168c(context, iM829n)) == null) ? c0214g0.m818c(i4) : colorStateListM8168c;
    }
}
