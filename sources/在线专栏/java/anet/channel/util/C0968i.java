package anet.channel.util;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: anet.channel.util.i */
/* loaded from: classes.dex */
public class C0968i {

    /* renamed from: a */
    private static AtomicInteger f5489a = new AtomicInteger();

    /* renamed from: a */
    public static String m4663a(String str) {
        if (f5489a.get() == Integer.MAX_VALUE) {
            f5489a.set(0);
        }
        return !TextUtils.isEmpty(str) ? StringUtils.concatString(str, ".AWCN", String.valueOf(f5489a.incrementAndGet())) : StringUtils.concatString("AWCN", String.valueOf(f5489a.incrementAndGet()));
    }
}
