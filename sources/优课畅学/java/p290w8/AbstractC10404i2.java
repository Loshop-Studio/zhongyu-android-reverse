package p290w8;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10255d;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.i2 */
/* loaded from: classes5.dex */
public abstract class AbstractC10404i2 extends AbstractC10459w {

    /* renamed from: b */
    public final InterfaceC10210f f20715b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10404i2(InterfaceC10052b primitiveSerializer) {
        super(primitiveSerializer, null);
        AbstractC9133u.m16133g(primitiveSerializer, "primitiveSerializer");
        this.f20715b = new C10399h2(primitiveSerializer.getDescriptor());
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: d */
    public final Iterator mo19305d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // p290w8.AbstractC10361a, p246s8.InterfaceC10051a
    public final Object deserialize(InterfaceC10256e decoder) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return m19307f(decoder, null);
    }

    @Override // p290w8.AbstractC10459w, p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public final InterfaceC10210f getDescriptor() {
        return this.f20715b;
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final AbstractC10394g2 mo19302a() {
        return (AbstractC10394g2) mo19311k(mo19325r());
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int mo19303b(AbstractC10394g2 abstractC10394g2) {
        AbstractC9133u.m16133g(abstractC10394g2, "<this>");
        return abstractC10394g2.mo19315d();
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void mo19304c(AbstractC10394g2 abstractC10394g2, int i10) {
        AbstractC9133u.m16133g(abstractC10394g2, "<this>");
        abstractC10394g2.mo19314b(i10);
    }

    /* renamed from: r */
    public abstract Object mo19325r();

    @Override // p290w8.AbstractC10459w
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void mo19318n(AbstractC10394g2 abstractC10394g2, int i10, Object obj) {
        AbstractC9133u.m16133g(abstractC10394g2, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // p290w8.AbstractC10459w, p246s8.InterfaceC10059i
    public final void serialize(InterfaceC10257f encoder, Object obj) {
        AbstractC9133u.m16133g(encoder, "encoder");
        int iMo19306e = mo19306e(obj);
        InterfaceC10210f interfaceC10210f = this.f20715b;
        InterfaceC10255d interfaceC10255dBeginCollection = encoder.beginCollection(interfaceC10210f, iMo19306e);
        mo19326u(interfaceC10255dBeginCollection, obj, iMo19306e);
        interfaceC10255dBeginCollection.endStructure(interfaceC10210f);
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Object mo19312l(AbstractC10394g2 abstractC10394g2) {
        AbstractC9133u.m16133g(abstractC10394g2, "<this>");
        return abstractC10394g2.mo19313a();
    }

    /* renamed from: u */
    public abstract void mo19326u(InterfaceC10255d interfaceC10255d, Object obj, int i10);
}
