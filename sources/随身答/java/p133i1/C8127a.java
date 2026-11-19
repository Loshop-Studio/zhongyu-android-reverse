package p133i1;

import androidx.collection.SieveCacheKt;

/* renamed from: i1.a */
/* loaded from: classes3.dex */
public class C8127a {

    /* renamed from: a */
    public int f13896a;

    /* renamed from: b */
    public long f13897b;

    public C8127a(long j9, int i9) {
        this.f13897b = j9;
        this.f13896a = i9;
    }

    /* renamed from: b */
    public static C8127a m13019b(String str, int i9, int i10) {
        long j9;
        int i11;
        if (i9 >= i10) {
            return null;
        }
        long j10 = 0;
        int i12 = i9;
        while (i12 < i10) {
            char cCharAt = str.charAt(i12);
            if (cCharAt < '0' || cCharAt > '9') {
                if (cCharAt >= 'A' && cCharAt <= 'F') {
                    j9 = j10 * 16;
                    i11 = cCharAt - 'A';
                } else {
                    if (cCharAt < 'a' || cCharAt > 'f') {
                        break;
                    }
                    j9 = j10 * 16;
                    i11 = cCharAt - 'a';
                }
                j10 = j9 + i11 + 10;
            } else {
                j10 = (j10 * 16) + (cCharAt - '0');
            }
            if (j10 > 4294967295L) {
                return null;
            }
            i12++;
        }
        if (i12 == i9) {
            return null;
        }
        return new C8127a(j10, i12);
    }

    /* renamed from: c */
    public static C8127a m13020c(String str, int i9, int i10, boolean z9) {
        if (i9 >= i10) {
            return null;
        }
        boolean z10 = false;
        if (z9) {
            char cCharAt = str.charAt(i9);
            if (cCharAt == '+') {
                i9++;
            } else if (cCharAt == '-') {
                z10 = true;
                i9++;
            }
        }
        long j9 = 0;
        int i11 = i9;
        while (i11 < i10) {
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                break;
            }
            if (z10) {
                j9 = (j9 * 10) - (cCharAt2 - '0');
                if (j9 < SieveCacheKt.NodeMetaAndPreviousMask) {
                    return null;
                }
            } else {
                j9 = (j9 * 10) + (cCharAt2 - '0');
                if (j9 > SieveCacheKt.NodeLinkMask) {
                    return null;
                }
            }
            i11++;
        }
        if (i11 == i9) {
            return null;
        }
        return new C8127a(j9, i11);
    }

    /* renamed from: a */
    public int m13021a() {
        return this.f13896a;
    }

    /* renamed from: d */
    public int m13022d() {
        return (int) this.f13897b;
    }
}
