package kotlinx.serialization.modules;

import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;

/* loaded from: classes5.dex */
final class SerializerAlreadyRegisteredException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(String msg) {
        super(msg);
        AbstractC9133u.m16133g(msg, "msg");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(InterfaceC8375c baseClass, InterfaceC8375c concreteClass) {
        this("Serializer for " + concreteClass + " already registered in the scope of " + baseClass);
        AbstractC9133u.m16133g(baseClass, "baseClass");
        AbstractC9133u.m16133g(concreteClass, "concreteClass");
    }
}
