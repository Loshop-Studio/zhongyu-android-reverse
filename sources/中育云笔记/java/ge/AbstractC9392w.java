package ge;

import ee.InterfaceC9129f;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9227d;
import p153fe.InterfaceC9229f;

/* renamed from: ge.w */
/* loaded from: classes6.dex */
public abstract class AbstractC9392w extends AbstractC9294a {

    /* renamed from: a */
    public final InterfaceC5432b f21819a;

    public /* synthetic */ AbstractC9392w(InterfaceC5432b interfaceC5432b, AbstractC9972n abstractC9972n) {
        this(interfaceC5432b);
    }

    @Override // ge.AbstractC9294a
    /* renamed from: g */
    public final void mo18334g(InterfaceC9226c decoder, Object obj, int i10, int i11) {
        AbstractC9979u.m20294g(decoder, "decoder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            mo18335h(decoder, i10 + i12, obj, false);
        }
    }

    @Override // p049ce.InterfaceC5432b, p049ce.InterfaceC5439i, p049ce.InterfaceC5431a
    public abstract InterfaceC9129f getDescriptor();

    @Override // ge.AbstractC9294a
    /* renamed from: h */
    public void mo18335h(InterfaceC9226c decoder, int i10, Object obj, boolean z10) {
        AbstractC9979u.m20294g(decoder, "decoder");
        mo18344n(obj, i10, InterfaceC9226c.a.m18145c(decoder, getDescriptor(), i10, this.f21819a, null, 8, null));
    }

    /* renamed from: n */
    public abstract void mo18344n(Object obj, int i10, Object obj2);

    @Override // p049ce.InterfaceC5439i
    public void serialize(InterfaceC9229f encoder, Object obj) {
        AbstractC9979u.m20294g(encoder, "encoder");
        int iMo18332e = mo18332e(obj);
        InterfaceC9129f descriptor = getDescriptor();
        InterfaceC9227d interfaceC9227dBeginCollection = encoder.beginCollection(descriptor, iMo18332e);
        Iterator itMo18331d = mo18331d(obj);
        for (int i10 = 0; i10 < iMo18332e; i10++) {
            interfaceC9227dBeginCollection.encodeSerializableElement(getDescriptor(), i10, this.f21819a, itMo18331d.next());
        }
        interfaceC9227dBeginCollection.endStructure(descriptor);
    }

    public AbstractC9392w(InterfaceC5432b interfaceC5432b) {
        super(null);
        this.f21819a = interfaceC5432b;
    }
}
