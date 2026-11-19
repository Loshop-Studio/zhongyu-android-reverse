package p182n;

import java.io.File;
import p160l.C9230d;
import p160l.InterfaceC9227a;
import p204p.InterfaceC9624a;

/* renamed from: n.b */
/* loaded from: classes3.dex */
public class C9349b implements InterfaceC9624a.b {

    /* renamed from: a */
    public final InterfaceC9227a f18461a;

    /* renamed from: b */
    public final Object f18462b;

    /* renamed from: c */
    public final C9230d f18463c;

    public C9349b(InterfaceC9227a interfaceC9227a, Object obj, C9230d c9230d) {
        this.f18461a = interfaceC9227a;
        this.f18462b = obj;
        this.f18463c = c9230d;
    }

    @Override // p204p.InterfaceC9624a.b
    /* renamed from: a */
    public boolean mo17226a(File file) {
        return this.f18461a.mo16931b(this.f18462b, file, this.f18463c);
    }
}
