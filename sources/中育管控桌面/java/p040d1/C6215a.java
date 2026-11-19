package p040d1;

import androidx.collection.SieveCacheKt;

/* renamed from: d1.a */
/* loaded from: classes3.dex */
public class C6215a {

    /* renamed from: a */
    public int f7503a;

    /* renamed from: b */
    public long f7504b;

    public C6215a(long j6, int i6) {
        this.f7504b = j6;
        this.f7503a = i6;
    }

    /* renamed from: b */
    public static C6215a m6319b(String str, int i6, int i7) {
        long j6;
        int i8;
        if (i6 >= i7) {
            return null;
        }
        long j7 = 0;
        int i9 = i6;
        while (i9 < i7) {
            char cCharAt = str.charAt(i9);
            if (cCharAt < '0' || cCharAt > '9') {
                if (cCharAt >= 'A' && cCharAt <= 'F') {
                    j6 = j7 * 16;
                    i8 = cCharAt - 'A';
                } else {
                    if (cCharAt < 'a' || cCharAt > 'f') {
                        break;
                    }
                    j6 = j7 * 16;
                    i8 = cCharAt - 'a';
                }
                j7 = j6 + i8 + 10;
            } else {
                j7 = (j7 * 16) + (cCharAt - '0');
            }
            if (j7 > 4294967295L) {
                return null;
            }
            i9++;
        }
        if (i9 == i6) {
            return null;
        }
        return new C6215a(j7, i9);
    }

    /* renamed from: c */
    public static C6215a m6320c(String str, int i6, int i7, boolean z6) {
        if (i6 >= i7) {
            return null;
        }
        boolean z7 = false;
        if (z6) {
            char cCharAt = str.charAt(i6);
            if (cCharAt == '+') {
                i6++;
            } else if (cCharAt == '-') {
                z7 = true;
                i6++;
            }
        }
        long j6 = 0;
        int i8 = i6;
        while (i8 < i7) {
            char cCharAt2 = str.charAt(i8);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                break;
            }
            if (z7) {
                j6 = (j6 * 10) - (cCharAt2 - '0');
                if (j6 < SieveCacheKt.NodeMetaAndPreviousMask) {
                    return null;
                }
            } else {
                j6 = (j6 * 10) + (cCharAt2 - '0');
                if (j6 > SieveCacheKt.NodeLinkMask) {
                    return null;
                }
            }
            i8++;
        }
        if (i8 == i6) {
            return null;
        }
        return new C6215a(j6, i8);
    }

    /* renamed from: a */
    public int m6321a() {
        return this.f7503a;
    }

    /* renamed from: d */
    public int m6322d() {
        return (int) this.f7504b;
    }
}
