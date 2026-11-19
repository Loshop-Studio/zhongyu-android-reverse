package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5442r;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6070d;

/* renamed from: m7.y1 */
/* loaded from: classes4.dex */
public final class C6192y1 extends AbstractC6129d1 {

    /* renamed from: c */
    public static final C6192y1 f9899c = new C6192y1(C6195z1.f9904a);

    @Override // p118m7.AbstractC6116a
    /* renamed from: e */
    public final int mo5813e(Object obj) {
        short[] collectionSize = ((C5442r) obj).f8404a;
        AbstractC5830k.m5330g(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // p118m7.AbstractC6169r, p118m7.AbstractC6116a
    /* renamed from: h */
    public final void mo5816h(InterfaceC6069c interfaceC6069c, int i, Object obj) {
        C6189x1 builder = (C6189x1) obj;
        AbstractC5830k.m5330g(builder, "builder");
        short sDecodeShort = interfaceC6069c.decodeInlineElement(this.f9788b, i).decodeShort();
        builder.mo5824b(builder.mo5825d() + 1);
        short[] sArr = builder.f9891a;
        int i8 = builder.f9892b;
        builder.f9892b = i8 + 1;
        sArr[i8] = sDecodeShort;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: i */
    public final Object mo5817i(Object obj) {
        short[] toBuilder = ((C5442r) obj).f8404a;
        AbstractC5830k.m5330g(toBuilder, "$this$toBuilder");
        C6189x1 c6189x1 = new C6189x1();
        c6189x1.f9891a = toBuilder;
        c6189x1.f9892b = toBuilder.length;
        c6189x1.mo5824b(10);
        return c6189x1;
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: l */
    public final Object mo5819l() {
        return new C5442r(new short[0]);
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: m */
    public final void mo5820m(InterfaceC6070d encoder, Object obj, int i) {
        short[] sArr = ((C5442r) obj).f8404a;
        AbstractC5830k.m5330g(encoder, "encoder");
        for (int i8 = 0; i8 < i; i8++) {
            encoder.encodeInlineElement(this.f9788b, i8).encodeShort(sArr[i8]);
        }
    }
}
