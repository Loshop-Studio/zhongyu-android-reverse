package p118m7;

import java.util.Iterator;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6070d;
import p109l7.InterfaceC6072f;

/* renamed from: m7.r */
/* loaded from: classes4.dex */
public abstract class AbstractC6169r extends AbstractC6116a {

    /* renamed from: a */
    public final InterfaceC5686b f9853a;

    public AbstractC6169r(InterfaceC5686b interfaceC5686b) {
        this.f9853a = interfaceC5686b;
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: g */
    public final void mo5815g(InterfaceC6069c interfaceC6069c, Object obj, int i, int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i9 = 0; i9 < i8; i9++) {
            mo5816h(interfaceC6069c, i + i9, obj);
        }
    }

    @Override // p118m7.AbstractC6116a
    /* renamed from: h */
    public void mo5816h(InterfaceC6069c interfaceC6069c, int i, Object obj) {
        mo5826k(i, obj, interfaceC6069c.decodeSerializableElement(getDescriptor(), i, this.f9853a, null));
    }

    /* renamed from: k */
    public abstract void mo5826k(int i, Object obj, Object obj2);

    @Override // p084i7.InterfaceC5689e
    public void serialize(InterfaceC6072f interfaceC6072f, Object obj) {
        int iMo5813e = mo5813e(obj);
        InterfaceC5765g descriptor = getDescriptor();
        InterfaceC6070d interfaceC6070dBeginCollection = interfaceC6072f.beginCollection(descriptor, iMo5813e);
        Iterator itMo5812d = mo5812d(obj);
        for (int i = 0; i < iMo5813e; i++) {
            interfaceC6070dBeginCollection.encodeSerializableElement(getDescriptor(), i, this.f9853a, itMo5812d.next());
        }
        interfaceC6070dBeginCollection.endStructure(descriptor);
    }
}
