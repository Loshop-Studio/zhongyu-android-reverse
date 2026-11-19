package p279v8;

import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10059i;
import p268u8.InterfaceC10210f;
import p301x8.AbstractC10583a;

/* renamed from: v8.f */
/* loaded from: classes5.dex */
public interface InterfaceC10257f {
    InterfaceC10255d beginCollection(InterfaceC10210f interfaceC10210f, int i10);

    InterfaceC10255d beginStructure(InterfaceC10210f interfaceC10210f);

    void encodeBoolean(boolean z10);

    void encodeByte(byte b10);

    void encodeChar(char c10);

    void encodeDouble(double d10);

    void encodeEnum(InterfaceC10210f interfaceC10210f, int i10);

    void encodeFloat(float f10);

    InterfaceC10257f encodeInline(InterfaceC10210f interfaceC10210f);

    void encodeInt(int i10);

    void encodeLong(long j10);

    void encodeNotNullMark();

    void encodeNull();

    void encodeSerializableValue(InterfaceC10059i interfaceC10059i, Object obj);

    void encodeShort(short s10);

    void encodeString(String str);

    AbstractC10583a getSerializersModule();

    /* renamed from: v8.f$a */
    public static final class a {
        /* renamed from: a */
        public static InterfaceC10255d m19212a(InterfaceC10257f interfaceC10257f, InterfaceC10210f descriptor, int i10) {
            AbstractC9133u.m16133g(descriptor, "descriptor");
            return interfaceC10257f.beginStructure(descriptor);
        }

        /* renamed from: c */
        public static void m19214c(InterfaceC10257f interfaceC10257f, InterfaceC10059i serializer, Object obj) {
            AbstractC9133u.m16133g(serializer, "serializer");
            if (serializer.getDescriptor().mo19085b()) {
                interfaceC10257f.encodeSerializableValue(serializer, obj);
            } else if (obj == null) {
                interfaceC10257f.encodeNull();
            } else {
                interfaceC10257f.encodeNotNullMark();
                interfaceC10257f.encodeSerializableValue(serializer, obj);
            }
        }

        /* renamed from: d */
        public static void m19215d(InterfaceC10257f interfaceC10257f, InterfaceC10059i serializer, Object obj) {
            AbstractC9133u.m16133g(serializer, "serializer");
            serializer.serialize(interfaceC10257f, obj);
        }

        /* renamed from: b */
        public static void m19213b(InterfaceC10257f interfaceC10257f) {
        }
    }
}
