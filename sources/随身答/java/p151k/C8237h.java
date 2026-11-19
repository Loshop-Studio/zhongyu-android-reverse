package p151k;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import coil3.util.AbstractC5349d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: k.h */
/* loaded from: classes3.dex */
public final class C8237h implements InterfaceC8239j {

    /* renamed from: a */
    public final Drawable f14307a;

    /* renamed from: b */
    public final boolean f14308b;

    public C8237h(Drawable drawable, boolean z9) {
        this.f14307a = drawable;
        this.f14308b = z9;
    }

    @Override // p151k.InterfaceC8239j
    /* renamed from: a */
    public boolean mo12a() {
        return this.f14308b;
    }

    /* renamed from: b */
    public final Drawable m13267b() {
        return this.f14307a;
    }

    @Override // p151k.InterfaceC8239j
    public void draw(Canvas canvas) {
        this.f14307a.draw(canvas);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8237h)) {
            return false;
        }
        C8237h c8237h = (C8237h) obj;
        return Intrinsics.areEqual(this.f14307a, c8237h.f14307a) && this.f14308b == c8237h.f14308b;
    }

    @Override // p151k.InterfaceC8239j
    public int getHeight() {
        return AbstractC5349d.m2942b(this.f14307a);
    }

    @Override // p151k.InterfaceC8239j
    public long getSize() {
        return RangesKt.coerceAtLeast(AbstractC5349d.m2947g(this.f14307a) * 4 * AbstractC5349d.m2942b(this.f14307a), 0L);
    }

    @Override // p151k.InterfaceC8239j
    public int getWidth() {
        return AbstractC5349d.m2947g(this.f14307a);
    }

    public int hashCode() {
        return (this.f14307a.hashCode() * 31) + Boolean.hashCode(this.f14308b);
    }

    public String toString() {
        return "DrawableImage(drawable=" + this.f14307a + ", shareable=" + this.f14308b + ')';
    }
}
