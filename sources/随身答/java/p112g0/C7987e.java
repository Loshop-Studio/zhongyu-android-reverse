package p112g0;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.fragment.app.FragmentTransaction;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.UByte;
import p112g0.InterfaceC7983a;

/* renamed from: g0.e */
/* loaded from: classes3.dex */
public class C7987e implements InterfaceC7983a {

    /* renamed from: u */
    public static final String f13445u = "e";

    /* renamed from: a */
    public int[] f13446a;

    /* renamed from: b */
    public final int[] f13447b;

    /* renamed from: c */
    public final InterfaceC7983a.a f13448c;

    /* renamed from: d */
    public ByteBuffer f13449d;

    /* renamed from: e */
    public byte[] f13450e;

    /* renamed from: f */
    public short[] f13451f;

    /* renamed from: g */
    public byte[] f13452g;

    /* renamed from: h */
    public byte[] f13453h;

    /* renamed from: i */
    public byte[] f13454i;

    /* renamed from: j */
    public int[] f13455j;

    /* renamed from: k */
    public int f13456k;

    /* renamed from: l */
    public C7985c f13457l;

    /* renamed from: m */
    public Bitmap f13458m;

    /* renamed from: n */
    public boolean f13459n;

    /* renamed from: o */
    public int f13460o;

    /* renamed from: p */
    public int f13461p;

    /* renamed from: q */
    public int f13462q;

    /* renamed from: r */
    public int f13463r;

    /* renamed from: s */
    public Boolean f13464s;

    /* renamed from: t */
    public Bitmap.Config f13465t;

    public C7987e(InterfaceC7983a.a aVar, C7985c c7985c, ByteBuffer byteBuffer, int i9) {
        this(aVar);
        m12546q(c7985c, byteBuffer, i9);
    }

    @Override // p112g0.InterfaceC7983a
    /* renamed from: a */
    public synchronized Bitmap mo12502a() {
        try {
            if (this.f13457l.f13430c <= 0 || this.f13456k < 0) {
                if (Log.isLoggable(f13445u, 3)) {
                    int i9 = this.f13457l.f13430c;
                }
                this.f13460o = 1;
            }
            int i10 = this.f13460o;
            if (i10 != 1 && i10 != 2) {
                this.f13460o = 0;
                if (this.f13450e == null) {
                    this.f13450e = this.f13448c.mo12511b(255);
                }
                C7984b c7984b = (C7984b) this.f13457l.f13432e.get(this.f13456k);
                int i11 = this.f13456k - 1;
                C7984b c7984b2 = i11 >= 0 ? (C7984b) this.f13457l.f13432e.get(i11) : null;
                int[] iArr = c7984b.f13427k;
                if (iArr == null) {
                    iArr = this.f13457l.f13428a;
                }
                this.f13446a = iArr;
                if (iArr == null) {
                    Log.isLoggable(f13445u, 3);
                    this.f13460o = 1;
                    return null;
                }
                if (c7984b.f13422f) {
                    System.arraycopy(iArr, 0, this.f13447b, 0, iArr.length);
                    int[] iArr2 = this.f13447b;
                    this.f13446a = iArr2;
                    iArr2[c7984b.f13424h] = 0;
                    if (c7984b.f13423g == 2 && this.f13456k == 0) {
                        this.f13464s = Boolean.TRUE;
                    }
                }
                return m12547r(c7984b, c7984b2);
            }
            Log.isLoggable(f13445u, 3);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p112g0.InterfaceC7983a
    /* renamed from: b */
    public void mo12503b() {
        this.f13456k = (this.f13456k + 1) % this.f13457l.f13430c;
    }

    @Override // p112g0.InterfaceC7983a
    /* renamed from: c */
    public int mo12504c() {
        return this.f13457l.f13430c;
    }

    @Override // p112g0.InterfaceC7983a
    public void clear() {
        this.f13457l = null;
        byte[] bArr = this.f13454i;
        if (bArr != null) {
            this.f13448c.mo12514e(bArr);
        }
        int[] iArr = this.f13455j;
        if (iArr != null) {
            this.f13448c.mo12515f(iArr);
        }
        Bitmap bitmap = this.f13458m;
        if (bitmap != null) {
            this.f13448c.mo12510a(bitmap);
        }
        this.f13458m = null;
        this.f13449d = null;
        this.f13464s = null;
        byte[] bArr2 = this.f13450e;
        if (bArr2 != null) {
            this.f13448c.mo12514e(bArr2);
        }
    }

    @Override // p112g0.InterfaceC7983a
    /* renamed from: d */
    public void mo12505d(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f13465t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // p112g0.InterfaceC7983a
    /* renamed from: e */
    public int mo12506e() {
        int i9;
        if (this.f13457l.f13430c <= 0 || (i9 = this.f13456k) < 0) {
            return 0;
        }
        return m12542m(i9);
    }

    @Override // p112g0.InterfaceC7983a
    /* renamed from: f */
    public void mo12507f() {
        this.f13456k = -1;
    }

    @Override // p112g0.InterfaceC7983a
    /* renamed from: g */
    public int mo12508g() {
        return this.f13456k;
    }

    @Override // p112g0.InterfaceC7983a
    public ByteBuffer getData() {
        return this.f13449d;
    }

    @Override // p112g0.InterfaceC7983a
    /* renamed from: h */
    public int mo12509h() {
        return this.f13449d.limit() + this.f13454i.length + (this.f13455j.length * 4);
    }

    /* renamed from: i */
    public final int m12538i(int i9, int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = i9; i17 < this.f13461p + i9; i17++) {
            byte[] bArr = this.f13454i;
            if (i17 >= bArr.length || i17 >= i10) {
                break;
            }
            int i18 = this.f13446a[bArr[i17] & UByte.MAX_VALUE];
            if (i18 != 0) {
                i12 += (i18 >> 24) & 255;
                i13 += (i18 >> 16) & 255;
                i14 += (i18 >> 8) & 255;
                i15 += i18 & 255;
                i16++;
            }
        }
        int i19 = i9 + i11;
        for (int i20 = i19; i20 < this.f13461p + i19; i20++) {
            byte[] bArr2 = this.f13454i;
            if (i20 >= bArr2.length || i20 >= i10) {
                break;
            }
            int i21 = this.f13446a[bArr2[i20] & UByte.MAX_VALUE];
            if (i21 != 0) {
                i12 += (i21 >> 24) & 255;
                i13 += (i21 >> 16) & 255;
                i14 += (i21 >> 8) & 255;
                i15 += i21 & 255;
                i16++;
            }
        }
        if (i16 == 0) {
            return 0;
        }
        return ((i12 / i16) << 24) | ((i13 / i16) << 16) | ((i14 / i16) << 8) | (i15 / i16);
    }

    /* renamed from: j */
    public final void m12539j(C7984b c7984b) {
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr = this.f13455j;
        int i13 = c7984b.f13420d;
        int i14 = this.f13461p;
        int i15 = i13 / i14;
        int i16 = c7984b.f13418b / i14;
        int i17 = c7984b.f13419c / i14;
        int i18 = c7984b.f13417a / i14;
        boolean z9 = this.f13456k == 0;
        int i19 = this.f13463r;
        int i20 = this.f13462q;
        byte[] bArr = this.f13454i;
        int[] iArr2 = this.f13446a;
        Boolean bool = this.f13464s;
        int i21 = 8;
        int i22 = 0;
        int i23 = 0;
        int i24 = 1;
        while (i23 < i15) {
            int[] iArr3 = iArr;
            if (c7984b.f13421e) {
                if (i22 >= i15) {
                    int i25 = i24 + 1;
                    i9 = i15;
                    if (i25 == 2) {
                        i24 = i25;
                        i22 = 4;
                    } else if (i25 == 3) {
                        i24 = i25;
                        i21 = 4;
                        i22 = 2;
                    } else if (i25 != 4) {
                        i24 = i25;
                    } else {
                        i24 = i25;
                        i22 = 1;
                        i21 = 2;
                    }
                } else {
                    i9 = i15;
                }
                i10 = i22 + i21;
            } else {
                i9 = i15;
                i10 = i22;
                i22 = i23;
            }
            int i26 = i22 + i16;
            boolean z10 = i14 == 1;
            if (i26 < i20) {
                int i27 = i26 * i19;
                int i28 = i27 + i18;
                int i29 = i28 + i17;
                int i30 = i27 + i19;
                if (i30 < i29) {
                    i29 = i30;
                }
                i11 = i10;
                int i31 = i23 * i14 * c7984b.f13419c;
                if (z10) {
                    int i32 = i28;
                    while (i32 < i29) {
                        int i33 = i32;
                        int i34 = iArr2[bArr[i31] & UByte.MAX_VALUE];
                        if (i34 != 0) {
                            iArr3[i33] = i34;
                        } else if (z9 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i31 += i14;
                        i32 = i33 + 1;
                    }
                } else {
                    int i35 = ((i29 - i28) * i14) + i31;
                    i12 = i14;
                    int i36 = i28;
                    while (i36 < i29) {
                        int i37 = i29;
                        int iM12538i = m12538i(i31, i35, c7984b.f13419c);
                        if (iM12538i != 0) {
                            iArr3[i36] = iM12538i;
                        } else if (z9 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i31 += i12;
                        i36++;
                        i29 = i37;
                    }
                    i23++;
                    i14 = i12;
                    iArr = iArr3;
                    i15 = i9;
                    i22 = i11;
                }
            } else {
                i11 = i10;
            }
            i12 = i14;
            i23++;
            i14 = i12;
            iArr = iArr3;
            i15 = i9;
            i22 = i11;
        }
        if (this.f13464s == null) {
            this.f13464s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    /* renamed from: k */
    public final void m12540k(C7984b c7984b) {
        C7984b c7984b2 = c7984b;
        int[] iArr = this.f13455j;
        int i9 = c7984b2.f13420d;
        int i10 = c7984b2.f13418b;
        int i11 = c7984b2.f13419c;
        int i12 = c7984b2.f13417a;
        boolean z9 = this.f13456k == 0;
        int i13 = this.f13463r;
        byte[] bArr = this.f13454i;
        int[] iArr2 = this.f13446a;
        int i14 = 0;
        byte b10 = -1;
        while (i14 < i9) {
            int i15 = (i14 + i10) * i13;
            int i16 = i15 + i12;
            int i17 = i16 + i11;
            int i18 = i15 + i13;
            if (i18 < i17) {
                i17 = i18;
            }
            int i19 = c7984b2.f13419c * i14;
            int i20 = i16;
            while (i20 < i17) {
                byte b11 = bArr[i19];
                int[] iArr3 = iArr;
                int i21 = b11 & UByte.MAX_VALUE;
                if (i21 != b10) {
                    int i22 = iArr2[i21];
                    if (i22 != 0) {
                        iArr3[i20] = i22;
                    } else {
                        b10 = b11;
                    }
                }
                i19++;
                i20++;
                iArr = iArr3;
            }
            i14++;
            c7984b2 = c7984b;
        }
        Boolean bool = this.f13464s;
        this.f13464s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f13464s == null && z9 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* renamed from: l */
    public final void m12541l(C7984b c7984b) {
        int i9;
        int i10;
        byte[] bArr;
        short s9;
        C7987e c7987e = this;
        if (c7984b != null) {
            c7987e.f13449d.position(c7984b.f13426j);
        }
        if (c7984b == null) {
            C7985c c7985c = c7987e.f13457l;
            i9 = c7985c.f13433f;
            i10 = c7985c.f13434g;
        } else {
            i9 = c7984b.f13419c;
            i10 = c7984b.f13420d;
        }
        int i11 = i9 * i10;
        byte[] bArr2 = c7987e.f13454i;
        if (bArr2 == null || bArr2.length < i11) {
            c7987e.f13454i = c7987e.f13448c.mo12511b(i11);
        }
        byte[] bArr3 = c7987e.f13454i;
        if (c7987e.f13451f == null) {
            c7987e.f13451f = new short[4096];
        }
        short[] sArr = c7987e.f13451f;
        if (c7987e.f13452g == null) {
            c7987e.f13452g = new byte[4096];
        }
        byte[] bArr4 = c7987e.f13452g;
        if (c7987e.f13453h == null) {
            c7987e.f13453h = new byte[FragmentTransaction.TRANSIT_FRAGMENT_OPEN];
        }
        byte[] bArr5 = c7987e.f13453h;
        int iM12545p = c7987e.m12545p();
        int i12 = 1 << iM12545p;
        int i13 = i12 + 1;
        int i14 = i12 + 2;
        int i15 = iM12545p + 1;
        int i16 = (1 << i15) - 1;
        byte b10 = 0;
        for (int i17 = 0; i17 < i12; i17++) {
            sArr[i17] = 0;
            bArr4[i17] = (byte) i17;
        }
        byte[] bArr6 = c7987e.f13450e;
        int i18 = i15;
        int i19 = i14;
        int i20 = i16;
        int i21 = 0;
        int iM12544o = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = -1;
        while (true) {
            if (i21 >= i11) {
                break;
            }
            if (iM12544o == 0) {
                iM12544o = c7987e.m12544o();
                if (iM12544o <= 0) {
                    c7987e.f13460o = 3;
                    break;
                }
                i22 = b10;
            }
            i24 += (bArr6[i22] & UByte.MAX_VALUE) << i23;
            i22++;
            iM12544o--;
            int i29 = i23 + 8;
            int i30 = i19;
            int i31 = i18;
            int i32 = i28;
            short[] sArr2 = sArr;
            int i33 = i26;
            while (true) {
                bArr = bArr4;
                if (i29 < i31) {
                    i19 = i30;
                    i26 = i33;
                    break;
                }
                int i34 = i24 & i20;
                i24 >>= i31;
                i29 -= i31;
                if (i34 == i12) {
                    i31 = i15;
                    i30 = i14;
                    i20 = i16;
                    bArr4 = bArr;
                    i32 = -1;
                } else {
                    if (i34 == i13) {
                        i26 = i33;
                        i19 = i30;
                        break;
                    }
                    byte[] bArr7 = bArr5;
                    if (i32 == -1) {
                        bArr3[i25] = bArr[i34];
                        i25++;
                        i21++;
                        i32 = i34;
                        i33 = i32;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                    } else {
                        if (i34 >= i30) {
                            bArr7[i27] = (byte) i33;
                            i27++;
                            s9 = i32;
                        } else {
                            s9 = i34;
                        }
                        while (s9 >= i12) {
                            bArr7[i27] = bArr[s9];
                            i27++;
                            s9 = sArr2[s9];
                        }
                        int i35 = bArr[s9] & UByte.MAX_VALUE;
                        byte b11 = (byte) i35;
                        bArr3[i25] = b11;
                        while (true) {
                            i25++;
                            i21++;
                            if (i27 <= 0) {
                                break;
                            }
                            i27--;
                            bArr3[i25] = bArr7[i27];
                        }
                        if (i30 < 4096) {
                            sArr2[i30] = (short) i32;
                            bArr[i30] = b11;
                            i30++;
                            if ((i30 & i20) == 0 && i30 < 4096) {
                                i31++;
                                i20 += i30;
                            }
                        }
                        i32 = i34;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                        i33 = i35;
                    }
                }
            }
            i23 = i29;
            sArr = sArr2;
            bArr4 = bArr;
            b10 = 0;
            i28 = i32;
            i18 = i31;
            c7987e = this;
        }
        Arrays.fill(bArr3, i25, i11, b10);
    }

    /* renamed from: m */
    public int m12542m(int i9) {
        if (i9 < 0) {
            return -1;
        }
        C7985c c7985c = this.f13457l;
        if (i9 < c7985c.f13430c) {
            return ((C7984b) c7985c.f13432e.get(i9)).f13425i;
        }
        return -1;
    }

    /* renamed from: n */
    public final Bitmap m12543n() {
        Boolean bool = this.f13464s;
        Bitmap bitmapMo12512c = this.f13448c.mo12512c(this.f13463r, this.f13462q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f13465t);
        bitmapMo12512c.setHasAlpha(true);
        return bitmapMo12512c;
    }

    /* renamed from: o */
    public final int m12544o() {
        int iM12545p = m12545p();
        if (iM12545p <= 0) {
            return iM12545p;
        }
        ByteBuffer byteBuffer = this.f13449d;
        byteBuffer.get(this.f13450e, 0, Math.min(iM12545p, byteBuffer.remaining()));
        return iM12545p;
    }

    /* renamed from: p */
    public final int m12545p() {
        return this.f13449d.get() & UByte.MAX_VALUE;
    }

    /* renamed from: q */
    public synchronized void m12546q(C7985c c7985c, ByteBuffer byteBuffer, int i9) {
        try {
            if (i9 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i9);
            }
            int iHighestOneBit = Integer.highestOneBit(i9);
            this.f13460o = 0;
            this.f13457l = c7985c;
            this.f13456k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f13449d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f13449d.order(ByteOrder.LITTLE_ENDIAN);
            this.f13459n = false;
            Iterator it = c7985c.f13432e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C7984b) it.next()).f13423g == 3) {
                    this.f13459n = true;
                    break;
                }
            }
            this.f13461p = iHighestOneBit;
            int i10 = c7985c.f13433f;
            this.f13463r = i10 / iHighestOneBit;
            int i11 = c7985c.f13434g;
            this.f13462q = i11 / iHighestOneBit;
            this.f13454i = this.f13448c.mo12511b(i10 * i11);
            this.f13455j = this.f13448c.mo12513d(this.f13463r * this.f13462q);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: r */
    public final Bitmap m12547r(C7984b c7984b, C7984b c7984b2) {
        int i9;
        int i10;
        Bitmap bitmap;
        int[] iArr = this.f13455j;
        int i11 = 0;
        if (c7984b2 == null) {
            Bitmap bitmap2 = this.f13458m;
            if (bitmap2 != null) {
                this.f13448c.mo12510a(bitmap2);
            }
            this.f13458m = null;
            Arrays.fill(iArr, 0);
        }
        if (c7984b2 != null && c7984b2.f13423g == 3 && this.f13458m == null) {
            Arrays.fill(iArr, 0);
        }
        if (c7984b2 != null && (i10 = c7984b2.f13423g) > 0) {
            if (i10 == 2) {
                if (!c7984b.f13422f) {
                    C7985c c7985c = this.f13457l;
                    int i12 = c7985c.f13439l;
                    if (c7984b.f13427k == null || c7985c.f13437j != c7984b.f13424h) {
                        i11 = i12;
                    }
                }
                int i13 = c7984b2.f13420d;
                int i14 = this.f13461p;
                int i15 = i13 / i14;
                int i16 = c7984b2.f13418b / i14;
                int i17 = c7984b2.f13419c / i14;
                int i18 = c7984b2.f13417a / i14;
                int i19 = this.f13463r;
                int i20 = (i16 * i19) + i18;
                int i21 = (i15 * i19) + i20;
                while (i20 < i21) {
                    int i22 = i20 + i17;
                    for (int i23 = i20; i23 < i22; i23++) {
                        iArr[i23] = i11;
                    }
                    i20 += this.f13463r;
                }
            } else if (i10 == 3 && (bitmap = this.f13458m) != null) {
                int i24 = this.f13463r;
                bitmap.getPixels(iArr, 0, i24, 0, 0, i24, this.f13462q);
            }
        }
        m12541l(c7984b);
        if (c7984b.f13421e || this.f13461p != 1) {
            m12539j(c7984b);
        } else {
            m12540k(c7984b);
        }
        if (this.f13459n && ((i9 = c7984b.f13423g) == 0 || i9 == 1)) {
            if (this.f13458m == null) {
                this.f13458m = m12543n();
            }
            Bitmap bitmap3 = this.f13458m;
            int i25 = this.f13463r;
            bitmap3.setPixels(iArr, 0, i25, 0, 0, i25, this.f13462q);
        }
        Bitmap bitmapM12543n = m12543n();
        int i26 = this.f13463r;
        bitmapM12543n.setPixels(iArr, 0, i26, 0, 0, i26, this.f13462q);
        return bitmapM12543n;
    }

    public C7987e(InterfaceC7983a.a aVar) {
        this.f13447b = new int[256];
        this.f13465t = Bitmap.Config.ARGB_8888;
        this.f13448c = aVar;
        this.f13457l = new C7985c();
    }
}
