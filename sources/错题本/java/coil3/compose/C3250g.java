package coil3.compose;

import androidx.compose.p011ui.graphics.painter.Painter;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: coil3.compose.g */
/* loaded from: classes2.dex */
public final class C3250g implements InterfaceC3252i {

    /* renamed from: a */
    public final Painter f1856a;

    public C3250g(Painter painter) {
        this.f1856a = painter;
    }

    @Override // coil3.compose.InterfaceC3252i
    /* renamed from: a */
    public final Painter mo2186a() {
        return this.f1856a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3250g) && AbstractC5830k.m5325b(this.f1856a, ((C3250g) obj).f1856a);
    }

    public final int hashCode() {
        Painter painter = this.f1856a;
        if (painter == null) {
            return 0;
        }
        return painter.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f1856a + ")";
    }
}
