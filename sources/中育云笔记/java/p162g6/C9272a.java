package p162g6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: g6.a */
/* loaded from: classes5.dex */
public class C9272a extends Drawable {

    /* renamed from: a */
    public int f21608a;

    /* renamed from: b */
    public Paint f21609b = new Paint();

    /* renamed from: c */
    public Paint f21610c = new Paint();

    /* renamed from: d */
    public Paint f21611d = new Paint();

    /* renamed from: e */
    public int f21612e;

    /* renamed from: f */
    public int f21613f;

    /* renamed from: g */
    public Bitmap f21614g;

    public C9272a(int i10) {
        this.f21608a = 10;
        this.f21608a = i10;
        this.f21610c.setColor(-1);
        this.f21611d.setColor(-3421237);
    }

    /* renamed from: a */
    public final void m18261a() {
        if (getBounds().width() <= 0 || getBounds().height() <= 0) {
            return;
        }
        this.f21614g = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f21614g);
        Rect rect = new Rect();
        boolean z10 = true;
        for (int i10 = 0; i10 <= this.f21613f; i10++) {
            boolean z11 = z10;
            for (int i11 = 0; i11 <= this.f21612e; i11++) {
                int i12 = this.f21608a;
                int i13 = i10 * i12;
                rect.top = i13;
                int i14 = i11 * i12;
                rect.left = i14;
                rect.bottom = i13 + i12;
                rect.right = i14 + i12;
                canvas.drawRect(rect, z11 ? this.f21610c : this.f21611d);
                z11 = !z11;
            }
            z10 = !z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f21614g;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f21614g, (Rect) null, getBounds(), this.f21609b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        this.f21612e = (int) Math.ceil(rect.width() / this.f21608a);
        this.f21613f = (int) Math.ceil(iHeight / this.f21608a);
        m18261a();
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
