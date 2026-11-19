package p071i;

import android.util.Log;
import androidx.core.view.ViewCompat;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.UByte;

/* renamed from: i.d */
/* loaded from: classes2.dex */
public class C3774d {

    /* renamed from: b */
    public ByteBuffer f4488b;

    /* renamed from: c */
    public C3773c f4489c;

    /* renamed from: a */
    public final byte[] f4487a = new byte[256];

    /* renamed from: d */
    public int f4490d = 0;

    /* renamed from: a */
    public void m4893a() {
        this.f4488b = null;
        this.f4489c = null;
    }

    /* renamed from: b */
    public final boolean m4894b() {
        return this.f4489c.f4475b != 0;
    }

    /* renamed from: c */
    public C3773c m4895c() {
        if (this.f4488b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m4894b()) {
            return this.f4489c;
        }
        m4903k();
        if (!m4894b()) {
            m4900h();
            C3773c c3773c = this.f4489c;
            if (c3773c.f4476c < 0) {
                c3773c.f4475b = 1;
            }
        }
        return this.f4489c;
    }

    /* renamed from: d */
    public final int m4896d() {
        try {
            return this.f4488b.get() & UByte.MAX_VALUE;
        } catch (Exception unused) {
            this.f4489c.f4475b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    public final void m4897e() {
        this.f4489c.f4477d.f4463a = m4906n();
        this.f4489c.f4477d.f4464b = m4906n();
        this.f4489c.f4477d.f4465c = m4906n();
        this.f4489c.f4477d.f4466d = m4906n();
        int iM4896d = m4896d();
        boolean z3 = (iM4896d & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iM4896d & 7) + 1);
        C3772b c3772b = this.f4489c.f4477d;
        c3772b.f4467e = (iM4896d & 64) != 0;
        if (z3) {
            c3772b.f4473k = m4899g(iPow);
        } else {
            c3772b.f4473k = null;
        }
        this.f4489c.f4477d.f4472j = this.f4488b.position();
        m4910r();
        if (m4894b()) {
            return;
        }
        C3773c c3773c = this.f4489c;
        c3773c.f4476c++;
        c3773c.f4478e.add(c3773c.f4477d);
    }

    /* renamed from: f */
    public final void m4898f() {
        int iM4896d = m4896d();
        this.f4490d = iM4896d;
        if (iM4896d <= 0) {
            return;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            try {
                i5 = this.f4490d;
                if (i4 >= i5) {
                    return;
                }
                i5 -= i4;
                this.f4488b.get(this.f4487a, i4, i5);
                i4 += i5;
            } catch (Exception unused) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error Reading Block n: ");
                    sb.append(i4);
                    sb.append(" count: ");
                    sb.append(i5);
                    sb.append(" blockSize: ");
                    sb.append(this.f4490d);
                }
                this.f4489c.f4475b = 1;
                return;
            }
        }
    }

    /* renamed from: g */
    public final int[] m4899g(int i4) {
        byte[] bArr = new byte[i4 * 3];
        int[] iArr = null;
        try {
            this.f4488b.get(bArr);
            iArr = new int[256];
            int i5 = 0;
            int i6 = 0;
            while (i5 < i4) {
                int i7 = i6 + 1;
                int i8 = i7 + 1;
                int i9 = i8 + 1;
                int i10 = i5 + 1;
                iArr[i5] = ((bArr[i6] & UByte.MAX_VALUE) << 16) | ViewCompat.MEASURED_STATE_MASK | ((bArr[i7] & UByte.MAX_VALUE) << 8) | (bArr[i8] & UByte.MAX_VALUE);
                i6 = i9;
                i5 = i10;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f4489c.f4475b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    public final void m4900h() {
        m4901i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    public final void m4901i(int i4) {
        boolean z3 = false;
        while (!z3 && !m4894b() && this.f4489c.f4476c <= i4) {
            int iM4896d = m4896d();
            if (iM4896d == 33) {
                int iM4896d2 = m4896d();
                if (iM4896d2 == 1) {
                    m4909q();
                } else if (iM4896d2 == 249) {
                    this.f4489c.f4477d = new C3772b();
                    m4902j();
                } else if (iM4896d2 == 254) {
                    m4909q();
                } else if (iM4896d2 != 255) {
                    m4909q();
                } else {
                    m4898f();
                    StringBuilder sb = new StringBuilder();
                    for (int i5 = 0; i5 < 11; i5++) {
                        sb.append((char) this.f4487a[i5]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m4905m();
                    } else {
                        m4909q();
                    }
                }
            } else if (iM4896d == 44) {
                C3773c c3773c = this.f4489c;
                if (c3773c.f4477d == null) {
                    c3773c.f4477d = new C3772b();
                }
                m4897e();
            } else if (iM4896d != 59) {
                this.f4489c.f4475b = 1;
            } else {
                z3 = true;
            }
        }
    }

    /* renamed from: j */
    public final void m4902j() {
        m4896d();
        int iM4896d = m4896d();
        C3772b c3772b = this.f4489c.f4477d;
        int i4 = (iM4896d & 28) >> 2;
        c3772b.f4469g = i4;
        if (i4 == 0) {
            c3772b.f4469g = 1;
        }
        c3772b.f4468f = (iM4896d & 1) != 0;
        int iM4906n = m4906n();
        if (iM4906n < 2) {
            iM4906n = 10;
        }
        C3772b c3772b2 = this.f4489c.f4477d;
        c3772b2.f4471i = iM4906n * 10;
        c3772b2.f4470h = m4896d();
        m4896d();
    }

    /* renamed from: k */
    public final void m4903k() {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < 6; i4++) {
            sb.append((char) m4896d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f4489c.f4475b = 1;
            return;
        }
        m4904l();
        if (!this.f4489c.f4481h || m4894b()) {
            return;
        }
        C3773c c3773c = this.f4489c;
        c3773c.f4474a = m4899g(c3773c.f4482i);
        C3773c c3773c2 = this.f4489c;
        c3773c2.f4485l = c3773c2.f4474a[c3773c2.f4483j];
    }

    /* renamed from: l */
    public final void m4904l() {
        this.f4489c.f4479f = m4906n();
        this.f4489c.f4480g = m4906n();
        int iM4896d = m4896d();
        C3773c c3773c = this.f4489c;
        c3773c.f4481h = (iM4896d & 128) != 0;
        c3773c.f4482i = (int) Math.pow(2.0d, (iM4896d & 7) + 1);
        this.f4489c.f4483j = m4896d();
        this.f4489c.f4484k = m4896d();
    }

    /* renamed from: m */
    public final void m4905m() {
        do {
            m4898f();
            byte[] bArr = this.f4487a;
            if (bArr[0] == 1) {
                this.f4489c.f4486m = ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE);
            }
            if (this.f4490d <= 0) {
                return;
            }
        } while (!m4894b());
    }

    /* renamed from: n */
    public final int m4906n() {
        return this.f4488b.getShort();
    }

    /* renamed from: o */
    public final void m4907o() {
        this.f4488b = null;
        Arrays.fill(this.f4487a, (byte) 0);
        this.f4489c = new C3773c();
        this.f4490d = 0;
    }

    /* renamed from: p */
    public C3774d m4908p(ByteBuffer byteBuffer) {
        m4907o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f4488b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f4488b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: q */
    public final void m4909q() {
        int iM4896d;
        do {
            iM4896d = m4896d();
            this.f4488b.position(Math.min(this.f4488b.position() + iM4896d, this.f4488b.limit()));
        } while (iM4896d > 0);
    }

    /* renamed from: r */
    public final void m4910r() {
        m4896d();
        m4909q();
    }
}
