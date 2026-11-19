package p046e0;

import android.util.Log;
import androidx.core.view.ViewCompat;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.UByte;

/* renamed from: e0.d */
/* loaded from: classes3.dex */
public class C6259d {

    /* renamed from: b */
    public ByteBuffer f7591b;

    /* renamed from: c */
    public C6258c f7592c;

    /* renamed from: a */
    public final byte[] f7590a = new byte[256];

    /* renamed from: d */
    public int f7593d = 0;

    /* renamed from: a */
    public void m6369a() {
        this.f7591b = null;
        this.f7592c = null;
    }

    /* renamed from: b */
    public final boolean m6370b() {
        return this.f7592c.f7578b != 0;
    }

    /* renamed from: c */
    public C6258c m6371c() {
        if (this.f7591b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m6370b()) {
            return this.f7592c;
        }
        m6379k();
        if (!m6370b()) {
            m6376h();
            C6258c c6258c = this.f7592c;
            if (c6258c.f7579c < 0) {
                c6258c.f7578b = 1;
            }
        }
        return this.f7592c;
    }

    /* renamed from: d */
    public final int m6372d() {
        try {
            return this.f7591b.get() & UByte.MAX_VALUE;
        } catch (Exception unused) {
            this.f7592c.f7578b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    public final void m6373e() {
        this.f7592c.f7580d.f7566a = m6382n();
        this.f7592c.f7580d.f7567b = m6382n();
        this.f7592c.f7580d.f7568c = m6382n();
        this.f7592c.f7580d.f7569d = m6382n();
        int iM6372d = m6372d();
        boolean z6 = (iM6372d & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iM6372d & 7) + 1);
        C6257b c6257b = this.f7592c.f7580d;
        c6257b.f7570e = (iM6372d & 64) != 0;
        if (z6) {
            c6257b.f7576k = m6375g(iPow);
        } else {
            c6257b.f7576k = null;
        }
        this.f7592c.f7580d.f7575j = this.f7591b.position();
        m6386r();
        if (m6370b()) {
            return;
        }
        C6258c c6258c = this.f7592c;
        c6258c.f7579c++;
        c6258c.f7581e.add(c6258c.f7580d);
    }

    /* renamed from: f */
    public final void m6374f() {
        int iM6372d = m6372d();
        this.f7593d = iM6372d;
        if (iM6372d <= 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            try {
                int i7 = this.f7593d;
                if (i6 >= i7) {
                    return;
                }
                int i8 = i7 - i6;
                this.f7591b.get(this.f7590a, i6, i8);
                i6 += i8;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.f7592c.f7578b = 1;
                return;
            }
        }
    }

    /* renamed from: g */
    public final int[] m6375g(int i6) {
        byte[] bArr = new byte[i6 * 3];
        int[] iArr = null;
        try {
            this.f7591b.get(bArr);
            iArr = new int[256];
            int i7 = 0;
            int i8 = 0;
            while (i7 < i6) {
                int i9 = bArr[i8] & UByte.MAX_VALUE;
                int i10 = i8 + 2;
                int i11 = bArr[i8 + 1] & UByte.MAX_VALUE;
                i8 += 3;
                int i12 = i7 + 1;
                iArr[i7] = (i11 << 8) | (i9 << 16) | ViewCompat.MEASURED_STATE_MASK | (bArr[i10] & UByte.MAX_VALUE);
                i7 = i12;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f7592c.f7578b = 1;
            return iArr;
        }
    }

    /* renamed from: h */
    public final void m6376h() {
        m6377i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    public final void m6377i(int i6) {
        boolean z6 = false;
        while (!z6 && !m6370b() && this.f7592c.f7579c <= i6) {
            int iM6372d = m6372d();
            if (iM6372d == 33) {
                int iM6372d2 = m6372d();
                if (iM6372d2 == 1) {
                    m6385q();
                } else if (iM6372d2 == 249) {
                    this.f7592c.f7580d = new C6257b();
                    m6378j();
                } else if (iM6372d2 == 254) {
                    m6385q();
                } else if (iM6372d2 != 255) {
                    m6385q();
                } else {
                    m6374f();
                    StringBuilder sb = new StringBuilder();
                    for (int i7 = 0; i7 < 11; i7++) {
                        sb.append((char) this.f7590a[i7]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m6381m();
                    } else {
                        m6385q();
                    }
                }
            } else if (iM6372d == 44) {
                C6258c c6258c = this.f7592c;
                if (c6258c.f7580d == null) {
                    c6258c.f7580d = new C6257b();
                }
                m6373e();
            } else if (iM6372d != 59) {
                this.f7592c.f7578b = 1;
            } else {
                z6 = true;
            }
        }
    }

    /* renamed from: j */
    public final void m6378j() {
        m6372d();
        int iM6372d = m6372d();
        C6257b c6257b = this.f7592c.f7580d;
        int i6 = (iM6372d & 28) >> 2;
        c6257b.f7572g = i6;
        if (i6 == 0) {
            c6257b.f7572g = 1;
        }
        c6257b.f7571f = (iM6372d & 1) != 0;
        int iM6382n = m6382n();
        if (iM6382n < 2) {
            iM6382n = 10;
        }
        C6257b c6257b2 = this.f7592c.f7580d;
        c6257b2.f7574i = iM6382n * 10;
        c6257b2.f7573h = m6372d();
        m6372d();
    }

    /* renamed from: k */
    public final void m6379k() {
        StringBuilder sb = new StringBuilder();
        for (int i6 = 0; i6 < 6; i6++) {
            sb.append((char) m6372d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f7592c.f7578b = 1;
            return;
        }
        m6380l();
        if (!this.f7592c.f7584h || m6370b()) {
            return;
        }
        C6258c c6258c = this.f7592c;
        c6258c.f7577a = m6375g(c6258c.f7585i);
        C6258c c6258c2 = this.f7592c;
        c6258c2.f7588l = c6258c2.f7577a[c6258c2.f7586j];
    }

    /* renamed from: l */
    public final void m6380l() {
        this.f7592c.f7582f = m6382n();
        this.f7592c.f7583g = m6382n();
        int iM6372d = m6372d();
        C6258c c6258c = this.f7592c;
        c6258c.f7584h = (iM6372d & 128) != 0;
        c6258c.f7585i = (int) Math.pow(2.0d, (iM6372d & 7) + 1);
        this.f7592c.f7586j = m6372d();
        this.f7592c.f7587k = m6372d();
    }

    /* renamed from: m */
    public final void m6381m() {
        do {
            m6374f();
            byte[] bArr = this.f7590a;
            if (bArr[0] == 1) {
                this.f7592c.f7589m = ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE);
            }
            if (this.f7593d <= 0) {
                return;
            }
        } while (!m6370b());
    }

    /* renamed from: n */
    public final int m6382n() {
        return this.f7591b.getShort();
    }

    /* renamed from: o */
    public final void m6383o() {
        this.f7591b = null;
        Arrays.fill(this.f7590a, (byte) 0);
        this.f7592c = new C6258c();
        this.f7593d = 0;
    }

    /* renamed from: p */
    public C6259d m6384p(ByteBuffer byteBuffer) {
        m6383o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f7591b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f7591b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: q */
    public final void m6385q() {
        int iM6372d;
        do {
            iM6372d = m6372d();
            this.f7591b.position(Math.min(this.f7591b.position() + iM6372d, this.f7591b.limit()));
        } while (iM6372d > 0);
    }

    /* renamed from: r */
    public final void m6386r() {
        m6372d();
        m6385q();
    }
}
