package p290w8;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.serialization.SerializationException;
import p246s8.InterfaceC10052b;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10255d;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.w0 */
/* loaded from: classes5.dex */
public abstract class AbstractC10460w0 implements InterfaceC10052b {

    /* renamed from: a */
    public final InterfaceC10052b f20793a;

    /* renamed from: b */
    public final InterfaceC10052b f20794b;

    public /* synthetic */ AbstractC10460w0(InterfaceC10052b interfaceC10052b, InterfaceC10052b interfaceC10052b2, AbstractC9126n abstractC9126n) {
        this(interfaceC10052b, interfaceC10052b2);
    }

    /* renamed from: a */
    public abstract Object mo19397a(Object obj);

    /* renamed from: b */
    public final InterfaceC10052b m19541b() {
        return this.f20793a;
    }

    /* renamed from: c */
    public abstract Object mo19398c(Object obj);

    /* renamed from: d */
    public final InterfaceC10052b m19542d() {
        return this.f20794b;
    }

    @Override // p246s8.InterfaceC10051a
    public Object deserialize(InterfaceC10256e decoder) {
        Object objMo19399e;
        AbstractC9133u.m16133g(decoder, "decoder");
        InterfaceC10210f descriptor = getDescriptor();
        InterfaceC10254c interfaceC10254cBeginStructure = decoder.beginStructure(descriptor);
        if (interfaceC10254cBeginStructure.decodeSequentially()) {
            objMo19399e = mo19399e(InterfaceC10254c.a.m19208c(interfaceC10254cBeginStructure, getDescriptor(), 0, m19541b(), null, 8, null), InterfaceC10254c.a.m19208c(interfaceC10254cBeginStructure, getDescriptor(), 1, m19542d(), null, 8, null));
        } else {
            Object objM19208c = AbstractC10458v2.f20791a;
            Object objM19208c2 = AbstractC10458v2.f20791a;
            while (true) {
                int iDecodeElementIndex = interfaceC10254cBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex != -1) {
                    if (iDecodeElementIndex == 0) {
                        objM19208c = InterfaceC10254c.a.m19208c(interfaceC10254cBeginStructure, getDescriptor(), 0, m19541b(), null, 8, null);
                    } else {
                        if (iDecodeElementIndex != 1) {
                            throw new SerializationException("Invalid index: " + iDecodeElementIndex);
                        }
                        objM19208c2 = InterfaceC10254c.a.m19208c(interfaceC10254cBeginStructure, getDescriptor(), 1, m19542d(), null, 8, null);
                    }
                } else {
                    if (objM19208c == AbstractC10458v2.f20791a) {
                        throw new SerializationException("Element 'key' is missing");
                    }
                    if (objM19208c2 == AbstractC10458v2.f20791a) {
                        throw new SerializationException("Element 'value' is missing");
                    }
                    objMo19399e = mo19399e(objM19208c, objM19208c2);
                }
            }
        }
        interfaceC10254cBeginStructure.endStructure(descriptor);
        return objMo19399e;
    }

    /* renamed from: e */
    public abstract Object mo19399e(Object obj, Object obj2);

    @Override // p246s8.InterfaceC10059i
    public void serialize(InterfaceC10257f encoder, Object obj) {
        AbstractC9133u.m16133g(encoder, "encoder");
        InterfaceC10255d interfaceC10255dBeginStructure = encoder.beginStructure(getDescriptor());
        interfaceC10255dBeginStructure.encodeSerializableElement(getDescriptor(), 0, this.f20793a, mo19397a(obj));
        interfaceC10255dBeginStructure.encodeSerializableElement(getDescriptor(), 1, this.f20794b, mo19398c(obj));
        interfaceC10255dBeginStructure.endStructure(getDescriptor());
    }

    public AbstractC10460w0(InterfaceC10052b interfaceC10052b, InterfaceC10052b interfaceC10052b2) {
        this.f20793a = interfaceC10052b;
        this.f20794b = interfaceC10052b2;
    }
}
