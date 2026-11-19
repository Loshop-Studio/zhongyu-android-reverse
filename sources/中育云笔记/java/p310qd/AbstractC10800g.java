package p310qd;

import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: qd.g */
/* loaded from: classes6.dex */
public abstract class AbstractC10800g {
    /* renamed from: b */
    public static final boolean m23189b(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC9979u.m20296i(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}
