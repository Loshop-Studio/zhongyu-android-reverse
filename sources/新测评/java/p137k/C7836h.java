package p137k;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import coil3.util.AbstractC5214d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: k.h */
/* loaded from: classes3.dex */
public final class C7836h implements InterfaceC7838j {

    /* renamed from: a */
    public final Drawable f13572a;

    /* renamed from: b */
    public final boolean f13573b;

    public C7836h(Drawable drawable, boolean z9) {
        this.f13572a = drawable;
        this.f13573b = z9;
    }

    @Override // p137k.InterfaceC7838j
    /* renamed from: a */
    public boolean mo13296a() {
        return this.f13573b;
    }

    /* renamed from: b */
    public final Drawable m13298b() {
        return this.f13572a;
    }

    @Override // p137k.InterfaceC7838j
    public void draw(Canvas canvas) {
        this.f13572a.draw(canvas);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7836h)) {
            return false;
        }
        C7836h c7836h = (C7836h) obj;
        return Intrinsics.areEqual(this.f13572a, c7836h.f13572a) && this.f13573b == c7836h.f13573b;
    }

    @Override // p137k.InterfaceC7838j
    public int getHeight() {
        return AbstractC5214d.m3225b(this.f13572a);
    }

    @Override // p137k.InterfaceC7838j
    public long getSize() {
        return RangesKt.coerceAtLeast(AbstractC5214d.m3230g(this.f13572a) * 4 * AbstractC5214d.m3225b(this.f13572a), 0L);
    }

    @Override // p137k.InterfaceC7838j
    public int getWidth() {
        return AbstractC5214d.m3230g(this.f13572a);
    }

    public int hashCode() {
        return (this.f13572a.hashCode() * 31) + Boolean.hashCode(this.f13573b);
    }

    public String toString() {
        return "DrawableImage(drawable=" + this.f13572a + ", shareable=" + this.f13573b + ')';
    }
}
