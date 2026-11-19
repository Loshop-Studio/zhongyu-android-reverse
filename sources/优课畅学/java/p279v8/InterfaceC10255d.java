package p279v8;

import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10059i;
import p268u8.InterfaceC10210f;

/* renamed from: v8.d */
/* loaded from: classes5.dex */
public interface InterfaceC10255d {

    /* renamed from: v8.d$a */
    public static final class a {
        /* renamed from: a */
        public static boolean m19209a(InterfaceC10255d interfaceC10255d, InterfaceC10210f descriptor, int i10) {
            AbstractC9133u.m16133g(descriptor, "descriptor");
            return true;
        }
    }

    void encodeBooleanElement(InterfaceC10210f interfaceC10210f, int i10, boolean z10);

    void encodeByteElement(InterfaceC10210f interfaceC10210f, int i10, byte b10);

    void encodeCharElement(InterfaceC10210f interfaceC10210f, int i10, char c10);

    void encodeDoubleElement(InterfaceC10210f interfaceC10210f, int i10, double d10);

    void encodeFloatElement(InterfaceC10210f interfaceC10210f, int i10, float f10);

    InterfaceC10257f encodeInlineElement(InterfaceC10210f interfaceC10210f, int i10);

    void encodeIntElement(InterfaceC10210f interfaceC10210f, int i10, int i11);

    void encodeLongElement(InterfaceC10210f interfaceC10210f, int i10, long j10);

    void encodeSerializableElement(InterfaceC10210f interfaceC10210f, int i10, InterfaceC10059i interfaceC10059i, Object obj);

    void encodeShortElement(InterfaceC10210f interfaceC10210f, int i10, short s10);

    void encodeStringElement(InterfaceC10210f interfaceC10210f, int i10, String str);

    void endStructure(InterfaceC10210f interfaceC10210f);
}
