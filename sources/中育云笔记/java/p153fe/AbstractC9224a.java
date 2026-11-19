package p153fe;

import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlinx.serialization.SerializationException;
import p049ce.InterfaceC5431a;
import p153fe.InterfaceC9226c;
import p153fe.InterfaceC9228e;

/* renamed from: fe.a */
/* loaded from: classes6.dex */
public abstract class AbstractC9224a implements InterfaceC9228e, InterfaceC9226c {
    public static /* synthetic */ Object decodeSerializableValue$default(AbstractC9224a abstractC9224a, InterfaceC5431a interfaceC5431a, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
        }
        if ((i10 & 2) != 0) {
            obj = null;
        }
        return abstractC9224a.decodeSerializableValue(interfaceC5431a, obj);
    }

    @Override // p153fe.InterfaceC9228e
    public InterfaceC9226c beginStructure(InterfaceC9129f descriptor) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        return this;
    }

    @Override // p153fe.InterfaceC9228e
    public boolean decodeBoolean() {
        Object objDecodeValue = decodeValue();
        AbstractC9979u.m20292e(objDecodeValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objDecodeValue).booleanValue();
    }

    @Override // p153fe.InterfaceC9226c
    public final boolean decodeBooleanElement(InterfaceC9129f descriptor, int i10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        return decodeBoolean();
    }

    @Override // p153fe.InterfaceC9228e
    public byte decodeByte() {
        Object objDecodeValue = decodeValue();
        AbstractC9979u.m20292e(objDecodeValue, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) objDecodeValue).byteValue();
    }

    @Override // p153fe.InterfaceC9226c
    public final byte decodeByteElement(InterfaceC9129f descriptor, int i10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        return decodeByte();
    }

    @Override // p153fe.InterfaceC9228e
    public char decodeChar() {
        Object objDecodeValue = decodeValue();
        AbstractC9979u.m20292e(objDecodeValue, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objDecodeValue).charValue();
    }

    @Override // p153fe.InterfaceC9226c
    public final char decodeCharElement(InterfaceC9129f descriptor, int i10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        return decodeChar();
    }

    @Override // p153fe.InterfaceC9226c
    public int decodeCollectionSize(InterfaceC9129f interfaceC9129f) {
        return InterfaceC9226c.a.m18143a(this, interfaceC9129f);
    }

    @Override // p153fe.InterfaceC9228e
    public double decodeDouble() {
        Object objDecodeValue = decodeValue();
        AbstractC9979u.m20292e(objDecodeValue, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objDecodeValue).doubleValue();
    }

    @Override // p153fe.InterfaceC9226c
    public final double decodeDoubleElement(InterfaceC9129f descriptor, int i10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        return decodeDouble();
    }

    @Override // p153fe.InterfaceC9228e
    public int decodeEnum(InterfaceC9129f enumDescriptor) {
        AbstractC9979u.m20294g(enumDescriptor, "enumDescriptor");
        Object objDecodeValue = decodeValue();
        AbstractC9979u.m20292e(objDecodeValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeValue).intValue();
    }

    @Override // p153fe.InterfaceC9228e
    public float decodeFloat() {
        Object objDecodeValue = decodeValue();
        AbstractC9979u.m20292e(objDecodeValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objDecodeValue).floatValue();
    }

    @Override // p153fe.InterfaceC9226c
    public final float decodeFloatElement(InterfaceC9129f descriptor, int i10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        return decodeFloat();
    }

    @Override // p153fe.InterfaceC9228e
    public InterfaceC9228e decodeInline(InterfaceC9129f descriptor) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        return this;
    }

    @Override // p153fe.InterfaceC9226c
    public InterfaceC9228e decodeInlineElement(InterfaceC9129f descriptor, int i10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        return decodeInline(descriptor.mo17960e(i10));
    }

    @Override // p153fe.InterfaceC9228e
    public int decodeInt() {
        Object objDecodeValue = decodeValue();
        AbstractC9979u.m20292e(objDecodeValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeValue).intValue();
    }

    @Override // p153fe.InterfaceC9226c
    public final int decodeIntElement(InterfaceC9129f descriptor, int i10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        return decodeInt();
    }

    @Override // p153fe.InterfaceC9228e
    public long decodeLong() {
        Object objDecodeValue = decodeValue();
        AbstractC9979u.m20292e(objDecodeValue, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objDecodeValue).longValue();
    }

    @Override // p153fe.InterfaceC9226c
    public final long decodeLongElement(InterfaceC9129f descriptor, int i10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        return decodeLong();
    }

    @Override // p153fe.InterfaceC9228e
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override // p153fe.InterfaceC9228e
    public Void decodeNull() {
        return null;
    }

    public final <T> T decodeNullableSerializableElement(InterfaceC9129f descriptor, int i10, InterfaceC5431a deserializer, T t10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        AbstractC9979u.m20294g(deserializer, "deserializer");
        return (deserializer.getDescriptor().mo17957b() || decodeNotNullMark()) ? (T) decodeSerializableValue(deserializer, t10) : (T) decodeNull();
    }

    public <T> T decodeNullableSerializableValue(InterfaceC5431a interfaceC5431a) {
        return (T) InterfaceC9228e.a.m18147a(this, interfaceC5431a);
    }

    @Override // p153fe.InterfaceC9226c
    public boolean decodeSequentially() {
        return InterfaceC9226c.a.m18144b(this);
    }

    @Override // p153fe.InterfaceC9226c
    public <T> T decodeSerializableElement(InterfaceC9129f descriptor, int i10, InterfaceC5431a deserializer, T t10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        AbstractC9979u.m20294g(deserializer, "deserializer");
        return (T) decodeSerializableValue(deserializer, t10);
    }

    @Override // p153fe.InterfaceC9228e
    public <T> T decodeSerializableValue(InterfaceC5431a interfaceC5431a) {
        return (T) InterfaceC9228e.a.m18148b(this, interfaceC5431a);
    }

    @Override // p153fe.InterfaceC9228e
    public short decodeShort() {
        Object objDecodeValue = decodeValue();
        AbstractC9979u.m20292e(objDecodeValue, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) objDecodeValue).shortValue();
    }

    @Override // p153fe.InterfaceC9226c
    public final short decodeShortElement(InterfaceC9129f descriptor, int i10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        return decodeShort();
    }

    @Override // p153fe.InterfaceC9228e
    public String decodeString() {
        Object objDecodeValue = decodeValue();
        AbstractC9979u.m20292e(objDecodeValue, "null cannot be cast to non-null type kotlin.String");
        return (String) objDecodeValue;
    }

    @Override // p153fe.InterfaceC9226c
    public final String decodeStringElement(InterfaceC9129f descriptor, int i10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        return decodeString();
    }

    public Object decodeValue() {
        throw new SerializationException(AbstractC9983y.m20315b(getClass()) + " can't retrieve untyped values");
    }

    @Override // p153fe.InterfaceC9226c
    public void endStructure(InterfaceC9129f descriptor) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
    }

    public <T> T decodeSerializableValue(InterfaceC5431a deserializer, T t10) {
        AbstractC9979u.m20294g(deserializer, "deserializer");
        return (T) decodeSerializableValue(deserializer);
    }
}
