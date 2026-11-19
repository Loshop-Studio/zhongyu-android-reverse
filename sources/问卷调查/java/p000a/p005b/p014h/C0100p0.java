package p000a.p005b.p014h;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p000a.p005b.C0014b;
import p000a.p031h.p035d.C0202a;

/* renamed from: a.b.h.p0 */
/* loaded from: classes.dex */
public class C0100p0 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f744a = new ThreadLocal<>();

    /* renamed from: b */
    public static final int[] f745b = {-16842910};

    /* renamed from: c */
    public static final int[] f746c = {R.attr.state_focused};

    /* renamed from: d */
    public static final int[] f747d = {R.attr.state_pressed};

    /* renamed from: e */
    public static final int[] f748e = {R.attr.state_checked};

    /* renamed from: f */
    public static final int[] f749f = new int[0];

    /* renamed from: g */
    public static final int[] f750g = new int[1];

    /* renamed from: a */
    public static void m376a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C0014b.f35j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m377b(Context context, int i) {
        ColorStateList colorStateListM379d = m379d(context, i);
        if (colorStateListM379d != null && colorStateListM379d.isStateful()) {
            return colorStateListM379d.getColorForState(f745b, colorStateListM379d.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f744a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        return C0202a.m757c(m378c(context, i), Math.round(Color.alpha(r4) * f2));
    }

    /* renamed from: c */
    public static int m378c(Context context, int i) {
        int[] iArr = f750g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021 A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #0 {all -> 0x001f, blocks: (B:3:0x000a, B:5:0x0010, B:7:0x0016, B:12:0x0021), top: B:17:0x000a }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList m379d(android.content.Context r3, int r4) {
        /*
            int[] r0 = p000a.p005b.p014h.C0100p0.f750g
            r1 = 0
            r0[r1] = r4
            r4 = 0
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0)
            boolean r0 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L21
            int r0 = r4.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L21
            java.lang.ThreadLocal<android.util.TypedValue> r2 = p000a.p005b.p007d.p008a.C0034a.f211a     // Catch: java.lang.Throwable -> L1f
            android.content.res.ColorStateList r3 = r3.getColorStateList(r0)     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L21
            goto L25
        L1f:
            r3 = move-exception
            goto L29
        L21:
            android.content.res.ColorStateList r3 = r4.getColorStateList(r1)     // Catch: java.lang.Throwable -> L1f
        L25:
            r4.recycle()
            return r3
        L29:
            r4.recycle()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p014h.C0100p0.m379d(android.content.Context, int):android.content.res.ColorStateList");
    }
}
