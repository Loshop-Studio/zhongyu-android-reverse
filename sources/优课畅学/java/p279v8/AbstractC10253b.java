package p279v8;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlinx.serialization.SerializationException;
import p246s8.InterfaceC10059i;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10255d;
import p279v8.InterfaceC10257f;
import p290w8.C10417l1;

/* renamed from: v8.b */
/* loaded from: classes5.dex */
public abstract class AbstractC10253b implements InterfaceC10257f, InterfaceC10255d {
    @Override // p279v8.InterfaceC10257f
    public InterfaceC10255d beginCollection(InterfaceC10210f interfaceC10210f, int i10) {
        return InterfaceC10257f.a.m19212a(this, interfaceC10210f, i10);
    }

    @Override // p279v8.InterfaceC10257f
    public InterfaceC10255d beginStructure(InterfaceC10210f descriptor) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        return this;
    }

    @Override // p279v8.InterfaceC10257f
    public void encodeBoolean(boolean z10) {
        encodeValue(Boolean.valueOf(z10));
    }

    @Override // p279v8.InterfaceC10255d
    public final void encodeBooleanElement(InterfaceC10210f descriptor, int i10, boolean z10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeBoolean(z10);
        }
    }

    @Override // p279v8.InterfaceC10257f
    public void encodeByte(byte b10) {
        encodeValue(Byte.valueOf(b10));
    }

    @Override // p279v8.InterfaceC10255d
    public final void encodeByteElement(InterfaceC10210f descriptor, int i10, byte b10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeByte(b10);
        }
    }

    @Override // p279v8.InterfaceC10257f
    public void encodeChar(char c10) {
        encodeValue(Character.valueOf(c10));
    }

    @Override // p279v8.InterfaceC10255d
    public final void encodeCharElement(InterfaceC10210f descriptor, int i10, char c10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeChar(c10);
        }
    }

    @Override // p279v8.InterfaceC10257f
    public void encodeDouble(double d10) {
        encodeValue(Double.valueOf(d10));
    }

    @Override // p279v8.InterfaceC10255d
    public final void encodeDoubleElement(InterfaceC10210f descriptor, int i10, double d10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeDouble(d10);
        }
    }

    public boolean encodeElement(InterfaceC10210f descriptor, int i10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        return true;
    }

    @Override // p279v8.InterfaceC10257f
    public void encodeEnum(InterfaceC10210f enumDescriptor, int i10) {
        AbstractC9133u.m16133g(enumDescriptor, "enumDescriptor");
        encodeValue(Integer.valueOf(i10));
    }

    @Override // p279v8.InterfaceC10257f
    public void encodeFloat(float f10) {
        encodeValue(Float.valueOf(f10));
    }

    @Override // p279v8.InterfaceC10255d
    public final void encodeFloatElement(InterfaceC10210f descriptor, int i10, float f10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeFloat(f10);
        }
    }

    @Override // p279v8.InterfaceC10257f
    public InterfaceC10257f encodeInline(InterfaceC10210f descriptor) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        return this;
    }

    @Override // p279v8.InterfaceC10255d
    public final InterfaceC10257f encodeInlineElement(InterfaceC10210f descriptor, int i10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        return encodeElement(descriptor, i10) ? encodeInline(descriptor.mo19088e(i10)) : C10417l1.f20732a;
    }

    @Override // p279v8.InterfaceC10257f
    public void encodeInt(int i10) {
        encodeValue(Integer.valueOf(i10));
    }

    @Override // p279v8.InterfaceC10255d
    public final void encodeIntElement(InterfaceC10210f descriptor, int i10, int i11) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeInt(i11);
        }
    }

    @Override // p279v8.InterfaceC10257f
    public void encodeLong(long j10) {
        encodeValue(Long.valueOf(j10));
    }

    @Override // p279v8.InterfaceC10255d
    public final void encodeLongElement(InterfaceC10210f descriptor, int i10, long j10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeLong(j10);
        }
    }

    @Override // p279v8.InterfaceC10257f
    public void encodeNotNullMark() {
        InterfaceC10257f.a.m19213b(this);
    }

    public <T> void encodeNullableSerializableElement(InterfaceC10210f descriptor, int i10, InterfaceC10059i serializer, T t10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        AbstractC9133u.m16133g(serializer, "serializer");
        if (encodeElement(descriptor, i10)) {
            encodeNullableSerializableValue(serializer, t10);
        }
    }

    public <T> void encodeNullableSerializableValue(InterfaceC10059i interfaceC10059i, T t10) {
        InterfaceC10257f.a.m19214c(this, interfaceC10059i, t10);
    }

    @Override // p279v8.InterfaceC10255d
    public <T> void encodeSerializableElement(InterfaceC10210f descriptor, int i10, InterfaceC10059i serializer, T t10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        AbstractC9133u.m16133g(serializer, "serializer");
        if (encodeElement(descriptor, i10)) {
            encodeSerializableValue(serializer, t10);
        }
    }

    @Override // p279v8.InterfaceC10257f
    public void encodeSerializableValue(InterfaceC10059i interfaceC10059i, Object obj) {
        InterfaceC10257f.a.m19215d(this, interfaceC10059i, obj);
    }

    @Override // p279v8.InterfaceC10257f
    public void encodeShort(short s10) {
        encodeValue(Short.valueOf(s10));
    }

    @Override // p279v8.InterfaceC10255d
    public final void encodeShortElement(InterfaceC10210f descriptor, int i10, short s10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        if (encodeElement(descriptor, i10)) {
            encodeShort(s10);
        }
    }

    @Override // p279v8.InterfaceC10257f
    public void encodeString(String value) {
        AbstractC9133u.m16133g(value, "value");
        encodeValue(value);
    }

    @Override // p279v8.InterfaceC10255d
    public final void encodeStringElement(InterfaceC10210f descriptor, int i10, String value) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        AbstractC9133u.m16133g(value, "value");
        if (encodeElement(descriptor, i10)) {
            encodeString(value);
        }
    }

    public void encodeValue(Object value) {
        AbstractC9133u.m16133g(value, "value");
        throw new SerializationException("Non-serializable " + AbstractC9137y.m16154b(value.getClass()) + " is not supported by " + AbstractC9137y.m16154b(getClass()) + " encoder");
    }

    @Override // p279v8.InterfaceC10255d
    public void endStructure(InterfaceC10210f descriptor) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
    }

    public boolean shouldEncodeElementDefault(InterfaceC10210f interfaceC10210f, int i10) {
        return InterfaceC10255d.a.m19209a(this, interfaceC10210f, i10);
    }
}
