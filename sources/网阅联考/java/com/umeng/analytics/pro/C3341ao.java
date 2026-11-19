package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.ao */
/* loaded from: classes2.dex */
public class C3341ao {

    /* renamed from: a */
    private short[] f1815a;

    /* renamed from: b */
    private int f1816b = -1;

    public C3341ao(int i4) {
        this.f1815a = new short[i4];
    }

    /* renamed from: d */
    private void m2952d() {
        short[] sArr = this.f1815a;
        short[] sArr2 = new short[sArr.length * 2];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        this.f1815a = sArr2;
    }

    /* renamed from: a */
    public short m2953a() {
        short[] sArr = this.f1815a;
        int i4 = this.f1816b;
        this.f1816b = i4 - 1;
        return sArr[i4];
    }

    /* renamed from: b */
    public short m2955b() {
        return this.f1815a[this.f1816b];
    }

    /* renamed from: c */
    public void m2956c() {
        this.f1816b = -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<ShortStack vector:[");
        for (int i4 = 0; i4 < this.f1815a.length; i4++) {
            if (i4 != 0) {
                sb.append(" ");
            }
            if (i4 == this.f1816b) {
                sb.append(">>");
            }
            sb.append((int) this.f1815a[i4]);
            if (i4 == this.f1816b) {
                sb.append("<<");
            }
        }
        sb.append("]>");
        return sb.toString();
    }

    /* renamed from: a */
    public void m2954a(short s3) {
        if (this.f1815a.length == this.f1816b + 1) {
            m2952d();
        }
        short[] sArr = this.f1815a;
        int i4 = this.f1816b + 1;
        this.f1816b = i4;
        sArr[i4] = s3;
    }
}
