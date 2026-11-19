package p213p5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
import p023b5.InterfaceC5114d;

/* renamed from: p5.d */
/* loaded from: classes4.dex */
public final class C9325d implements InterfaceC5114d {

    /* renamed from: a */
    public final int f16194a;

    /* renamed from: b */
    public final int f16195b;

    /* renamed from: c */
    public Bitmap f16196c;

    /* renamed from: d */
    public Canvas f16197d;

    /* renamed from: e */
    public int f16198e;

    /* renamed from: f */
    public final Paint f16199f;

    public C9325d(int i9, int i10) {
        this.f16194a = i9;
        this.f16195b = i10;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, heig… Bitmap.Config.ARGB_8888)");
        this.f16196c = bitmapCreateBitmap;
        this.f16197d = new Canvas(this.f16196c);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.f16199f = paint;
    }

    @Override // p023b5.InterfaceC5114d
    /* renamed from: a */
    public void mo2174a(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f16197d.drawBitmap(bitmap, 0.0f, 0.0f, this.f16199f);
    }

    @Override // p023b5.InterfaceC5114d
    /* renamed from: b */
    public Rect mo2175b() {
        return new Rect(0, 0, this.f16194a, this.f16195b);
    }

    @Override // p023b5.InterfaceC5114d
    public void reset() {
        this.f16197d.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f16197d.drawColor(this.f16198e);
    }
}
