package anetwork.channel.util;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: anetwork.channel.util.a */
/* loaded from: classes3.dex */
public class C5137a {

    /* renamed from: a */
    private static AtomicInteger f2974a = new AtomicInteger(0);

    /* renamed from: a */
    public static String m2654a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(16);
        if (str != null) {
            sb2.append(str);
            sb2.append('.');
        }
        if (str2 != null) {
            sb2.append(str2);
            sb2.append(f2974a.incrementAndGet() & Integer.MAX_VALUE);
        }
        return sb2.toString();
    }
}
