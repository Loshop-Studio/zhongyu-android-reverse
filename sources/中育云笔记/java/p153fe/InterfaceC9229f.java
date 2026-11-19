package p153fe;

import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5439i;
import p182he.AbstractC9553a;

/* renamed from: fe.f */
/* loaded from: classes6.dex */
public interface InterfaceC9229f {
    InterfaceC9227d beginCollection(InterfaceC9129f interfaceC9129f, int i10);

    InterfaceC9227d beginStructure(InterfaceC9129f interfaceC9129f);

    void encodeBoolean(boolean z10);

    void encodeByte(byte b10);

    void encodeChar(char c10);

    void encodeDouble(double d10);

    void encodeEnum(InterfaceC9129f interfaceC9129f, int i10);

    void encodeFloat(float f10);

    InterfaceC9229f encodeInline(InterfaceC9129f interfaceC9129f);

    void encodeInt(int i10);

    void encodeLong(long j10);

    void encodeNotNullMark();

    void encodeNull();

    void encodeSerializableValue(InterfaceC5439i interfaceC5439i, Object obj);

    void encodeShort(short s10);

    void encodeString(String str);

    AbstractC9553a getSerializersModule();

    /* renamed from: fe.f$a */
    public static final class a {
        /* renamed from: a */
        public static InterfaceC9227d m18149a(InterfaceC9229f interfaceC9229f, InterfaceC9129f descriptor, int i10) {
            AbstractC9979u.m20294g(descriptor, "descriptor");
            return interfaceC9229f.beginStructure(descriptor);
        }

        /* renamed from: c */
        public static void m18151c(InterfaceC9229f interfaceC9229f, InterfaceC5439i serializer, Object obj) {
            AbstractC9979u.m20294g(serializer, "serializer");
            if (serializer.getDescriptor().mo17957b()) {
                interfaceC9229f.encodeSerializableValue(serializer, obj);
            } else if (obj == null) {
                interfaceC9229f.encodeNull();
            } else {
                interfaceC9229f.encodeNotNullMark();
                interfaceC9229f.encodeSerializableValue(serializer, obj);
            }
        }

        /* renamed from: d */
        public static void m18152d(InterfaceC9229f interfaceC9229f, InterfaceC5439i serializer, Object obj) {
            AbstractC9979u.m20294g(serializer, "serializer");
            serializer.serialize(interfaceC9229f, obj);
        }

        /* renamed from: b */
        public static void m18150b(InterfaceC9229f interfaceC9229f) {
        }
    }
}
