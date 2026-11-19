package kotlinx.serialization.modules;

import kotlin.jvm.internal.AbstractC9979u;
import p280od.InterfaceC10469c;

/* loaded from: classes6.dex */
final class SerializerAlreadyRegisteredException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(String msg) {
        super(msg);
        AbstractC9979u.m20294g(msg, "msg");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(InterfaceC10469c baseClass, InterfaceC10469c concreteClass) {
        this("Serializer for " + concreteClass + " already registered in the scope of " + baseClass);
        AbstractC9979u.m20294g(baseClass, "baseClass");
        AbstractC9979u.m20294g(concreteClass, "concreteClass");
    }
}
