package anet.channel.util;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: anet.channel.util.i */
/* loaded from: classes3.dex */
public class C5091i {

    /* renamed from: a */
    private static AtomicInteger f2767a = new AtomicInteger();

    /* renamed from: a */
    public static String m2554a(String str) {
        if (f2767a.get() == Integer.MAX_VALUE) {
            f2767a.set(0);
        }
        return !TextUtils.isEmpty(str) ? StringUtils.concatString(str, ".AWCN", String.valueOf(f2767a.incrementAndGet())) : StringUtils.concatString("AWCN", String.valueOf(f2767a.incrementAndGet()));
    }
}
