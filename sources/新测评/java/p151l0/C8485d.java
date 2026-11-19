package p151l0;

import android.util.Log;
import androidx.core.view.ViewCompat;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.UByte;

/* renamed from: l0.d */
/* loaded from: classes3.dex */
public class C8485d {

    /* renamed from: b */
    public ByteBuffer f14036b;

    /* renamed from: c */
    public C8484c f14037c;

    /* renamed from: a */
    public final byte[] f14035a = new byte[256];

    /* renamed from: d */
    public int f14038d = 0;

    /* renamed from: a */
    public void m13884a() {
        this.f14036b = null;
        this.f14037c = null;
    }

    /* renamed from: b */
    public final boolean m13885b() {
        return this.f14037c.f14023b != 0;
    }

    /* renamed from: c */
    public C8484c m13886c() {
        if (this.f14036b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m13885b()) {
            return this.f14037c;
        }
        m13894k();
        if (!m13885b()) {
            m13891h();
            C8484c c8484c = this.f14037c;
            if (c8484c.f14024c < 0) {
                c8484c.f14023b = 1;
            }
        }
        return this.f14037c;
    }

    /* renamed from: d */
    public final int m13887d() {
        try {
            return this.f14036b.get() & UByte.MAX_VALUE;
        } catch (Exception unused) {
            this.f14037c.f14023b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    public final void m13888e() {
        this.f14037c.f14025d.f14011a = m13897n();
        this.f14037c.f14025d.f14012b = m13897n();
        this.f14037c.f14025d.f14013c = m13897n();
        this.f14037c.f14025d.f14014d = m13897n();
        int iM13887d = m13887d();
        boolean z9 = (iM13887d & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iM13887d & 7) + 1);
        C8483b c8483b = this.f14037c.f14025d;
        c8483b.f14015e = (iM13887d & 64) != 0;
        if (z9) {
            c8483b.f14021k = m13890g(iPow);
        } else {
            c8483b.f14021k = null;
        }
        this.f14037c.f14025d.f14020j = this.f14036b.position();
        m13901r();
        if (m13885b()) {
            return;
        }
        C8484c c8484c = this.f14037c;
        c8484c.f14024c++;
        c8484c.f14026e.add(c8484c.f14025d);
    }

    /* renamed from: f */
    public final void m13889f() {
        int iM13887d = m13887d();
        this.f14038d = iM13887d;
        if (iM13887d <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                int i11 = this.f14038d;
                if (i10 >= i11) {
                    return;
                }
                int i12 = i11 - i10;
                this.f14036b.get(this.f14035a, i10, i12);
                i10 += i12;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.f14037c.f14023b = 1;
                return;
            }
        }
    }

    /* renamed from: g */
    public final int[] m13890g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f14036b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & UByte.MAX_VALUE;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & UByte.MAX_VALUE;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | ViewCompat.MEASURED_STATE_MASK | (bArr[i14] & UByte.MAX_VALUE);
                i11 = i16;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f14037c.f14023b = 1;
            return iArr;
        }
    }

    /* renamed from: h */
    public final void m13891h() {
        m13892i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    public final void m13892i(int i10) {
        boolean z9 = false;
        while (!z9 && !m13885b() && this.f14037c.f14024c <= i10) {
            int iM13887d = m13887d();
            if (iM13887d == 33) {
                int iM13887d2 = m13887d();
                if (iM13887d2 == 1) {
                    m13900q();
                } else if (iM13887d2 == 249) {
                    this.f14037c.f14025d = new C8483b();
                    m13893j();
                } else if (iM13887d2 == 254) {
                    m13900q();
                } else if (iM13887d2 != 255) {
                    m13900q();
                } else {
                    m13889f();
                    StringBuilder sb = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb.append((char) this.f14035a[i11]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m13896m();
                    } else {
                        m13900q();
                    }
                }
            } else if (iM13887d == 44) {
                C8484c c8484c = this.f14037c;
                if (c8484c.f14025d == null) {
                    c8484c.f14025d = new C8483b();
                }
                m13888e();
            } else if (iM13887d != 59) {
                this.f14037c.f14023b = 1;
            } else {
                z9 = true;
            }
        }
    }

    /* renamed from: j */
    public final void m13893j() {
        m13887d();
        int iM13887d = m13887d();
        C8483b c8483b = this.f14037c.f14025d;
        int i10 = (iM13887d & 28) >> 2;
        c8483b.f14017g = i10;
        if (i10 == 0) {
            c8483b.f14017g = 1;
        }
        c8483b.f14016f = (iM13887d & 1) != 0;
        int iM13897n = m13897n();
        if (iM13897n < 2) {
            iM13897n = 10;
        }
        C8483b c8483b2 = this.f14037c.f14025d;
        c8483b2.f14019i = iM13897n * 10;
        c8483b2.f14018h = m13887d();
        m13887d();
    }

    /* renamed from: k */
    public final void m13894k() {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb.append((char) m13887d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f14037c.f14023b = 1;
            return;
        }
        m13895l();
        if (!this.f14037c.f14029h || m13885b()) {
            return;
        }
        C8484c c8484c = this.f14037c;
        c8484c.f14022a = m13890g(c8484c.f14030i);
        C8484c c8484c2 = this.f14037c;
        c8484c2.f14033l = c8484c2.f14022a[c8484c2.f14031j];
    }

    /* renamed from: l */
    public final void m13895l() {
        this.f14037c.f14027f = m13897n();
        this.f14037c.f14028g = m13897n();
        int iM13887d = m13887d();
        C8484c c8484c = this.f14037c;
        c8484c.f14029h = (iM13887d & 128) != 0;
        c8484c.f14030i = (int) Math.pow(2.0d, (iM13887d & 7) + 1);
        this.f14037c.f14031j = m13887d();
        this.f14037c.f14032k = m13887d();
    }

    /* renamed from: m */
    public final void m13896m() {
        do {
            m13889f();
            byte[] bArr = this.f14035a;
            if (bArr[0] == 1) {
                this.f14037c.f14034m = ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE);
            }
            if (this.f14038d <= 0) {
                return;
            }
        } while (!m13885b());
    }

    /* renamed from: n */
    public final int m13897n() {
        return this.f14036b.getShort();
    }

    /* renamed from: o */
    public final void m13898o() {
        this.f14036b = null;
        Arrays.fill(this.f14035a, (byte) 0);
        this.f14037c = new C8484c();
        this.f14038d = 0;
    }

    /* renamed from: p */
    public C8485d m13899p(ByteBuffer byteBuffer) {
        m13898o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f14036b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f14036b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: q */
    public final void m13900q() {
        int iM13887d;
        do {
            iM13887d = m13887d();
            this.f14036b.position(Math.min(this.f14036b.position() + iM13887d, this.f14036b.limit()));
        } while (iM13887d > 0);
    }

    /* renamed from: r */
    public final void m13901r() {
        m13887d();
        m13900q();
    }
}
