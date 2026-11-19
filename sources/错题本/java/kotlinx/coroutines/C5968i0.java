package kotlinx.coroutines;

import androidx.collection.AbstractC0584a;

/* renamed from: kotlinx.coroutines.i0 */
/* loaded from: classes4.dex */
public final class C5968i0 implements InterfaceC5999s0 {

    /* renamed from: a */
    public final boolean f9459a;

    public C5968i0(boolean z8) {
        this.f9459a = z8;
    }

    @Override // kotlinx.coroutines.InterfaceC5999s0
    /* renamed from: b */
    public final C5897f1 mo5429b() {
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC5999s0
    public final boolean isActive() {
        return this.f9459a;
    }

    public final String toString() {
        return AbstractC0584a.m911l('}', this.f9459a ? "Active" : "New", new StringBuilder("Empty{"));
    }
}
