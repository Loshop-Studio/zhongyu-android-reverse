package coil3.compose;

import androidx.compose.p011ui.graphics.painter.Painter;
import kotlin.jvm.internal.AbstractC5830k;
import p154s.C6528b;

/* renamed from: coil3.compose.f */
/* loaded from: classes2.dex */
public final class C3249f implements InterfaceC3252i {

    /* renamed from: a */
    public final Painter f1854a;

    /* renamed from: b */
    public final C6528b f1855b;

    public C3249f(Painter painter, C6528b c6528b) {
        this.f1854a = painter;
        this.f1855b = c6528b;
    }

    @Override // coil3.compose.InterfaceC3252i
    /* renamed from: a */
    public final Painter mo2186a() {
        return this.f1854a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3249f)) {
            return false;
        }
        C3249f c3249f = (C3249f) obj;
        return AbstractC5830k.m5325b(this.f1854a, c3249f.f1854a) && AbstractC5830k.m5325b(this.f1855b, c3249f.f1855b);
    }

    public final int hashCode() {
        Painter painter = this.f1854a;
        return this.f1855b.hashCode() + ((painter == null ? 0 : painter.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f1854a + ", result=" + this.f1855b + ")";
    }
}
