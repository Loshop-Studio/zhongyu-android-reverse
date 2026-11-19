package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes5.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {

    /* renamed from: b */
    public static final C9107a f17459b = new C9107a(null);

    /* renamed from: a */
    public final Class f17460a;

    /* renamed from: kotlin.enums.EnumEntriesSerializationProxy$a */
    public static final class C9107a {
        public /* synthetic */ C9107a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C9107a() {
        }
    }

    public EnumEntriesSerializationProxy(Enum[] entries) {
        AbstractC9133u.m16133g(entries, "entries");
        Class<?> componentType = entries.getClass().getComponentType();
        AbstractC9133u.m16130d(componentType);
        this.f17460a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f17460a.getEnumConstants();
        AbstractC9133u.m16132f(enumConstants, "getEnumConstants(...)");
        return AbstractC9108a.m16085a((Enum[]) enumConstants);
    }
}
