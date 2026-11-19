package p156g0;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.fragment.app.FragmentTransaction;
import com.tendcloud.tenddata.C7863av;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p156g0.InterfaceC9253a;

/* renamed from: g0.e */
/* loaded from: classes3.dex */
public class C9257e implements InterfaceC9253a {

    /* renamed from: u */
    public static final String f21583u = "e";

    /* renamed from: a */
    public int[] f21584a;

    /* renamed from: b */
    public final int[] f21585b;

    /* renamed from: c */
    public final InterfaceC9253a.a f21586c;

    /* renamed from: d */
    public ByteBuffer f21587d;

    /* renamed from: e */
    public byte[] f21588e;

    /* renamed from: f */
    public short[] f21589f;

    /* renamed from: g */
    public byte[] f21590g;

    /* renamed from: h */
    public byte[] f21591h;

    /* renamed from: i */
    public byte[] f21592i;

    /* renamed from: j */
    public int[] f21593j;

    /* renamed from: k */
    public int f21594k;

    /* renamed from: l */
    public C9255c f21595l;

    /* renamed from: m */
    public Bitmap f21596m;

    /* renamed from: n */
    public boolean f21597n;

    /* renamed from: o */
    public int f21598o;

    /* renamed from: p */
    public int f21599p;

    /* renamed from: q */
    public int f21600q;

    /* renamed from: r */
    public int f21601r;

    /* renamed from: s */
    public Boolean f21602s;

    /* renamed from: t */
    public Bitmap.Config f21603t;

    public C9257e(InterfaceC9253a.a aVar, C9255c c9255c, ByteBuffer byteBuffer, int i10) {
        this(aVar);
        m18252q(c9255c, byteBuffer, i10);
    }

    @Override // p156g0.InterfaceC9253a
    /* renamed from: a */
    public synchronized Bitmap mo18208a() {
        try {
            if (this.f21595l.f21568c <= 0 || this.f21594k < 0) {
                if (Log.isLoggable(f21583u, 3)) {
                    int i10 = this.f21595l.f21568c;
                }
                this.f21598o = 1;
            }
            int i11 = this.f21598o;
            if (i11 != 1 && i11 != 2) {
                this.f21598o = 0;
                if (this.f21588e == null) {
                    this.f21588e = this.f21586c.mo18217b(255);
                }
                C9254b c9254b = (C9254b) this.f21595l.f21570e.get(this.f21594k);
                int i12 = this.f21594k - 1;
                C9254b c9254b2 = i12 >= 0 ? (C9254b) this.f21595l.f21570e.get(i12) : null;
                int[] iArr = c9254b.f21565k;
                if (iArr == null) {
                    iArr = this.f21595l.f21566a;
                }
                this.f21584a = iArr;
                if (iArr == null) {
                    Log.isLoggable(f21583u, 3);
                    this.f21598o = 1;
                    return null;
                }
                if (c9254b.f21560f) {
                    System.arraycopy(iArr, 0, this.f21585b, 0, iArr.length);
                    int[] iArr2 = this.f21585b;
                    this.f21584a = iArr2;
                    iArr2[c9254b.f21562h] = 0;
                    if (c9254b.f21561g == 2 && this.f21594k == 0) {
                        this.f21602s = Boolean.TRUE;
                    }
                }
                return m18253r(c9254b, c9254b2);
            }
            Log.isLoggable(f21583u, 3);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p156g0.InterfaceC9253a
    /* renamed from: b */
    public void mo18209b() {
        this.f21594k = (this.f21594k + 1) % this.f21595l.f21568c;
    }

    @Override // p156g0.InterfaceC9253a
    /* renamed from: c */
    public int mo18210c() {
        return this.f21595l.f21568c;
    }

    @Override // p156g0.InterfaceC9253a
    public void clear() {
        this.f21595l = null;
        byte[] bArr = this.f21592i;
        if (bArr != null) {
            this.f21586c.mo18220e(bArr);
        }
        int[] iArr = this.f21593j;
        if (iArr != null) {
            this.f21586c.mo18221f(iArr);
        }
        Bitmap bitmap = this.f21596m;
        if (bitmap != null) {
            this.f21586c.mo18216a(bitmap);
        }
        this.f21596m = null;
        this.f21587d = null;
        this.f21602s = null;
        byte[] bArr2 = this.f21588e;
        if (bArr2 != null) {
            this.f21586c.mo18220e(bArr2);
        }
    }

    @Override // p156g0.InterfaceC9253a
    /* renamed from: d */
    public void mo18211d(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f21603t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // p156g0.InterfaceC9253a
    /* renamed from: e */
    public int mo18212e() {
        int i10;
        if (this.f21595l.f21568c <= 0 || (i10 = this.f21594k) < 0) {
            return 0;
        }
        return m18248m(i10);
    }

    @Override // p156g0.InterfaceC9253a
    /* renamed from: f */
    public void mo18213f() {
        this.f21594k = -1;
    }

    @Override // p156g0.InterfaceC9253a
    /* renamed from: g */
    public int mo18214g() {
        return this.f21594k;
    }

    @Override // p156g0.InterfaceC9253a
    public ByteBuffer getData() {
        return this.f21587d;
    }

    @Override // p156g0.InterfaceC9253a
    /* renamed from: h */
    public int mo18215h() {
        return this.f21587d.limit() + this.f21592i.length + (this.f21593j.length * 4);
    }

    /* renamed from: i */
    public final int m18244i(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f21599p + i10; i18++) {
            byte[] bArr = this.f21592i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f21584a[bArr[i18] & C7863av.f14384i];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f21599p + i20; i21++) {
            byte[] bArr2 = this.f21592i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f21584a[bArr2[i21] & C7863av.f14384i];
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
    public final void m18245j(C9254b c9254b) {
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = this.f21593j;
        int i14 = c9254b.f21558d;
        int i15 = this.f21599p;
        int i16 = i14 / i15;
        int i17 = c9254b.f21556b / i15;
        int i18 = c9254b.f21557c / i15;
        int i19 = c9254b.f21555a / i15;
        boolean z10 = this.f21594k == 0;
        int i20 = this.f21601r;
        int i21 = this.f21600q;
        byte[] bArr = this.f21592i;
        int[] iArr2 = this.f21584a;
        Boolean bool = this.f21602s;
        int i22 = 8;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1;
        while (i24 < i16) {
            int[] iArr3 = iArr;
            if (c9254b.f21559e) {
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
                int i32 = i24 * i15 * c9254b.f21557c;
                if (z11) {
                    int i33 = i29;
                    while (i33 < i30) {
                        int i34 = i33;
                        int i35 = iArr2[bArr[i32] & C7863av.f14384i];
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
                        int iM18244i = m18244i(i32, i36, c9254b.f21557c);
                        if (iM18244i != 0) {
                            iArr3[i37] = iM18244i;
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
        if (this.f21602s == null) {
            this.f21602s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    /* renamed from: k */
    public final void m18246k(C9254b c9254b) {
        C9254b c9254b2 = c9254b;
        int[] iArr = this.f21593j;
        int i10 = c9254b2.f21558d;
        int i11 = c9254b2.f21556b;
        int i12 = c9254b2.f21557c;
        int i13 = c9254b2.f21555a;
        boolean z10 = this.f21594k == 0;
        int i14 = this.f21601r;
        byte[] bArr = this.f21592i;
        int[] iArr2 = this.f21584a;
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
            int i20 = c9254b2.f21557c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int[] iArr3 = iArr;
                int i22 = b11 & C7863av.f14384i;
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
            c9254b2 = c9254b;
        }
        Boolean bool = this.f21602s;
        this.f21602s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f21602s == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* renamed from: l */
    public final void m18247l(C9254b c9254b) {
        int i10;
        int i11;
        byte[] bArr;
        short s10;
        C9257e c9257e = this;
        if (c9254b != null) {
            c9257e.f21587d.position(c9254b.f21564j);
        }
        if (c9254b == null) {
            C9255c c9255c = c9257e.f21595l;
            i10 = c9255c.f21571f;
            i11 = c9255c.f21572g;
        } else {
            i10 = c9254b.f21557c;
            i11 = c9254b.f21558d;
        }
        int i12 = i10 * i11;
        byte[] bArr2 = c9257e.f21592i;
        if (bArr2 == null || bArr2.length < i12) {
            c9257e.f21592i = c9257e.f21586c.mo18217b(i12);
        }
        byte[] bArr3 = c9257e.f21592i;
        if (c9257e.f21589f == null) {
            c9257e.f21589f = new short[4096];
        }
        short[] sArr = c9257e.f21589f;
        if (c9257e.f21590g == null) {
            c9257e.f21590g = new byte[4096];
        }
        byte[] bArr4 = c9257e.f21590g;
        if (c9257e.f21591h == null) {
            c9257e.f21591h = new byte[FragmentTransaction.TRANSIT_FRAGMENT_OPEN];
        }
        byte[] bArr5 = c9257e.f21591h;
        int iM18251p = c9257e.m18251p();
        int i13 = 1 << iM18251p;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = iM18251p + 1;
        int i17 = (1 << i16) - 1;
        byte b10 = 0;
        for (int i18 = 0; i18 < i13; i18++) {
            sArr[i18] = 0;
            bArr4[i18] = (byte) i18;
        }
        byte[] bArr6 = c9257e.f21588e;
        int i19 = i16;
        int i20 = i15;
        int i21 = i17;
        int i22 = 0;
        int iM18250o = 0;
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
            if (iM18250o == 0) {
                iM18250o = c9257e.m18250o();
                if (iM18250o <= 0) {
                    c9257e.f21598o = 3;
                    break;
                }
                i23 = b10;
            }
            i25 += (bArr6[i23] & C7863av.f14384i) << i24;
            i23++;
            iM18250o--;
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
                        int i36 = bArr[s10] & C7863av.f14384i;
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
            c9257e = this;
        }
        Arrays.fill(bArr3, i26, i12, b10);
    }

    /* renamed from: m */
    public int m18248m(int i10) {
        if (i10 < 0) {
            return -1;
        }
        C9255c c9255c = this.f21595l;
        if (i10 < c9255c.f21568c) {
            return ((C9254b) c9255c.f21570e.get(i10)).f21563i;
        }
        return -1;
    }

    /* renamed from: n */
    public final Bitmap m18249n() {
        Boolean bool = this.f21602s;
        Bitmap bitmapMo18218c = this.f21586c.mo18218c(this.f21601r, this.f21600q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f21603t);
        bitmapMo18218c.setHasAlpha(true);
        return bitmapMo18218c;
    }

    /* renamed from: o */
    public final int m18250o() {
        int iM18251p = m18251p();
        if (iM18251p <= 0) {
            return iM18251p;
        }
        ByteBuffer byteBuffer = this.f21587d;
        byteBuffer.get(this.f21588e, 0, Math.min(iM18251p, byteBuffer.remaining()));
        return iM18251p;
    }

    /* renamed from: p */
    public final int m18251p() {
        return this.f21587d.get() & C7863av.f14384i;
    }

    /* renamed from: q */
    public synchronized void m18252q(C9255c c9255c, ByteBuffer byteBuffer, int i10) {
        try {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
            int iHighestOneBit = Integer.highestOneBit(i10);
            this.f21598o = 0;
            this.f21595l = c9255c;
            this.f21594k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f21587d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f21587d.order(ByteOrder.LITTLE_ENDIAN);
            this.f21597n = false;
            Iterator it = c9255c.f21570e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C9254b) it.next()).f21561g == 3) {
                    this.f21597n = true;
                    break;
                }
            }
            this.f21599p = iHighestOneBit;
            int i11 = c9255c.f21571f;
            this.f21601r = i11 / iHighestOneBit;
            int i12 = c9255c.f21572g;
            this.f21600q = i12 / iHighestOneBit;
            this.f21592i = this.f21586c.mo18217b(i11 * i12);
            this.f21593j = this.f21586c.mo18219d(this.f21601r * this.f21600q);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: r */
    public final Bitmap m18253r(C9254b c9254b, C9254b c9254b2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f21593j;
        int i12 = 0;
        if (c9254b2 == null) {
            Bitmap bitmap2 = this.f21596m;
            if (bitmap2 != null) {
                this.f21586c.mo18216a(bitmap2);
            }
            this.f21596m = null;
            Arrays.fill(iArr, 0);
        }
        if (c9254b2 != null && c9254b2.f21561g == 3 && this.f21596m == null) {
            Arrays.fill(iArr, 0);
        }
        if (c9254b2 != null && (i11 = c9254b2.f21561g) > 0) {
            if (i11 == 2) {
                if (!c9254b.f21560f) {
                    C9255c c9255c = this.f21595l;
                    int i13 = c9255c.f21577l;
                    if (c9254b.f21565k == null || c9255c.f21575j != c9254b.f21562h) {
                        i12 = i13;
                    }
                }
                int i14 = c9254b2.f21558d;
                int i15 = this.f21599p;
                int i16 = i14 / i15;
                int i17 = c9254b2.f21556b / i15;
                int i18 = c9254b2.f21557c / i15;
                int i19 = c9254b2.f21555a / i15;
                int i20 = this.f21601r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f21601r;
                }
            } else if (i11 == 3 && (bitmap = this.f21596m) != null) {
                int i25 = this.f21601r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f21600q);
            }
        }
        m18247l(c9254b);
        if (c9254b.f21559e || this.f21599p != 1) {
            m18245j(c9254b);
        } else {
            m18246k(c9254b);
        }
        if (this.f21597n && ((i10 = c9254b.f21561g) == 0 || i10 == 1)) {
            if (this.f21596m == null) {
                this.f21596m = m18249n();
            }
            Bitmap bitmap3 = this.f21596m;
            int i26 = this.f21601r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f21600q);
        }
        Bitmap bitmapM18249n = m18249n();
        int i27 = this.f21601r;
        bitmapM18249n.setPixels(iArr, 0, i27, 0, 0, i27, this.f21600q);
        return bitmapM18249n;
    }

    public C9257e(InterfaceC9253a.a aVar) {
        this.f21585b = new int[256];
        this.f21603t = Bitmap.Config.ARGB_8888;
        this.f21586c = aVar;
        this.f21595l = new C9255c();
    }
}
