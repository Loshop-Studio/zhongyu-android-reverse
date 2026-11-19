package p152k0;

import java.io.File;
import p122h0.C8084d;
import p122h0.InterfaceC8081a;
import p174m0.InterfaceC8939a;

/* renamed from: k0.b */
/* loaded from: classes3.dex */
public class C8251b implements InterfaceC8939a.b {

    /* renamed from: a */
    public final InterfaceC8081a f14320a;

    /* renamed from: b */
    public final Object f14321b;

    /* renamed from: c */
    public final C8084d f14322c;

    public C8251b(InterfaceC8081a interfaceC8081a, Object obj, C8084d c8084d) {
        this.f14320a = interfaceC8081a;
        this.f14321b = obj;
        this.f14322c = c8084d;
    }

    @Override // p174m0.InterfaceC8939a.b
    /* renamed from: a */
    public boolean mo13291a(File file) {
        return this.f14320a.mo12898a(this.f14321b, file, this.f14322c);
    }
}
