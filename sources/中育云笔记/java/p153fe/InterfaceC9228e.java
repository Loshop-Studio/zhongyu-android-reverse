package p153fe;

import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5431a;

/* renamed from: fe.e */
/* loaded from: classes6.dex */
public interface InterfaceC9228e {

    /* renamed from: fe.e$a */
    public static final class a {
        /* renamed from: a */
        public static Object m18147a(InterfaceC9228e interfaceC9228e, InterfaceC5431a deserializer) {
            AbstractC9979u.m20294g(deserializer, "deserializer");
            return (deserializer.getDescriptor().mo17957b() || interfaceC9228e.decodeNotNullMark()) ? interfaceC9228e.decodeSerializableValue(deserializer) : interfaceC9228e.decodeNull();
        }

        /* renamed from: b */
        public static Object m18148b(InterfaceC9228e interfaceC9228e, InterfaceC5431a deserializer) {
            AbstractC9979u.m20294g(deserializer, "deserializer");
            return deserializer.deserialize(interfaceC9228e);
        }
    }

    InterfaceC9226c beginStructure(InterfaceC9129f interfaceC9129f);

    boolean decodeBoolean();

    byte decodeByte();

    char decodeChar();

    double decodeDouble();

    int decodeEnum(InterfaceC9129f interfaceC9129f);

    float decodeFloat();

    InterfaceC9228e decodeInline(InterfaceC9129f interfaceC9129f);

    int decodeInt();

    long decodeLong();

    boolean decodeNotNullMark();

    Void decodeNull();

    Object decodeSerializableValue(InterfaceC5431a interfaceC5431a);

    short decodeShort();

    String decodeString();
}
