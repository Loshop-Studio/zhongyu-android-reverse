package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.ao */
/* loaded from: classes.dex */
public class C1857ao {

    /* renamed from: a */
    private short[] f8407a;

    /* renamed from: b */
    private int f8408b = -1;

    public C1857ao(int i4) {
        this.f8407a = new short[i4];
    }

    /* renamed from: d */
    private void m6875d() {
        short[] sArr = this.f8407a;
        short[] sArr2 = new short[sArr.length * 2];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        this.f8407a = sArr2;
    }

    /* renamed from: a */
    public short m6876a() {
        short[] sArr = this.f8407a;
        int i4 = this.f8408b;
        this.f8408b = i4 - 1;
        return sArr[i4];
    }

    /* renamed from: b */
    public short m6878b() {
        return this.f8407a[this.f8408b];
    }

    /* renamed from: c */
    public void m6879c() {
        this.f8408b = -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<ShortStack vector:[");
        for (int i4 = 0; i4 < this.f8407a.length; i4++) {
            if (i4 != 0) {
                sb.append(" ");
            }
            if (i4 == this.f8408b) {
                sb.append(">>");
            }
            sb.append((int) this.f8407a[i4]);
            if (i4 == this.f8408b) {
                sb.append("<<");
            }
        }
        sb.append("]>");
        return sb.toString();
    }

    /* renamed from: a */
    public void m6877a(short s3) {
        if (this.f8407a.length == this.f8408b + 1) {
            m6875d();
        }
        short[] sArr = this.f8407a;
        int i4 = this.f8408b + 1;
        this.f8408b = i4;
        sArr[i4] = s3;
    }
}
