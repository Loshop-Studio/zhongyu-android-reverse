package p151l0;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.fragment.app.FragmentTransaction;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.UByte;
import p151l0.InterfaceC8482a;

/* renamed from: l0.e */
/* loaded from: classes3.dex */
public class C8486e implements InterfaceC8482a {

    /* renamed from: u */
    public static final String f14039u = "e";

    /* renamed from: a */
    public int[] f14040a;

    /* renamed from: b */
    public final int[] f14041b;

    /* renamed from: c */
    public final InterfaceC8482a.a f14042c;

    /* renamed from: d */
    public ByteBuffer f14043d;

    /* renamed from: e */
    public byte[] f14044e;

    /* renamed from: f */
    public short[] f14045f;

    /* renamed from: g */
    public byte[] f14046g;

    /* renamed from: h */
    public byte[] f14047h;

    /* renamed from: i */
    public byte[] f14048i;

    /* renamed from: j */
    public int[] f14049j;

    /* renamed from: k */
    public int f14050k;

    /* renamed from: l */
    public C8484c f14051l;

    /* renamed from: m */
    public Bitmap f14052m;

    /* renamed from: n */
    public boolean f14053n;

    /* renamed from: o */
    public int f14054o;

    /* renamed from: p */
    public int f14055p;

    /* renamed from: q */
    public int f14056q;

    /* renamed from: r */
    public int f14057r;

    /* renamed from: s */
    public Boolean f14058s;

    /* renamed from: t */
    public Bitmap.Config f14059t;

    public C8486e(InterfaceC8482a.a aVar, C8484c c8484c, ByteBuffer byteBuffer, int i10) {
        this(aVar);
        m13910q(c8484c, byteBuffer, i10);
    }

    @Override // p151l0.InterfaceC8482a
    /* renamed from: a */
    public synchronized Bitmap mo13866a() {
        try {
            if (this.f14051l.f14024c <= 0 || this.f14050k < 0) {
                if (Log.isLoggable(f14039u, 3)) {
                    int i10 = this.f14051l.f14024c;
                }
                this.f14054o = 1;
            }
            int i11 = this.f14054o;
            if (i11 != 1 && i11 != 2) {
                this.f14054o = 0;
                if (this.f14044e == null) {
                    this.f14044e = this.f14042c.mo13875b(255);
                }
                C8483b c8483b = (C8483b) this.f14051l.f14026e.get(this.f14050k);
                int i12 = this.f14050k - 1;
                C8483b c8483b2 = i12 >= 0 ? (C8483b) this.f14051l.f14026e.get(i12) : null;
                int[] iArr = c8483b.f14021k;
                if (iArr == null) {
                    iArr = this.f14051l.f14022a;
                }
                this.f14040a = iArr;
                if (iArr == null) {
                    Log.isLoggable(f14039u, 3);
                    this.f14054o = 1;
                    return null;
                }
                if (c8483b.f14016f) {
                    System.arraycopy(iArr, 0, this.f14041b, 0, iArr.length);
                    int[] iArr2 = this.f14041b;
                    this.f14040a = iArr2;
                    iArr2[c8483b.f14018h] = 0;
                    if (c8483b.f14017g == 2 && this.f14050k == 0) {
                        this.f14058s = Boolean.TRUE;
                    }
                }
                return m13911r(c8483b, c8483b2);
            }
            Log.isLoggable(f14039u, 3);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p151l0.InterfaceC8482a
    /* renamed from: b */
    public void mo13867b() {
        this.f14050k = (this.f14050k + 1) % this.f14051l.f14024c;
    }

    @Override // p151l0.InterfaceC8482a
    /* renamed from: c */
    public int mo13868c() {
        return this.f14051l.f14024c;
    }

    @Override // p151l0.InterfaceC8482a
    public void clear() {
        this.f14051l = null;
        byte[] bArr = this.f14048i;
        if (bArr != null) {
            this.f14042c.mo13878e(bArr);
        }
        int[] iArr = this.f14049j;
        if (iArr != null) {
            this.f14042c.mo13879f(iArr);
        }
        Bitmap bitmap = this.f14052m;
        if (bitmap != null) {
            this.f14042c.mo13874a(bitmap);
        }
        this.f14052m = null;
        this.f14043d = null;
        this.f14058s = null;
        byte[] bArr2 = this.f14044e;
        if (bArr2 != null) {
            this.f14042c.mo13878e(bArr2);
        }
    }

    @Override // p151l0.InterfaceC8482a
    /* renamed from: d */
    public void mo13869d(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f14059t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // p151l0.InterfaceC8482a
    /* renamed from: e */
    public int mo13870e() {
        int i10;
        if (this.f14051l.f14024c <= 0 || (i10 = this.f14050k) < 0) {
            return 0;
        }
        return m13906m(i10);
    }

    @Override // p151l0.InterfaceC8482a
    /* renamed from: f */
    public void mo13871f() {
        this.f14050k = -1;
    }

    @Override // p151l0.InterfaceC8482a
    /* renamed from: g */
    public int mo13872g() {
        return this.f14050k;
    }

    @Override // p151l0.InterfaceC8482a
    public ByteBuffer getData() {
        return this.f14043d;
    }

    @Override // p151l0.InterfaceC8482a
    /* renamed from: h */
    public int mo13873h() {
        return this.f14043d.limit() + this.f14048i.length + (this.f14049j.length * 4);
    }

    /* renamed from: i */
    public final int m13902i(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f14055p + i10; i18++) {
            byte[] bArr = this.f14048i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f14040a[bArr[i18] & UByte.MAX_VALUE];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f14055p + i20; i21++) {
            byte[] bArr2 = this.f14048i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f14040a[bArr2[i21] & UByte.MAX_VALUE];
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
    public final void m13903j(C8483b c8483b) {
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = this.f14049j;
        int i14 = c8483b.f14014d;
        int i15 = this.f14055p;
        int i16 = i14 / i15;
        int i17 = c8483b.f14012b / i15;
        int i18 = c8483b.f14013c / i15;
        int i19 = c8483b.f14011a / i15;
        boolean z9 = this.f14050k == 0;
        int i20 = this.f14057r;
        int i21 = this.f14056q;
        byte[] bArr = this.f14048i;
        int[] iArr2 = this.f14040a;
        Boolean bool = this.f14058s;
        int i22 = 8;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1;
        while (i24 < i16) {
            int[] iArr3 = iArr;
            if (c8483b.f14015e) {
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
            boolean z10 = i15 == 1;
            if (i27 < i21) {
                int i28 = i27 * i20;
                int i29 = i28 + i19;
                int i30 = i29 + i18;
                int i31 = i28 + i20;
                if (i31 < i30) {
                    i30 = i31;
                }
                i12 = i11;
                int i32 = i24 * i15 * c8483b.f14013c;
                if (z10) {
                    int i33 = i29;
                    while (i33 < i30) {
                        int i34 = i33;
                        int i35 = iArr2[bArr[i32] & UByte.MAX_VALUE];
                        if (i35 != 0) {
                            iArr3[i34] = i35;
                        } else if (z9 && bool == null) {
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
                        int iM13902i = m13902i(i32, i36, c8483b.f14013c);
                        if (iM13902i != 0) {
                            iArr3[i37] = iM13902i;
                        } else if (z9 && bool == null) {
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
        if (this.f14058s == null) {
            this.f14058s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    /* renamed from: k */
    public final void m13904k(C8483b c8483b) {
        C8483b c8483b2 = c8483b;
        int[] iArr = this.f14049j;
        int i10 = c8483b2.f14014d;
        int i11 = c8483b2.f14012b;
        int i12 = c8483b2.f14013c;
        int i13 = c8483b2.f14011a;
        boolean z9 = this.f14050k == 0;
        int i14 = this.f14057r;
        byte[] bArr = this.f14048i;
        int[] iArr2 = this.f14040a;
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
            int i20 = c8483b2.f14013c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int[] iArr3 = iArr;
                int i22 = b11 & UByte.MAX_VALUE;
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
            c8483b2 = c8483b;
        }
        Boolean bool = this.f14058s;
        this.f14058s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f14058s == null && z9 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* renamed from: l */
    public final void m13905l(C8483b c8483b) {
        int i10;
        int i11;
        byte[] bArr;
        short s10;
        C8486e c8486e = this;
        if (c8483b != null) {
            c8486e.f14043d.position(c8483b.f14020j);
        }
        if (c8483b == null) {
            C8484c c8484c = c8486e.f14051l;
            i10 = c8484c.f14027f;
            i11 = c8484c.f14028g;
        } else {
            i10 = c8483b.f14013c;
            i11 = c8483b.f14014d;
        }
        int i12 = i10 * i11;
        byte[] bArr2 = c8486e.f14048i;
        if (bArr2 == null || bArr2.length < i12) {
            c8486e.f14048i = c8486e.f14042c.mo13875b(i12);
        }
        byte[] bArr3 = c8486e.f14048i;
        if (c8486e.f14045f == null) {
            c8486e.f14045f = new short[4096];
        }
        short[] sArr = c8486e.f14045f;
        if (c8486e.f14046g == null) {
            c8486e.f14046g = new byte[4096];
        }
        byte[] bArr4 = c8486e.f14046g;
        if (c8486e.f14047h == null) {
            c8486e.f14047h = new byte[FragmentTransaction.TRANSIT_FRAGMENT_OPEN];
        }
        byte[] bArr5 = c8486e.f14047h;
        int iM13909p = c8486e.m13909p();
        int i13 = 1 << iM13909p;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = iM13909p + 1;
        int i17 = (1 << i16) - 1;
        byte b10 = 0;
        for (int i18 = 0; i18 < i13; i18++) {
            sArr[i18] = 0;
            bArr4[i18] = (byte) i18;
        }
        byte[] bArr6 = c8486e.f14044e;
        int i19 = i16;
        int i20 = i15;
        int i21 = i17;
        int i22 = 0;
        int iM13908o = 0;
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
            if (iM13908o == 0) {
                iM13908o = c8486e.m13908o();
                if (iM13908o <= 0) {
                    c8486e.f14054o = 3;
                    break;
                }
                i23 = b10;
            }
            i25 += (bArr6[i23] & UByte.MAX_VALUE) << i24;
            i23++;
            iM13908o--;
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
                        int i36 = bArr[s10] & UByte.MAX_VALUE;
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
            c8486e = this;
        }
        Arrays.fill(bArr3, i26, i12, b10);
    }

    /* renamed from: m */
    public int m13906m(int i10) {
        if (i10 < 0) {
            return -1;
        }
        C8484c c8484c = this.f14051l;
        if (i10 < c8484c.f14024c) {
            return ((C8483b) c8484c.f14026e.get(i10)).f14019i;
        }
        return -1;
    }

    /* renamed from: n */
    public final Bitmap m13907n() {
        Boolean bool = this.f14058s;
        Bitmap bitmapMo13876c = this.f14042c.mo13876c(this.f14057r, this.f14056q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f14059t);
        bitmapMo13876c.setHasAlpha(true);
        return bitmapMo13876c;
    }

    /* renamed from: o */
    public final int m13908o() {
        int iM13909p = m13909p();
        if (iM13909p <= 0) {
            return iM13909p;
        }
        ByteBuffer byteBuffer = this.f14043d;
        byteBuffer.get(this.f14044e, 0, Math.min(iM13909p, byteBuffer.remaining()));
        return iM13909p;
    }

    /* renamed from: p */
    public final int m13909p() {
        return this.f14043d.get() & UByte.MAX_VALUE;
    }

    /* renamed from: q */
    public synchronized void m13910q(C8484c c8484c, ByteBuffer byteBuffer, int i10) {
        try {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
            int iHighestOneBit = Integer.highestOneBit(i10);
            this.f14054o = 0;
            this.f14051l = c8484c;
            this.f14050k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f14043d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f14043d.order(ByteOrder.LITTLE_ENDIAN);
            this.f14053n = false;
            Iterator it = c8484c.f14026e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C8483b) it.next()).f14017g == 3) {
                    this.f14053n = true;
                    break;
                }
            }
            this.f14055p = iHighestOneBit;
            int i11 = c8484c.f14027f;
            this.f14057r = i11 / iHighestOneBit;
            int i12 = c8484c.f14028g;
            this.f14056q = i12 / iHighestOneBit;
            this.f14048i = this.f14042c.mo13875b(i11 * i12);
            this.f14049j = this.f14042c.mo13877d(this.f14057r * this.f14056q);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: r */
    public final Bitmap m13911r(C8483b c8483b, C8483b c8483b2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f14049j;
        int i12 = 0;
        if (c8483b2 == null) {
            Bitmap bitmap2 = this.f14052m;
            if (bitmap2 != null) {
                this.f14042c.mo13874a(bitmap2);
            }
            this.f14052m = null;
            Arrays.fill(iArr, 0);
        }
        if (c8483b2 != null && c8483b2.f14017g == 3 && this.f14052m == null) {
            Arrays.fill(iArr, 0);
        }
        if (c8483b2 != null && (i11 = c8483b2.f14017g) > 0) {
            if (i11 == 2) {
                if (!c8483b.f14016f) {
                    C8484c c8484c = this.f14051l;
                    int i13 = c8484c.f14033l;
                    if (c8483b.f14021k == null || c8484c.f14031j != c8483b.f14018h) {
                        i12 = i13;
                    }
                }
                int i14 = c8483b2.f14014d;
                int i15 = this.f14055p;
                int i16 = i14 / i15;
                int i17 = c8483b2.f14012b / i15;
                int i18 = c8483b2.f14013c / i15;
                int i19 = c8483b2.f14011a / i15;
                int i20 = this.f14057r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f14057r;
                }
            } else if (i11 == 3 && (bitmap = this.f14052m) != null) {
                int i25 = this.f14057r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f14056q);
            }
        }
        m13905l(c8483b);
        if (c8483b.f14015e || this.f14055p != 1) {
            m13903j(c8483b);
        } else {
            m13904k(c8483b);
        }
        if (this.f14053n && ((i10 = c8483b.f14017g) == 0 || i10 == 1)) {
            if (this.f14052m == null) {
                this.f14052m = m13907n();
            }
            Bitmap bitmap3 = this.f14052m;
            int i26 = this.f14057r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f14056q);
        }
        Bitmap bitmapM13907n = m13907n();
        int i27 = this.f14057r;
        bitmapM13907n.setPixels(iArr, 0, i27, 0, 0, i27, this.f14056q);
        return bitmapM13907n;
    }

    public C8486e(InterfaceC8482a.a aVar) {
        this.f14041b = new int[256];
        this.f14059t = Bitmap.Config.ARGB_8888;
        this.f14042c = aVar;
        this.f14051l = new C8484c();
    }
}
