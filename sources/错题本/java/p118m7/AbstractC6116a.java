package p118m7;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5830k;
import p084i7.InterfaceC5686b;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6071e;

/* renamed from: m7.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6116a implements InterfaceC5686b {
    /* renamed from: a */
    public abstract Object mo5809a();

    /* renamed from: b */
    public abstract int mo5810b(Object obj);

    /* renamed from: c */
    public abstract void mo5811c(int i, Object obj);

    /* renamed from: d */
    public abstract Iterator mo5812d(Object obj);

    @Override // p084i7.InterfaceC5685a
    public Object deserialize(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        return m5814f(decoder);
    }

    /* renamed from: e */
    public abstract int mo5813e(Object obj);

    /* renamed from: f */
    public final Object m5814f(InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        Object objMo5809a = mo5809a();
        int iMo5810b = mo5810b(objMo5809a);
        InterfaceC6069c interfaceC6069cBeginStructure = decoder.beginStructure(getDescriptor());
        if (!interfaceC6069cBeginStructure.decodeSequentially()) {
            while (true) {
                int iDecodeElementIndex = interfaceC6069cBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    break;
                }
                mo5816h(interfaceC6069cBeginStructure, iDecodeElementIndex + iMo5810b, objMo5809a);
            }
        } else {
            int iDecodeCollectionSize = interfaceC6069cBeginStructure.decodeCollectionSize(getDescriptor());
            mo5811c(iDecodeCollectionSize, objMo5809a);
            mo5815g(interfaceC6069cBeginStructure, objMo5809a, iMo5810b, iDecodeCollectionSize);
        }
        interfaceC6069cBeginStructure.endStructure(getDescriptor());
        return mo5818j(objMo5809a);
    }

    /* renamed from: g */
    public abstract void mo5815g(InterfaceC6069c interfaceC6069c, Object obj, int i, int i8);

    /* renamed from: h */
    public abstract void mo5816h(InterfaceC6069c interfaceC6069c, int i, Object obj);

    /* renamed from: i */
    public abstract Object mo5817i(Object obj);

    /* renamed from: j */
    public abstract Object mo5818j(Object obj);
}
