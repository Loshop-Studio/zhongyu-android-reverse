package p231r3;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

/* renamed from: r3.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9428a {
    /* renamed from: a */
    public static void m15571a(Drawable drawable, int i9) {
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ColorStateList.valueOf(i9));
        }
    }
}
