package p000a.p022f.p025b;

import io.github.inflationx.calligraphy3.BuildConfig;
import java.util.Arrays;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.f.b.g */
/* loaded from: classes.dex */
public class C0145g {

    /* renamed from: m */
    public static int f1002m = 1;

    /* renamed from: a */
    public boolean f1003a;

    /* renamed from: e */
    public float f1007e;

    /* renamed from: i */
    public a f1011i;

    /* renamed from: b */
    public int f1004b = -1;

    /* renamed from: c */
    public int f1005c = -1;

    /* renamed from: d */
    public int f1006d = 0;

    /* renamed from: f */
    public boolean f1008f = false;

    /* renamed from: g */
    public float[] f1009g = new float[9];

    /* renamed from: h */
    public float[] f1010h = new float[9];

    /* renamed from: j */
    public C0140b[] f1012j = new C0140b[16];

    /* renamed from: k */
    public int f1013k = 0;

    /* renamed from: l */
    public int f1014l = 0;

    /* renamed from: a.f.b.g$a */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C0145g(a aVar) {
        this.f1011i = aVar;
    }

    /* renamed from: a */
    public final void m573a(C0140b c0140b) {
        int i = 0;
        while (true) {
            int i2 = this.f1013k;
            if (i >= i2) {
                C0140b[] c0140bArr = this.f1012j;
                if (i2 >= c0140bArr.length) {
                    this.f1012j = (C0140b[]) Arrays.copyOf(c0140bArr, c0140bArr.length * 2);
                }
                C0140b[] c0140bArr2 = this.f1012j;
                int i3 = this.f1013k;
                c0140bArr2[i3] = c0140b;
                this.f1013k = i3 + 1;
                return;
            }
            if (this.f1012j[i] == c0140b) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: b */
    public final void m574b(C0140b c0140b) {
        int i = this.f1013k;
        int i2 = 0;
        while (i2 < i) {
            if (this.f1012j[i2] == c0140b) {
                while (i2 < i - 1) {
                    C0140b[] c0140bArr = this.f1012j;
                    int i3 = i2 + 1;
                    c0140bArr[i2] = c0140bArr[i3];
                    i2 = i3;
                }
                this.f1013k--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: c */
    public void m575c() {
        this.f1011i = a.UNKNOWN;
        this.f1006d = 0;
        this.f1004b = -1;
        this.f1005c = -1;
        this.f1007e = 0.0f;
        this.f1008f = false;
        int i = this.f1013k;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1012j[i2] = null;
        }
        this.f1013k = 0;
        this.f1014l = 0;
        this.f1003a = false;
        Arrays.fill(this.f1010h, 0.0f);
    }

    /* renamed from: d */
    public void m576d(C0142d c0142d, float f2) {
        this.f1007e = f2;
        this.f1008f = true;
        int i = this.f1013k;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1012j[i2].m547k(this, false);
        }
        this.f1013k = 0;
    }

    /* renamed from: e */
    public final void m577e(C0140b c0140b) {
        int i = this.f1013k;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1012j[i2].mo548l(c0140b, false);
        }
        this.f1013k = 0;
    }

    public String toString() {
        StringBuilder sbM2079g = C0561a.m2079g(BuildConfig.FLAVOR);
        sbM2079g.append(this.f1004b);
        return sbM2079g.toString();
    }
}
