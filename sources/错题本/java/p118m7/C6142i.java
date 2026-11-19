package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6070d;

/* renamed from: m7.i */
/* loaded from: classes4.dex */
public final class C6142i extends AbstractC6129d1 {

    /* renamed from: c */
    public static final C6142i f9812c = new C6142i(C6145j.f9814a);

    @Override // p118m7.AbstractC6116a
    /* renamed from: e */
    public final int mo5813e(Object obj) {
        byte[] bArr = (byte[]) obj;
        AbstractC5830k.m5330g(bArr, "<this>");
        return bArr.length;
    }

    @Override // p118m7.AbstractC6169r, p118m7.AbstractC6116a
    /* renamed from: h */
    public final void mo5816h(InterfaceC6069c interfaceC6069c, int i, Object obj) {
        C6139h builder = (C6139h) obj;
        AbstractC5830k.m5330g(builder, "builder");
        byte bDecodeByteElement = interfaceC6069c.decodeByteElement(this.f9788b, i);
        builder.mo5824b(builder.mo5825d() + 1);
        byte[] bArr = builder.f9805a;
        int i8 = builder.f9806b;
        builder.f9806b = i8 + 1;
        bArr[i8] = bDecodeByteElement;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: i */
    public final Object mo5817i(Object obj) {
        byte[] bArr = (byte[]) obj;
        AbstractC5830k.m5330g(bArr, "<this>");
        C6139h c6139h = new C6139h();
        c6139h.f9805a = bArr;
        c6139h.f9806b = bArr.length;
        c6139h.mo5824b(10);
        return c6139h;
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: l */
    public final Object mo5819l() {
        return new byte[0];
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: m */
    public final void mo5820m(InterfaceC6070d encoder, Object obj, int i) {
        byte[] content = (byte[]) obj;
        AbstractC5830k.m5330g(encoder, "encoder");
        AbstractC5830k.m5330g(content, "content");
        for (int i8 = 0; i8 < i; i8++) {
            encoder.encodeByteElement(this.f9788b, i8, content[i8]);
        }
    }
}
