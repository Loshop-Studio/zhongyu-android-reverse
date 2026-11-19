package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5437m;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6070d;

/* renamed from: m7.s1 */
/* loaded from: classes4.dex */
public final class C6174s1 extends AbstractC6129d1 {

    /* renamed from: c */
    public static final C6174s1 f9863c = new C6174s1(C6177t1.f9867a);

    @Override // p118m7.AbstractC6116a
    /* renamed from: e */
    public final int mo5813e(Object obj) {
        int[] collectionSize = ((C5437m) obj).f8399a;
        AbstractC5830k.m5330g(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // p118m7.AbstractC6169r, p118m7.AbstractC6116a
    /* renamed from: h */
    public final void mo5816h(InterfaceC6069c interfaceC6069c, int i, Object obj) {
        C6171r1 builder = (C6171r1) obj;
        AbstractC5830k.m5330g(builder, "builder");
        int iDecodeInt = interfaceC6069c.decodeInlineElement(this.f9788b, i).decodeInt();
        builder.mo5824b(builder.mo5825d() + 1);
        int[] iArr = builder.f9858a;
        int i8 = builder.f9859b;
        builder.f9859b = i8 + 1;
        iArr[i8] = iDecodeInt;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: i */
    public final Object mo5817i(Object obj) {
        int[] toBuilder = ((C5437m) obj).f8399a;
        AbstractC5830k.m5330g(toBuilder, "$this$toBuilder");
        C6171r1 c6171r1 = new C6171r1();
        c6171r1.f9858a = toBuilder;
        c6171r1.f9859b = toBuilder.length;
        c6171r1.mo5824b(10);
        return c6171r1;
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: l */
    public final Object mo5819l() {
        return new C5437m(new int[0]);
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: m */
    public final void mo5820m(InterfaceC6070d encoder, Object obj, int i) {
        int[] iArr = ((C5437m) obj).f8399a;
        AbstractC5830k.m5330g(encoder, "encoder");
        for (int i8 = 0; i8 < i; i8++) {
            encoder.encodeInlineElement(this.f9788b, i8).encodeInt(iArr[i8]);
        }
    }
}
