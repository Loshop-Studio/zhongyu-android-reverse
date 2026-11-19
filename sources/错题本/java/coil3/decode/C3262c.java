package coil3.decode;

import p076h7.C5642e;
import p119n.C6206k;
import p154s.C6538l;

/* renamed from: coil3.decode.c */
/* loaded from: classes2.dex */
public final class C3262c implements InterfaceC3268i {

    /* renamed from: a */
    public final C5642e f1893a;

    /* renamed from: b */
    public final C3272m f1894b;

    public C3262c(C5642e c5642e, C3272m c3272m) {
        this.f1893a = c5642e;
        this.f1894b = c3272m;
    }

    @Override // coil3.decode.InterfaceC3268i
    /* renamed from: a */
    public final InterfaceC3269j mo2190a(C6206k c6206k, C6538l c6538l) {
        return new C3263d(c6206k.f9922a, c6538l, this.f1893a, this.f1894b);
    }
}
