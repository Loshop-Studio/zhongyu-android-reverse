package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6070d;

/* renamed from: m7.k1 */
/* loaded from: classes4.dex */
public final class C6150k1 extends AbstractC6129d1 {

    /* renamed from: c */
    public static final C6150k1 f9822c = new C6150k1(C6153l1.f9824a);

    @Override // p118m7.AbstractC6116a
    /* renamed from: e */
    public final int mo5813e(Object obj) {
        short[] sArr = (short[]) obj;
        AbstractC5830k.m5330g(sArr, "<this>");
        return sArr.length;
    }

    @Override // p118m7.AbstractC6169r, p118m7.AbstractC6116a
    /* renamed from: h */
    public final void mo5816h(InterfaceC6069c interfaceC6069c, int i, Object obj) {
        C6147j1 builder = (C6147j1) obj;
        AbstractC5830k.m5330g(builder, "builder");
        short sDecodeShortElement = interfaceC6069c.decodeShortElement(this.f9788b, i);
        builder.mo5824b(builder.mo5825d() + 1);
        short[] sArr = builder.f9818a;
        int i8 = builder.f9819b;
        builder.f9819b = i8 + 1;
        sArr[i8] = sDecodeShortElement;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: i */
    public final Object mo5817i(Object obj) {
        short[] sArr = (short[]) obj;
        AbstractC5830k.m5330g(sArr, "<this>");
        C6147j1 c6147j1 = new C6147j1();
        c6147j1.f9818a = sArr;
        c6147j1.f9819b = sArr.length;
        c6147j1.mo5824b(10);
        return c6147j1;
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: l */
    public final Object mo5819l() {
        return new short[0];
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: m */
    public final void mo5820m(InterfaceC6070d encoder, Object obj, int i) {
        short[] content = (short[]) obj;
        AbstractC5830k.m5330g(encoder, "encoder");
        AbstractC5830k.m5330g(content, "content");
        for (int i8 = 0; i8 < i; i8++) {
            encoder.encodeShortElement(this.f9788b, i8, content[i8]);
        }
    }
}
