package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5439o;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6070d;

/* renamed from: m7.v1 */
/* loaded from: classes4.dex */
public final class C6183v1 extends AbstractC6129d1 {

    /* renamed from: c */
    public static final C6183v1 f9878c = new C6183v1(C6186w1.f9886a);

    @Override // p118m7.AbstractC6116a
    /* renamed from: e */
    public final int mo5813e(Object obj) {
        long[] collectionSize = ((C5439o) obj).f8401a;
        AbstractC5830k.m5330g(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // p118m7.AbstractC6169r, p118m7.AbstractC6116a
    /* renamed from: h */
    public final void mo5816h(InterfaceC6069c interfaceC6069c, int i, Object obj) {
        C6180u1 builder = (C6180u1) obj;
        AbstractC5830k.m5330g(builder, "builder");
        long jDecodeLong = interfaceC6069c.decodeInlineElement(this.f9788b, i).decodeLong();
        builder.mo5824b(builder.mo5825d() + 1);
        long[] jArr = builder.f9872a;
        int i8 = builder.f9873b;
        builder.f9873b = i8 + 1;
        jArr[i8] = jDecodeLong;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: i */
    public final Object mo5817i(Object obj) {
        long[] toBuilder = ((C5439o) obj).f8401a;
        AbstractC5830k.m5330g(toBuilder, "$this$toBuilder");
        C6180u1 c6180u1 = new C6180u1();
        c6180u1.f9872a = toBuilder;
        c6180u1.f9873b = toBuilder.length;
        c6180u1.mo5824b(10);
        return c6180u1;
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: l */
    public final Object mo5819l() {
        return new C5439o(new long[0]);
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: m */
    public final void mo5820m(InterfaceC6070d encoder, Object obj, int i) {
        long[] jArr = ((C5439o) obj).f8401a;
        AbstractC5830k.m5330g(encoder, "encoder");
        for (int i8 = 0; i8 < i; i8++) {
            encoder.encodeInlineElement(this.f9788b, i8).encodeLong(jArr[i8]);
        }
    }
}
