package p109l7;

import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p084i7.InterfaceC5689e;
import p101k7.InterfaceC5765g;
import p118m7.C6176t0;

/* renamed from: l7.b */
/* loaded from: classes4.dex */
public abstract class AbstractC6068b implements InterfaceC6072f, InterfaceC6070d {
    @Override // p109l7.InterfaceC6072f
    @NotNull
    public InterfaceC6070d beginStructure(@NotNull InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return this;
    }

    @Override // p109l7.InterfaceC6072f
    public void encodeBoolean(boolean z8) {
        encodeValue(Boolean.valueOf(z8));
    }

    @Override // p109l7.InterfaceC6070d
    public final void encodeBooleanElement(@NotNull InterfaceC5765g descriptor, int i, boolean z8) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        if (encodeElement(descriptor, i)) {
            encodeBoolean(z8);
        }
    }

    @Override // p109l7.InterfaceC6072f
    public void encodeByte(byte b6) {
        encodeValue(Byte.valueOf(b6));
    }

    @Override // p109l7.InterfaceC6070d
    public final void encodeByteElement(@NotNull InterfaceC5765g descriptor, int i, byte b6) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        if (encodeElement(descriptor, i)) {
            encodeByte(b6);
        }
    }

    @Override // p109l7.InterfaceC6072f
    public void encodeChar(char c) {
        encodeValue(Character.valueOf(c));
    }

    @Override // p109l7.InterfaceC6070d
    public final void encodeCharElement(@NotNull InterfaceC5765g descriptor, int i, char c) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        if (encodeElement(descriptor, i)) {
            encodeChar(c);
        }
    }

    @Override // p109l7.InterfaceC6072f
    public void encodeDouble(double d9) {
        encodeValue(Double.valueOf(d9));
    }

    @Override // p109l7.InterfaceC6070d
    public final void encodeDoubleElement(@NotNull InterfaceC5765g descriptor, int i, double d9) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        if (encodeElement(descriptor, i)) {
            encodeDouble(d9);
        }
    }

    public boolean encodeElement(InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return true;
    }

    @Override // p109l7.InterfaceC6072f
    public void encodeEnum(@NotNull InterfaceC5765g enumDescriptor, int i) {
        AbstractC5830k.m5330g(enumDescriptor, "enumDescriptor");
        encodeValue(Integer.valueOf(i));
    }

    @Override // p109l7.InterfaceC6072f
    public void encodeFloat(float f) {
        encodeValue(Float.valueOf(f));
    }

    @Override // p109l7.InterfaceC6070d
    public final void encodeFloatElement(@NotNull InterfaceC5765g descriptor, int i, float f) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        if (encodeElement(descriptor, i)) {
            encodeFloat(f);
        }
    }

    @Override // p109l7.InterfaceC6072f
    @NotNull
    public InterfaceC6072f encodeInline(@NotNull InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return this;
    }

    @Override // p109l7.InterfaceC6070d
    @NotNull
    public final InterfaceC6072f encodeInlineElement(@NotNull InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return encodeElement(descriptor, i) ? encodeInline(descriptor.mo5104g(i)) : C6176t0.f9865a;
    }

    @Override // p109l7.InterfaceC6072f
    public void encodeInt(int i) {
        encodeValue(Integer.valueOf(i));
    }

    @Override // p109l7.InterfaceC6070d
    public final void encodeIntElement(@NotNull InterfaceC5765g descriptor, int i, int i8) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        if (encodeElement(descriptor, i)) {
            encodeInt(i8);
        }
    }

    @Override // p109l7.InterfaceC6072f
    public void encodeLong(long j7) {
        encodeValue(Long.valueOf(j7));
    }

    @Override // p109l7.InterfaceC6070d
    public final void encodeLongElement(@NotNull InterfaceC5765g descriptor, int i, long j7) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        if (encodeElement(descriptor, i)) {
            encodeLong(j7);
        }
    }

    public <T> void encodeNullableSerializableElement(@NotNull InterfaceC5765g descriptor, int i, @NotNull InterfaceC5689e serializer, @Nullable T t8) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        AbstractC5830k.m5330g(serializer, "serializer");
        if (encodeElement(descriptor, i)) {
            encodeNullableSerializableValue(serializer, t8);
        }
    }

    @Override // p109l7.InterfaceC6070d
    public <T> void encodeSerializableElement(@NotNull InterfaceC5765g descriptor, int i, @NotNull InterfaceC5689e serializer, T t8) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        AbstractC5830k.m5330g(serializer, "serializer");
        if (encodeElement(descriptor, i)) {
            encodeSerializableValue(serializer, t8);
        }
    }

    @Override // p109l7.InterfaceC6072f
    public void encodeShort(short s8) {
        encodeValue(Short.valueOf(s8));
    }

    @Override // p109l7.InterfaceC6070d
    public final void encodeShortElement(@NotNull InterfaceC5765g descriptor, int i, short s8) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        if (encodeElement(descriptor, i)) {
            encodeShort(s8);
        }
    }

    @Override // p109l7.InterfaceC6072f
    public void encodeString(@NotNull String value) {
        AbstractC5830k.m5330g(value, "value");
        encodeValue(value);
    }

    @Override // p109l7.InterfaceC6070d
    public final void encodeStringElement(@NotNull InterfaceC5765g descriptor, int i, @NotNull String value) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        AbstractC5830k.m5330g(value, "value");
        if (encodeElement(descriptor, i)) {
            encodeString(value);
        }
    }

    public void encodeValue(@NotNull Object value) {
        AbstractC5830k.m5330g(value, "value");
        throw new SerializationException("Non-serializable " + AbstractC5832m.m5340a(value.getClass()) + " is not supported by " + AbstractC5832m.m5340a(getClass()) + " encoder");
    }

    public void endStructure(@NotNull InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
    }
}
