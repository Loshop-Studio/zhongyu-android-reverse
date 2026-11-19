package p046e0;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.fragment.app.FragmentTransaction;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.UByte;
import p046e0.InterfaceC6256a;

/* renamed from: e0.e */
/* loaded from: classes3.dex */
public class C6260e implements InterfaceC6256a {

    /* renamed from: u */
    public static final String f7594u = "e";

    /* renamed from: a */
    public int[] f7595a;

    /* renamed from: b */
    public final int[] f7596b;

    /* renamed from: c */
    public final InterfaceC6256a.a f7597c;

    /* renamed from: d */
    public ByteBuffer f7598d;

    /* renamed from: e */
    public byte[] f7599e;

    /* renamed from: f */
    public short[] f7600f;

    /* renamed from: g */
    public byte[] f7601g;

    /* renamed from: h */
    public byte[] f7602h;

    /* renamed from: i */
    public byte[] f7603i;

    /* renamed from: j */
    public int[] f7604j;

    /* renamed from: k */
    public int f7605k;

    /* renamed from: l */
    public C6258c f7606l;

    /* renamed from: m */
    public Bitmap f7607m;

    /* renamed from: n */
    public boolean f7608n;

    /* renamed from: o */
    public int f7609o;

    /* renamed from: p */
    public int f7610p;

    /* renamed from: q */
    public int f7611q;

    /* renamed from: r */
    public int f7612r;

    /* renamed from: s */
    public Boolean f7613s;

    /* renamed from: t */
    public Bitmap.Config f7614t;

    public C6260e(InterfaceC6256a.a aVar, C6258c c6258c, ByteBuffer byteBuffer, int i6) {
        this(aVar);
        m6395q(c6258c, byteBuffer, i6);
    }

    @Override // p046e0.InterfaceC6256a
    /* renamed from: a */
    public synchronized Bitmap mo6351a() {
        try {
            if (this.f7606l.f7579c <= 0 || this.f7605k < 0) {
                if (Log.isLoggable(f7594u, 3)) {
                    int i6 = this.f7606l.f7579c;
                }
                this.f7609o = 1;
            }
            int i7 = this.f7609o;
            if (i7 != 1 && i7 != 2) {
                this.f7609o = 0;
                if (this.f7599e == null) {
                    this.f7599e = this.f7597c.mo6360b(255);
                }
                C6257b c6257b = (C6257b) this.f7606l.f7581e.get(this.f7605k);
                int i8 = this.f7605k - 1;
                C6257b c6257b2 = i8 >= 0 ? (C6257b) this.f7606l.f7581e.get(i8) : null;
                int[] iArr = c6257b.f7576k;
                if (iArr == null) {
                    iArr = this.f7606l.f7577a;
                }
                this.f7595a = iArr;
                if (iArr == null) {
                    Log.isLoggable(f7594u, 3);
                    this.f7609o = 1;
                    return null;
                }
                if (c6257b.f7571f) {
                    System.arraycopy(iArr, 0, this.f7596b, 0, iArr.length);
                    int[] iArr2 = this.f7596b;
                    this.f7595a = iArr2;
                    iArr2[c6257b.f7573h] = 0;
                    if (c6257b.f7572g == 2 && this.f7605k == 0) {
                        this.f7613s = Boolean.TRUE;
                    }
                }
                return m6396r(c6257b, c6257b2);
            }
            Log.isLoggable(f7594u, 3);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p046e0.InterfaceC6256a
    /* renamed from: b */
    public void mo6352b() {
        this.f7605k = (this.f7605k + 1) % this.f7606l.f7579c;
    }

    @Override // p046e0.InterfaceC6256a
    /* renamed from: c */
    public int mo6353c() {
        return this.f7606l.f7579c;
    }

    @Override // p046e0.InterfaceC6256a
    public void clear() {
        this.f7606l = null;
        byte[] bArr = this.f7603i;
        if (bArr != null) {
            this.f7597c.mo6363e(bArr);
        }
        int[] iArr = this.f7604j;
        if (iArr != null) {
            this.f7597c.mo6364f(iArr);
        }
        Bitmap bitmap = this.f7607m;
        if (bitmap != null) {
            this.f7597c.mo6359a(bitmap);
        }
        this.f7607m = null;
        this.f7598d = null;
        this.f7613s = null;
        byte[] bArr2 = this.f7599e;
        if (bArr2 != null) {
            this.f7597c.mo6363e(bArr2);
        }
    }

    @Override // p046e0.InterfaceC6256a
    /* renamed from: d */
    public void mo6354d(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f7614t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // p046e0.InterfaceC6256a
    /* renamed from: e */
    public int mo6355e() {
        int i6;
        if (this.f7606l.f7579c <= 0 || (i6 = this.f7605k) < 0) {
            return 0;
        }
        return m6391m(i6);
    }

    @Override // p046e0.InterfaceC6256a
    /* renamed from: f */
    public void mo6356f() {
        this.f7605k = -1;
    }

    @Override // p046e0.InterfaceC6256a
    /* renamed from: g */
    public int mo6357g() {
        return this.f7605k;
    }

    @Override // p046e0.InterfaceC6256a
    public ByteBuffer getData() {
        return this.f7598d;
    }

    @Override // p046e0.InterfaceC6256a
    /* renamed from: h */
    public int mo6358h() {
        return this.f7598d.limit() + this.f7603i.length + (this.f7604j.length * 4);
    }

    /* renamed from: i */
    public final int m6387i(int i6, int i7, int i8) {
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = i6; i14 < this.f7610p + i6; i14++) {
            byte[] bArr = this.f7603i;
            if (i14 >= bArr.length || i14 >= i7) {
                break;
            }
            int i15 = this.f7595a[bArr[i14] & UByte.MAX_VALUE];
            if (i15 != 0) {
                i9 += (i15 >> 24) & 255;
                i10 += (i15 >> 16) & 255;
                i11 += (i15 >> 8) & 255;
                i12 += i15 & 255;
                i13++;
            }
        }
        int i16 = i6 + i8;
        for (int i17 = i16; i17 < this.f7610p + i16; i17++) {
            byte[] bArr2 = this.f7603i;
            if (i17 >= bArr2.length || i17 >= i7) {
                break;
            }
            int i18 = this.f7595a[bArr2[i17] & UByte.MAX_VALUE];
            if (i18 != 0) {
                i9 += (i18 >> 24) & 255;
                i10 += (i18 >> 16) & 255;
                i11 += (i18 >> 8) & 255;
                i12 += i18 & 255;
                i13++;
            }
        }
        if (i13 == 0) {
            return 0;
        }
        return ((i9 / i13) << 24) | ((i10 / i13) << 16) | ((i11 / i13) << 8) | (i12 / i13);
    }

    /* renamed from: j */
    public final void m6388j(C6257b c6257b) {
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f7604j;
        int i10 = c6257b.f7569d;
        int i11 = this.f7610p;
        int i12 = i10 / i11;
        int i13 = c6257b.f7567b / i11;
        int i14 = c6257b.f7568c / i11;
        int i15 = c6257b.f7566a / i11;
        boolean z6 = this.f7605k == 0;
        int i16 = this.f7612r;
        int i17 = this.f7611q;
        byte[] bArr = this.f7603i;
        int[] iArr2 = this.f7595a;
        Boolean bool = this.f7613s;
        int i18 = 8;
        int i19 = 0;
        int i20 = 0;
        int i21 = 1;
        while (i20 < i12) {
            int[] iArr3 = iArr;
            if (c6257b.f7570e) {
                if (i19 >= i12) {
                    int i22 = i21 + 1;
                    i6 = i12;
                    if (i22 == 2) {
                        i21 = i22;
                        i19 = 4;
                    } else if (i22 == 3) {
                        i21 = i22;
                        i18 = 4;
                        i19 = 2;
                    } else if (i22 != 4) {
                        i21 = i22;
                    } else {
                        i21 = i22;
                        i19 = 1;
                        i18 = 2;
                    }
                } else {
                    i6 = i12;
                }
                i7 = i19 + i18;
            } else {
                i6 = i12;
                i7 = i19;
                i19 = i20;
            }
            int i23 = i19 + i13;
            boolean z7 = i11 == 1;
            if (i23 < i17) {
                int i24 = i23 * i16;
                int i25 = i24 + i15;
                int i26 = i25 + i14;
                int i27 = i24 + i16;
                if (i27 < i26) {
                    i26 = i27;
                }
                i8 = i7;
                int i28 = i20 * i11 * c6257b.f7568c;
                if (z7) {
                    int i29 = i25;
                    while (i29 < i26) {
                        int i30 = i29;
                        int i31 = iArr2[bArr[i28] & UByte.MAX_VALUE];
                        if (i31 != 0) {
                            iArr3[i30] = i31;
                        } else if (z6 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i28 += i11;
                        i29 = i30 + 1;
                    }
                } else {
                    int i32 = ((i26 - i25) * i11) + i28;
                    i9 = i11;
                    int i33 = i25;
                    while (i33 < i26) {
                        int i34 = i26;
                        int iM6387i = m6387i(i28, i32, c6257b.f7568c);
                        if (iM6387i != 0) {
                            iArr3[i33] = iM6387i;
                        } else if (z6 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i28 += i9;
                        i33++;
                        i26 = i34;
                    }
                    i20++;
                    i11 = i9;
                    iArr = iArr3;
                    i12 = i6;
                    i19 = i8;
                }
            } else {
                i8 = i7;
            }
            i9 = i11;
            i20++;
            i11 = i9;
            iArr = iArr3;
            i12 = i6;
            i19 = i8;
        }
        if (this.f7613s == null) {
            this.f7613s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    /* renamed from: k */
    public final void m6389k(C6257b c6257b) {
        C6257b c6257b2 = c6257b;
        int[] iArr = this.f7604j;
        int i6 = c6257b2.f7569d;
        int i7 = c6257b2.f7567b;
        int i8 = c6257b2.f7568c;
        int i9 = c6257b2.f7566a;
        boolean z6 = this.f7605k == 0;
        int i10 = this.f7612r;
        byte[] bArr = this.f7603i;
        int[] iArr2 = this.f7595a;
        int i11 = 0;
        byte b7 = -1;
        while (i11 < i6) {
            int i12 = (i11 + i7) * i10;
            int i13 = i12 + i9;
            int i14 = i13 + i8;
            int i15 = i12 + i10;
            if (i15 < i14) {
                i14 = i15;
            }
            int i16 = c6257b2.f7568c * i11;
            int i17 = i13;
            while (i17 < i14) {
                byte b8 = bArr[i16];
                int[] iArr3 = iArr;
                int i18 = b8 & UByte.MAX_VALUE;
                if (i18 != b7) {
                    int i19 = iArr2[i18];
                    if (i19 != 0) {
                        iArr3[i17] = i19;
                    } else {
                        b7 = b8;
                    }
                }
                i16++;
                i17++;
                iArr = iArr3;
            }
            i11++;
            c6257b2 = c6257b;
        }
        Boolean bool = this.f7613s;
        this.f7613s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f7613s == null && z6 && b7 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* renamed from: l */
    public final void m6390l(C6257b c6257b) {
        int i6;
        int i7;
        byte[] bArr;
        short s6;
        C6260e c6260e = this;
        if (c6257b != null) {
            c6260e.f7598d.position(c6257b.f7575j);
        }
        if (c6257b == null) {
            C6258c c6258c = c6260e.f7606l;
            i6 = c6258c.f7582f;
            i7 = c6258c.f7583g;
        } else {
            i6 = c6257b.f7568c;
            i7 = c6257b.f7569d;
        }
        int i8 = i6 * i7;
        byte[] bArr2 = c6260e.f7603i;
        if (bArr2 == null || bArr2.length < i8) {
            c6260e.f7603i = c6260e.f7597c.mo6360b(i8);
        }
        byte[] bArr3 = c6260e.f7603i;
        if (c6260e.f7600f == null) {
            c6260e.f7600f = new short[4096];
        }
        short[] sArr = c6260e.f7600f;
        if (c6260e.f7601g == null) {
            c6260e.f7601g = new byte[4096];
        }
        byte[] bArr4 = c6260e.f7601g;
        if (c6260e.f7602h == null) {
            c6260e.f7602h = new byte[FragmentTransaction.TRANSIT_FRAGMENT_OPEN];
        }
        byte[] bArr5 = c6260e.f7602h;
        int iM6394p = c6260e.m6394p();
        int i9 = 1 << iM6394p;
        int i10 = i9 + 1;
        int i11 = i9 + 2;
        int i12 = iM6394p + 1;
        int i13 = (1 << i12) - 1;
        byte b7 = 0;
        for (int i14 = 0; i14 < i9; i14++) {
            sArr[i14] = 0;
            bArr4[i14] = (byte) i14;
        }
        byte[] bArr6 = c6260e.f7599e;
        int i15 = i12;
        int i16 = i11;
        int i17 = i13;
        int i18 = 0;
        int iM6393o = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = -1;
        while (true) {
            if (i18 >= i8) {
                break;
            }
            if (iM6393o == 0) {
                iM6393o = c6260e.m6393o();
                if (iM6393o <= 0) {
                    c6260e.f7609o = 3;
                    break;
                }
                i19 = b7;
            }
            i21 += (bArr6[i19] & UByte.MAX_VALUE) << i20;
            i19++;
            iM6393o--;
            int i26 = i20 + 8;
            int i27 = i16;
            int i28 = i15;
            int i29 = i25;
            short[] sArr2 = sArr;
            int i30 = i23;
            while (true) {
                bArr = bArr4;
                if (i26 < i28) {
                    i16 = i27;
                    i23 = i30;
                    break;
                }
                int i31 = i21 & i17;
                i21 >>= i28;
                i26 -= i28;
                if (i31 == i9) {
                    i28 = i12;
                    i27 = i11;
                    i17 = i13;
                    bArr4 = bArr;
                    i29 = -1;
                } else {
                    if (i31 == i10) {
                        i23 = i30;
                        i16 = i27;
                        break;
                    }
                    byte[] bArr7 = bArr5;
                    if (i29 == -1) {
                        bArr3[i22] = bArr[i31];
                        i22++;
                        i18++;
                        i29 = i31;
                        i30 = i29;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                    } else {
                        if (i31 >= i27) {
                            bArr7[i24] = (byte) i30;
                            i24++;
                            s6 = i29;
                        } else {
                            s6 = i31;
                        }
                        while (s6 >= i9) {
                            bArr7[i24] = bArr[s6];
                            i24++;
                            s6 = sArr2[s6];
                        }
                        int i32 = bArr[s6] & UByte.MAX_VALUE;
                        byte b8 = (byte) i32;
                        bArr3[i22] = b8;
                        while (true) {
                            i22++;
                            i18++;
                            if (i24 <= 0) {
                                break;
                            }
                            i24--;
                            bArr3[i22] = bArr7[i24];
                        }
                        if (i27 < 4096) {
                            sArr2[i27] = (short) i29;
                            bArr[i27] = b8;
                            i27++;
                            if ((i27 & i17) == 0 && i27 < 4096) {
                                i28++;
                                i17 += i27;
                            }
                        }
                        i29 = i31;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                        i30 = i32;
                    }
                }
            }
            i20 = i26;
            sArr = sArr2;
            bArr4 = bArr;
            b7 = 0;
            i25 = i29;
            i15 = i28;
            c6260e = this;
        }
        Arrays.fill(bArr3, i22, i8, b7);
    }

    /* renamed from: m */
    public int m6391m(int i6) {
        if (i6 < 0) {
            return -1;
        }
        C6258c c6258c = this.f7606l;
        if (i6 < c6258c.f7579c) {
            return ((C6257b) c6258c.f7581e.get(i6)).f7574i;
        }
        return -1;
    }

    /* renamed from: n */
    public final Bitmap m6392n() {
        Boolean bool = this.f7613s;
        Bitmap bitmapMo6361c = this.f7597c.mo6361c(this.f7612r, this.f7611q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f7614t);
        bitmapMo6361c.setHasAlpha(true);
        return bitmapMo6361c;
    }

    /* renamed from: o */
    public final int m6393o() {
        int iM6394p = m6394p();
        if (iM6394p <= 0) {
            return iM6394p;
        }
        ByteBuffer byteBuffer = this.f7598d;
        byteBuffer.get(this.f7599e, 0, Math.min(iM6394p, byteBuffer.remaining()));
        return iM6394p;
    }

    /* renamed from: p */
    public final int m6394p() {
        return this.f7598d.get() & UByte.MAX_VALUE;
    }

    /* renamed from: q */
    public synchronized void m6395q(C6258c c6258c, ByteBuffer byteBuffer, int i6) {
        try {
            if (i6 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i6);
            }
            int iHighestOneBit = Integer.highestOneBit(i6);
            this.f7609o = 0;
            this.f7606l = c6258c;
            this.f7605k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f7598d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f7598d.order(ByteOrder.LITTLE_ENDIAN);
            this.f7608n = false;
            Iterator it = c6258c.f7581e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C6257b) it.next()).f7572g == 3) {
                    this.f7608n = true;
                    break;
                }
            }
            this.f7610p = iHighestOneBit;
            int i7 = c6258c.f7582f;
            this.f7612r = i7 / iHighestOneBit;
            int i8 = c6258c.f7583g;
            this.f7611q = i8 / iHighestOneBit;
            this.f7603i = this.f7597c.mo6360b(i7 * i8);
            this.f7604j = this.f7597c.mo6362d(this.f7612r * this.f7611q);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: r */
    public final Bitmap m6396r(C6257b c6257b, C6257b c6257b2) {
        int i6;
        int i7;
        Bitmap bitmap;
        int[] iArr = this.f7604j;
        int i8 = 0;
        if (c6257b2 == null) {
            Bitmap bitmap2 = this.f7607m;
            if (bitmap2 != null) {
                this.f7597c.mo6359a(bitmap2);
            }
            this.f7607m = null;
            Arrays.fill(iArr, 0);
        }
        if (c6257b2 != null && c6257b2.f7572g == 3 && this.f7607m == null) {
            Arrays.fill(iArr, 0);
        }
        if (c6257b2 != null && (i7 = c6257b2.f7572g) > 0) {
            if (i7 == 2) {
                if (!c6257b.f7571f) {
                    C6258c c6258c = this.f7606l;
                    int i9 = c6258c.f7588l;
                    if (c6257b.f7576k == null || c6258c.f7586j != c6257b.f7573h) {
                        i8 = i9;
                    }
                }
                int i10 = c6257b2.f7569d;
                int i11 = this.f7610p;
                int i12 = i10 / i11;
                int i13 = c6257b2.f7567b / i11;
                int i14 = c6257b2.f7568c / i11;
                int i15 = c6257b2.f7566a / i11;
                int i16 = this.f7612r;
                int i17 = (i13 * i16) + i15;
                int i18 = (i12 * i16) + i17;
                while (i17 < i18) {
                    int i19 = i17 + i14;
                    for (int i20 = i17; i20 < i19; i20++) {
                        iArr[i20] = i8;
                    }
                    i17 += this.f7612r;
                }
            } else if (i7 == 3 && (bitmap = this.f7607m) != null) {
                int i21 = this.f7612r;
                bitmap.getPixels(iArr, 0, i21, 0, 0, i21, this.f7611q);
            }
        }
        m6390l(c6257b);
        if (c6257b.f7570e || this.f7610p != 1) {
            m6388j(c6257b);
        } else {
            m6389k(c6257b);
        }
        if (this.f7608n && ((i6 = c6257b.f7572g) == 0 || i6 == 1)) {
            if (this.f7607m == null) {
                this.f7607m = m6392n();
            }
            Bitmap bitmap3 = this.f7607m;
            int i22 = this.f7612r;
            bitmap3.setPixels(iArr, 0, i22, 0, 0, i22, this.f7611q);
        }
        Bitmap bitmapM6392n = m6392n();
        int i23 = this.f7612r;
        bitmapM6392n.setPixels(iArr, 0, i23, 0, 0, i23, this.f7611q);
        return bitmapM6392n;
    }

    public C6260e(InterfaceC6256a.a aVar) {
        this.f7596b = new int[256];
        this.f7614t = Bitmap.Config.ARGB_8888;
        this.f7597c = aVar;
        this.f7606l = new C6258c();
    }
}
