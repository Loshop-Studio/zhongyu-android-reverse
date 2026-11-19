package p077d8;

import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: d8.c */
/* loaded from: classes5.dex */
public interface InterfaceC8318c {

    /* renamed from: d8.c$a */
    public static final class a {
        /* renamed from: a */
        public static boolean m13494a(InterfaceC8318c interfaceC8318c, Comparable value) {
            AbstractC9133u.m16133g(value, "value");
            return value.compareTo(interfaceC8318c.getStart()) >= 0 && value.compareTo(interfaceC8318c.getEndInclusive()) <= 0;
        }

        /* renamed from: b */
        public static boolean m13495b(InterfaceC8318c interfaceC8318c) {
            return interfaceC8318c.getStart().compareTo(interfaceC8318c.getEndInclusive()) > 0;
        }
    }

    Comparable getEndInclusive();

    Comparable getStart();

    boolean isEmpty();
}
