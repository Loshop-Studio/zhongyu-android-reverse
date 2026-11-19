package p082e1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: e1.a */
/* loaded from: classes4.dex */
public class C8346a extends Drawable {

    /* renamed from: a */
    public int f15855a;

    /* renamed from: b */
    public Paint f15856b = new Paint();

    /* renamed from: c */
    public Paint f15857c = new Paint();

    /* renamed from: d */
    public Paint f15858d = new Paint();

    /* renamed from: e */
    public int f15859e;

    /* renamed from: f */
    public int f15860f;

    /* renamed from: g */
    public Bitmap f15861g;

    public C8346a(int i10) {
        this.f15855a = 10;
        this.f15855a = i10;
        this.f15857c.setColor(-1);
        this.f15858d.setColor(-3421237);
    }

    /* renamed from: a */
    public final void m13589a() {
        if (getBounds().width() <= 0 || getBounds().height() <= 0) {
            return;
        }
        this.f15861g = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f15861g);
        Rect rect = new Rect();
        boolean z10 = true;
        for (int i10 = 0; i10 <= this.f15860f; i10++) {
            boolean z11 = z10;
            for (int i11 = 0; i11 <= this.f15859e; i11++) {
                int i12 = this.f15855a;
                int i13 = i10 * i12;
                rect.top = i13;
                int i14 = i11 * i12;
                rect.left = i14;
                rect.bottom = i13 + i12;
                rect.right = i14 + i12;
                canvas.drawRect(rect, z11 ? this.f15857c : this.f15858d);
                z11 = !z11;
            }
            z10 = !z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f15861g;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f15861g, (Rect) null, getBounds(), this.f15856b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        this.f15859e = (int) Math.ceil(rect.width() / this.f15855a);
        this.f15860f = (int) Math.ceil(iHeight / this.f15855a);
        m13589a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        throw new UnsupportedOperationException("Alpha is not supported by this drawable.");
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("ColorFilter is not supported by this drawable.");
    }
}
