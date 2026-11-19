package p212k;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import coil3.util.AbstractC5491d;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;

/* renamed from: k.h */
/* loaded from: classes3.dex */
public final class C9754h implements InterfaceC9756j {

    /* renamed from: a */
    public final Drawable f22920a;

    /* renamed from: b */
    public final boolean f22921b;

    public C9754h(Drawable drawable, boolean z10) {
        this.f22920a = drawable;
        this.f22921b = z10;
    }

    @Override // p212k.InterfaceC9756j
    /* renamed from: a */
    public boolean mo19675a() {
        return this.f22921b;
    }

    /* renamed from: b */
    public final Drawable m19677b() {
        return this.f22920a;
    }

    @Override // p212k.InterfaceC9756j
    public void draw(Canvas canvas) {
        this.f22920a.draw(canvas);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9754h)) {
            return false;
        }
        C9754h c9754h = (C9754h) obj;
        return AbstractC9979u.m20289b(this.f22920a, c9754h.f22920a) && this.f22921b == c9754h.f22921b;
    }

    @Override // p212k.InterfaceC9756j
    public int getHeight() {
        return AbstractC5491d.m3319b(this.f22920a);
    }

    @Override // p212k.InterfaceC9756j
    public long getSize() {
        return AbstractC10410o.m21753f(AbstractC5491d.m3324g(this.f22920a) * 4 * AbstractC5491d.m3319b(this.f22920a), 0L);
    }

    @Override // p212k.InterfaceC9756j
    public int getWidth() {
        return AbstractC5491d.m3324g(this.f22920a);
    }

    public int hashCode() {
        return (this.f22920a.hashCode() * 31) + Boolean.hashCode(this.f22921b);
    }

    public String toString() {
        return "DrawableImage(drawable=" + this.f22920a + ", shareable=" + this.f22921b + ')';
    }
}
