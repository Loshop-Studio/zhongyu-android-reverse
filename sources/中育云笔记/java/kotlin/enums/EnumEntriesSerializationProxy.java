package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {

    /* renamed from: d */
    public static final C9952a f23372d = new C9952a(null);

    /* renamed from: c */
    public final Class f23373c;

    /* renamed from: kotlin.enums.EnumEntriesSerializationProxy$a */
    public static final class C9952a {
        public /* synthetic */ C9952a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C9952a() {
        }
    }

    public EnumEntriesSerializationProxy(Enum[] entries) {
        AbstractC9979u.m20294g(entries, "entries");
        Class<?> componentType = entries.getClass().getComponentType();
        AbstractC9979u.m20291d(componentType);
        this.f23373c = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f23373c.getEnumConstants();
        AbstractC9979u.m20293f(enumConstants, "getEnumConstants(...)");
        return AbstractC9953a.m20230a((Enum[]) enumConstants);
    }
}
