package coil3.compose;

import androidx.compose.p011ui.graphics.painter.Painter;
import kotlin.jvm.internal.AbstractC5830k;
import p154s.C6540n;

/* renamed from: coil3.compose.h */
/* loaded from: classes2.dex */
public final class C3251h implements InterfaceC3252i {

    /* renamed from: a */
    public final Painter f1857a;

    /* renamed from: b */
    public final C6540n f1858b;

    public C3251h(Painter painter, C6540n c6540n) {
        this.f1857a = painter;
        this.f1858b = c6540n;
    }

    @Override // coil3.compose.InterfaceC3252i
    /* renamed from: a */
    public final Painter mo2186a() {
        return this.f1857a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3251h)) {
            return false;
        }
        C3251h c3251h = (C3251h) obj;
        return AbstractC5830k.m5325b(this.f1857a, c3251h.f1857a) && AbstractC5830k.m5325b(this.f1858b, c3251h.f1858b);
    }

    public final int hashCode() {
        return this.f1858b.hashCode() + (this.f1857a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f1857a + ", result=" + this.f1858b + ")";
    }
}
