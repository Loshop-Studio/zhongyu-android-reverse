package coil3;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import coil3.util.AbstractC3348l;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: coil3.e */
/* loaded from: classes2.dex */
public final class C3294e implements InterfaceC3305k {

    /* renamed from: a */
    public final Drawable f1976a;

    public C3294e(Drawable drawable) {
        this.f1976a = drawable;
    }

    @Override // coil3.InterfaceC3305k
    /* renamed from: a */
    public final boolean mo2175a() {
        return false;
    }

    @Override // coil3.InterfaceC3305k
    public final void draw(Canvas canvas) {
        this.f1976a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3294e) && AbstractC5830k.m5325b(this.f1976a, ((C3294e) obj).f1976a);
    }

    @Override // coil3.InterfaceC3305k
    public final int getHeight() {
        return AbstractC3348l.m2288a(this.f1976a);
    }

    @Override // coil3.InterfaceC3305k
    public final long getSize() {
        Drawable drawable = this.f1976a;
        long jM2289b = AbstractC3348l.m2289b(drawable) * 4 * AbstractC3348l.m2288a(drawable);
        if (jM2289b < 0) {
            return 0L;
        }
        return jM2289b;
    }

    @Override // coil3.InterfaceC3305k
    public final int getWidth() {
        return AbstractC3348l.m2289b(this.f1976a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f1976a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.f1976a + ", shareable=false)";
    }
}
