package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6070d;

/* renamed from: m7.i0 */
/* loaded from: classes4.dex */
public final class C6143i0 extends AbstractC6129d1 {

    /* renamed from: c */
    public static final C6143i0 f9813c = new C6143i0(C6146j0.f9816a);

    @Override // p118m7.AbstractC6116a
    /* renamed from: e */
    public final int mo5813e(Object obj) {
        int[] iArr = (int[]) obj;
        AbstractC5830k.m5330g(iArr, "<this>");
        return iArr.length;
    }

    @Override // p118m7.AbstractC6169r, p118m7.AbstractC6116a
    /* renamed from: h */
    public final void mo5816h(InterfaceC6069c interfaceC6069c, int i, Object obj) {
        C6140h0 builder = (C6140h0) obj;
        AbstractC5830k.m5330g(builder, "builder");
        int iDecodeIntElement = interfaceC6069c.decodeIntElement(this.f9788b, i);
        builder.mo5824b(builder.mo5825d() + 1);
        int[] iArr = builder.f9807a;
        int i8 = builder.f9808b;
        builder.f9808b = i8 + 1;
        iArr[i8] = iDecodeIntElement;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: i */
    public final Object mo5817i(Object obj) {
        int[] iArr = (int[]) obj;
        AbstractC5830k.m5330g(iArr, "<this>");
        C6140h0 c6140h0 = new C6140h0();
        c6140h0.f9807a = iArr;
        c6140h0.f9808b = iArr.length;
        c6140h0.mo5824b(10);
        return c6140h0;
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: l */
    public final Object mo5819l() {
        return new int[0];
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: m */
    public final void mo5820m(InterfaceC6070d encoder, Object obj, int i) {
        int[] content = (int[]) obj;
        AbstractC5830k.m5330g(encoder, "encoder");
        AbstractC5830k.m5330g(content, "content");
        for (int i8 = 0; i8 < i; i8++) {
            encoder.encodeIntElement(this.f9788b, i8, content[i8]);
        }
    }
}
