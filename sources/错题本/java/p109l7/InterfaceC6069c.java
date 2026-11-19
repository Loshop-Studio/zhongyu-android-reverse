package p109l7;

import kotlin.jvm.internal.AbstractC5830k;
import p084i7.InterfaceC5685a;
import p101k7.InterfaceC5765g;
import p133o7.AbstractC6281e;

/* renamed from: l7.c */
/* loaded from: classes4.dex */
public interface InterfaceC6069c {
    boolean decodeBooleanElement(InterfaceC5765g interfaceC5765g, int i);

    byte decodeByteElement(InterfaceC5765g interfaceC5765g, int i);

    char decodeCharElement(InterfaceC5765g interfaceC5765g, int i);

    default int decodeCollectionSize(InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return -1;
    }

    double decodeDoubleElement(InterfaceC5765g interfaceC5765g, int i);

    int decodeElementIndex(InterfaceC5765g interfaceC5765g);

    float decodeFloatElement(InterfaceC5765g interfaceC5765g, int i);

    InterfaceC6071e decodeInlineElement(InterfaceC5765g interfaceC5765g, int i);

    int decodeIntElement(InterfaceC5765g interfaceC5765g, int i);

    long decodeLongElement(InterfaceC5765g interfaceC5765g, int i);

    Object decodeNullableSerializableElement(InterfaceC5765g interfaceC5765g, int i, InterfaceC5685a interfaceC5685a, Object obj);

    default boolean decodeSequentially() {
        return false;
    }

    Object decodeSerializableElement(InterfaceC5765g interfaceC5765g, int i, InterfaceC5685a interfaceC5685a, Object obj);

    short decodeShortElement(InterfaceC5765g interfaceC5765g, int i);

    String decodeStringElement(InterfaceC5765g interfaceC5765g, int i);

    void endStructure(InterfaceC5765g interfaceC5765g);

    AbstractC6281e getSerializersModule();
}
