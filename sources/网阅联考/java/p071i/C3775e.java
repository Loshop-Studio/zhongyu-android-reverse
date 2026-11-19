package p071i;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.UByte;
import p071i.InterfaceC3771a;

/* renamed from: i.e */
/* loaded from: classes2.dex */
public class C3775e implements InterfaceC3771a {

    /* renamed from: u */
    public static final String f4491u = "e";

    /* renamed from: a */
    public int[] f4492a;

    /* renamed from: b */
    public final int[] f4493b;

    /* renamed from: c */
    public final InterfaceC3771a.a f4494c;

    /* renamed from: d */
    public ByteBuffer f4495d;

    /* renamed from: e */
    public byte[] f4496e;

    /* renamed from: f */
    public short[] f4497f;

    /* renamed from: g */
    public byte[] f4498g;

    /* renamed from: h */
    public byte[] f4499h;

    /* renamed from: i */
    public byte[] f4500i;

    /* renamed from: j */
    public int[] f4501j;

    /* renamed from: k */
    public int f4502k;

    /* renamed from: l */
    public C3773c f4503l;

    /* renamed from: m */
    public Bitmap f4504m;

    /* renamed from: n */
    public boolean f4505n;

    /* renamed from: o */
    public int f4506o;

    /* renamed from: p */
    public int f4507p;

    /* renamed from: q */
    public int f4508q;

    /* renamed from: r */
    public int f4509r;

    /* renamed from: s */
    public Boolean f4510s;

    /* renamed from: t */
    public Bitmap.Config f4511t;

    public C3775e(InterfaceC3771a.a aVar, C3773c c3773c, ByteBuffer byteBuffer, int i4) {
        this(aVar);
        m4919q(c3773c, byteBuffer, i4);
    }

    @Override // p071i.InterfaceC3771a
    /* renamed from: a */
    public synchronized Bitmap mo4875a() {
        if (this.f4503l.f4476c <= 0 || this.f4502k < 0) {
            if (Log.isLoggable(f4491u, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to decode frame, frameCount=");
                sb.append(this.f4503l.f4476c);
                sb.append(", framePointer=");
                sb.append(this.f4502k);
            }
            this.f4506o = 1;
        }
        int i4 = this.f4506o;
        if (i4 != 1 && i4 != 2) {
            this.f4506o = 0;
            if (this.f4496e == null) {
                this.f4496e = this.f4494c.mo4887e(255);
            }
            C3772b c3772b = (C3772b) this.f4503l.f4478e.get(this.f4502k);
            int i5 = this.f4502k - 1;
            C3772b c3772b2 = i5 >= 0 ? (C3772b) this.f4503l.f4478e.get(i5) : null;
            int[] iArr = c3772b.f4473k;
            if (iArr == null) {
                iArr = this.f4503l.f4474a;
            }
            this.f4492a = iArr;
            if (iArr == null) {
                if (Log.isLoggable(f4491u, 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("No valid color table found for frame #");
                    sb2.append(this.f4502k);
                }
                this.f4506o = 1;
                return null;
            }
            if (c3772b.f4468f) {
                System.arraycopy(iArr, 0, this.f4493b, 0, iArr.length);
                int[] iArr2 = this.f4493b;
                this.f4492a = iArr2;
                iArr2[c3772b.f4470h] = 0;
                if (c3772b.f4469g == 2 && this.f4502k == 0) {
                    this.f4510s = Boolean.TRUE;
                }
            }
            return m4920r(c3772b, c3772b2);
        }
        if (Log.isLoggable(f4491u, 3)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to decode frame, status=");
            sb3.append(this.f4506o);
        }
        return null;
    }

    @Override // p071i.InterfaceC3771a
    /* renamed from: b */
    public void mo4876b() {
        this.f4502k = (this.f4502k + 1) % this.f4503l.f4476c;
    }

    @Override // p071i.InterfaceC3771a
    /* renamed from: c */
    public int mo4877c() {
        return this.f4503l.f4476c;
    }

    @Override // p071i.InterfaceC3771a
    public void clear() {
        this.f4503l = null;
        byte[] bArr = this.f4500i;
        if (bArr != null) {
            this.f4494c.mo4886d(bArr);
        }
        int[] iArr = this.f4501j;
        if (iArr != null) {
            this.f4494c.mo4888f(iArr);
        }
        Bitmap bitmap = this.f4504m;
        if (bitmap != null) {
            this.f4494c.mo4885c(bitmap);
        }
        this.f4504m = null;
        this.f4495d = null;
        this.f4510s = null;
        byte[] bArr2 = this.f4496e;
        if (bArr2 != null) {
            this.f4494c.mo4886d(bArr2);
        }
    }

    @Override // p071i.InterfaceC3771a
    /* renamed from: d */
    public int mo4878d() {
        int i4;
        if (this.f4503l.f4476c <= 0 || (i4 = this.f4502k) < 0) {
            return 0;
        }
        return m4915m(i4);
    }

    @Override // p071i.InterfaceC3771a
    /* renamed from: e */
    public void mo4879e(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f4511t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    @Override // p071i.InterfaceC3771a
    /* renamed from: f */
    public void mo4880f() {
        this.f4502k = -1;
    }

    @Override // p071i.InterfaceC3771a
    /* renamed from: g */
    public int mo4881g() {
        return this.f4502k;
    }

    @Override // p071i.InterfaceC3771a
    public ByteBuffer getData() {
        return this.f4495d;
    }

    @Override // p071i.InterfaceC3771a
    /* renamed from: h */
    public int mo4882h() {
        return this.f4495d.limit() + this.f4500i.length + (this.f4501j.length * 4);
    }

    /* renamed from: i */
    public final int m4911i(int i4, int i5, int i6) {
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = i4; i12 < this.f4507p + i4; i12++) {
            byte[] bArr = this.f4500i;
            if (i12 >= bArr.length || i12 >= i5) {
                break;
            }
            int i13 = this.f4492a[bArr[i12] & UByte.MAX_VALUE];
            if (i13 != 0) {
                i7 += (i13 >> 24) & 255;
                i8 += (i13 >> 16) & 255;
                i9 += (i13 >> 8) & 255;
                i10 += i13 & 255;
                i11++;
            }
        }
        int i14 = i4 + i6;
        for (int i15 = i14; i15 < this.f4507p + i14; i15++) {
            byte[] bArr2 = this.f4500i;
            if (i15 >= bArr2.length || i15 >= i5) {
                break;
            }
            int i16 = this.f4492a[bArr2[i15] & UByte.MAX_VALUE];
            if (i16 != 0) {
                i7 += (i16 >> 24) & 255;
                i8 += (i16 >> 16) & 255;
                i9 += (i16 >> 8) & 255;
                i10 += i16 & 255;
                i11++;
            }
        }
        if (i11 == 0) {
            return 0;
        }
        return ((i7 / i11) << 24) | ((i8 / i11) << 16) | ((i9 / i11) << 8) | (i10 / i11);
    }

    /* renamed from: j */
    public final void m4912j(C3772b c3772b) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr = this.f4501j;
        int i9 = c3772b.f4466d;
        int i10 = this.f4507p;
        int i11 = i9 / i10;
        int i12 = c3772b.f4464b / i10;
        int i13 = c3772b.f4465c / i10;
        int i14 = c3772b.f4463a / i10;
        boolean z3 = this.f4502k == 0;
        int i15 = this.f4509r;
        int i16 = this.f4508q;
        byte[] bArr = this.f4500i;
        int[] iArr2 = this.f4492a;
        Boolean bool = this.f4510s;
        int i17 = 8;
        int i18 = 0;
        int i19 = 0;
        int i20 = 1;
        while (i19 < i11) {
            Boolean bool2 = bool;
            if (c3772b.f4467e) {
                if (i18 >= i11) {
                    int i21 = i20 + 1;
                    i4 = i11;
                    if (i21 == 2) {
                        i18 = 4;
                    } else if (i21 == 3) {
                        i17 = 4;
                        i20 = i21;
                        i18 = 2;
                    } else if (i21 == 4) {
                        i20 = i21;
                        i18 = 1;
                        i17 = 2;
                    }
                    i20 = i21;
                } else {
                    i4 = i11;
                }
                i5 = i18 + i17;
            } else {
                i4 = i11;
                i5 = i18;
                i18 = i19;
            }
            int i22 = i18 + i12;
            boolean z4 = i10 == 1;
            if (i22 < i16) {
                int i23 = i22 * i15;
                int i24 = i23 + i14;
                int i25 = i24 + i13;
                int i26 = i23 + i15;
                if (i26 < i25) {
                    i25 = i26;
                }
                i6 = i5;
                int i27 = i19 * i10 * c3772b.f4465c;
                if (z4) {
                    int i28 = i24;
                    while (i28 < i25) {
                        int i29 = i12;
                        int i30 = iArr2[bArr[i27] & UByte.MAX_VALUE];
                        if (i30 != 0) {
                            iArr[i28] = i30;
                        } else if (z3 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i27 += i10;
                        i28++;
                        i12 = i29;
                    }
                } else {
                    i8 = i12;
                    int i31 = ((i25 - i24) * i10) + i27;
                    int i32 = i24;
                    while (true) {
                        i7 = i13;
                        if (i32 < i25) {
                            int iM4911i = m4911i(i27, i31, c3772b.f4465c);
                            if (iM4911i != 0) {
                                iArr[i32] = iM4911i;
                            } else if (z3 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i27 += i10;
                            i32++;
                            i13 = i7;
                        }
                    }
                    bool = bool2;
                    i19++;
                    i12 = i8;
                    i11 = i4;
                    i13 = i7;
                    i18 = i6;
                }
            } else {
                i6 = i5;
            }
            i8 = i12;
            i7 = i13;
            bool = bool2;
            i19++;
            i12 = i8;
            i11 = i4;
            i13 = i7;
            i18 = i6;
        }
        Boolean bool3 = bool;
        if (this.f4510s == null) {
            this.f4510s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    /* renamed from: k */
    public final void m4913k(C3772b c3772b) {
        C3772b c3772b2 = c3772b;
        int[] iArr = this.f4501j;
        int i4 = c3772b2.f4466d;
        int i5 = c3772b2.f4464b;
        int i6 = c3772b2.f4465c;
        int i7 = c3772b2.f4463a;
        boolean z3 = this.f4502k == 0;
        int i8 = this.f4509r;
        byte[] bArr = this.f4500i;
        int[] iArr2 = this.f4492a;
        int i9 = 0;
        byte b4 = -1;
        while (i9 < i4) {
            int i10 = (i9 + i5) * i8;
            int i11 = i10 + i7;
            int i12 = i11 + i6;
            int i13 = i10 + i8;
            if (i13 < i12) {
                i12 = i13;
            }
            int i14 = c3772b2.f4465c * i9;
            int i15 = i11;
            while (i15 < i12) {
                byte b5 = bArr[i14];
                int i16 = i4;
                int i17 = b5 & UByte.MAX_VALUE;
                if (i17 != b4) {
                    int i18 = iArr2[i17];
                    if (i18 != 0) {
                        iArr[i15] = i18;
                    } else {
                        b4 = b5;
                    }
                }
                i14++;
                i15++;
                i4 = i16;
            }
            i9++;
            c3772b2 = c3772b;
        }
        Boolean bool = this.f4510s;
        this.f4510s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f4510s == null && z3 && b4 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* renamed from: l */
    public final void m4914l(C3772b c3772b) {
        int i4;
        int i5;
        short s3;
        C3775e c3775e = this;
        if (c3772b != null) {
            c3775e.f4495d.position(c3772b.f4472j);
        }
        if (c3772b == null) {
            C3773c c3773c = c3775e.f4503l;
            i4 = c3773c.f4479f;
            i5 = c3773c.f4480g;
        } else {
            i4 = c3772b.f4465c;
            i5 = c3772b.f4466d;
        }
        int i6 = i4 * i5;
        byte[] bArr = c3775e.f4500i;
        if (bArr == null || bArr.length < i6) {
            c3775e.f4500i = c3775e.f4494c.mo4887e(i6);
        }
        byte[] bArr2 = c3775e.f4500i;
        if (c3775e.f4497f == null) {
            c3775e.f4497f = new short[4096];
        }
        short[] sArr = c3775e.f4497f;
        if (c3775e.f4498g == null) {
            c3775e.f4498g = new byte[4096];
        }
        byte[] bArr3 = c3775e.f4498g;
        if (c3775e.f4499h == null) {
            c3775e.f4499h = new byte[4097];
        }
        byte[] bArr4 = c3775e.f4499h;
        int iM4918p = m4918p();
        int i7 = 1 << iM4918p;
        int i8 = i7 + 1;
        int i9 = i7 + 2;
        int i10 = iM4918p + 1;
        int i11 = (1 << i10) - 1;
        int i12 = 0;
        for (int i13 = 0; i13 < i7; i13++) {
            sArr[i13] = 0;
            bArr3[i13] = (byte) i13;
        }
        byte[] bArr5 = c3775e.f4496e;
        int i14 = i10;
        int i15 = i9;
        int i16 = i11;
        int iM4917o = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = -1;
        while (true) {
            if (i12 >= i6) {
                break;
            }
            if (iM4917o == 0) {
                iM4917o = m4917o();
                if (iM4917o <= 0) {
                    c3775e.f4506o = 3;
                    break;
                }
                i17 = 0;
            }
            i19 += (bArr5[i17] & UByte.MAX_VALUE) << i18;
            i17++;
            iM4917o--;
            int i24 = i18 + 8;
            int i25 = i15;
            int i26 = i14;
            int i27 = i23;
            int i28 = i10;
            int i29 = i21;
            while (true) {
                if (i24 < i26) {
                    i23 = i27;
                    i15 = i25;
                    i18 = i24;
                    c3775e = this;
                    i21 = i29;
                    i10 = i28;
                    i14 = i26;
                    break;
                }
                int i30 = i9;
                int i31 = i19 & i16;
                i19 >>= i26;
                i24 -= i26;
                if (i31 == i7) {
                    i16 = i11;
                    i26 = i28;
                    i25 = i30;
                    i9 = i25;
                    i27 = -1;
                } else {
                    if (i31 == i8) {
                        i18 = i24;
                        i21 = i29;
                        i15 = i25;
                        i10 = i28;
                        i9 = i30;
                        i23 = i27;
                        i14 = i26;
                        c3775e = this;
                        break;
                    }
                    if (i27 == -1) {
                        bArr2[i20] = bArr3[i31];
                        i20++;
                        i12++;
                        i27 = i31;
                        i29 = i27;
                        i9 = i30;
                        i24 = i24;
                    } else {
                        if (i31 >= i25) {
                            bArr4[i22] = (byte) i29;
                            i22++;
                            s3 = i27;
                        } else {
                            s3 = i31;
                        }
                        while (s3 >= i7) {
                            bArr4[i22] = bArr3[s3];
                            i22++;
                            s3 = sArr[s3];
                        }
                        i29 = bArr3[s3] & UByte.MAX_VALUE;
                        byte b4 = (byte) i29;
                        bArr2[i20] = b4;
                        while (true) {
                            i20++;
                            i12++;
                            if (i22 <= 0) {
                                break;
                            }
                            i22--;
                            bArr2[i20] = bArr4[i22];
                        }
                        byte[] bArr6 = bArr4;
                        if (i25 < 4096) {
                            sArr[i25] = (short) i27;
                            bArr3[i25] = b4;
                            i25++;
                            if ((i25 & i16) == 0 && i25 < 4096) {
                                i26++;
                                i16 += i25;
                            }
                        }
                        i27 = i31;
                        i9 = i30;
                        i24 = i24;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i20, i6, (byte) 0);
    }

    /* renamed from: m */
    public int m4915m(int i4) {
        if (i4 >= 0) {
            C3773c c3773c = this.f4503l;
            if (i4 < c3773c.f4476c) {
                return ((C3772b) c3773c.f4478e.get(i4)).f4471i;
            }
        }
        return -1;
    }

    /* renamed from: n */
    public final Bitmap m4916n() {
        Boolean bool = this.f4510s;
        Bitmap bitmapMo4883a = this.f4494c.mo4883a(this.f4509r, this.f4508q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f4511t);
        bitmapMo4883a.setHasAlpha(true);
        return bitmapMo4883a;
    }

    /* renamed from: o */
    public final int m4917o() {
        int iM4918p = m4918p();
        if (iM4918p <= 0) {
            return iM4918p;
        }
        ByteBuffer byteBuffer = this.f4495d;
        byteBuffer.get(this.f4496e, 0, Math.min(iM4918p, byteBuffer.remaining()));
        return iM4918p;
    }

    /* renamed from: p */
    public final int m4918p() {
        return this.f4495d.get() & UByte.MAX_VALUE;
    }

    /* renamed from: q */
    public synchronized void m4919q(C3773c c3773c, ByteBuffer byteBuffer, int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i4);
        }
        int iHighestOneBit = Integer.highestOneBit(i4);
        this.f4506o = 0;
        this.f4503l = c3773c;
        this.f4502k = -1;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f4495d = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f4495d.order(ByteOrder.LITTLE_ENDIAN);
        this.f4505n = false;
        Iterator it = c3773c.f4478e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((C3772b) it.next()).f4469g == 3) {
                this.f4505n = true;
                break;
            }
        }
        this.f4507p = iHighestOneBit;
        int i5 = c3773c.f4479f;
        this.f4509r = i5 / iHighestOneBit;
        int i6 = c3773c.f4480g;
        this.f4508q = i6 / iHighestOneBit;
        this.f4500i = this.f4494c.mo4887e(i5 * i6);
        this.f4501j = this.f4494c.mo4884b(this.f4509r * this.f4508q);
    }

    /* renamed from: r */
    public final Bitmap m4920r(C3772b c3772b, C3772b c3772b2) {
        int i4;
        int i5;
        Bitmap bitmap;
        int[] iArr = this.f4501j;
        int i6 = 0;
        if (c3772b2 == null) {
            Bitmap bitmap2 = this.f4504m;
            if (bitmap2 != null) {
                this.f4494c.mo4885c(bitmap2);
            }
            this.f4504m = null;
            Arrays.fill(iArr, 0);
        }
        if (c3772b2 != null && c3772b2.f4469g == 3 && this.f4504m == null) {
            Arrays.fill(iArr, 0);
        }
        if (c3772b2 != null && (i5 = c3772b2.f4469g) > 0) {
            if (i5 == 2) {
                if (!c3772b.f4468f) {
                    C3773c c3773c = this.f4503l;
                    int i7 = c3773c.f4485l;
                    if (c3772b.f4473k == null || c3773c.f4483j != c3772b.f4470h) {
                        i6 = i7;
                    }
                }
                int i8 = c3772b2.f4466d;
                int i9 = this.f4507p;
                int i10 = i8 / i9;
                int i11 = c3772b2.f4464b / i9;
                int i12 = c3772b2.f4465c / i9;
                int i13 = c3772b2.f4463a / i9;
                int i14 = this.f4509r;
                int i15 = (i11 * i14) + i13;
                int i16 = (i10 * i14) + i15;
                while (i15 < i16) {
                    int i17 = i15 + i12;
                    for (int i18 = i15; i18 < i17; i18++) {
                        iArr[i18] = i6;
                    }
                    i15 += this.f4509r;
                }
            } else if (i5 == 3 && (bitmap = this.f4504m) != null) {
                int i19 = this.f4509r;
                bitmap.getPixels(iArr, 0, i19, 0, 0, i19, this.f4508q);
            }
        }
        m4914l(c3772b);
        if (c3772b.f4467e || this.f4507p != 1) {
            m4912j(c3772b);
        } else {
            m4913k(c3772b);
        }
        if (this.f4505n && ((i4 = c3772b.f4469g) == 0 || i4 == 1)) {
            if (this.f4504m == null) {
                this.f4504m = m4916n();
            }
            Bitmap bitmap3 = this.f4504m;
            int i20 = this.f4509r;
            bitmap3.setPixels(iArr, 0, i20, 0, 0, i20, this.f4508q);
        }
        Bitmap bitmapM4916n = m4916n();
        int i21 = this.f4509r;
        bitmapM4916n.setPixels(iArr, 0, i21, 0, 0, i21, this.f4508q);
        return bitmapM4916n;
    }

    public C3775e(InterfaceC3771a.a aVar) {
        this.f4493b = new int[256];
        this.f4511t = Bitmap.Config.ARGB_8888;
        this.f4494c = aVar;
        this.f4503l = new C3773c();
    }
}
