package anetwork.channel.util;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: anetwork.channel.util.a */
/* loaded from: classes.dex */
public class C1014a {

    /* renamed from: a */
    private static AtomicInteger f5696a = new AtomicInteger(0);

    /* renamed from: a */
    public static String m4763a(String str, String str2) {
        StringBuilder sb = new StringBuilder(16);
        if (str != null) {
            sb.append(str);
            sb.append('.');
        }
        if (str2 != null) {
            sb.append(str2);
            sb.append(f5696a.incrementAndGet() & Integer.MAX_VALUE);
        }
        return sb.toString();
    }
}
