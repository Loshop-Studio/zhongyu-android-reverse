package ge;

import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.SerializationException;
import p049ce.AbstractC5437g;
import p049ce.InterfaceC5431a;
import p049ce.InterfaceC5432b;
import p049ce.InterfaceC5439i;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9227d;
import p153fe.InterfaceC9228e;
import p153fe.InterfaceC9229f;
import p280od.InterfaceC10469c;

/* renamed from: ge.b */
/* loaded from: classes6.dex */
public abstract class AbstractC9299b implements InterfaceC5432b {
    /* renamed from: b */
    public final Object m18359b(InterfaceC9226c interfaceC9226c) {
        return InterfaceC9226c.a.m18145c(interfaceC9226c, getDescriptor(), 1, AbstractC5437g.m2935a(this, interfaceC9226c, interfaceC9226c.decodeStringElement(getDescriptor(), 0)), null, 8, null);
    }

    /* renamed from: c */
    public InterfaceC5431a m18360c(InterfaceC9226c decoder, String str) {
        AbstractC9979u.m20294g(decoder, "decoder");
        return decoder.getSerializersModule().mo18780e(mo2934e(), str);
    }

    /* renamed from: d */
    public InterfaceC5439i m18361d(InterfaceC9229f encoder, Object value) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(value, "value");
        return encoder.getSerializersModule().mo18781f(mo2934e(), value);
    }

    @Override // p049ce.InterfaceC5431a
    public final Object deserialize(InterfaceC9228e decoder) {
        Object objM18359b;
        AbstractC9979u.m20294g(decoder, "decoder");
        InterfaceC9129f descriptor = getDescriptor();
        InterfaceC9226c interfaceC9226cBeginStructure = decoder.beginStructure(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (interfaceC9226cBeginStructure.decodeSequentially()) {
            objM18359b = m18359b(interfaceC9226cBeginStructure);
        } else {
            Object objM18145c = null;
            while (true) {
                int iDecodeElementIndex = interfaceC9226cBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex != -1) {
                    if (iDecodeElementIndex == 0) {
                        ref$ObjectRef.f23402c = interfaceC9226cBeginStructure.decodeStringElement(getDescriptor(), iDecodeElementIndex);
                    } else {
                        if (iDecodeElementIndex != 1) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) ref$ObjectRef.f23402c;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb2.append(str);
                            sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb2.append(iDecodeElementIndex);
                            throw new SerializationException(sb2.toString());
                        }
                        Object obj = ref$ObjectRef.f23402c;
                        if (obj == null) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        ref$ObjectRef.f23402c = obj;
                        objM18145c = InterfaceC9226c.a.m18145c(interfaceC9226cBeginStructure, getDescriptor(), iDecodeElementIndex, AbstractC5437g.m2935a(this, interfaceC9226cBeginStructure, (String) obj), null, 8, null);
                    }
                } else {
                    if (objM18145c == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ref$ObjectRef.f23402c)).toString());
                    }
                    AbstractC9979u.m20292e(objM18145c, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                    objM18359b = objM18145c;
                }
            }
        }
        interfaceC9226cBeginStructure.endStructure(descriptor);
        return objM18359b;
    }

    /* renamed from: e */
    public abstract InterfaceC10469c mo2934e();

    @Override // p049ce.InterfaceC5439i
    public final void serialize(InterfaceC9229f encoder, Object value) {
        AbstractC9979u.m20294g(encoder, "encoder");
        AbstractC9979u.m20294g(value, "value");
        InterfaceC5439i interfaceC5439iM2936b = AbstractC5437g.m2936b(this, encoder, value);
        InterfaceC9129f descriptor = getDescriptor();
        InterfaceC9227d interfaceC9227dBeginStructure = encoder.beginStructure(descriptor);
        interfaceC9227dBeginStructure.encodeStringElement(getDescriptor(), 0, interfaceC5439iM2936b.getDescriptor().mo17961f());
        InterfaceC9129f descriptor2 = getDescriptor();
        AbstractC9979u.m20292e(interfaceC5439iM2936b, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        interfaceC9227dBeginStructure.encodeSerializableElement(descriptor2, 1, interfaceC5439iM2936b, value);
        interfaceC9227dBeginStructure.endStructure(descriptor);
    }
}
