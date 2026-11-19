package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6070d;

/* renamed from: m7.n0 */
/* loaded from: classes4.dex */
public final class C6158n0 extends AbstractC6129d1 {

    /* renamed from: c */
    public static final C6158n0 f9833c = new C6158n0(C6161o0.f9839a);

    @Override // p118m7.AbstractC6116a
    /* renamed from: e */
    public final int mo5813e(Object obj) {
        long[] jArr = (long[]) obj;
        AbstractC5830k.m5330g(jArr, "<this>");
        return jArr.length;
    }

    @Override // p118m7.AbstractC6169r, p118m7.AbstractC6116a
    /* renamed from: h */
    public final void mo5816h(InterfaceC6069c interfaceC6069c, int i, Object obj) {
        C6155m0 builder = (C6155m0) obj;
        AbstractC5830k.m5330g(builder, "builder");
        long jDecodeLongElement = interfaceC6069c.decodeLongElement(this.f9788b, i);
        builder.mo5824b(builder.mo5825d() + 1);
        long[] jArr = builder.f9827a;
        int i8 = builder.f9828b;
        builder.f9828b = i8 + 1;
        jArr[i8] = jDecodeLongElement;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: i */
    public final Object mo5817i(Object obj) {
        long[] jArr = (long[]) obj;
        AbstractC5830k.m5330g(jArr, "<this>");
        C6155m0 c6155m0 = new C6155m0();
        c6155m0.f9827a = jArr;
        c6155m0.f9828b = jArr.length;
        c6155m0.mo5824b(10);
        return c6155m0;
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: l */
    public final Object mo5819l() {
        return new long[0];
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: m */
    public final void mo5820m(InterfaceC6070d encoder, Object obj, int i) {
        long[] content = (long[]) obj;
        AbstractC5830k.m5330g(encoder, "encoder");
        AbstractC5830k.m5330g(content, "content");
        for (int i8 = 0; i8 < i; i8++) {
            encoder.encodeLongElement(this.f9788b, i8, content[i8]);
        }
    }
}
