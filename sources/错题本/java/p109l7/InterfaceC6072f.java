package p109l7;

import kotlin.jvm.internal.AbstractC5830k;
import p084i7.InterfaceC5689e;
import p101k7.InterfaceC5765g;
import p133o7.AbstractC6281e;

/* renamed from: l7.f */
/* loaded from: classes4.dex */
public interface InterfaceC6072f {
    default InterfaceC6070d beginCollection(InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return beginStructure(descriptor);
    }

    InterfaceC6070d beginStructure(InterfaceC5765g interfaceC5765g);

    void encodeBoolean(boolean z8);

    void encodeByte(byte b6);

    void encodeChar(char c);

    void encodeDouble(double d9);

    void encodeEnum(InterfaceC5765g interfaceC5765g, int i);

    void encodeFloat(float f);

    InterfaceC6072f encodeInline(InterfaceC5765g interfaceC5765g);

    void encodeInt(int i);

    void encodeLong(long j7);

    void encodeNull();

    default void encodeNullableSerializableValue(InterfaceC5689e serializer, Object obj) {
        AbstractC5830k.m5330g(serializer, "serializer");
        if (serializer.getDescriptor().mo5099b()) {
            encodeSerializableValue(serializer, obj);
        } else if (obj == null) {
            encodeNull();
        } else {
            encodeNotNullMark();
            encodeSerializableValue(serializer, obj);
        }
    }

    default void encodeSerializableValue(InterfaceC5689e serializer, Object obj) {
        AbstractC5830k.m5330g(serializer, "serializer");
        serializer.serialize(this, obj);
    }

    void encodeShort(short s8);

    void encodeString(String str);

    AbstractC6281e getSerializersModule();

    default void encodeNotNullMark() {
    }
}
