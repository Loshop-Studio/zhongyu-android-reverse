package kotlinx.serialization.json.internal;

import p016b0.C3080k0;
import p041d2.C5413c;

/* renamed from: kotlinx.serialization.json.internal.g */
/* loaded from: classes4.dex */
public final class C6026g extends C3080k0 {

    /* renamed from: c */
    public final boolean f9551c;

    public C6026g(C5413c c5413c, boolean z8) {
        super(c5413c);
        this.f9551c = z8;
    }

    @Override // p016b0.C3080k0
    /* renamed from: b */
    public final void mo2032b(byte b6) {
        if (this.f9551c) {
            mo2038h(String.valueOf(b6 & 255));
        } else {
            m2036f(String.valueOf(b6 & 255));
        }
    }

    @Override // p016b0.C3080k0
    /* renamed from: d */
    public final void mo2034d(int i) {
        if (this.f9551c) {
            mo2038h(Long.toString(i & 4294967295L, 10));
        } else {
            m2036f(Long.toString(i & 4294967295L, 10));
        }
    }

    @Override // p016b0.C3080k0
    /* renamed from: e */
    public final void mo2035e(long j7) {
        int i = 63;
        String str = "0";
        if (this.f9551c) {
            if (j7 != 0) {
                if (j7 > 0) {
                    str = Long.toString(j7, 10);
                } else {
                    char[] cArr = new char[64];
                    long j8 = (j7 >>> 1) / 5;
                    long j9 = 10;
                    cArr[63] = Character.forDigit((int) (j7 - (j8 * j9)), 10);
                    while (j8 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j8 % j9), 10);
                        j8 /= j9;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            mo2038h(str);
            return;
        }
        if (j7 != 0) {
            if (j7 > 0) {
                str = Long.toString(j7, 10);
            } else {
                char[] cArr2 = new char[64];
                long j10 = (j7 >>> 1) / 5;
                long j11 = 10;
                cArr2[63] = Character.forDigit((int) (j7 - (j10 * j11)), 10);
                while (j10 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j10 % j11), 10);
                    j10 /= j11;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        m2036f(str);
    }

    @Override // p016b0.C3080k0
    /* renamed from: g */
    public final void mo2037g(short s8) {
        if (this.f9551c) {
            mo2038h(String.valueOf(s8 & 65535));
        } else {
            m2036f(String.valueOf(s8 & 65535));
        }
    }
}
