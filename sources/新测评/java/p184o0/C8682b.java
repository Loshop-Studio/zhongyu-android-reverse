package p184o0;

import java.io.File;
import p162m0.C8539d;
import p162m0.InterfaceC8536a;
import p206q0.InterfaceC8866a;

/* renamed from: o0.b */
/* loaded from: classes3.dex */
public class C8682b implements InterfaceC8866a.b {

    /* renamed from: a */
    public final InterfaceC8536a f14419a;

    /* renamed from: b */
    public final Object f14420b;

    /* renamed from: c */
    public final C8539d f14421c;

    public C8682b(InterfaceC8536a interfaceC8536a, Object obj, C8539d c8539d) {
        this.f14419a = interfaceC8536a;
        this.f14420b = obj;
        this.f14421c = c8539d;
    }

    @Override // p206q0.InterfaceC8866a.b
    /* renamed from: a */
    public boolean mo14280a(File file) {
        return this.f14419a.mo14048a(this.f14420b, file, this.f14421c);
    }
}
