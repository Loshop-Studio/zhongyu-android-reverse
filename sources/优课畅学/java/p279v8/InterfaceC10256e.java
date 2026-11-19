package p279v8;

import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10051a;
import p268u8.InterfaceC10210f;

/* renamed from: v8.e */
/* loaded from: classes5.dex */
public interface InterfaceC10256e {

    /* renamed from: v8.e$a */
    public static final class a {
        /* renamed from: a */
        public static Object m19210a(InterfaceC10256e interfaceC10256e, InterfaceC10051a deserializer) {
            AbstractC9133u.m16133g(deserializer, "deserializer");
            return (deserializer.getDescriptor().mo19085b() || interfaceC10256e.decodeNotNullMark()) ? interfaceC10256e.decodeSerializableValue(deserializer) : interfaceC10256e.decodeNull();
        }

        /* renamed from: b */
        public static Object m19211b(InterfaceC10256e interfaceC10256e, InterfaceC10051a deserializer) {
            AbstractC9133u.m16133g(deserializer, "deserializer");
            return deserializer.deserialize(interfaceC10256e);
        }
    }

    InterfaceC10254c beginStructure(InterfaceC10210f interfaceC10210f);

    boolean decodeBoolean();

    byte decodeByte();

    char decodeChar();

    double decodeDouble();

    int decodeEnum(InterfaceC10210f interfaceC10210f);

    float decodeFloat();

    InterfaceC10256e decodeInline(InterfaceC10210f interfaceC10210f);

    int decodeInt();

    long decodeLong();

    boolean decodeNotNullMark();

    Void decodeNull();

    Object decodeSerializableValue(InterfaceC10051a interfaceC10051a);

    short decodeShort();

    String decodeString();
}
