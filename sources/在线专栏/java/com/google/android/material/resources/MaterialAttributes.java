package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.C1371R;

/* loaded from: classes.dex */
public class MaterialAttributes {
    public static TypedValue resolve(Context context, int i4) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean resolveBoolean(Context context, int i4, boolean z3) {
        TypedValue typedValueResolve = resolve(context, i4);
        return (typedValueResolve == null || typedValueResolve.type != 18) ? z3 : typedValueResolve.data != 0;
    }

    public static boolean resolveBooleanOrThrow(Context context, int i4, String str) {
        return resolveOrThrow(context, i4, str) != 0;
    }

    public static int resolveDimension(Context context, int i4, int i5) {
        TypedValue typedValueResolve = resolve(context, i4);
        return (int) ((typedValueResolve == null || typedValueResolve.type != 5) ? context.getResources().getDimension(i5) : typedValueResolve.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static int resolveMinimumAccessibleTouchTarget(Context context) {
        return resolveDimension(context, C1371R.attr.minTouchTargetSize, C1371R.dimen.mtrl_min_touch_target_size);
    }

    public static int resolveOrThrow(Context context, int i4, String str) {
        TypedValue typedValueResolve = resolve(context, i4);
        if (typedValueResolve != null) {
            return typedValueResolve.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i4)));
    }

    public static int resolveOrThrow(View view, int i4) {
        return resolveOrThrow(view.getContext(), i4, view.getClass().getCanonicalName());
    }
}
