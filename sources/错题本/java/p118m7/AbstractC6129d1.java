package p118m7;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5830k;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6070d;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

/* renamed from: m7.d1 */
/* loaded from: classes4.dex */
public abstract class AbstractC6129d1 extends AbstractC6169r {

    /* renamed from: b */
    public final C6126c1 f9788b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6129d1(InterfaceC5686b primitiveSerializer) {
        super(primitiveSerializer);
        AbstractC5830k.m5330g(primitiveSerializer, "primitiveSerializer");
        this.f9788b = new C6126c1(primitiveSerializer.getDescriptor());
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: a */
    public final Object mo5809a() {
        return (AbstractC6122b1) mo5817i(mo5819l());
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: b */
    public final int mo5810b(Object obj) {
        AbstractC6122b1 abstractC6122b1 = (AbstractC6122b1) obj;
        AbstractC5830k.m5330g(abstractC6122b1, "<this>");
        return abstractC6122b1.mo5825d();
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: c */
    public final void mo5811c(int i, Object obj) {
        AbstractC6122b1 abstractC6122b1 = (AbstractC6122b1) obj;
        AbstractC5830k.m5330g(abstractC6122b1, "<this>");
        abstractC6122b1.mo5824b(i);
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: d */
    public final Iterator mo5812d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // p118m7.AbstractC6116a, p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        return m5814f(decoder);
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return this.f9788b;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: j */
    public final Object mo5818j(Object obj) {
        AbstractC6122b1 abstractC6122b1 = (AbstractC6122b1) obj;
        AbstractC5830k.m5330g(abstractC6122b1, "<this>");
        return abstractC6122b1.mo5823a();
    }

    @Override // p118m7.AbstractC6169r
    /* renamed from: k */
    public final void mo5826k(int i, Object obj, Object obj2) {
        AbstractC5830k.m5330g((AbstractC6122b1) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* renamed from: l */
    public abstract Object mo5819l();

    /* renamed from: m */
    public abstract void mo5820m(InterfaceC6070d interfaceC6070d, Object obj, int i);

    @Override // p118m7.AbstractC6169r, p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        int iMo5813e = mo5813e(obj);
        C6126c1 c6126c1 = this.f9788b;
        InterfaceC6070d interfaceC6070dBeginCollection = interfaceC6072f.beginCollection(c6126c1, iMo5813e);
        mo5820m(interfaceC6070dBeginCollection, obj, iMo5813e);
        interfaceC6070dBeginCollection.endStructure(c6126c1);
    }
}
