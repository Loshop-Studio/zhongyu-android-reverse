package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6070d;

/* renamed from: m7.o */
/* loaded from: classes4.dex */
public final class C6160o extends AbstractC6129d1 {

    /* renamed from: c */
    public static final C6160o f9838c = new C6160o(C6163p.f9843a);

    @Override // p118m7.AbstractC6116a
    /* renamed from: e */
    public final int mo5813e(Object obj) {
        char[] cArr = (char[]) obj;
        AbstractC5830k.m5330g(cArr, "<this>");
        return cArr.length;
    }

    @Override // p118m7.AbstractC6169r, p118m7.AbstractC6116a
    /* renamed from: h */
    public final void mo5816h(InterfaceC6069c interfaceC6069c, int i, Object obj) {
        C6157n builder = (C6157n) obj;
        AbstractC5830k.m5330g(builder, "builder");
        char cDecodeCharElement = interfaceC6069c.decodeCharElement(this.f9788b, i);
        builder.mo5824b(builder.mo5825d() + 1);
        char[] cArr = builder.f9831a;
        int i8 = builder.f9832b;
        builder.f9832b = i8 + 1;
        cArr[i8] = cDecodeCharElement;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: i */
    public final Object mo5817i(Object obj) {
        char[] cArr = (char[]) obj;
        AbstractC5830k.m5330g(cArr, "<this>");
        C6157n c6157n = new C6157n();
        c6157n.f9831a = cArr;
        c6157n.f9832b = cArr.length;
        c6157n.mo5824b(10);
        return c6157n;
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: l */
    public final Object mo5819l() {
        return new char[0];
    }

    @Override // p118m7.AbstractC6129d1
    /* renamed from: m */
    public final void mo5820m(InterfaceC6070d encoder, Object obj, int i) {
        char[] content = (char[]) obj;
        AbstractC5830k.m5330g(encoder, "encoder");
        AbstractC5830k.m5330g(content, "content");
        for (int i8 = 0; i8 < i; i8++) {
            encoder.encodeCharElement(this.f9788b, i8, content[i8]);
        }
    }
}
