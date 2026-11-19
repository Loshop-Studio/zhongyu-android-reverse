package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5435k;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6070d;

/* renamed from: m7.p1 */
/* loaded from: classes4.dex */
public final class C6165p1 extends AbstractC6129d1 {

    /* renamed from: c */
    public static final C6165p1 f9848c = new C6165p1(C6168q1.f9851a);

    @Override // p118m7.AbstractC6116a
    /* renamed from: e */
    public final int mo5813e(Object obj) {
        byte[] collectionSize = ((C5435k) obj).f8397a;
        AbstractC5830k.m5330g(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // p118m7.AbstractC6169r, p118m7.AbstractC6116a
    /* renamed from: h */
    public final void mo5816h(InterfaceC6069c interfaceC6069c, int i, Object obj) {
        C6162o1 builder = (C6162o1) obj;
        AbstractC5830k.m5330g(builder, "builder");
        byte bDecodeByte = interfaceC6069c.decodeInlineElement(this.f9788b, i).decodeByte();
        builder.mo5824b(builder.mo5825d() + 1);
        byte[] bArr = builder.f9841a;
        int i8 = builder.f9842b;
        builder.f9842b = i8 + 1;
        bArr[i8] = bDecodeByte;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: i */
    public final Object mo5817i(Object obj) {
        byte[] toBuilder = ((C5435k) obj).f8397a;
        AbstractC5830k.m5330g(toBuilder, "$this$toBuilder");
        C6162o1 c6162o1 = new C6162o1();
        c6162o1.f9841a = toBuilder;
        c6162o1.f9842b = toBuilder.length;
        c6162o1.mo5824b(10);
        return c6162o1;
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: l */
    public final Object mo5819l() {
        return new C5435k(new byte[0]);
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: m */
    public final void mo5820m(InterfaceC6070d encoder, Object obj, int i) {
        byte[] bArr = ((C5435k) obj).f8397a;
        AbstractC5830k.m5330g(encoder, "encoder");
        for (int i8 = 0; i8 < i; i8++) {
            encoder.encodeInlineElement(this.f9788b, i8).encodeByte(bArr[i8]);
        }
    }
}
