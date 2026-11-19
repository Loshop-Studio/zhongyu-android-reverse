package p112g0;

import android.util.Log;
import androidx.core.view.ViewCompat;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.UByte;

/* renamed from: g0.d */
/* loaded from: classes3.dex */
public class C7986d {

    /* renamed from: b */
    public ByteBuffer f13442b;

    /* renamed from: c */
    public C7985c f13443c;

    /* renamed from: a */
    public final byte[] f13441a = new byte[256];

    /* renamed from: d */
    public int f13444d = 0;

    /* renamed from: a */
    public void m12520a() {
        this.f13442b = null;
        this.f13443c = null;
    }

    /* renamed from: b */
    public final boolean m12521b() {
        return this.f13443c.f13429b != 0;
    }

    /* renamed from: c */
    public C7985c m12522c() {
        if (this.f13442b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m12521b()) {
            return this.f13443c;
        }
        m12530k();
        if (!m12521b()) {
            m12527h();
            C7985c c7985c = this.f13443c;
            if (c7985c.f13430c < 0) {
                c7985c.f13429b = 1;
            }
        }
        return this.f13443c;
    }

    /* renamed from: d */
    public final int m12523d() {
        try {
            return this.f13442b.get() & UByte.MAX_VALUE;
        } catch (Exception unused) {
            this.f13443c.f13429b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    public final void m12524e() {
        this.f13443c.f13431d.f13417a = m12533n();
        this.f13443c.f13431d.f13418b = m12533n();
        this.f13443c.f13431d.f13419c = m12533n();
        this.f13443c.f13431d.f13420d = m12533n();
        int iM12523d = m12523d();
        boolean z9 = (iM12523d & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iM12523d & 7) + 1);
        C7984b c7984b = this.f13443c.f13431d;
        c7984b.f13421e = (iM12523d & 64) != 0;
        if (z9) {
            c7984b.f13427k = m12526g(iPow);
        } else {
            c7984b.f13427k = null;
        }
        this.f13443c.f13431d.f13426j = this.f13442b.position();
        m12537r();
        if (m12521b()) {
            return;
        }
        C7985c c7985c = this.f13443c;
        c7985c.f13430c++;
        c7985c.f13432e.add(c7985c.f13431d);
    }

    /* renamed from: f */
    public final void m12525f() {
        int iM12523d = m12523d();
        this.f13444d = iM12523d;
        if (iM12523d <= 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            try {
                int i10 = this.f13444d;
                if (i9 >= i10) {
                    return;
                }
                int i11 = i10 - i9;
                this.f13442b.get(this.f13441a, i9, i11);
                i9 += i11;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.f13443c.f13429b = 1;
                return;
            }
        }
    }

    /* renamed from: g */
    public final int[] m12526g(int i9) {
        byte[] bArr = new byte[i9 * 3];
        int[] iArr = null;
        try {
            this.f13442b.get(bArr);
            iArr = new int[256];
            int i10 = 0;
            int i11 = 0;
            while (i10 < i9) {
                int i12 = bArr[i11] & UByte.MAX_VALUE;
                int i13 = i11 + 2;
                int i14 = bArr[i11 + 1] & UByte.MAX_VALUE;
                i11 += 3;
                int i15 = i10 + 1;
                iArr[i10] = (i14 << 8) | (i12 << 16) | ViewCompat.MEASURED_STATE_MASK | (bArr[i13] & UByte.MAX_VALUE);
                i10 = i15;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f13443c.f13429b = 1;
            return iArr;
        }
    }

    /* renamed from: h */
    public final void m12527h() {
        m12528i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    public final void m12528i(int i9) {
        boolean z9 = false;
        while (!z9 && !m12521b() && this.f13443c.f13430c <= i9) {
            int iM12523d = m12523d();
            if (iM12523d == 33) {
                int iM12523d2 = m12523d();
                if (iM12523d2 == 1) {
                    m12536q();
                } else if (iM12523d2 == 249) {
                    this.f13443c.f13431d = new C7984b();
                    m12529j();
                } else if (iM12523d2 == 254) {
                    m12536q();
                } else if (iM12523d2 != 255) {
                    m12536q();
                } else {
                    m12525f();
                    StringBuilder sb = new StringBuilder();
                    for (int i10 = 0; i10 < 11; i10++) {
                        sb.append((char) this.f13441a[i10]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m12532m();
                    } else {
                        m12536q();
                    }
                }
            } else if (iM12523d == 44) {
                C7985c c7985c = this.f13443c;
                if (c7985c.f13431d == null) {
                    c7985c.f13431d = new C7984b();
                }
                m12524e();
            } else if (iM12523d != 59) {
                this.f13443c.f13429b = 1;
            } else {
                z9 = true;
            }
        }
    }

    /* renamed from: j */
    public final void m12529j() {
        m12523d();
        int iM12523d = m12523d();
        C7984b c7984b = this.f13443c.f13431d;
        int i9 = (iM12523d & 28) >> 2;
        c7984b.f13423g = i9;
        if (i9 == 0) {
            c7984b.f13423g = 1;
        }
        c7984b.f13422f = (iM12523d & 1) != 0;
        int iM12533n = m12533n();
        if (iM12533n < 2) {
            iM12533n = 10;
        }
        C7984b c7984b2 = this.f13443c.f13431d;
        c7984b2.f13425i = iM12533n * 10;
        c7984b2.f13424h = m12523d();
        m12523d();
    }

    /* renamed from: k */
    public final void m12530k() {
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < 6; i9++) {
            sb.append((char) m12523d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f13443c.f13429b = 1;
            return;
        }
        m12531l();
        if (!this.f13443c.f13435h || m12521b()) {
            return;
        }
        C7985c c7985c = this.f13443c;
        c7985c.f13428a = m12526g(c7985c.f13436i);
        C7985c c7985c2 = this.f13443c;
        c7985c2.f13439l = c7985c2.f13428a[c7985c2.f13437j];
    }

    /* renamed from: l */
    public final void m12531l() {
        this.f13443c.f13433f = m12533n();
        this.f13443c.f13434g = m12533n();
        int iM12523d = m12523d();
        C7985c c7985c = this.f13443c;
        c7985c.f13435h = (iM12523d & 128) != 0;
        c7985c.f13436i = (int) Math.pow(2.0d, (iM12523d & 7) + 1);
        this.f13443c.f13437j = m12523d();
        this.f13443c.f13438k = m12523d();
    }

    /* renamed from: m */
    public final void m12532m() {
        do {
            m12525f();
            byte[] bArr = this.f13441a;
            if (bArr[0] == 1) {
                this.f13443c.f13440m = ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE);
            }
            if (this.f13444d <= 0) {
                return;
            }
        } while (!m12521b());
    }

    /* renamed from: n */
    public final int m12533n() {
        return this.f13442b.getShort();
    }

    /* renamed from: o */
    public final void m12534o() {
        this.f13442b = null;
        Arrays.fill(this.f13441a, (byte) 0);
        this.f13443c = new C7985c();
        this.f13444d = 0;
    }

    /* renamed from: p */
    public C7986d m12535p(ByteBuffer byteBuffer) {
        m12534o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f13442b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f13442b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: q */
    public final void m12536q() {
        int iM12523d;
        do {
            iM12523d = m12523d();
            this.f13442b.position(Math.min(this.f13442b.position() + iM12523d, this.f13442b.limit()));
        } while (iM12523d > 0);
    }

    /* renamed from: r */
    public final void m12537r() {
        m12523d();
        m12536q();
    }
}
