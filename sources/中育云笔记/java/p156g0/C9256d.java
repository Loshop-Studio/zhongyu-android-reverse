package p156g0;

import android.util.Log;
import androidx.core.view.ViewCompat;
import com.tendcloud.tenddata.C7863av;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: g0.d */
/* loaded from: classes3.dex */
public class C9256d {

    /* renamed from: b */
    public ByteBuffer f21580b;

    /* renamed from: c */
    public C9255c f21581c;

    /* renamed from: a */
    public final byte[] f21579a = new byte[256];

    /* renamed from: d */
    public int f21582d = 0;

    /* renamed from: a */
    public void m18226a() {
        this.f21580b = null;
        this.f21581c = null;
    }

    /* renamed from: b */
    public final boolean m18227b() {
        return this.f21581c.f21567b != 0;
    }

    /* renamed from: c */
    public C9255c m18228c() {
        if (this.f21580b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m18227b()) {
            return this.f21581c;
        }
        m18236k();
        if (!m18227b()) {
            m18233h();
            C9255c c9255c = this.f21581c;
            if (c9255c.f21568c < 0) {
                c9255c.f21567b = 1;
            }
        }
        return this.f21581c;
    }

    /* renamed from: d */
    public final int m18229d() {
        try {
            return this.f21580b.get() & C7863av.f14384i;
        } catch (Exception unused) {
            this.f21581c.f21567b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    public final void m18230e() {
        this.f21581c.f21569d.f21555a = m18239n();
        this.f21581c.f21569d.f21556b = m18239n();
        this.f21581c.f21569d.f21557c = m18239n();
        this.f21581c.f21569d.f21558d = m18239n();
        int iM18229d = m18229d();
        boolean z10 = (iM18229d & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iM18229d & 7) + 1);
        C9254b c9254b = this.f21581c.f21569d;
        c9254b.f21559e = (iM18229d & 64) != 0;
        if (z10) {
            c9254b.f21565k = m18232g(iPow);
        } else {
            c9254b.f21565k = null;
        }
        this.f21581c.f21569d.f21564j = this.f21580b.position();
        m18243r();
        if (m18227b()) {
            return;
        }
        C9255c c9255c = this.f21581c;
        c9255c.f21568c++;
        c9255c.f21570e.add(c9255c.f21569d);
    }

    /* renamed from: f */
    public final void m18231f() {
        int iM18229d = m18229d();
        this.f21582d = iM18229d;
        if (iM18229d <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                int i11 = this.f21582d;
                if (i10 >= i11) {
                    return;
                }
                int i12 = i11 - i10;
                this.f21580b.get(this.f21579a, i10, i12);
                i10 += i12;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.f21581c.f21567b = 1;
                return;
            }
        }
    }

    /* renamed from: g */
    public final int[] m18232g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f21580b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & C7863av.f14384i;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & C7863av.f14384i;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | ViewCompat.MEASURED_STATE_MASK | (bArr[i14] & C7863av.f14384i);
                i11 = i16;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f21581c.f21567b = 1;
            return iArr;
        }
    }

    /* renamed from: h */
    public final void m18233h() {
        m18234i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    public final void m18234i(int i10) {
        boolean z10 = false;
        while (!z10 && !m18227b() && this.f21581c.f21568c <= i10) {
            int iM18229d = m18229d();
            if (iM18229d == 33) {
                int iM18229d2 = m18229d();
                if (iM18229d2 == 1) {
                    m18242q();
                } else if (iM18229d2 == 249) {
                    this.f21581c.f21569d = new C9254b();
                    m18235j();
                } else if (iM18229d2 == 254) {
                    m18242q();
                } else if (iM18229d2 != 255) {
                    m18242q();
                } else {
                    m18231f();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb2.append((char) this.f21579a[i11]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        m18238m();
                    } else {
                        m18242q();
                    }
                }
            } else if (iM18229d == 44) {
                C9255c c9255c = this.f21581c;
                if (c9255c.f21569d == null) {
                    c9255c.f21569d = new C9254b();
                }
                m18230e();
            } else if (iM18229d != 59) {
                this.f21581c.f21567b = 1;
            } else {
                z10 = true;
            }
        }
    }

    /* renamed from: j */
    public final void m18235j() {
        m18229d();
        int iM18229d = m18229d();
        C9254b c9254b = this.f21581c.f21569d;
        int i10 = (iM18229d & 28) >> 2;
        c9254b.f21561g = i10;
        if (i10 == 0) {
            c9254b.f21561g = 1;
        }
        c9254b.f21560f = (iM18229d & 1) != 0;
        int iM18239n = m18239n();
        if (iM18239n < 2) {
            iM18239n = 10;
        }
        C9254b c9254b2 = this.f21581c.f21569d;
        c9254b2.f21563i = iM18239n * 10;
        c9254b2.f21562h = m18229d();
        m18229d();
    }

    /* renamed from: k */
    public final void m18236k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) m18229d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f21581c.f21567b = 1;
            return;
        }
        m18237l();
        if (!this.f21581c.f21573h || m18227b()) {
            return;
        }
        C9255c c9255c = this.f21581c;
        c9255c.f21566a = m18232g(c9255c.f21574i);
        C9255c c9255c2 = this.f21581c;
        c9255c2.f21577l = c9255c2.f21566a[c9255c2.f21575j];
    }

    /* renamed from: l */
    public final void m18237l() {
        this.f21581c.f21571f = m18239n();
        this.f21581c.f21572g = m18239n();
        int iM18229d = m18229d();
        C9255c c9255c = this.f21581c;
        c9255c.f21573h = (iM18229d & 128) != 0;
        c9255c.f21574i = (int) Math.pow(2.0d, (iM18229d & 7) + 1);
        this.f21581c.f21575j = m18229d();
        this.f21581c.f21576k = m18229d();
    }

    /* renamed from: m */
    public final void m18238m() {
        do {
            m18231f();
            byte[] bArr = this.f21579a;
            if (bArr[0] == 1) {
                this.f21581c.f21578m = ((bArr[2] & C7863av.f14384i) << 8) | (bArr[1] & C7863av.f14384i);
            }
            if (this.f21582d <= 0) {
                return;
            }
        } while (!m18227b());
    }

    /* renamed from: n */
    public final int m18239n() {
        return this.f21580b.getShort();
    }

    /* renamed from: o */
    public final void m18240o() {
        this.f21580b = null;
        Arrays.fill(this.f21579a, (byte) 0);
        this.f21581c = new C9255c();
        this.f21582d = 0;
    }

    /* renamed from: p */
    public C9256d m18241p(ByteBuffer byteBuffer) {
        m18240o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f21580b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f21580b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: q */
    public final void m18242q() {
        int iM18229d;
        do {
            iM18229d = m18229d();
            this.f21580b.position(Math.min(this.f21580b.position() + iM18229d, this.f21580b.limit()));
        } while (iM18229d > 0);
    }

    /* renamed from: r */
    public final void m18243r() {
        m18229d();
        m18242q();
    }
}
