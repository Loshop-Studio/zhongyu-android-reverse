package p025c2;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

/* renamed from: c2.a */
/* loaded from: classes3.dex */
public abstract class AbstractC4485a {
    /* renamed from: a */
    public static void m1596a(Drawable drawable, int i6) {
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ColorStateList.valueOf(i6));
        }
    }
}
