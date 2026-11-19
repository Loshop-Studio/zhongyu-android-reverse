package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6070d;

/* renamed from: m7.f */
/* loaded from: classes4.dex */
public final class C6133f extends AbstractC6129d1 {

    /* renamed from: c */
    public static final C6133f f9797c = new C6133f(C6136g.f9800a);

    @Override // p118m7.AbstractC6116a
    /* renamed from: e */
    public final int mo5813e(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        AbstractC5830k.m5330g(zArr, "<this>");
        return zArr.length;
    }

    @Override // p118m7.AbstractC6169r, p118m7.AbstractC6116a
    /* renamed from: h */
    public final void mo5816h(InterfaceC6069c interfaceC6069c, int i, Object obj) {
        C6130e builder = (C6130e) obj;
        AbstractC5830k.m5330g(builder, "builder");
        boolean zDecodeBooleanElement = interfaceC6069c.decodeBooleanElement(this.f9788b, i);
        builder.mo5824b(builder.mo5825d() + 1);
        boolean[] zArr = builder.f9789a;
        int i8 = builder.f9790b;
        builder.f9790b = i8 + 1;
        zArr[i8] = zDecodeBooleanElement;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: i */
    public final Object mo5817i(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        AbstractC5830k.m5330g(zArr, "<this>");
        C6130e c6130e = new C6130e();
        c6130e.f9789a = zArr;
        c6130e.f9790b = zArr.length;
        c6130e.mo5824b(10);
        return c6130e;
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: l */
    public final Object mo5819l() {
        return new boolean[0];
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: m */
    public final void mo5820m(InterfaceC6070d encoder, Object obj, int i) {
        boolean[] content = (boolean[]) obj;
        AbstractC5830k.m5330g(encoder, "encoder");
        AbstractC5830k.m5330g(content, "content");
        for (int i8 = 0; i8 < i; i8++) {
            encoder.encodeBooleanElement(this.f9788b, i8, content[i8]);
        }
    }
}
