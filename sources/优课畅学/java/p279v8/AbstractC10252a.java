package p279v8;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlinx.serialization.SerializationException;
import p246s8.InterfaceC10051a;
import p268u8.InterfaceC10210f;
import p279v8.InterfaceC10254c;
import p279v8.InterfaceC10256e;

/* renamed from: v8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10252a implements InterfaceC10256e, InterfaceC10254c {
    public static /* synthetic */ Object decodeSerializableValue$default(AbstractC10252a abstractC10252a, InterfaceC10051a interfaceC10051a, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
        }
        if ((i10 & 2) != 0) {
            obj = null;
        }
        return abstractC10252a.decodeSerializableValue(interfaceC10051a, obj);
    }

    @Override // p279v8.InterfaceC10256e
    public InterfaceC10254c beginStructure(InterfaceC10210f descriptor) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        return this;
    }

    @Override // p279v8.InterfaceC10256e
    public boolean decodeBoolean() {
        Object objDecodeValue = decodeValue();
        AbstractC9133u.m16131e(objDecodeValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objDecodeValue).booleanValue();
    }

    @Override // p279v8.InterfaceC10254c
    public final boolean decodeBooleanElement(InterfaceC10210f descriptor, int i10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        return decodeBoolean();
    }

    @Override // p279v8.InterfaceC10256e
    public byte decodeByte() {
        Object objDecodeValue = decodeValue();
        AbstractC9133u.m16131e(objDecodeValue, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) objDecodeValue).byteValue();
    }

    @Override // p279v8.InterfaceC10254c
    public final byte decodeByteElement(InterfaceC10210f descriptor, int i10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        return decodeByte();
    }

    @Override // p279v8.InterfaceC10256e
    public char decodeChar() {
        Object objDecodeValue = decodeValue();
        AbstractC9133u.m16131e(objDecodeValue, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objDecodeValue).charValue();
    }

    @Override // p279v8.InterfaceC10254c
    public final char decodeCharElement(InterfaceC10210f descriptor, int i10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        return decodeChar();
    }

    @Override // p279v8.InterfaceC10254c
    public int decodeCollectionSize(InterfaceC10210f interfaceC10210f) {
        return InterfaceC10254c.a.m19206a(this, interfaceC10210f);
    }

    @Override // p279v8.InterfaceC10256e
    public double decodeDouble() {
        Object objDecodeValue = decodeValue();
        AbstractC9133u.m16131e(objDecodeValue, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objDecodeValue).doubleValue();
    }

    @Override // p279v8.InterfaceC10254c
    public final double decodeDoubleElement(InterfaceC10210f descriptor, int i10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        return decodeDouble();
    }

    @Override // p279v8.InterfaceC10256e
    public int decodeEnum(InterfaceC10210f enumDescriptor) {
        AbstractC9133u.m16133g(enumDescriptor, "enumDescriptor");
        Object objDecodeValue = decodeValue();
        AbstractC9133u.m16131e(objDecodeValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeValue).intValue();
    }

    @Override // p279v8.InterfaceC10256e
    public float decodeFloat() {
        Object objDecodeValue = decodeValue();
        AbstractC9133u.m16131e(objDecodeValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objDecodeValue).floatValue();
    }

    @Override // p279v8.InterfaceC10254c
    public final float decodeFloatElement(InterfaceC10210f descriptor, int i10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        return decodeFloat();
    }

    @Override // p279v8.InterfaceC10256e
    public InterfaceC10256e decodeInline(InterfaceC10210f descriptor) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        return this;
    }

    @Override // p279v8.InterfaceC10254c
    public InterfaceC10256e decodeInlineElement(InterfaceC10210f descriptor, int i10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        return decodeInline(descriptor.mo19088e(i10));
    }

    @Override // p279v8.InterfaceC10256e
    public int decodeInt() {
        Object objDecodeValue = decodeValue();
        AbstractC9133u.m16131e(objDecodeValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeValue).intValue();
    }

    @Override // p279v8.InterfaceC10254c
    public final int decodeIntElement(InterfaceC10210f descriptor, int i10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        return decodeInt();
    }

    @Override // p279v8.InterfaceC10256e
    public long decodeLong() {
        Object objDecodeValue = decodeValue();
        AbstractC9133u.m16131e(objDecodeValue, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objDecodeValue).longValue();
    }

    @Override // p279v8.InterfaceC10254c
    public final long decodeLongElement(InterfaceC10210f descriptor, int i10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        return decodeLong();
    }

    @Override // p279v8.InterfaceC10256e
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override // p279v8.InterfaceC10256e
    public Void decodeNull() {
        return null;
    }

    public final <T> T decodeNullableSerializableElement(InterfaceC10210f descriptor, int i10, InterfaceC10051a deserializer, T t10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        AbstractC9133u.m16133g(deserializer, "deserializer");
        return (deserializer.getDescriptor().mo19085b() || decodeNotNullMark()) ? (T) decodeSerializableValue(deserializer, t10) : (T) decodeNull();
    }

    public <T> T decodeNullableSerializableValue(InterfaceC10051a interfaceC10051a) {
        return (T) InterfaceC10256e.a.m19210a(this, interfaceC10051a);
    }

    @Override // p279v8.InterfaceC10254c
    public boolean decodeSequentially() {
        return InterfaceC10254c.a.m19207b(this);
    }

    @Override // p279v8.InterfaceC10254c
    public <T> T decodeSerializableElement(InterfaceC10210f descriptor, int i10, InterfaceC10051a deserializer, T t10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        AbstractC9133u.m16133g(deserializer, "deserializer");
        return (T) decodeSerializableValue(deserializer, t10);
    }

    @Override // p279v8.InterfaceC10256e
    public <T> T decodeSerializableValue(InterfaceC10051a interfaceC10051a) {
        return (T) InterfaceC10256e.a.m19211b(this, interfaceC10051a);
    }

    @Override // p279v8.InterfaceC10256e
    public short decodeShort() {
        Object objDecodeValue = decodeValue();
        AbstractC9133u.m16131e(objDecodeValue, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) objDecodeValue).shortValue();
    }

    @Override // p279v8.InterfaceC10254c
    public final short decodeShortElement(InterfaceC10210f descriptor, int i10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        return decodeShort();
    }

    @Override // p279v8.InterfaceC10256e
    public String decodeString() {
        Object objDecodeValue = decodeValue();
        AbstractC9133u.m16131e(objDecodeValue, "null cannot be cast to non-null type kotlin.String");
        return (String) objDecodeValue;
    }

    @Override // p279v8.InterfaceC10254c
    public final String decodeStringElement(InterfaceC10210f descriptor, int i10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        return decodeString();
    }

    public Object decodeValue() {
        throw new SerializationException(AbstractC9137y.m16154b(getClass()) + " can't retrieve untyped values");
    }

    @Override // p279v8.InterfaceC10254c
    public void endStructure(InterfaceC10210f descriptor) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
    }

    public <T> T decodeSerializableValue(InterfaceC10051a deserializer, T t10) {
        AbstractC9133u.m16133g(deserializer, "deserializer");
        return (T) decodeSerializableValue(deserializer);
    }
}
