package p114g2;

import com.umeng.analytics.pro.C6768ce;

/* renamed from: g2.c0 */
/* loaded from: classes4.dex */
public abstract class AbstractC8008c0 {
    /* renamed from: a */
    public abstract int mo12559a(byte[] bArr, int i9, int i10);

    /* renamed from: c */
    public void m12572c(byte[] bArr) {
        mo12560d(bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public abstract void mo12560d(byte[] bArr, int i9, int i10);

    /* renamed from: e */
    public int m12573e(byte[] bArr, int i9, int i10) throws C6768ce {
        int i11 = 0;
        while (i11 < i10) {
            int iMo12559a = mo12559a(bArr, i9 + i11, i10 - i11);
            if (iMo12559a <= 0) {
                throw new C6768ce("Cannot read. Remote side has closed. Tried to read " + i10 + " bytes, but only got " + i11 + " bytes. (This is often indicative of an internal error on the server side. Please check your server logs.)");
            }
            i11 += iMo12559a;
        }
        return i11;
    }

    /* renamed from: f */
    public byte[] mo12563f() {
        return null;
    }

    /* renamed from: g */
    public int mo12564g() {
        return 0;
    }

    /* renamed from: h */
    public int mo12565h() {
        return -1;
    }

    /* renamed from: b */
    public void mo12562b(int i9) {
    }
}
