package p070b.p074b.p075a.p076a.p096r;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import io.github.inflationx.calligraphy3.C1088R;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p074b.p075a.p076a.C0564b;

/* renamed from: b.b.a.a.r.j */
/* loaded from: classes.dex */
public final class C0655j {

    /* renamed from: a */
    public static final int[] f3947a = {C1088R.attr.colorPrimary};

    /* renamed from: b */
    public static final int[] f3948b = {C1088R.attr.colorPrimaryVariant};

    /* renamed from: a */
    public static void m2266a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0564b.f3529x, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C1088R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m2268c(context, f3948b, "Theme.MaterialComponents");
            }
        }
        m2268c(context, f3947a, "Theme.AppCompat");
    }

    /* renamed from: b */
    public static void m2267b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0564b.f3529x, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 : iArr2) {
                if (typedArrayObtainStyledAttributes2.getResourceId(i3, -1) == -1) {
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
            z = true;
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: c */
    public static void m2268c(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= iArr.length) {
                typedArrayObtainStyledAttributes.recycle();
                z = true;
                break;
            } else {
                if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                    typedArrayObtainStyledAttributes.recycle();
                    break;
                }
                i++;
            }
        }
        if (!z) {
            throw new IllegalArgumentException(C0561a.m2077e("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    /* renamed from: d */
    public static TypedArray m2269d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m2266a(context, attributeSet, i, i2);
        m2267b(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }
}
