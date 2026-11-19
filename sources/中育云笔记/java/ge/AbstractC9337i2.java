package ge;

import ee.InterfaceC9129f;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9227d;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* renamed from: ge.i2 */
/* loaded from: classes6.dex */
public abstract class AbstractC9337i2 extends AbstractC9392w {

    /* renamed from: b */
    public final InterfaceC9129f f21742b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9337i2(InterfaceC5432b primitiveSerializer) {
        super(primitiveSerializer, null);
        AbstractC9979u.m20294g(primitiveSerializer, "primitiveSerializer");
        this.f21742b = new C9332h2(primitiveSerializer.getDescriptor());
    }

    @Override // ge.AbstractC9294a
    /* renamed from: d */
    public final Iterator mo18331d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // ge.AbstractC9294a, p049ce.InterfaceC5431a
    public final Object deserialize(InterfaceC9228e decoder) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return m18333f(decoder, null);
    }

    @Override // ge.AbstractC9392w, p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public final InterfaceC9129f getDescriptor() {
        return this.f21742b;
    }

    @Override // ge.AbstractC9294a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final AbstractC9327g2 mo18328a() {
        return (AbstractC9327g2) mo18337k(mo18351r());
    }

    @Override // ge.AbstractC9294a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int mo18329b(AbstractC9327g2 abstractC9327g2) {
        AbstractC9979u.m20294g(abstractC9327g2, "<this>");
        return abstractC9327g2.mo18341d();
    }

    @Override // ge.AbstractC9294a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void mo18330c(AbstractC9327g2 abstractC9327g2, int i10) {
        AbstractC9979u.m20294g(abstractC9327g2, "<this>");
        abstractC9327g2.mo18340b(i10);
    }

    /* renamed from: r */
    public abstract Object mo18351r();

    @Override // ge.AbstractC9392w
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void mo18344n(AbstractC9327g2 abstractC9327g2, int i10, Object obj) {
        AbstractC9979u.m20294g(abstractC9327g2, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // ge.AbstractC9392w, p049ce.InterfaceC5439i
    public final void serialize(InterfaceC9229f encoder, Object obj) {
        AbstractC9979u.m20294g(encoder, "encoder");
        int iMo18332e = mo18332e(obj);
        InterfaceC9129f interfaceC9129f = this.f21742b;
        InterfaceC9227d interfaceC9227dBeginCollection = encoder.beginCollection(interfaceC9129f, iMo18332e);
        mo18352u(interfaceC9227dBeginCollection, obj, iMo18332e);
        interfaceC9227dBeginCollection.endStructure(interfaceC9129f);
    }

    @Override // ge.AbstractC9294a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Object mo18338l(AbstractC9327g2 abstractC9327g2) {
        AbstractC9979u.m20294g(abstractC9327g2, "<this>");
        return abstractC9327g2.mo18339a();
    }

    /* renamed from: u */
    public abstract void mo18352u(InterfaceC9227d interfaceC9227d, Object obj, int i10);
}
