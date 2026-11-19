package p113g8;

import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: g8.g */
/* loaded from: classes5.dex */
public abstract class AbstractC8668g {
    /* renamed from: b */
    public static final boolean m14050b(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC9133u.m16135i(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}
