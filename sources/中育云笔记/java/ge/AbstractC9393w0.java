package ge;

import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.serialization.SerializationException;
import p049ce.InterfaceC5432b;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9227d;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;

/* renamed from: ge.w0 */
/* loaded from: classes6.dex */
public abstract class AbstractC9393w0 implements InterfaceC5432b {

    /* renamed from: a */
    public final InterfaceC5432b f21820a;

    /* renamed from: b */
    public final InterfaceC5432b f21821b;

    public /* synthetic */ AbstractC9393w0(InterfaceC5432b interfaceC5432b, InterfaceC5432b interfaceC5432b2, AbstractC9972n abstractC9972n) {
        this(interfaceC5432b, interfaceC5432b2);
    }

    /* renamed from: a */
    public abstract Object mo18423a(Object obj);

    /* renamed from: b */
    public final InterfaceC5432b m18569b() {
        return this.f21820a;
    }

    /* renamed from: c */
    public abstract Object mo18424c(Object obj);

    /* renamed from: d */
    public final InterfaceC5432b m18570d() {
        return this.f21821b;
    }

    @Override // p049ce.InterfaceC5431a
    public Object deserialize(InterfaceC9228e decoder) {
        Object objMo18425e;
        AbstractC9979u.m20294g(decoder, "decoder");
        InterfaceC9129f descriptor = getDescriptor();
        InterfaceC9226c interfaceC9226cBeginStructure = decoder.beginStructure(descriptor);
        if (interfaceC9226cBeginStructure.decodeSequentially()) {
            objMo18425e = mo18425e(InterfaceC9226c.a.m18145c(interfaceC9226cBeginStructure, getDescriptor(), 0, m18569b(), null, 8, null), InterfaceC9226c.a.m18145c(interfaceC9226cBeginStructure, getDescriptor(), 1, m18570d(), null, 8, null));
        } else {
            Object objM18145c = AbstractC9391v2.f21818a;
            Object objM18145c2 = AbstractC9391v2.f21818a;
            while (true) {
                int iDecodeElementIndex = interfaceC9226cBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex != -1) {
                    if (iDecodeElementIndex == 0) {
                        objM18145c = InterfaceC9226c.a.m18145c(interfaceC9226cBeginStructure, getDescriptor(), 0, m18569b(), null, 8, null);
                    } else {
                        if (iDecodeElementIndex != 1) {
                            throw new SerializationException("Invalid index: " + iDecodeElementIndex);
                        }
                        objM18145c2 = InterfaceC9226c.a.m18145c(interfaceC9226cBeginStructure, getDescriptor(), 1, m18570d(), null, 8, null);
                    }
                } else {
                    if (objM18145c == AbstractC9391v2.f21818a) {
                        throw new SerializationException("Element 'key' is missing");
                    }
                    if (objM18145c2 == AbstractC9391v2.f21818a) {
                        throw new SerializationException("Element 'value' is missing");
                    }
                    objMo18425e = mo18425e(objM18145c, objM18145c2);
                }
            }
        }
        interfaceC9226cBeginStructure.endStructure(descriptor);
        return objMo18425e;
    }

    /* renamed from: e */
    public abstract Object mo18425e(Object obj, Object obj2);

    @Override // p049ce.InterfaceC5439i
    public void serialize(InterfaceC9229f encoder, Object obj) {
        AbstractC9979u.m20294g(encoder, "encoder");
        InterfaceC9227d interfaceC9227dBeginStructure = encoder.beginStructure(getDescriptor());
        interfaceC9227dBeginStructure.encodeSerializableElement(getDescriptor(), 0, this.f21820a, mo18423a(obj));
        interfaceC9227dBeginStructure.encodeSerializableElement(getDescriptor(), 1, this.f21821b, mo18424c(obj));
        interfaceC9227dBeginStructure.endStructure(getDescriptor());
    }

    public AbstractC9393w0(InterfaceC5432b interfaceC5432b, InterfaceC5432b interfaceC5432b2) {
        this.f21820a = interfaceC5432b;
        this.f21821b = interfaceC5432b2;
    }
}
