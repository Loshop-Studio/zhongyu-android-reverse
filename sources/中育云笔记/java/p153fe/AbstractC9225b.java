package p153fe;

import ee.InterfaceC9129f;
import ge.C9350l1;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlinx.serialization.SerializationException;
import p049ce.InterfaceC5439i;
import p153fe.InterfaceC9227d;
import p153fe.InterfaceC9229f;

/* renamed from: fe.b */
/* loaded from: classes6.dex */
public abstract class AbstractC9225b implements InterfaceC9229f, InterfaceC9227d {
    @Override // p153fe.InterfaceC9229f
    public InterfaceC9227d beginCollection(InterfaceC9129f interfaceC9129f, int i10) {
        return InterfaceC9229f.a.m18149a(this, interfaceC9129f, i10);
    }

    @Override // p153fe.InterfaceC9229f
    public InterfaceC9227d beginStructure(InterfaceC9129f descriptor) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        return this;
    }

    @Override // p153fe.InterfaceC9229f
    public void encodeBoolean(boolean z10) {
        encodeValue(Boolean.valueOf(z10));
    }

    @Override // p153fe.InterfaceC9227d
    public final void encodeBooleanElement(InterfaceC9129f descriptor, int i10, boolean z10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeBoolean(z10);
        }
    }

    @Override // p153fe.InterfaceC9229f
    public void encodeByte(byte b10) {
        encodeValue(Byte.valueOf(b10));
    }

    @Override // p153fe.InterfaceC9227d
    public final void encodeByteElement(InterfaceC9129f descriptor, int i10, byte b10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeByte(b10);
        }
    }

    @Override // p153fe.InterfaceC9229f
    public void encodeChar(char c10) {
        encodeValue(Character.valueOf(c10));
    }

    @Override // p153fe.InterfaceC9227d
    public final void encodeCharElement(InterfaceC9129f descriptor, int i10, char c10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeChar(c10);
        }
    }

    @Override // p153fe.InterfaceC9229f
    public void encodeDouble(double d10) {
        encodeValue(Double.valueOf(d10));
    }

    @Override // p153fe.InterfaceC9227d
    public final void encodeDoubleElement(InterfaceC9129f descriptor, int i10, double d10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeDouble(d10);
        }
    }

    public boolean encodeElement(InterfaceC9129f descriptor, int i10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        return true;
    }

    @Override // p153fe.InterfaceC9229f
    public void encodeEnum(InterfaceC9129f enumDescriptor, int i10) {
        AbstractC9979u.m20294g(enumDescriptor, "enumDescriptor");
        encodeValue(Integer.valueOf(i10));
    }

    @Override // p153fe.InterfaceC9229f
    public void encodeFloat(float f10) {
        encodeValue(Float.valueOf(f10));
    }

    @Override // p153fe.InterfaceC9227d
    public final void encodeFloatElement(InterfaceC9129f descriptor, int i10, float f10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeFloat(f10);
        }
    }

    @Override // p153fe.InterfaceC9229f
    public InterfaceC9229f encodeInline(InterfaceC9129f descriptor) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        return this;
    }

    @Override // p153fe.InterfaceC9227d
    public final InterfaceC9229f encodeInlineElement(InterfaceC9129f descriptor, int i10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        return encodeElement(descriptor, i10) ? encodeInline(descriptor.mo17960e(i10)) : C9350l1.f21759a;
    }

    @Override // p153fe.InterfaceC9229f
    public void encodeInt(int i10) {
        encodeValue(Integer.valueOf(i10));
    }

    @Override // p153fe.InterfaceC9227d
    public final void encodeIntElement(InterfaceC9129f descriptor, int i10, int i11) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeInt(i11);
        }
    }

    @Override // p153fe.InterfaceC9229f
    public void encodeLong(long j10) {
        encodeValue(Long.valueOf(j10));
    }

    @Override // p153fe.InterfaceC9227d
    public final void encodeLongElement(InterfaceC9129f descriptor, int i10, long j10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeLong(j10);
        }
    }

    @Override // p153fe.InterfaceC9229f
    public void encodeNotNullMark() {
        InterfaceC9229f.a.m18150b(this);
    }

    public <T> void encodeNullableSerializableElement(InterfaceC9129f descriptor, int i10, InterfaceC5439i serializer, T t10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        AbstractC9979u.m20294g(serializer, "serializer");
        if (encodeElement(descriptor, i10)) {
            encodeNullableSerializableValue(serializer, t10);
        }
    }

    public <T> void encodeNullableSerializableValue(InterfaceC5439i interfaceC5439i, T t10) {
        InterfaceC9229f.a.m18151c(this, interfaceC5439i, t10);
    }

    @Override // p153fe.InterfaceC9227d
    public <T> void encodeSerializableElement(InterfaceC9129f descriptor, int i10, InterfaceC5439i serializer, T t10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        AbstractC9979u.m20294g(serializer, "serializer");
        if (encodeElement(descriptor, i10)) {
            encodeSerializableValue(serializer, t10);
        }
    }

    @Override // p153fe.InterfaceC9229f
    public void encodeSerializableValue(InterfaceC5439i interfaceC5439i, Object obj) {
        InterfaceC9229f.a.m18152d(this, interfaceC5439i, obj);
    }

    @Override // p153fe.InterfaceC9229f
    public void encodeShort(short s10) {
        encodeValue(Short.valueOf(s10));
    }

    @Override // p153fe.InterfaceC9227d
    public final void encodeShortElement(InterfaceC9129f descriptor, int i10, short s10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeShort(s10);
        }
    }

    @Override // p153fe.InterfaceC9229f
    public void encodeString(String value) {
        AbstractC9979u.m20294g(value, "value");
        encodeValue(value);
    }

    @Override // p153fe.InterfaceC9227d
    public final void encodeStringElement(InterfaceC9129f descriptor, int i10, String value) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        AbstractC9979u.m20294g(value, "value");
        if (encodeElement(descriptor, i10)) {
            encodeString(value);
        }
    }

    public void encodeValue(Object value) {
        AbstractC9979u.m20294g(value, "value");
        throw new SerializationException("Non-serializable " + AbstractC9983y.m20315b(value.getClass()) + " is not supported by " + AbstractC9983y.m20315b(getClass()) + " encoder");
    }

    @Override // p153fe.InterfaceC9227d
    public void endStructure(InterfaceC9129f descriptor) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
    }

    public boolean shouldEncodeElementDefault(InterfaceC9129f interfaceC9129f, int i10) {
        return InterfaceC9227d.a.m18146a(this, interfaceC9129f, i10);
    }
}
