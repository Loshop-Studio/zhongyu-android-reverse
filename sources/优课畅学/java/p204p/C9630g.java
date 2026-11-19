package p204p;

import p116h0.C8703g;
import p160l.InterfaceC9228b;
import p182n.InterfaceC9357j;
import p204p.InterfaceC9631h;

/* renamed from: p.g */
/* loaded from: classes3.dex */
public class C9630g extends C8703g implements InterfaceC9631h {

    /* renamed from: e */
    public InterfaceC9631h.a f19258e;

    public C9630g(long j10) {
        super(j10);
    }

    @Override // p204p.InterfaceC9631h
    /* renamed from: b */
    public /* bridge */ /* synthetic */ InterfaceC9357j mo18179b(InterfaceC9228b interfaceC9228b, InterfaceC9357j interfaceC9357j) {
        return (InterfaceC9357j) super.m14172j(interfaceC9228b, interfaceC9357j);
    }

    @Override // p204p.InterfaceC9631h
    /* renamed from: c */
    public void mo18180c(InterfaceC9631h.a aVar) {
        this.f19258e = aVar;
    }

    @Override // p204p.InterfaceC9631h
    /* renamed from: d */
    public /* bridge */ /* synthetic */ InterfaceC9357j mo18181d(InterfaceC9228b interfaceC9228b) {
        return (InterfaceC9357j) super.m14173k(interfaceC9228b);
    }

    @Override // p116h0.C8703g
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public int mo14170h(InterfaceC9357j interfaceC9357j) {
        return interfaceC9357j == null ? super.mo14170h(null) : interfaceC9357j.getSize();
    }

    @Override // p116h0.C8703g
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo14171i(InterfaceC9228b interfaceC9228b, InterfaceC9357j interfaceC9357j) {
        InterfaceC9631h.a aVar = this.f19258e;
        if (aVar == null || interfaceC9357j == null) {
            return;
        }
        aVar.mo2980c(interfaceC9357j);
    }

    @Override // p204p.InterfaceC9631h
    public void trimMemory(int i10) {
        if (i10 >= 40) {
            m14166a();
        } else if (i10 >= 20 || i10 == 15) {
            m14174l(m14169g() / 2);
        }
    }
}
