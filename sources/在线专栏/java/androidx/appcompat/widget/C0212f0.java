package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.f0 */
/* loaded from: classes.dex */
class C0212f0 extends C0238x {

    /* renamed from: b */
    private final WeakReference<Context> f1090b;

    public C0212f0(Context context, Resources resources) {
        super(resources);
        this.f1090b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.C0238x, android.content.res.Resources
    public Drawable getDrawable(int i4) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i4);
        Context context = this.f1090b.get();
        if (drawable != null && context != null) {
            C0237w.m1017h().m1033x(context, i4, drawable);
        }
        return drawable;
    }
}
