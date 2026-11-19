package p290w8;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10052b;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10255d;
import p279v8.InterfaceC10257f;

/* renamed from: w8.w */
/* loaded from: classes5.dex */
public abstract class AbstractC10459w extends AbstractC10361a {

    /* renamed from: a */
    public final InterfaceC10052b f20792a;

    public /* synthetic */ AbstractC10459w(InterfaceC10052b interfaceC10052b, AbstractC9126n abstractC9126n) {
        this(interfaceC10052b);
    }

    @Override // p290w8.AbstractC10361a
    /* renamed from: g */
    public final void mo19308g(InterfaceC10254c decoder, Object obj, int i10, int i11) {
        AbstractC9133u.m16133g(decoder, "decoder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            mo19309h(decoder, i10 + i12, obj, false);
        }
    }

    @Override // p246s8.InterfaceC10052b, p246s8.InterfaceC10059i, p246s8.InterfaceC10051a
    public abstract InterfaceC10210f getDescriptor();

    @Override // p290w8.AbstractC10361a
    /* renamed from: h */
    public void mo19309h(InterfaceC10254c decoder, int i10, Object obj, boolean z10) {
        AbstractC9133u.m16133g(decoder, "decoder");
        mo19318n(obj, i10, InterfaceC10254c.a.m19208c(decoder, getDescriptor(), i10, this.f20792a, null, 8, null));
    }

    /* renamed from: n */
    public abstract void mo19318n(Object obj, int i10, Object obj2);

    @Override // p246s8.InterfaceC10059i
    public void serialize(InterfaceC10257f encoder, Object obj) {
        AbstractC9133u.m16133g(encoder, "encoder");
        int iMo19306e = mo19306e(obj);
        InterfaceC10210f descriptor = getDescriptor();
        InterfaceC10255d interfaceC10255dBeginCollection = encoder.beginCollection(descriptor, iMo19306e);
        Iterator itMo19305d = mo19305d(obj);
        for (int i10 = 0; i10 < iMo19306e; i10++) {
            interfaceC10255dBeginCollection.encodeSerializableElement(getDescriptor(), i10, this.f20792a, itMo19305d.next());
        }
        interfaceC10255dBeginCollection.endStructure(descriptor);
    }

    public AbstractC10459w(InterfaceC10052b interfaceC10052b) {
        super(null);
        this.f20792a = interfaceC10052b;
    }
}
