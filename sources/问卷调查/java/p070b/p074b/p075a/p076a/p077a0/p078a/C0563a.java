package p070b.p074b.p075a.p076a.p077a0.p078a;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import io.github.inflationx.calligraphy3.C1088R;
import p000a.p005b.p012g.C0042c;

/* renamed from: b.b.a.a.a0.a.a */
/* loaded from: classes.dex */
public class C0563a {

    /* renamed from: a */
    public static final int[] f3504a = {R.attr.theme, C1088R.attr.theme};

    /* renamed from: b */
    public static final int[] f3505b = {C1088R.attr.materialThemeOverlay};

    /* renamed from: a */
    public static Context m2100a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3505b, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof C0042c) && ((C0042c) context).f287a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C0042c c0042c = new C0042c(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f3504a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0042c.getTheme().applyStyle(resourceId2, true);
        }
        return c0042c;
    }
}
