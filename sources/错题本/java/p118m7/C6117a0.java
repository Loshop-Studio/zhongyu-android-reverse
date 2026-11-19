package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6070d;

/* renamed from: m7.a0 */
/* loaded from: classes4.dex */
public final class C6117a0 extends AbstractC6129d1 {

    /* renamed from: c */
    public static final C6117a0 f9763c = new C6117a0(C6121b0.f9777a);

    @Override // p118m7.AbstractC6116a
    /* renamed from: e */
    public final int mo5813e(Object obj) {
        float[] fArr = (float[]) obj;
        AbstractC5830k.m5330g(fArr, "<this>");
        return fArr.length;
    }

    @Override // p118m7.AbstractC6169r, p118m7.AbstractC6116a
    /* renamed from: h */
    public final void mo5816h(InterfaceC6069c interfaceC6069c, int i, Object obj) {
        C6193z builder = (C6193z) obj;
        AbstractC5830k.m5330g(builder, "builder");
        float fDecodeFloatElement = interfaceC6069c.decodeFloatElement(this.f9788b, i);
        builder.mo5824b(builder.mo5825d() + 1);
        float[] fArr = builder.f9900a;
        int i8 = builder.f9901b;
        builder.f9901b = i8 + 1;
        fArr[i8] = fDecodeFloatElement;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: i */
    public final Object mo5817i(Object obj) {
        float[] fArr = (float[]) obj;
        AbstractC5830k.m5330g(fArr, "<this>");
        C6193z c6193z = new C6193z();
        c6193z.f9900a = fArr;
        c6193z.f9901b = fArr.length;
        c6193z.mo5824b(10);
        return c6193z;
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: l */
    public final Object mo5819l() {
        return new float[0];
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: m */
    public final void mo5820m(InterfaceC6070d encoder, Object obj, int i) {
        float[] content = (float[]) obj;
        AbstractC5830k.m5330g(encoder, "encoder");
        AbstractC5830k.m5330g(content, "content");
        for (int i8 = 0; i8 < i; i8++) {
            encoder.encodeFloatElement(this.f9788b, i8, content[i8]);
        }
    }
}
