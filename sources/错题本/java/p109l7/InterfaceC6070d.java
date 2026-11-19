package p109l7;

import kotlin.jvm.internal.AbstractC5830k;
import p084i7.InterfaceC5689e;
import p101k7.InterfaceC5765g;

/* renamed from: l7.d */
/* loaded from: classes4.dex */
public interface InterfaceC6070d {
    void encodeBooleanElement(InterfaceC5765g interfaceC5765g, int i, boolean z8);

    void encodeByteElement(InterfaceC5765g interfaceC5765g, int i, byte b6);

    void encodeCharElement(InterfaceC5765g interfaceC5765g, int i, char c);

    void encodeDoubleElement(InterfaceC5765g interfaceC5765g, int i, double d9);

    void encodeFloatElement(InterfaceC5765g interfaceC5765g, int i, float f);

    InterfaceC6072f encodeInlineElement(InterfaceC5765g interfaceC5765g, int i);

    void encodeIntElement(InterfaceC5765g interfaceC5765g, int i, int i8);

    void encodeLongElement(InterfaceC5765g interfaceC5765g, int i, long j7);

    void encodeNullableSerializableElement(InterfaceC5765g interfaceC5765g, int i, InterfaceC5689e interfaceC5689e, Object obj);

    void encodeSerializableElement(InterfaceC5765g interfaceC5765g, int i, InterfaceC5689e interfaceC5689e, Object obj);

    void encodeShortElement(InterfaceC5765g interfaceC5765g, int i, short s8);

    void encodeStringElement(InterfaceC5765g interfaceC5765g, int i, String str);

    void endStructure(InterfaceC5765g interfaceC5765g);

    default boolean shouldEncodeElementDefault(InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return true;
    }
}
