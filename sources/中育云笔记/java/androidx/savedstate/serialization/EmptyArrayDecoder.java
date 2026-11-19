package androidx.savedstate.serialization;

import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p153fe.AbstractC9224a;
import p182he.AbstractC9553a;
import p182he.AbstractC9554b;

/* loaded from: classes3.dex */
final class EmptyArrayDecoder extends AbstractC9224a {
    public static final EmptyArrayDecoder INSTANCE = new EmptyArrayDecoder();
    private static final AbstractC9553a serializersModule = AbstractC9554b.m18782a();

    private EmptyArrayDecoder() {
    }

    @Override // p153fe.InterfaceC9226c
    public int decodeElementIndex(InterfaceC9129f descriptor) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        return -1;
    }

    @Override // p153fe.InterfaceC9226c
    public AbstractC9553a getSerializersModule() {
        return serializersModule;
    }
}
