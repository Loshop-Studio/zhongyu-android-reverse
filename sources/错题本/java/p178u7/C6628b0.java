package p178u7;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: u7.b0 */
/* loaded from: classes4.dex */
public final class C6628b0 {

    /* renamed from: a */
    public int f11100a;

    /* renamed from: b */
    public final int[] f11101b = new int[10];

    /* renamed from: a */
    public final int m6262a() {
        if ((this.f11100a & 128) != 0) {
            return this.f11101b[7];
        }
        return 65535;
    }

    /* renamed from: b */
    public final void m6263b(C6628b0 other) {
        AbstractC5830k.m5330g(other, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & other.f11100a) != 0) {
                m6264c(i, other.f11101b[i]);
            }
        }
    }

    /* renamed from: c */
    public final void m6264c(int i, int i8) {
        if (i >= 0) {
            int[] iArr = this.f11101b;
            if (i >= iArr.length) {
                return;
            }
            this.f11100a = (1 << i) | this.f11100a;
            iArr[i] = i8;
        }
    }
}
