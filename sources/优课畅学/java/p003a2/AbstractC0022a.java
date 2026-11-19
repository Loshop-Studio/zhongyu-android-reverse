package p003a2;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

/* renamed from: a2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC0022a {
    /* renamed from: a */
    public static void m51a(Drawable drawable, int i10) {
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ColorStateList.valueOf(i10));
        }
    }
}
