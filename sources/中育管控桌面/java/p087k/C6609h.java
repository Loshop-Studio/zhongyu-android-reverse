package p087k;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import coil3.util.AbstractC4595d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: k.h */
/* loaded from: classes3.dex */
public final class C6609h implements InterfaceC6611j {

    /* renamed from: a */
    public final Drawable f8649a;

    /* renamed from: b */
    public final boolean f8650b;

    public C6609h(Drawable drawable, boolean z6) {
        this.f8649a = drawable;
        this.f8650b = z6;
    }

    @Override // p087k.InterfaceC6611j
    /* renamed from: a */
    public boolean mo7565a() {
        return this.f8650b;
    }

    /* renamed from: b */
    public final Drawable m7567b() {
        return this.f8649a;
    }

    @Override // p087k.InterfaceC6611j
    public void draw(Canvas canvas) {
        this.f8649a.draw(canvas);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6609h)) {
            return false;
        }
        C6609h c6609h = (C6609h) obj;
        return Intrinsics.areEqual(this.f8649a, c6609h.f8649a) && this.f8650b == c6609h.f8650b;
    }

    @Override // p087k.InterfaceC6611j
    public int getHeight() {
        return AbstractC4595d.m2051b(this.f8649a);
    }

    @Override // p087k.InterfaceC6611j
    public long getSize() {
        return RangesKt.coerceAtLeast(AbstractC4595d.m2056g(this.f8649a) * 4 * AbstractC4595d.m2051b(this.f8649a), 0L);
    }

    @Override // p087k.InterfaceC6611j
    public int getWidth() {
        return AbstractC4595d.m2056g(this.f8649a);
    }

    public int hashCode() {
        return (this.f8649a.hashCode() * 31) + Boolean.hashCode(this.f8650b);
    }

    public String toString() {
        return "DrawableImage(drawable=" + this.f8649a + ", shareable=" + this.f8650b + ')';
    }
}
