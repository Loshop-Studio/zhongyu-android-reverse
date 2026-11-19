package p153fe;

import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5431a;
import p182he.AbstractC9553a;

/* renamed from: fe.c */
/* loaded from: classes6.dex */
public interface InterfaceC9226c {

    /* renamed from: fe.c$a */
    public static final class a {
        /* renamed from: a */
        public static int m18143a(InterfaceC9226c interfaceC9226c, InterfaceC9129f descriptor) {
            AbstractC9979u.m20294g(descriptor, "descriptor");
            return -1;
        }

        /* renamed from: b */
        public static boolean m18144b(InterfaceC9226c interfaceC9226c) {
            return false;
        }

        /* renamed from: c */
        public static /* synthetic */ Object m18145c(InterfaceC9226c interfaceC9226c, InterfaceC9129f interfaceC9129f, int i10, InterfaceC5431a interfaceC5431a, Object obj, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i11 & 8) != 0) {
                obj = null;
            }
            return interfaceC9226c.decodeSerializableElement(interfaceC9129f, i10, interfaceC5431a, obj);
        }
    }

    boolean decodeBooleanElement(InterfaceC9129f interfaceC9129f, int i10);

    byte decodeByteElement(InterfaceC9129f interfaceC9129f, int i10);

    char decodeCharElement(InterfaceC9129f interfaceC9129f, int i10);

    int decodeCollectionSize(InterfaceC9129f interfaceC9129f);

    double decodeDoubleElement(InterfaceC9129f interfaceC9129f, int i10);

    int decodeElementIndex(InterfaceC9129f interfaceC9129f);

    float decodeFloatElement(InterfaceC9129f interfaceC9129f, int i10);

    InterfaceC9228e decodeInlineElement(InterfaceC9129f interfaceC9129f, int i10);

    int decodeIntElement(InterfaceC9129f interfaceC9129f, int i10);

    long decodeLongElement(InterfaceC9129f interfaceC9129f, int i10);

    boolean decodeSequentially();

    Object decodeSerializableElement(InterfaceC9129f interfaceC9129f, int i10, InterfaceC5431a interfaceC5431a, Object obj);

    short decodeShortElement(InterfaceC9129f interfaceC9129f, int i10);

    String decodeStringElement(InterfaceC9129f interfaceC9129f, int i10);

    void endStructure(InterfaceC9129f interfaceC9129f);

    AbstractC9553a getSerializersModule();
}
