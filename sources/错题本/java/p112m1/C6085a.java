package p112m1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: m1.a */
/* loaded from: classes3.dex */
public final class C6085a extends Drawable {

    /* renamed from: a */
    public final int f9713a;

    /* renamed from: b */
    public final Paint f9714b = new Paint();

    /* renamed from: c */
    public final Paint f9715c;

    /* renamed from: d */
    public final Paint f9716d;

    /* renamed from: e */
    public int f9717e;

    /* renamed from: f */
    public int f9718f;

    /* renamed from: g */
    public Bitmap f9719g;

    public C6085a(int i) {
        this.f9713a = 10;
        Paint paint = new Paint();
        this.f9715c = paint;
        Paint paint2 = new Paint();
        this.f9716d = paint2;
        this.f9713a = i;
        paint.setColor(-1);
        paint2.setColor(-3421237);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f9719g;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f9719g, (Rect) null, getBounds(), this.f9714b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        int iWidth = rect.width();
        int i = this.f9713a;
        this.f9717e = (int) Math.ceil(iWidth / i);
        this.f9718f = (int) Math.ceil(iHeight / i);
        if (getBounds().width() <= 0 || getBounds().height() <= 0) {
            return;
        }
        this.f9719g = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f9719g);
        Rect rect2 = new Rect();
        boolean z8 = true;
        for (int i8 = 0; i8 <= this.f9718f; i8++) {
            boolean z9 = z8;
            for (int i9 = 0; i9 <= this.f9717e; i9++) {
                int i10 = i8 * i;
                rect2.top = i10;
                int i11 = i9 * i;
                rect2.left = i11;
                rect2.bottom = i10 + i;
                rect2.right = i11 + i;
                canvas.drawRect(rect2, z9 ? this.f9715c : this.f9716d);
                z9 = !z9;
            }
            z8 = !z8;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw new UnsupportedOperationException("Alpha is not supported by this drawable.");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("ColorFilter is not supported by this drawable.");
    }
}
