package p265nd;

import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: nd.g */
/* loaded from: classes6.dex */
public interface InterfaceC10402g {

    /* renamed from: nd.g$a */
    public static final class a {
        /* renamed from: a */
        public static boolean m21731a(InterfaceC10402g interfaceC10402g, Comparable value) {
            AbstractC9979u.m20294g(value, "value");
            return value.compareTo(interfaceC10402g.getStart()) >= 0 && value.compareTo(interfaceC10402g.getEndInclusive()) <= 0;
        }

        /* renamed from: b */
        public static boolean m21732b(InterfaceC10402g interfaceC10402g) {
            return interfaceC10402g.getStart().compareTo(interfaceC10402g.getEndInclusive()) > 0;
        }
    }

    Comparable getEndInclusive();

    Comparable getStart();

    boolean isEmpty();
}
