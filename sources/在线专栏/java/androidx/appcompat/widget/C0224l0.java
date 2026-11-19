package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.l0 */
/* loaded from: classes.dex */
public class C0224l0 extends Resources {

    /* renamed from: b */
    private static boolean f1152b = false;

    /* renamed from: a */
    private final WeakReference<Context> f1153a;

    public C0224l0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1153a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m914a() {
        return f1152b;
    }

    /* renamed from: b */
    public static boolean m915b() {
        m914a();
        return false;
    }

    /* renamed from: c */
    final Drawable m916c(int i4) {
        return super.getDrawable(i4);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i4) throws Resources.NotFoundException {
        Context context = this.f1153a.get();
        return context != null ? C0237w.m1017h().m1031t(context, this, i4) : super.getDrawable(i4);
    }
}
