package p153fe;

import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5439i;

/* renamed from: fe.d */
/* loaded from: classes6.dex */
public interface InterfaceC9227d {

    /* renamed from: fe.d$a */
    public static final class a {
        /* renamed from: a */
        public static boolean m18146a(InterfaceC9227d interfaceC9227d, InterfaceC9129f descriptor, int i10) {
            AbstractC9979u.m20294g(descriptor, "descriptor");
            return true;
        }
    }

    void encodeBooleanElement(InterfaceC9129f interfaceC9129f, int i10, boolean z10);

    void encodeByteElement(InterfaceC9129f interfaceC9129f, int i10, byte b10);

    void encodeCharElement(InterfaceC9129f interfaceC9129f, int i10, char c10);

    void encodeDoubleElement(InterfaceC9129f interfaceC9129f, int i10, double d10);

    void encodeFloatElement(InterfaceC9129f interfaceC9129f, int i10, float f10);

    InterfaceC9229f encodeInlineElement(InterfaceC9129f interfaceC9129f, int i10);

    void encodeIntElement(InterfaceC9129f interfaceC9129f, int i10, int i11);

    void encodeLongElement(InterfaceC9129f interfaceC9129f, int i10, long j10);

    void encodeSerializableElement(InterfaceC9129f interfaceC9129f, int i10, InterfaceC5439i interfaceC5439i, Object obj);

    void encodeShortElement(InterfaceC9129f interfaceC9129f, int i10, short s10);

    void encodeStringElement(InterfaceC9129f interfaceC9129f, int i10, String str);

    void endStructure(InterfaceC9129f interfaceC9129f);
}
