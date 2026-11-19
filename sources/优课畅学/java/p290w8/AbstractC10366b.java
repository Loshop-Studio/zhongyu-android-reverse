package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.SerializationException;
import p089e8.InterfaceC8375c;
import p246s8.AbstractC10057g;
import p246s8.InterfaceC10051a;
import p246s8.InterfaceC10052b;
import p246s8.InterfaceC10059i;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10255d;
import p279v8.InterfaceC10256e;
import p279v8.InterfaceC10257f;

/* renamed from: w8.b */
/* loaded from: classes5.dex */
public abstract class AbstractC10366b implements InterfaceC10052b {
    /* renamed from: b */
    public final Object m19333b(InterfaceC10254c interfaceC10254c) {
        return InterfaceC10254c.a.m19208c(interfaceC10254c, getDescriptor(), 1, AbstractC10057g.m18761a(this, interfaceC10254c, interfaceC10254c.decodeStringElement(getDescriptor(), 0)), null, 8, null);
    }

    /* renamed from: c */
    public InterfaceC10051a m19334c(InterfaceC10254c decoder, String str) {
        AbstractC9133u.m16133g(decoder, "decoder");
        return decoder.getSerializersModule().mo16913e(mo18760e(), str);
    }

    /* renamed from: d */
    public InterfaceC10059i m19335d(InterfaceC10257f encoder, Object value) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(value, "value");
        return encoder.getSerializersModule().mo16914f(mo18760e(), value);
    }

    @Override // p246s8.InterfaceC10051a
    public final Object deserialize(InterfaceC10256e decoder) {
        Object objM19333b;
        AbstractC9133u.m16133g(decoder, "decoder");
        InterfaceC10210f descriptor = getDescriptor();
        InterfaceC10254c interfaceC10254cBeginStructure = decoder.beginStructure(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (interfaceC10254cBeginStructure.decodeSequentially()) {
            objM19333b = m19333b(interfaceC10254cBeginStructure);
        } else {
            Object objM19208c = null;
            while (true) {
                int iDecodeElementIndex = interfaceC10254cBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex != -1) {
                    if (iDecodeElementIndex == 0) {
                        ref$ObjectRef.f17473a = interfaceC10254cBeginStructure.decodeStringElement(getDescriptor(), iDecodeElementIndex);
                    } else {
                        if (iDecodeElementIndex != 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) ref$ObjectRef.f17473a;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(iDecodeElementIndex);
                            throw new SerializationException(sb.toString());
                        }
                        Object obj = ref$ObjectRef.f17473a;
                        if (obj == null) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        ref$ObjectRef.f17473a = obj;
                        objM19208c = InterfaceC10254c.a.m19208c(interfaceC10254cBeginStructure, getDescriptor(), iDecodeElementIndex, AbstractC10057g.m18761a(this, interfaceC10254cBeginStructure, (String) obj), null, 8, null);
                    }
                } else {
                    if (objM19208c == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ref$ObjectRef.f17473a)).toString());
                    }
                    AbstractC9133u.m16131e(objM19208c, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                    objM19333b = objM19208c;
                }
            }
        }
        interfaceC10254cBeginStructure.endStructure(descriptor);
        return objM19333b;
    }

    /* renamed from: e */
    public abstract InterfaceC8375c mo18760e();

    @Override // p246s8.InterfaceC10059i
    public final void serialize(InterfaceC10257f encoder, Object value) {
        AbstractC9133u.m16133g(encoder, "encoder");
        AbstractC9133u.m16133g(value, "value");
        InterfaceC10059i interfaceC10059iM18762b = AbstractC10057g.m18762b(this, encoder, value);
        InterfaceC10210f descriptor = getDescriptor();
        InterfaceC10255d interfaceC10255dBeginStructure = encoder.beginStructure(descriptor);
        interfaceC10255dBeginStructure.encodeStringElement(getDescriptor(), 0, interfaceC10059iM18762b.getDescriptor().mo19089f());
        InterfaceC10210f descriptor2 = getDescriptor();
        AbstractC9133u.m16131e(interfaceC10059iM18762b, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        interfaceC10255dBeginStructure.encodeSerializableElement(descriptor2, 1, interfaceC10059iM18762b, value);
        interfaceC10255dBeginStructure.endStructure(descriptor);
    }
}
