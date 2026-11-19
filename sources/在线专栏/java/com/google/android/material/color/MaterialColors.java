package com.google.android.material.color;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.resources.MaterialAttributes;
import p152t.C3385d;

/* loaded from: classes.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;

    private MaterialColors() {
    }

    public static int compositeARGBWithAlpha(int i4, int i5) {
        return C3385d.m10303d(i4, (Color.alpha(i4) * i5) / 255);
    }

    public static int getColor(View view, int i4) {
        return MaterialAttributes.resolveOrThrow(view, i4);
    }

    public static int layer(View view, int i4, int i5) {
        return layer(view, i4, i5, 1.0f);
    }

    public static int getColor(Context context, int i4, String str) {
        return MaterialAttributes.resolveOrThrow(context, i4, str);
    }

    public static int layer(View view, int i4, int i5, float f4) {
        return layer(getColor(view, i4), getColor(view, i5), f4);
    }

    public static int getColor(View view, int i4, int i5) {
        return getColor(view.getContext(), i4, i5);
    }

    public static int getColor(Context context, int i4, int i5) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i4);
        return typedValueResolve != null ? typedValueResolve.data : i5;
    }

    public static int layer(int i4, int i5, float f4) {
        return layer(i4, C3385d.m10303d(i5, Math.round(Color.alpha(i5) * f4)));
    }

    public static int layer(int i4, int i5) {
        return C3385d.m10301b(i5, i4);
    }
}
