package p109l7;

import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p084i7.InterfaceC5685a;
import p101k7.InterfaceC5765g;

/* renamed from: l7.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6067a implements InterfaceC6071e, InterfaceC6069c {
    public static /* synthetic */ Object decodeSerializableValue$default(AbstractC6067a abstractC6067a, InterfaceC5685a interfaceC5685a, Object obj, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
        }
        if ((i & 2) != 0) {
            obj = null;
        }
        return abstractC6067a.decodeSerializableValue(interfaceC5685a, obj);
    }

    @Override // p109l7.InterfaceC6071e
    @NotNull
    public InterfaceC6069c beginStructure(@NotNull InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return this;
    }

    @Override // p109l7.InterfaceC6071e
    public boolean decodeBoolean() {
        Object objDecodeValue = decodeValue();
        AbstractC5830k.m5328e(objDecodeValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objDecodeValue).booleanValue();
    }

    @Override // p109l7.InterfaceC6069c
    public final boolean decodeBooleanElement(@NotNull InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return decodeBoolean();
    }

    @Override // p109l7.InterfaceC6071e
    public byte decodeByte() {
        Object objDecodeValue = decodeValue();
        AbstractC5830k.m5328e(objDecodeValue, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) objDecodeValue).byteValue();
    }

    @Override // p109l7.InterfaceC6069c
    public final byte decodeByteElement(@NotNull InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return decodeByte();
    }

    @Override // p109l7.InterfaceC6071e
    public char decodeChar() {
        Object objDecodeValue = decodeValue();
        AbstractC5830k.m5328e(objDecodeValue, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objDecodeValue).charValue();
    }

    @Override // p109l7.InterfaceC6069c
    public final char decodeCharElement(@NotNull InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return decodeChar();
    }

    @Override // p109l7.InterfaceC6071e
    public double decodeDouble() {
        Object objDecodeValue = decodeValue();
        AbstractC5830k.m5328e(objDecodeValue, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objDecodeValue).doubleValue();
    }

    @Override // p109l7.InterfaceC6069c
    public final double decodeDoubleElement(@NotNull InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return decodeDouble();
    }

    @Override // p109l7.InterfaceC6071e
    public int decodeEnum(@NotNull InterfaceC5765g enumDescriptor) {
        AbstractC5830k.m5330g(enumDescriptor, "enumDescriptor");
        Object objDecodeValue = decodeValue();
        AbstractC5830k.m5328e(objDecodeValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeValue).intValue();
    }

    @Override // p109l7.InterfaceC6071e
    public float decodeFloat() {
        Object objDecodeValue = decodeValue();
        AbstractC5830k.m5328e(objDecodeValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objDecodeValue).floatValue();
    }

    @Override // p109l7.InterfaceC6069c
    public final float decodeFloatElement(@NotNull InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return decodeFloat();
    }

    @Override // p109l7.InterfaceC6071e
    @NotNull
    public InterfaceC6071e decodeInline(@NotNull InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return this;
    }

    @Override // p109l7.InterfaceC6069c
    @NotNull
    public InterfaceC6071e decodeInlineElement(@NotNull InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return decodeInline(descriptor.mo5104g(i));
    }

    @Override // p109l7.InterfaceC6071e
    public int decodeInt() {
        Object objDecodeValue = decodeValue();
        AbstractC5830k.m5328e(objDecodeValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeValue).intValue();
    }

    @Override // p109l7.InterfaceC6069c
    public final int decodeIntElement(@NotNull InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return decodeInt();
    }

    @Override // p109l7.InterfaceC6071e
    public long decodeLong() {
        Object objDecodeValue = decodeValue();
        AbstractC5830k.m5328e(objDecodeValue, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objDecodeValue).longValue();
    }

    @Override // p109l7.InterfaceC6069c
    public final long decodeLongElement(@NotNull InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return decodeLong();
    }

    @Override // p109l7.InterfaceC6071e
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override // p109l7.InterfaceC6071e
    @Nullable
    public Void decodeNull() {
        return null;
    }

    @Override // p109l7.InterfaceC6069c
    @Nullable
    public final <T> T decodeNullableSerializableElement(@NotNull InterfaceC5765g descriptor, int i, @NotNull InterfaceC5685a deserializer, @Nullable T t8) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        AbstractC5830k.m5330g(deserializer, "deserializer");
        return (deserializer.getDescriptor().mo5099b() || decodeNotNullMark()) ? (T) decodeSerializableValue(deserializer, t8) : (T) decodeNull();
    }

    public <T> T decodeSerializableElement(@NotNull InterfaceC5765g descriptor, int i, @NotNull InterfaceC5685a deserializer, @Nullable T t8) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        AbstractC5830k.m5330g(deserializer, "deserializer");
        return (T) decodeSerializableValue(deserializer, t8);
    }

    public <T> T decodeSerializableValue(@NotNull InterfaceC5685a deserializer, @Nullable T t8) {
        AbstractC5830k.m5330g(deserializer, "deserializer");
        return (T) decodeSerializableValue(deserializer);
    }

    @Override // p109l7.InterfaceC6071e
    public short decodeShort() {
        Object objDecodeValue = decodeValue();
        AbstractC5830k.m5328e(objDecodeValue, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) objDecodeValue).shortValue();
    }

    @Override // p109l7.InterfaceC6069c
    public final short decodeShortElement(@NotNull InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return decodeShort();
    }

    @Override // p109l7.InterfaceC6071e
    @NotNull
    public String decodeString() {
        Object objDecodeValue = decodeValue();
        AbstractC5830k.m5328e(objDecodeValue, "null cannot be cast to non-null type kotlin.String");
        return (String) objDecodeValue;
    }

    @Override // p109l7.InterfaceC6069c
    @NotNull
    public final String decodeStringElement(@NotNull InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return decodeString();
    }

    @NotNull
    public Object decodeValue() {
        throw new SerializationException(AbstractC5832m.m5340a(getClass()) + " can't retrieve untyped values");
    }

    public void endStructure(@NotNull InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
    }
}
