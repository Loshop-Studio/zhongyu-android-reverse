package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p015c.C1047j;
import p152t.C3385d;

/* renamed from: androidx.appcompat.widget.b0 */
/* loaded from: classes.dex */
public class C0204b0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1051a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1052b = {-16842910};

    /* renamed from: c */
    static final int[] f1053c = {R.attr.state_focused};

    /* renamed from: d */
    static final int[] f1054d = {R.attr.state_activated};

    /* renamed from: e */
    static final int[] f1055e = {R.attr.state_pressed};

    /* renamed from: f */
    static final int[] f1056f = {R.attr.state_checked};

    /* renamed from: g */
    static final int[] f1057g = {R.attr.state_selected};

    /* renamed from: h */
    static final int[] f1058h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f1059i = new int[0];

    /* renamed from: j */
    private static final int[] f1060j = new int[1];

    /* renamed from: a */
    public static void m762a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C1047j.f5928B0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(C1047j.f5953G0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m763b(Context context, int i4) {
        ColorStateList colorStateListM766e = m766e(context, i4);
        if (colorStateListM766e != null && colorStateListM766e.isStateful()) {
            return colorStateListM766e.getColorForState(f1052b, colorStateListM766e.getDefaultColor());
        }
        TypedValue typedValueM767f = m767f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueM767f, true);
        return m765d(context, i4, typedValueM767f.getFloat());
    }

    /* renamed from: c */
    public static int m764c(Context context, int i4) {
        int[] iArr = f1060j;
        iArr[0] = i4;
        C0214g0 c0214g0M814u = C0214g0.m814u(context, null, iArr);
        try {
            return c0214g0M814u.m817b(0, 0);
        } finally {
            c0214g0M814u.m835w();
        }
    }

    /* renamed from: d */
    static int m765d(Context context, int i4, float f4) {
        return C3385d.m10303d(m764c(context, i4), Math.round(Color.alpha(r0) * f4));
    }

    /* renamed from: e */
    public static ColorStateList m766e(Context context, int i4) {
        int[] iArr = f1060j;
        iArr[0] = i4;
        C0214g0 c0214g0M814u = C0214g0.m814u(context, null, iArr);
        try {
            return c0214g0M814u.m818c(0);
        } finally {
            c0214g0M814u.m835w();
        }
    }

    /* renamed from: f */
    private static TypedValue m767f() {
        ThreadLocal<TypedValue> threadLocal = f1051a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
