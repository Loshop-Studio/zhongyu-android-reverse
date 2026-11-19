package p195x;

import android.support.v4.media.AbstractC0037f;
import android.util.Log;
import androidx.core.view.ViewCompat;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: x.c */
/* loaded from: classes2.dex */
public final class C6739c {

    /* renamed from: b */
    public ByteBuffer f11378b;

    /* renamed from: c */
    public C6738b f11379c;

    /* renamed from: a */
    public final byte[] f11377a = new byte[256];

    /* renamed from: d */
    public int f11380d = 0;

    /* renamed from: a */
    public final boolean m6417a() {
        return this.f11379c.f11367b != 0;
    }

    /* renamed from: b */
    public final C6738b m6418b() {
        byte[] bArr;
        if (this.f11378b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m6417a()) {
            return this.f11379c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m6419c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f11379c.f11371f = this.f11378b.getShort();
            this.f11379c.f11372g = this.f11378b.getShort();
            int iM6419c = m6419c();
            C6738b c6738b = this.f11379c;
            c6738b.f11373h = (iM6419c & 128) != 0;
            c6738b.f11374i = (int) Math.pow(2.0d, (iM6419c & 7) + 1);
            this.f11379c.f11375j = m6419c();
            C6738b c6738b2 = this.f11379c;
            m6419c();
            c6738b2.getClass();
            if (this.f11379c.f11373h && !m6417a()) {
                C6738b c6738b3 = this.f11379c;
                c6738b3.f11366a = m6421e(c6738b3.f11374i);
                C6738b c6738b4 = this.f11379c;
                c6738b4.f11376k = c6738b4.f11366a[c6738b4.f11375j];
            }
        } else {
            this.f11379c.f11367b = 1;
        }
        if (!m6417a()) {
            boolean z8 = false;
            while (!z8 && !m6417a() && this.f11379c.f11368c <= Integer.MAX_VALUE) {
                int iM6419c2 = m6419c();
                if (iM6419c2 == 33) {
                    int iM6419c3 = m6419c();
                    if (iM6419c3 == 1) {
                        m6422f();
                    } else if (iM6419c3 == 249) {
                        this.f11379c.f11369d = new C6737a();
                        m6419c();
                        int iM6419c4 = m6419c();
                        C6737a c6737a = this.f11379c.f11369d;
                        int i8 = (iM6419c4 & 28) >> 2;
                        c6737a.f11361g = i8;
                        if (i8 == 0) {
                            c6737a.f11361g = 1;
                        }
                        c6737a.f11360f = (iM6419c4 & 1) != 0;
                        short s8 = this.f11378b.getShort();
                        if (s8 < 2) {
                            s8 = 10;
                        }
                        C6737a c6737a2 = this.f11379c.f11369d;
                        c6737a2.f11363i = s8 * 10;
                        c6737a2.f11362h = m6419c();
                        m6419c();
                    } else if (iM6419c3 == 254) {
                        m6422f();
                    } else if (iM6419c3 != 255) {
                        m6422f();
                    } else {
                        m6420d();
                        StringBuilder sb2 = new StringBuilder();
                        int i9 = 0;
                        while (true) {
                            bArr = this.f11377a;
                            if (i9 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i9]);
                            i9++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                m6420d();
                                if (bArr[0] == 1) {
                                    byte b6 = bArr[1];
                                    byte b9 = bArr[2];
                                    this.f11379c.getClass();
                                }
                                if (this.f11380d > 0) {
                                }
                            } while (!m6417a());
                        } else {
                            m6422f();
                        }
                    }
                } else if (iM6419c2 == 44) {
                    C6738b c6738b5 = this.f11379c;
                    if (c6738b5.f11369d == null) {
                        c6738b5.f11369d = new C6737a();
                    }
                    c6738b5.f11369d.f11355a = this.f11378b.getShort();
                    this.f11379c.f11369d.f11356b = this.f11378b.getShort();
                    this.f11379c.f11369d.f11357c = this.f11378b.getShort();
                    this.f11379c.f11369d.f11358d = this.f11378b.getShort();
                    int iM6419c5 = m6419c();
                    boolean z9 = (iM6419c5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iM6419c5 & 7) + 1);
                    C6737a c6737a3 = this.f11379c.f11369d;
                    c6737a3.f11359e = (iM6419c5 & 64) != 0;
                    if (z9) {
                        c6737a3.f11365k = m6421e(iPow);
                    } else {
                        c6737a3.f11365k = null;
                    }
                    this.f11379c.f11369d.f11364j = this.f11378b.position();
                    m6419c();
                    m6422f();
                    if (!m6417a()) {
                        C6738b c6738b6 = this.f11379c;
                        c6738b6.f11368c++;
                        c6738b6.f11370e.add(c6738b6.f11369d);
                    }
                } else if (iM6419c2 != 59) {
                    this.f11379c.f11367b = 1;
                } else {
                    z8 = true;
                }
            }
            C6738b c6738b7 = this.f11379c;
            if (c6738b7.f11368c < 0) {
                c6738b7.f11367b = 1;
            }
        }
        return this.f11379c;
    }

    /* renamed from: c */
    public final int m6419c() {
        try {
            return this.f11378b.get() & 255;
        } catch (Exception unused) {
            this.f11379c.f11367b = 1;
            return 0;
        }
    }

    /* renamed from: d */
    public final void m6420d() {
        int iM6419c = m6419c();
        this.f11380d = iM6419c;
        if (iM6419c <= 0) {
            return;
        }
        int i = 0;
        int i8 = 0;
        while (true) {
            try {
                i8 = this.f11380d;
                if (i >= i8) {
                    return;
                }
                i8 -= i;
                this.f11378b.get(this.f11377a, i, i8);
                i += i8;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbM99x = AbstractC0037f.m99x("Error Reading Block n: ", " count: ", i, " blockSize: ", i8);
                    sbM99x.append(this.f11380d);
                    Log.d("GifHeaderParser", sbM99x.toString(), e);
                }
                this.f11379c.f11367b = 1;
                return;
            }
        }
    }

    /* renamed from: e */
    public final int[] m6421e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f11378b.get(bArr);
            iArr = new int[256];
            int i8 = 0;
            int i9 = 0;
            while (i8 < i) {
                int i10 = bArr[i9] & 255;
                int i11 = i9 + 2;
                int i12 = bArr[i9 + 1] & 255;
                i9 += 3;
                int i13 = i8 + 1;
                iArr[i8] = (i12 << 8) | (i10 << 16) | ViewCompat.MEASURED_STATE_MASK | (bArr[i11] & 255);
                i8 = i13;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f11379c.f11367b = 1;
            return iArr;
        }
    }

    /* renamed from: f */
    public final void m6422f() {
        int iM6419c;
        do {
            iM6419c = m6419c();
            this.f11378b.position(Math.min(this.f11378b.position() + iM6419c, this.f11378b.limit()));
        } while (iM6419c > 0);
    }
}
