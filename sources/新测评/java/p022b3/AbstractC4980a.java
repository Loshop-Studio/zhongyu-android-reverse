package p022b3;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

/* renamed from: b3.a */
/* loaded from: classes4.dex */
public abstract class AbstractC4980a {
    /* renamed from: a */
    public static void m2460a(Drawable drawable, int i10) {
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ColorStateList.valueOf(i10));
        }
    }
}
