package p093m;

import java.io.File;
import p076j.C3794d;
import p076j.InterfaceC3791a;
import p102o.InterfaceC4410a;

/* renamed from: m.b */
/* loaded from: classes2.dex */
public class C4353b implements InterfaceC4410a.b {

    /* renamed from: a */
    public final InterfaceC3791a f4862a;

    /* renamed from: b */
    public final Object f4863b;

    /* renamed from: c */
    public final C3794d f4864c;

    public C4353b(InterfaceC3791a interfaceC3791a, Object obj, C3794d c3794d) {
        this.f4862a = interfaceC3791a;
        this.f4863b = obj;
        this.f4864c = c3794d;
    }

    @Override // p102o.InterfaceC4410a.b
    /* renamed from: a */
    public boolean mo5363a(File file) {
        return this.f4862a.mo4941a(this.f4863b, file, this.f4864c);
    }
}
