package p148k;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: k.d */
/* loaded from: classes3.dex */
public class C9045d {

    /* renamed from: b */
    public ByteBuffer f17292b;

    /* renamed from: c */
    public C9044c f17293c;

    /* renamed from: a */
    public final byte[] f17291a = new byte[256];

    /* renamed from: d */
    public int f17294d = 0;

    /* renamed from: a */
    public void m15812a() {
        this.f17292b = null;
        this.f17293c = null;
    }

    /* renamed from: b */
    public final boolean m15813b() {
        return this.f17293c.f17279b != 0;
    }

    /* renamed from: c */
    public C9044c m15814c() {
        if (this.f17292b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m15813b()) {
            return this.f17293c;
        }
        m15822k();
        if (!m15813b()) {
            m15819h();
            C9044c c9044c = this.f17293c;
            if (c9044c.f17280c < 0) {
                c9044c.f17279b = 1;
            }
        }
        return this.f17293c;
    }

    /* renamed from: d */
    public final int m15815d() {
        try {
            return this.f17292b.get() & 255;
        } catch (Exception unused) {
            this.f17293c.f17279b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    public final void m15816e() {
        this.f17293c.f17281d.f17267a = m15825n();
        this.f17293c.f17281d.f17268b = m15825n();
        this.f17293c.f17281d.f17269c = m15825n();
        this.f17293c.f17281d.f17270d = m15825n();
        int iM15815d = m15815d();
        boolean z10 = (iM15815d & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iM15815d & 7) + 1);
        C9043b c9043b = this.f17293c.f17281d;
        c9043b.f17271e = (iM15815d & 64) != 0;
        if (z10) {
            c9043b.f17277k = m15818g(iPow);
        } else {
            c9043b.f17277k = null;
        }
        this.f17293c.f17281d.f17276j = this.f17292b.position();
        m15829r();
        if (m15813b()) {
            return;
        }
        C9044c c9044c = this.f17293c;
        c9044c.f17280c++;
        c9044c.f17282e.add(c9044c.f17281d);
    }

    /* renamed from: f */
    public final void m15817f() {
        int iM15815d = m15815d();
        this.f17294d = iM15815d;
        if (iM15815d <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                int i11 = this.f17294d;
                if (i10 >= i11) {
                    return;
                }
                int i12 = i11 - i10;
                this.f17292b.get(this.f17291a, i10, i12);
                i10 += i12;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.f17293c.f17279b = 1;
                return;
            }
        }
    }

    /* renamed from: g */
    public final int[] m15818g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f17292b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & 255;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & 255;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & 255);
                i11 = i16;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f17293c.f17279b = 1;
            return iArr;
        }
    }

    /* renamed from: h */
    public final void m15819h() {
        m15820i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    public final void m15820i(int i10) {
        boolean z10 = false;
        while (!z10 && !m15813b() && this.f17293c.f17280c <= i10) {
            int iM15815d = m15815d();
            if (iM15815d == 33) {
                int iM15815d2 = m15815d();
                if (iM15815d2 == 1) {
                    m15828q();
                } else if (iM15815d2 == 249) {
                    this.f17293c.f17281d = new C9043b();
                    m15821j();
                } else if (iM15815d2 == 254) {
                    m15828q();
                } else if (iM15815d2 != 255) {
                    m15828q();
                } else {
                    m15817f();
                    StringBuilder sb = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb.append((char) this.f17291a[i11]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m15824m();
                    } else {
                        m15828q();
                    }
                }
            } else if (iM15815d == 44) {
                C9044c c9044c = this.f17293c;
                if (c9044c.f17281d == null) {
                    c9044c.f17281d = new C9043b();
                }
                m15816e();
            } else if (iM15815d != 59) {
                this.f17293c.f17279b = 1;
            } else {
                z10 = true;
            }
        }
    }

    /* renamed from: j */
    public final void m15821j() {
        m15815d();
        int iM15815d = m15815d();
        C9043b c9043b = this.f17293c.f17281d;
        int i10 = (iM15815d & 28) >> 2;
        c9043b.f17273g = i10;
        if (i10 == 0) {
            c9043b.f17273g = 1;
        }
        c9043b.f17272f = (iM15815d & 1) != 0;
        int iM15825n = m15825n();
        if (iM15825n < 2) {
            iM15825n = 10;
        }
        C9043b c9043b2 = this.f17293c.f17281d;
        c9043b2.f17275i = iM15825n * 10;
        c9043b2.f17274h = m15815d();
        m15815d();
    }

    /* renamed from: k */
    public final void m15822k() {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb.append((char) m15815d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f17293c.f17279b = 1;
            return;
        }
        m15823l();
        if (!this.f17293c.f17285h || m15813b()) {
            return;
        }
        C9044c c9044c = this.f17293c;
        c9044c.f17278a = m15818g(c9044c.f17286i);
        C9044c c9044c2 = this.f17293c;
        c9044c2.f17289l = c9044c2.f17278a[c9044c2.f17287j];
    }

    /* renamed from: l */
    public final void m15823l() {
        this.f17293c.f17283f = m15825n();
        this.f17293c.f17284g = m15825n();
        int iM15815d = m15815d();
        C9044c c9044c = this.f17293c;
        c9044c.f17285h = (iM15815d & 128) != 0;
        c9044c.f17286i = (int) Math.pow(2.0d, (iM15815d & 7) + 1);
        this.f17293c.f17287j = m15815d();
        this.f17293c.f17288k = m15815d();
    }

    /* renamed from: m */
    public final void m15824m() {
        do {
            m15817f();
            byte[] bArr = this.f17291a;
            if (bArr[0] == 1) {
                this.f17293c.f17290m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f17294d <= 0) {
                return;
            }
        } while (!m15813b());
    }

    /* renamed from: n */
    public final int m15825n() {
        return this.f17292b.getShort();
    }

    /* renamed from: o */
    public final void m15826o() {
        this.f17292b = null;
        Arrays.fill(this.f17291a, (byte) 0);
        this.f17293c = new C9044c();
        this.f17294d = 0;
    }

    /* renamed from: p */
    public C9045d m15827p(ByteBuffer byteBuffer) {
        m15826o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f17292b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f17292b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: q */
    public final void m15828q() {
        int iM15815d;
        do {
            iM15815d = m15815d();
            this.f17292b.position(Math.min(this.f17292b.position() + iM15815d, this.f17292b.limit()));
        } while (iM15815d > 0);
    }

    /* renamed from: r */
    public final void m15829r() {
        m15815d();
        m15828q();
    }
}
