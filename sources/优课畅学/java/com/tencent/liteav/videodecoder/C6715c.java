package com.tencent.liteav.videodecoder;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.tencent.liteav.videodecoder.c */
/* loaded from: classes4.dex */
class C6715c {

    /* renamed from: b */
    int f6347b;

    /* renamed from: c */
    private InputStream f6348c;

    /* renamed from: d */
    private int f6349d;

    /* renamed from: e */
    private int f6350e;

    /* renamed from: f */
    private final OutputStream f6351f;

    /* renamed from: h */
    private int f6353h;

    /* renamed from: a */
    protected C6713a f6346a = new C6713a(50);

    /* renamed from: g */
    private int[] f6352g = new int[8];

    public C6715c(InputStream inputStream, OutputStream outputStream) {
        this.f6348c = inputStream;
        this.f6351f = outputStream;
        this.f6349d = inputStream.read();
        this.f6350e = inputStream.read();
    }

    /* renamed from: a */
    private void m5679a(String str, String str2) {
    }

    /* renamed from: d */
    private void m5680d() {
        this.f6349d = this.f6350e;
        this.f6350e = this.f6348c.read();
        this.f6347b = 0;
    }

    /* renamed from: e */
    private int m5681e() {
        int i10 = 0;
        while (m5691b(true) == 0) {
            i10++;
        }
        if (i10 <= 0) {
            return 0;
        }
        return (int) (((1 << i10) - 1) + m5685a(i10));
    }

    /* renamed from: f */
    private void m5682f() throws IOException {
        int i10 = 0;
        while (m5691b(true) == 0) {
            i10++;
        }
        if (i10 > 0) {
            m5693b(i10);
        }
    }

    /* renamed from: g */
    private void m5683g() throws IOException {
        int[] iArr = this.f6352g;
        this.f6351f.write(iArr[7] | (iArr[0] << 7) | (iArr[1] << 6) | (iArr[2] << 5) | (iArr[3] << 4) | (iArr[4] << 3) | (iArr[5] << 2) | (iArr[6] << 1));
    }

    /* renamed from: b */
    public int m5691b(boolean z10) throws IOException {
        if (this.f6347b == 8) {
            m5680d();
            if (this.f6349d == -1) {
                return -1;
            }
        }
        int i10 = this.f6349d;
        int i11 = this.f6347b;
        int i12 = (i10 >> (7 - i11)) & 1;
        this.f6347b = i11 + 1;
        if (z10 && this.f6351f != null) {
            m5700d(i12);
        }
        return i12;
    }

    /* renamed from: c */
    public int m5696c(String str) {
        int iM5681e = m5681e();
        int i10 = ((iM5681e >> 1) + (iM5681e & 1)) * ((r1 << 1) - 1);
        m5679a(str, String.valueOf(i10));
        return i10;
    }

    /* renamed from: a */
    public boolean m5690a(boolean z10) {
        return m5691b(z10) == 1;
    }

    /* renamed from: a */
    public long m5685a(int i10) {
        if (i10 > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long jM5691b = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            jM5691b = (jM5691b << 1) | m5691b(true);
        }
        return jM5691b;
    }

    /* renamed from: c */
    public void m5698c(int i10) {
        int[] iArr = new int[i10];
        int iM5696c = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i10; i12++) {
            if (iM5696c != 0) {
                iM5696c = ((m5696c("deltaScale") + i11) + 256) % 256;
            }
            if (iM5696c != 0) {
                i11 = iM5696c;
            }
            iArr[i12] = i11;
        }
    }

    /* renamed from: e */
    public boolean m5703e(String str) {
        boolean zM5690a = m5690a(false);
        m5679a(str, zM5690a ? "1" : "0");
        return zM5690a;
    }

    /* renamed from: d */
    public boolean m5701d(String str) {
        boolean zM5690a = m5690a(true);
        m5679a(str, zM5690a ? "1" : "0");
        return zM5690a;
    }

    /* renamed from: a */
    public long m5686a(int i10, String str) {
        long jM5685a = m5685a(i10);
        m5679a(str, String.valueOf(jM5685a));
        return jM5685a;
    }

    /* renamed from: e */
    public void m5702e(int i10) throws IOException {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= 15) {
                break;
            }
            int i14 = (1 << i12) + i13;
            if (i10 < i14) {
                i11 = i12;
                break;
            } else {
                i12++;
                i13 = i14;
            }
        }
        m5688a(0L, i11);
        m5700d(1);
        m5688a(i10 - i13, i11);
    }

    /* renamed from: d */
    public void m5700d(int i10) throws IOException {
        if (this.f6353h == 8) {
            this.f6353h = 0;
            m5683g();
        }
        int[] iArr = this.f6352g;
        int i11 = this.f6353h;
        this.f6353h = i11 + 1;
        iArr[i11] = i10;
    }

    /* renamed from: a */
    public int m5684a(String str) {
        int iM5681e = m5681e();
        m5679a(str, String.valueOf(iM5681e));
        return iM5681e;
    }

    /* renamed from: c */
    public void m5699c(int i10, String str) throws IOException {
        m5702e(i10);
    }

    /* renamed from: b */
    public void m5693b(int i10) throws IOException {
        if (i10 > 64) {
            throw new IllegalArgumentException("Can not skip more then 64 bit");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            m5691b(true);
        }
    }

    /* renamed from: c */
    public void m5697c() throws IOException {
        m5700d(1);
        m5692b();
        m5687a();
    }

    /* renamed from: a */
    public void m5687a() throws IOException {
        for (int i10 = this.f6353h; i10 < 8; i10++) {
            this.f6352g[i10] = 0;
        }
        this.f6353h = 0;
        m5683g();
    }

    /* renamed from: b */
    public void m5694b(int i10, String str) throws IOException {
        m5693b(i10);
        m5679a(str, "skip NBits");
    }

    /* renamed from: b */
    public void m5695b(String str) throws IOException {
        m5682f();
        m5679a(str, "skip UE");
    }

    /* renamed from: a */
    public void m5688a(long j10, int i10) throws IOException {
        for (int i11 = 0; i11 < i10; i11++) {
            m5700d(((int) (j10 >> ((i10 - i11) - 1))) & 1);
        }
    }

    /* renamed from: a */
    public void m5689a(boolean z10, String str) throws IOException {
        m5700d(z10 ? 1 : 0);
    }

    /* renamed from: b */
    public void m5692b() throws IOException {
        m5688a(0L, 8 - this.f6353h);
    }
}
