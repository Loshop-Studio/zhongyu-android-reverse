package p279v8;

import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10051a;
import p268u8.InterfaceC10210f;
import p301x8.AbstractC10583a;

/* renamed from: v8.c */
/* loaded from: classes5.dex */
public interface InterfaceC10254c {

    /* renamed from: v8.c$a */
    public static final class a {
        /* renamed from: a */
        public static int m19206a(InterfaceC10254c interfaceC10254c, InterfaceC10210f descriptor) {
            AbstractC9133u.m16133g(descriptor, "descriptor");
            return -1;
        }

        /* renamed from: b */
        public static boolean m19207b(InterfaceC10254c interfaceC10254c) {
            return false;
        }

        /* renamed from: c */
        public static /* synthetic */ Object m19208c(InterfaceC10254c interfaceC10254c, InterfaceC10210f interfaceC10210f, int i10, InterfaceC10051a interfaceC10051a, Object obj, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i11 & 8) != 0) {
                obj = null;
            }
            return interfaceC10254c.decodeSerializableElement(interfaceC10210f, i10, interfaceC10051a, obj);
        }
    }

    boolean decodeBooleanElement(InterfaceC10210f interfaceC10210f, int i10);

    byte decodeByteElement(InterfaceC10210f interfaceC10210f, int i10);

    char decodeCharElement(InterfaceC10210f interfaceC10210f, int i10);

    int decodeCollectionSize(InterfaceC10210f interfaceC10210f);

    double decodeDoubleElement(InterfaceC10210f interfaceC10210f, int i10);

    int decodeElementIndex(InterfaceC10210f interfaceC10210f);

    float decodeFloatElement(InterfaceC10210f interfaceC10210f, int i10);

    InterfaceC10256e decodeInlineElement(InterfaceC10210f interfaceC10210f, int i10);

    int decodeIntElement(InterfaceC10210f interfaceC10210f, int i10);

    long decodeLongElement(InterfaceC10210f interfaceC10210f, int i10);

    boolean decodeSequentially();

    Object decodeSerializableElement(InterfaceC10210f interfaceC10210f, int i10, InterfaceC10051a interfaceC10051a, Object obj);

    short decodeShortElement(InterfaceC10210f interfaceC10210f, int i10);

    String decodeStringElement(InterfaceC10210f interfaceC10210f, int i10);

    void endStructure(InterfaceC10210f interfaceC10210f);

    AbstractC10583a getSerializersModule();
}
