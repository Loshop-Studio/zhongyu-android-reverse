package okhttp3;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: okhttp3.i */
/* loaded from: classes4.dex */
public final class C6300i implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String a9 = (String) obj;
        String b6 = (String) obj2;
        AbstractC5830k.m5330g(a9, "a");
        AbstractC5830k.m5330g(b6, "b");
        int iMin = Math.min(a9.length(), b6.length());
        for (int i = 4; i < iMin; i++) {
            char cCharAt = a9.charAt(i);
            char cCharAt2 = b6.charAt(i);
            if (cCharAt != cCharAt2) {
                return AbstractC5830k.m5332i(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = a9.length();
        int length2 = b6.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
