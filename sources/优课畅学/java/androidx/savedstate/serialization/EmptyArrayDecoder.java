package androidx.savedstate.serialization;

import kotlin.jvm.internal.AbstractC9133u;
import p268u8.InterfaceC10210f;
import p279v8.AbstractC10252a;
import p301x8.AbstractC10583a;
import p301x8.AbstractC10584b;

/* loaded from: classes3.dex */
final class EmptyArrayDecoder extends AbstractC10252a {
    public static final EmptyArrayDecoder INSTANCE = new EmptyArrayDecoder();
    private static final AbstractC10583a serializersModule = AbstractC10584b.m19742a();

    private EmptyArrayDecoder() {
    }

    @Override // p279v8.InterfaceC10254c
    public int decodeElementIndex(InterfaceC10210f descriptor) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        return -1;
    }

    @Override // p279v8.InterfaceC10254c
    public AbstractC10583a getSerializersModule() {
        return serializersModule;
    }
}
