package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6070d;

/* renamed from: m7.t */
/* loaded from: classes4.dex */
public final class C6175t extends AbstractC6129d1 {

    /* renamed from: c */
    public static final C6175t f9864c = new C6175t(C6178u.f9869a);

    @Override // p118m7.AbstractC6116a
    /* renamed from: e */
    public final int mo5813e(Object obj) {
        double[] dArr = (double[]) obj;
        AbstractC5830k.m5330g(dArr, "<this>");
        return dArr.length;
    }

    @Override // p118m7.AbstractC6169r, p118m7.AbstractC6116a
    /* renamed from: h */
    public final void mo5816h(InterfaceC6069c interfaceC6069c, int i, Object obj) {
        C6172s builder = (C6172s) obj;
        AbstractC5830k.m5330g(builder, "builder");
        double dDecodeDoubleElement = interfaceC6069c.decodeDoubleElement(this.f9788b, i);
        builder.mo5824b(builder.mo5825d() + 1);
        double[] dArr = builder.f9860a;
        int i8 = builder.f9861b;
        builder.f9861b = i8 + 1;
        dArr[i8] = dDecodeDoubleElement;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: i */
    public final Object mo5817i(Object obj) {
        double[] dArr = (double[]) obj;
        AbstractC5830k.m5330g(dArr, "<this>");
        C6172s c6172s = new C6172s();
        c6172s.f9860a = dArr;
        c6172s.f9861b = dArr.length;
        c6172s.mo5824b(10);
        return c6172s;
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: l */
    public final Object mo5819l() {
        return new double[0];
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: m */
    public final void mo5820m(InterfaceC6070d encoder, Object obj, int i) {
        double[] content = (double[]) obj;
        AbstractC5830k.m5330g(encoder, "encoder");
        AbstractC5830k.m5330g(content, "content");
        for (int i8 = 0; i8 < i; i8++) {
            encoder.encodeDoubleElement(this.f9788b, i8, content[i8]);
        }
    }
}
