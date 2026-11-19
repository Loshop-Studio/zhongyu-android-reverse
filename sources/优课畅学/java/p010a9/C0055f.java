package p010a9;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.lang.reflect.Array;
import tv.cjump.jni.NativeBitmapFactory;

/* renamed from: a9.f */
/* loaded from: classes5.dex */
public class C0055f {

    /* renamed from: a */
    public Canvas f187a;

    /* renamed from: b */
    public Bitmap f188b;

    /* renamed from: c */
    public Bitmap[][] f189c;

    /* renamed from: d */
    public Object f190d;

    /* renamed from: e */
    public int f191e;

    /* renamed from: f */
    public int f192f;

    /* renamed from: g */
    public int f193g;

    /* renamed from: a */
    public void m202a(int i10, int i11, int i12, boolean z10) {
        if (!z10 ? !(i10 > this.f191e || i11 > this.f192f) : !(i10 != this.f191e || i11 != this.f192f)) {
            Bitmap bitmap = this.f188b;
            if (bitmap != null) {
                bitmap.eraseColor(0);
                this.f187a.setBitmap(this.f188b);
                m205d();
                return;
            }
        }
        if (this.f188b != null) {
            m204c();
        }
        this.f191e = i10;
        this.f192f = i11;
        Bitmap bitmapM18957a = NativeBitmapFactory.m18957a(i10, i11, Bitmap.Config.ARGB_8888);
        this.f188b = bitmapM18957a;
        if (i12 > 0) {
            this.f193g = i12;
            bitmapM18957a.setDensity(i12);
        }
        Canvas canvas = this.f187a;
        if (canvas != null) {
            canvas.setBitmap(this.f188b);
            return;
        }
        Canvas canvas2 = new Canvas(this.f188b);
        this.f187a = canvas2;
        canvas2.setDensity(i12);
    }

    /* renamed from: b */
    public final synchronized boolean m203b(Canvas canvas, float f10, float f11, Paint paint) {
        if (this.f189c == null) {
            Bitmap bitmap = this.f188b;
            if (bitmap == null) {
                return false;
            }
            canvas.drawBitmap(bitmap, f10, f11, paint);
            return true;
        }
        for (int i10 = 0; i10 < this.f189c.length; i10++) {
            int i11 = 0;
            while (true) {
                Bitmap[] bitmapArr = this.f189c[i10];
                if (i11 < bitmapArr.length) {
                    Bitmap bitmap2 = bitmapArr[i11];
                    if (bitmap2 != null) {
                        float width = (bitmap2.getWidth() * i11) + f10;
                        if (width <= canvas.getWidth() && bitmap2.getWidth() + width >= 0.0f) {
                            float height = (bitmap2.getHeight() * i10) + f11;
                            if (height <= canvas.getHeight() && bitmap2.getHeight() + height >= 0.0f) {
                                canvas.drawBitmap(bitmap2, width, height, paint);
                            }
                        }
                    }
                    i11++;
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    public synchronized void m204c() {
        try {
            Bitmap bitmap = this.f188b;
            this.f188b = null;
            this.f192f = 0;
            this.f191e = 0;
            if (bitmap != null) {
                bitmap.recycle();
            }
            m205d();
            this.f190d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: d */
    public final void m205d() {
        Bitmap[][] bitmapArr = this.f189c;
        this.f189c = null;
        if (bitmapArr != null) {
            for (int i10 = 0; i10 < bitmapArr.length; i10++) {
                int i11 = 0;
                while (true) {
                    Bitmap[] bitmapArr2 = bitmapArr[i10];
                    if (i11 < bitmapArr2.length) {
                        Bitmap bitmap = bitmapArr2[i11];
                        if (bitmap != null) {
                            bitmap.recycle();
                            bitmapArr[i10][i11] = null;
                        }
                        i11++;
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void m206e(int i10, int i11, int i12, int i13) {
        int i14;
        m205d();
        int i15 = this.f191e;
        if (i15 <= 0 || (i14 = this.f192f) <= 0 || this.f188b == null) {
            return;
        }
        if (i15 > i12 || i14 > i13) {
            int iMin = Math.min(i12, i10);
            int iMin2 = Math.min(i13, i11);
            int i16 = this.f191e;
            int i17 = (i16 / iMin) + (i16 % iMin == 0 ? 0 : 1);
            int i18 = this.f192f;
            int i19 = (i18 / iMin2) + (i18 % iMin2 == 0 ? 0 : 1);
            int i20 = i16 / i17;
            int i21 = i18 / i19;
            Bitmap[][] bitmapArr = (Bitmap[][]) Array.newInstance((Class<?>) Bitmap.class, i19, i17);
            if (this.f187a == null) {
                Canvas canvas = new Canvas();
                this.f187a = canvas;
                int i22 = this.f193g;
                if (i22 > 0) {
                    canvas.setDensity(i22);
                }
            }
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            for (int i23 = 0; i23 < i19; i23++) {
                for (int i24 = 0; i24 < i17; i24++) {
                    Bitmap[] bitmapArr2 = bitmapArr[i23];
                    Bitmap bitmapM18957a = NativeBitmapFactory.m18957a(i20, i21, Bitmap.Config.ARGB_8888);
                    bitmapArr2[i24] = bitmapM18957a;
                    int i25 = this.f193g;
                    if (i25 > 0) {
                        bitmapM18957a.setDensity(i25);
                    }
                    this.f187a.setBitmap(bitmapM18957a);
                    int i26 = i24 * i20;
                    int i27 = i23 * i21;
                    rect.set(i26, i27, i26 + i20, i27 + i21);
                    rect2.set(0, 0, bitmapM18957a.getWidth(), bitmapM18957a.getHeight());
                    this.f187a.drawBitmap(this.f188b, rect, rect2, (Paint) null);
                }
            }
            this.f187a.setBitmap(this.f188b);
            this.f189c = bitmapArr;
        }
    }
}
