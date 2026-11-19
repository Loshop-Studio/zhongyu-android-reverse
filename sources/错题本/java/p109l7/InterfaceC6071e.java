package p109l7;

import kotlin.jvm.internal.AbstractC5830k;
import p084i7.InterfaceC5685a;
import p101k7.InterfaceC5765g;

/* renamed from: l7.e */
/* loaded from: classes4.dex */
public interface InterfaceC6071e {
    InterfaceC6069c beginStructure(InterfaceC5765g interfaceC5765g);

    boolean decodeBoolean();

    byte decodeByte();

    char decodeChar();

    double decodeDouble();

    int decodeEnum(InterfaceC5765g interfaceC5765g);

    float decodeFloat();

    InterfaceC6071e decodeInline(InterfaceC5765g interfaceC5765g);

    int decodeInt();

    long decodeLong();

    boolean decodeNotNullMark();

    Void decodeNull();

    default Object decodeNullableSerializableValue(InterfaceC5685a deserializer) {
        AbstractC5830k.m5330g(deserializer, "deserializer");
        return (deserializer.getDescriptor().mo5099b() || decodeNotNullMark()) ? decodeSerializableValue(deserializer) : decodeNull();
    }

    default Object decodeSerializableValue(InterfaceC5685a deserializer) {
        AbstractC5830k.m5330g(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }

    short decodeShort();

    String decodeString();
}
