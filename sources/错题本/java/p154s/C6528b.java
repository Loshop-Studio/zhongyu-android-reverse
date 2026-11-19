package p154s;

import coil3.InterfaceC3305k;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: s.b */
/* loaded from: classes2.dex */
public final class C6528b implements InterfaceC6535i {

    /* renamed from: a */
    public final InterfaceC3305k f10815a;

    /* renamed from: b */
    public final C6532f f10816b;

    /* renamed from: c */
    public final Throwable f10817c;

    public C6528b(InterfaceC3305k interfaceC3305k, C6532f c6532f, Throwable th) {
        this.f10815a = interfaceC3305k;
        this.f10816b = c6532f;
        this.f10817c = th;
    }

    @Override // p154s.InterfaceC6535i
    /* renamed from: a */
    public final C6532f mo6181a() {
        return this.f10816b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6528b)) {
            return false;
        }
        C6528b c6528b = (C6528b) obj;
        return AbstractC5830k.m5325b(this.f10815a, c6528b.f10815a) && AbstractC5830k.m5325b(this.f10816b, c6528b.f10816b) && AbstractC5830k.m5325b(this.f10817c, c6528b.f10817c);
    }

    public final int hashCode() {
        InterfaceC3305k interfaceC3305k = this.f10815a;
        return this.f10817c.hashCode() + ((this.f10816b.hashCode() + ((interfaceC3305k == null ? 0 : interfaceC3305k.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.f10815a + ", request=" + this.f10816b + ", throwable=" + this.f10817c + ')';
    }
}
