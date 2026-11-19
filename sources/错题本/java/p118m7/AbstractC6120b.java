package p118m7;

import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.SerializationException;
import p084i7.C5687c;
import p084i7.InterfaceC5686b;
import p084i7.InterfaceC5689e;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6070d;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;
import p185v7.AbstractC6683l;

/* renamed from: m7.b */
/* loaded from: classes4.dex */
public abstract class AbstractC6120b implements InterfaceC5686b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.String] */
    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        Object objDecodeSerializableElement;
        AbstractC5830k.m5330g(decoder, "decoder");
        C5687c c5687c = (C5687c) this;
        InterfaceC5765g descriptor = c5687c.getDescriptor();
        InterfaceC6069c interfaceC6069cBeginStructure = decoder.beginStructure(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (interfaceC6069cBeginStructure.decodeSequentially()) {
            objDecodeSerializableElement = interfaceC6069cBeginStructure.decodeSerializableElement(c5687c.getDescriptor(), 1, AbstractC6683l.m6369i(this, interfaceC6069cBeginStructure, interfaceC6069cBeginStructure.decodeStringElement(c5687c.getDescriptor(), 0)), null);
        } else {
            Object objDecodeSerializableElement2 = null;
            while (true) {
                int iDecodeElementIndex = interfaceC6069cBeginStructure.decodeElementIndex(c5687c.getDescriptor());
                if (iDecodeElementIndex != -1) {
                    if (iDecodeElementIndex == 0) {
                        ref$ObjectRef.element = interfaceC6069cBeginStructure.decodeStringElement(c5687c.getDescriptor(), iDecodeElementIndex);
                    } else {
                        if (iDecodeElementIndex != 1) {
                            StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                            String str = (String) ref$ObjectRef.element;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(iDecodeElementIndex);
                            throw new SerializationException(sb.toString());
                        }
                        T t8 = ref$ObjectRef.element;
                        if (t8 == 0) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        ref$ObjectRef.element = t8;
                        objDecodeSerializableElement2 = interfaceC6069cBeginStructure.decodeSerializableElement(c5687c.getDescriptor(), iDecodeElementIndex, AbstractC6683l.m6369i(this, interfaceC6069cBeginStructure, (String) t8), null);
                    }
                } else {
                    if (objDecodeSerializableElement2 == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ref$ObjectRef.element)).toString());
                    }
                    objDecodeSerializableElement = objDecodeSerializableElement2;
                }
            }
        }
        interfaceC6069cBeginStructure.endStructure(descriptor);
        return objDecodeSerializableElement;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object value) {
        AbstractC5830k.m5330g(value, "value");
        InterfaceC5689e interfaceC5689eM6370j = AbstractC6683l.m6370j(this, interfaceC6072f, value);
        C5687c c5687c = (C5687c) this;
        InterfaceC5765g descriptor = c5687c.getDescriptor();
        InterfaceC6070d interfaceC6070dBeginStructure = interfaceC6072f.beginStructure(descriptor);
        interfaceC6070dBeginStructure.encodeStringElement(c5687c.getDescriptor(), 0, interfaceC5689eM6370j.getDescriptor().mo5105h());
        interfaceC6070dBeginStructure.encodeSerializableElement(c5687c.getDescriptor(), 1, interfaceC5689eM6370j, value);
        interfaceC6070dBeginStructure.endStructure(descriptor);
    }
}
