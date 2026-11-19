package p148k;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.fragment.app.FragmentTransaction;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p148k.InterfaceC9042a;

/* renamed from: k.e */
/* loaded from: classes3.dex */
public class C9046e implements InterfaceC9042a {

    /* renamed from: u */
    public static final String f17295u = "e";

    /* renamed from: a */
    public int[] f17296a;

    /* renamed from: b */
    public final int[] f17297b;

    /* renamed from: c */
    public final InterfaceC9042a.a f17298c;

    /* renamed from: d */
    public ByteBuffer f17299d;

    /* renamed from: e */
    public byte[] f17300e;

    /* renamed from: f */
    public short[] f17301f;

    /* renamed from: g */
    public byte[] f17302g;

    /* renamed from: h */
    public byte[] f17303h;

    /* renamed from: i */
    public byte[] f17304i;

    /* renamed from: j */
    public int[] f17305j;

    /* renamed from: k */
    public int f17306k;

    /* renamed from: l */
    public C9044c f17307l;

    /* renamed from: m */
    public Bitmap f17308m;

    /* renamed from: n */
    public boolean f17309n;

    /* renamed from: o */
    public int f17310o;

    /* renamed from: p */
    public int f17311p;

    /* renamed from: q */
    public int f17312q;

    /* renamed from: r */
    public int f17313r;

    /* renamed from: s */
    public Boolean f17314s;

    /* renamed from: t */
    public Bitmap.Config f17315t;

    public C9046e(InterfaceC9042a.a aVar, C9044c c9044c, ByteBuffer byteBuffer, int i10) {
        this(aVar);
        m15838q(c9044c, byteBuffer, i10);
    }

    @Override // p148k.InterfaceC9042a
    /* renamed from: a */
    public synchronized Bitmap mo15794a() {
        try {
            if (this.f17307l.f17280c <= 0 || this.f17306k < 0) {
                if (Log.isLoggable(f17295u, 3)) {
                    int i10 = this.f17307l.f17280c;
                }
                this.f17310o = 1;
            }
            int i11 = this.f17310o;
            if (i11 != 1 && i11 != 2) {
                this.f17310o = 0;
                if (this.f17300e == null) {
                    this.f17300e = this.f17298c.mo15803b(255);
                }
                C9043b c9043b = (C9043b) this.f17307l.f17282e.get(this.f17306k);
                int i12 = this.f17306k - 1;
                C9043b c9043b2 = i12 >= 0 ? (C9043b) this.f17307l.f17282e.get(i12) : null;
                int[] iArr = c9043b.f17277k;
                if (iArr == null) {
                    iArr = this.f17307l.f17278a;
                }
                this.f17296a = iArr;
                if (iArr == null) {
                    Log.isLoggable(f17295u, 3);
                    this.f17310o = 1;
                    return null;
                }
                if (c9043b.f17272f) {
                    System.arraycopy(iArr, 0, this.f17297b, 0, iArr.length);
                    int[] iArr2 = this.f17297b;
                    this.f17296a = iArr2;
                    iArr2[c9043b.f17274h] = 0;
                    if (c9043b.f17273g == 2 && this.f17306k == 0) {
                        this.f17314s = Boolean.TRUE;
                    }
                }
                return m15839r(c9043b, c9043b2);
            }
            Log.isLoggable(f17295u, 3);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p148k.InterfaceC9042a
    /* renamed from: b */
    public void mo15795b() {
        this.f17306k = (this.f17306k + 1) % this.f17307l.f17280c;
    }

    @Override // p148k.InterfaceC9042a
    /* renamed from: c */
    public int mo15796c() {
        return this.f17307l.f17280c;
    }

    @Override // p148k.InterfaceC9042a
    public void clear() {
        this.f17307l = null;
        byte[] bArr = this.f17304i;
        if (bArr != null) {
            this.f17298c.mo15806e(bArr);
        }
        int[] iArr = this.f17305j;
        if (iArr != null) {
            this.f17298c.mo15807f(iArr);
        }
        Bitmap bitmap = this.f17308m;
        if (bitmap != null) {
            this.f17298c.mo15802a(bitmap);
        }
        this.f17308m = null;
        this.f17299d = null;
        this.f17314s = null;
        byte[] bArr2 = this.f17300e;
        if (bArr2 != null) {
            this.f17298c.mo15806e(bArr2);
        }
    }

    @Override // p148k.InterfaceC9042a
    /* renamed from: d */
    public void mo15797d(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f17315t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // p148k.InterfaceC9042a
    /* renamed from: e */
    public int mo15798e() {
        int i10;
        if (this.f17307l.f17280c <= 0 || (i10 = this.f17306k) < 0) {
            return 0;
        }
        return m15834m(i10);
    }

    @Override // p148k.InterfaceC9042a
    /* renamed from: f */
    public void mo15799f() {
        this.f17306k = -1;
    }

    @Override // p148k.InterfaceC9042a
    /* renamed from: g */
    public int mo15800g() {
        return this.f17306k;
    }

    @Override // p148k.InterfaceC9042a
    public ByteBuffer getData() {
        return this.f17299d;
    }

    @Override // p148k.InterfaceC9042a
    /* renamed from: h */
    public int mo15801h() {
        return this.f17299d.limit() + this.f17304i.length + (this.f17305j.length * 4);
    }

    /* renamed from: i */
    public final int m15830i(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f17311p + i10; i18++) {
            byte[] bArr = this.f17304i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f17296a[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f17311p + i20; i21++) {
            byte[] bArr2 = this.f17304i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f17296a[bArr2[i21] & 255];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    /* renamed from: j */
    public final void m15831j(C9043b c9043b) {
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = this.f17305j;
        int i14 = c9043b.f17270d;
        int i15 = this.f17311p;
        int i16 = i14 / i15;
        int i17 = c9043b.f17268b / i15;
        int i18 = c9043b.f17269c / i15;
        int i19 = c9043b.f17267a / i15;
        boolean z10 = this.f17306k == 0;
        int i20 = this.f17313r;
        int i21 = this.f17312q;
        byte[] bArr = this.f17304i;
        int[] iArr2 = this.f17296a;
        Boolean bool = this.f17314s;
        int i22 = 8;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1;
        while (i24 < i16) {
            int[] iArr3 = iArr;
            if (c9043b.f17271e) {
                if (i23 >= i16) {
                    int i26 = i25 + 1;
                    i10 = i16;
                    if (i26 == 2) {
                        i25 = i26;
                        i23 = 4;
                    } else if (i26 == 3) {
                        i25 = i26;
                        i22 = 4;
                        i23 = 2;
                    } else if (i26 != 4) {
                        i25 = i26;
                    } else {
                        i25 = i26;
                        i23 = 1;
                        i22 = 2;
                    }
                } else {
                    i10 = i16;
                }
                i11 = i23 + i22;
            } else {
                i10 = i16;
                i11 = i23;
                i23 = i24;
            }
            int i27 = i23 + i17;
            boolean z11 = i15 == 1;
            if (i27 < i21) {
                int i28 = i27 * i20;
                int i29 = i28 + i19;
                int i30 = i29 + i18;
                int i31 = i28 + i20;
                if (i31 < i30) {
                    i30 = i31;
                }
                i12 = i11;
                int i32 = i24 * i15 * c9043b.f17269c;
                if (z11) {
                    int i33 = i29;
                    while (i33 < i30) {
                        int i34 = i33;
                        int i35 = iArr2[bArr[i32] & 255];
                        if (i35 != 0) {
                            iArr3[i34] = i35;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i15;
                        i33 = i34 + 1;
                    }
                } else {
                    int i36 = ((i30 - i29) * i15) + i32;
                    i13 = i15;
                    int i37 = i29;
                    while (i37 < i30) {
                        int i38 = i30;
                        int iM15830i = m15830i(i32, i36, c9043b.f17269c);
                        if (iM15830i != 0) {
                            iArr3[i37] = iM15830i;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i13;
                        i37++;
                        i30 = i38;
                    }
                    i24++;
                    i15 = i13;
                    iArr = iArr3;
                    i16 = i10;
                    i23 = i12;
                }
            } else {
                i12 = i11;
            }
            i13 = i15;
            i24++;
            i15 = i13;
            iArr = iArr3;
            i16 = i10;
            i23 = i12;
        }
        if (this.f17314s == null) {
            this.f17314s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    /* renamed from: k */
    public final void m15832k(C9043b c9043b) {
        C9043b c9043b2 = c9043b;
        int[] iArr = this.f17305j;
        int i10 = c9043b2.f17270d;
        int i11 = c9043b2.f17268b;
        int i12 = c9043b2.f17269c;
        int i13 = c9043b2.f17267a;
        boolean z10 = this.f17306k == 0;
        int i14 = this.f17313r;
        byte[] bArr = this.f17304i;
        int[] iArr2 = this.f17296a;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = c9043b2.f17269c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int[] iArr3 = iArr;
                int i22 = b11 & 255;
                if (i22 != b10) {
                    int i23 = iArr2[i22];
                    if (i23 != 0) {
                        iArr3[i21] = i23;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                iArr = iArr3;
            }
            i15++;
            c9043b2 = c9043b;
        }
        Boolean bool = this.f17314s;
        this.f17314s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f17314s == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* renamed from: l */
    public final void m15833l(C9043b c9043b) {
        int i10;
        int i11;
        byte[] bArr;
        short s10;
        C9046e c9046e = this;
        if (c9043b != null) {
            c9046e.f17299d.position(c9043b.f17276j);
        }
        if (c9043b == null) {
            C9044c c9044c = c9046e.f17307l;
            i10 = c9044c.f17283f;
            i11 = c9044c.f17284g;
        } else {
            i10 = c9043b.f17269c;
            i11 = c9043b.f17270d;
        }
        int i12 = i10 * i11;
        byte[] bArr2 = c9046e.f17304i;
        if (bArr2 == null || bArr2.length < i12) {
            c9046e.f17304i = c9046e.f17298c.mo15803b(i12);
        }
        byte[] bArr3 = c9046e.f17304i;
        if (c9046e.f17301f == null) {
            c9046e.f17301f = new short[4096];
        }
        short[] sArr = c9046e.f17301f;
        if (c9046e.f17302g == null) {
            c9046e.f17302g = new byte[4096];
        }
        byte[] bArr4 = c9046e.f17302g;
        if (c9046e.f17303h == null) {
            c9046e.f17303h = new byte[FragmentTransaction.TRANSIT_FRAGMENT_OPEN];
        }
        byte[] bArr5 = c9046e.f17303h;
        int iM15837p = c9046e.m15837p();
        int i13 = 1 << iM15837p;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = iM15837p + 1;
        int i17 = (1 << i16) - 1;
        byte b10 = 0;
        for (int i18 = 0; i18 < i13; i18++) {
            sArr[i18] = 0;
            bArr4[i18] = (byte) i18;
        }
        byte[] bArr6 = c9046e.f17300e;
        int i19 = i16;
        int i20 = i15;
        int i21 = i17;
        int i22 = 0;
        int iM15836o = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1;
        while (true) {
            if (i22 >= i12) {
                break;
            }
            if (iM15836o == 0) {
                iM15836o = c9046e.m15836o();
                if (iM15836o <= 0) {
                    c9046e.f17310o = 3;
                    break;
                }
                i23 = b10;
            }
            i25 += (bArr6[i23] & 255) << i24;
            i23++;
            iM15836o--;
            int i30 = i24 + 8;
            int i31 = i20;
            int i32 = i19;
            int i33 = i29;
            short[] sArr2 = sArr;
            int i34 = i27;
            while (true) {
                bArr = bArr4;
                if (i30 < i32) {
                    i20 = i31;
                    i27 = i34;
                    break;
                }
                int i35 = i25 & i21;
                i25 >>= i32;
                i30 -= i32;
                if (i35 == i13) {
                    i32 = i16;
                    i31 = i15;
                    i21 = i17;
                    bArr4 = bArr;
                    i33 = -1;
                } else {
                    if (i35 == i14) {
                        i27 = i34;
                        i20 = i31;
                        break;
                    }
                    byte[] bArr7 = bArr5;
                    if (i33 == -1) {
                        bArr3[i26] = bArr[i35];
                        i26++;
                        i22++;
                        i33 = i35;
                        i34 = i33;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                    } else {
                        if (i35 >= i31) {
                            bArr7[i28] = (byte) i34;
                            i28++;
                            s10 = i33;
                        } else {
                            s10 = i35;
                        }
                        while (s10 >= i13) {
                            bArr7[i28] = bArr[s10];
                            i28++;
                            s10 = sArr2[s10];
                        }
                        int i36 = bArr[s10] & 255;
                        byte b11 = (byte) i36;
                        bArr3[i26] = b11;
                        while (true) {
                            i26++;
                            i22++;
                            if (i28 <= 0) {
                                break;
                            }
                            i28--;
                            bArr3[i26] = bArr7[i28];
                        }
                        if (i31 < 4096) {
                            sArr2[i31] = (short) i33;
                            bArr[i31] = b11;
                            i31++;
                            if ((i31 & i21) == 0 && i31 < 4096) {
                                i32++;
                                i21 += i31;
                            }
                        }
                        i33 = i35;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                        i34 = i36;
                    }
                }
            }
            i24 = i30;
            sArr = sArr2;
            bArr4 = bArr;
            b10 = 0;
            i29 = i33;
            i19 = i32;
            c9046e = this;
        }
        Arrays.fill(bArr3, i26, i12, b10);
    }

    /* renamed from: m */
    public int m15834m(int i10) {
        if (i10 < 0) {
            return -1;
        }
        C9044c c9044c = this.f17307l;
        if (i10 < c9044c.f17280c) {
            return ((C9043b) c9044c.f17282e.get(i10)).f17275i;
        }
        return -1;
    }

    /* renamed from: n */
    public final Bitmap m15835n() {
        Boolean bool = this.f17314s;
        Bitmap bitmapMo15804c = this.f17298c.mo15804c(this.f17313r, this.f17312q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f17315t);
        bitmapMo15804c.setHasAlpha(true);
        return bitmapMo15804c;
    }

    /* renamed from: o */
    public final int m15836o() {
        int iM15837p = m15837p();
        if (iM15837p <= 0) {
            return iM15837p;
        }
        ByteBuffer byteBuffer = this.f17299d;
        byteBuffer.get(this.f17300e, 0, Math.min(iM15837p, byteBuffer.remaining()));
        return iM15837p;
    }

    /* renamed from: p */
    public final int m15837p() {
        return this.f17299d.get() & 255;
    }

    /* renamed from: q */
    public synchronized void m15838q(C9044c c9044c, ByteBuffer byteBuffer, int i10) {
        try {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
            int iHighestOneBit = Integer.highestOneBit(i10);
            this.f17310o = 0;
            this.f17307l = c9044c;
            this.f17306k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f17299d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f17299d.order(ByteOrder.LITTLE_ENDIAN);
            this.f17309n = false;
            Iterator it = c9044c.f17282e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C9043b) it.next()).f17273g == 3) {
                    this.f17309n = true;
                    break;
                }
            }
            this.f17311p = iHighestOneBit;
            int i11 = c9044c.f17283f;
            this.f17313r = i11 / iHighestOneBit;
            int i12 = c9044c.f17284g;
            this.f17312q = i12 / iHighestOneBit;
            this.f17304i = this.f17298c.mo15803b(i11 * i12);
            this.f17305j = this.f17298c.mo15805d(this.f17313r * this.f17312q);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: r */
    public final Bitmap m15839r(C9043b c9043b, C9043b c9043b2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f17305j;
        int i12 = 0;
        if (c9043b2 == null) {
            Bitmap bitmap2 = this.f17308m;
            if (bitmap2 != null) {
                this.f17298c.mo15802a(bitmap2);
            }
            this.f17308m = null;
            Arrays.fill(iArr, 0);
        }
        if (c9043b2 != null && c9043b2.f17273g == 3 && this.f17308m == null) {
            Arrays.fill(iArr, 0);
        }
        if (c9043b2 != null && (i11 = c9043b2.f17273g) > 0) {
            if (i11 == 2) {
                if (!c9043b.f17272f) {
                    C9044c c9044c = this.f17307l;
                    int i13 = c9044c.f17289l;
                    if (c9043b.f17277k == null || c9044c.f17287j != c9043b.f17274h) {
                        i12 = i13;
                    }
                }
                int i14 = c9043b2.f17270d;
                int i15 = this.f17311p;
                int i16 = i14 / i15;
                int i17 = c9043b2.f17268b / i15;
                int i18 = c9043b2.f17269c / i15;
                int i19 = c9043b2.f17267a / i15;
                int i20 = this.f17313r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f17313r;
                }
            } else if (i11 == 3 && (bitmap = this.f17308m) != null) {
                int i25 = this.f17313r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f17312q);
            }
        }
        m15833l(c9043b);
        if (c9043b.f17271e || this.f17311p != 1) {
            m15831j(c9043b);
        } else {
            m15832k(c9043b);
        }
        if (this.f17309n && ((i10 = c9043b.f17273g) == 0 || i10 == 1)) {
            if (this.f17308m == null) {
                this.f17308m = m15835n();
            }
            Bitmap bitmap3 = this.f17308m;
            int i26 = this.f17313r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f17312q);
        }
        Bitmap bitmapM15835n = m15835n();
        int i27 = this.f17313r;
        bitmapM15835n.setPixels(iArr, 0, i27, 0, 0, i27, this.f17312q);
        return bitmapM15835n;
    }

    public C9046e(InterfaceC9042a.a aVar) {
        this.f17297b = new int[256];
        this.f17315t = Bitmap.Config.ARGB_8888;
        this.f17298c = aVar;
        this.f17307l = new C9044c();
    }
}
