package p195x;

import android.graphics.Bitmap;
import android.support.v4.media.C0039h;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import p024c0.C3210g;
import p024c0.InterfaceC3205b;

/* renamed from: x.d */
/* loaded from: classes2.dex */
public final class C6740d {

    /* renamed from: a */
    public int[] f11381a;

    /* renamed from: c */
    public final C0039h f11383c;

    /* renamed from: d */
    public ByteBuffer f11384d;

    /* renamed from: e */
    public byte[] f11385e;

    /* renamed from: f */
    public short[] f11386f;

    /* renamed from: g */
    public byte[] f11387g;

    /* renamed from: h */
    public byte[] f11388h;

    /* renamed from: i */
    public byte[] f11389i;

    /* renamed from: j */
    public final int[] f11390j;

    /* renamed from: k */
    public int f11391k;

    /* renamed from: l */
    public C6738b f11392l;

    /* renamed from: m */
    public Bitmap f11393m;

    /* renamed from: n */
    public final boolean f11394n;

    /* renamed from: o */
    public int f11395o;

    /* renamed from: p */
    public final int f11396p;

    /* renamed from: q */
    public final int f11397q;

    /* renamed from: r */
    public final int f11398r;

    /* renamed from: s */
    public Boolean f11399s;

    /* renamed from: b */
    public final int[] f11382b = new int[256];

    /* renamed from: t */
    public Bitmap.Config f11400t = Bitmap.Config.ARGB_8888;

    public C6740d(C0039h c0039h, C6738b c6738b, ByteBuffer byteBuffer, int i) {
        this.f11383c = c0039h;
        this.f11392l = new C6738b();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                int i8 = 0;
                this.f11395o = 0;
                this.f11392l = c6738b;
                this.f11391k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f11384d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f11384d.order(ByteOrder.LITTLE_ENDIAN);
                this.f11394n = false;
                ArrayList arrayList = c6738b.f11370e;
                int size = arrayList.size();
                while (true) {
                    if (i8 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i8);
                    i8++;
                    if (((C6737a) obj).f11361g == 3) {
                        this.f11394n = true;
                        break;
                    }
                }
                this.f11396p = iHighestOneBit;
                int i9 = c6738b.f11371f;
                this.f11398r = i9 / iHighestOneBit;
                int i10 = c6738b.f11372g;
                this.f11397q = i10 / iHighestOneBit;
                this.f11389i = (byte[]) ((C3210g) this.f11383c.f97c).m2155e(byte[].class, i9 * i10);
                this.f11390j = (int[]) ((C3210g) this.f11383c.f97c).m2155e(int[].class, this.f11398r * this.f11397q);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final Bitmap m6423a() {
        Boolean bool = this.f11399s;
        Bitmap bitmapMo2141a = ((InterfaceC3205b) this.f11383c.f96b).mo2141a(this.f11398r, this.f11397q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f11400t);
        bitmapMo2141a.setHasAlpha(true);
        return bitmapMo2141a;
    }

    /* renamed from: b */
    public final synchronized Bitmap m6424b() {
        try {
            if (this.f11392l.f11368c <= 0 || this.f11391k < 0) {
                if (Log.isLoggable("d", 3)) {
                    Log.d("d", "Unable to decode frame, frameCount=" + this.f11392l.f11368c + ", framePointer=" + this.f11391k);
                }
                this.f11395o = 1;
            }
            int i = this.f11395o;
            if (i != 1 && i != 2) {
                this.f11395o = 0;
                if (this.f11385e == null) {
                    this.f11385e = (byte[]) ((C3210g) this.f11383c.f97c).m2155e(byte[].class, 255);
                }
                C6737a c6737a = (C6737a) this.f11392l.f11370e.get(this.f11391k);
                int i8 = this.f11391k - 1;
                C6737a c6737a2 = i8 >= 0 ? (C6737a) this.f11392l.f11370e.get(i8) : null;
                int[] iArr = c6737a.f11365k;
                if (iArr == null) {
                    iArr = this.f11392l.f11366a;
                }
                this.f11381a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("d", 3)) {
                        Log.d("d", "No valid color table found for frame #" + this.f11391k);
                    }
                    this.f11395o = 1;
                    return null;
                }
                if (c6737a.f11360f) {
                    System.arraycopy(iArr, 0, this.f11382b, 0, iArr.length);
                    int[] iArr2 = this.f11382b;
                    this.f11381a = iArr2;
                    iArr2[c6737a.f11362h] = 0;
                    if (c6737a.f11361g == 2 && this.f11391k == 0) {
                        this.f11399s = Boolean.TRUE;
                    }
                }
                return m6426d(c6737a, c6737a2);
            }
            if (Log.isLoggable("d", 3)) {
                Log.d("d", "Unable to decode frame, status=" + this.f11395o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final void m6425c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f11400t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d7 A[PHI: r5
      0x01d7: PHI (r5v44 int) = (r5v38 int), (r5v46 int), (r5v46 int) binds: [B:89:0x01c3, B:91:0x01ce, B:92:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap m6426d(p195x.C6737a r36, p195x.C6737a r37) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p195x.C6740d.m6426d(x.a, x.a):android.graphics.Bitmap");
    }
}
