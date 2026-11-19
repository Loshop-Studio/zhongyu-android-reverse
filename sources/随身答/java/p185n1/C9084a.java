package p185n1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: n1.a */
/* loaded from: classes4.dex */
public class C9084a extends Drawable {

    /* renamed from: a */
    public int f15291a;

    /* renamed from: b */
    public Paint f15292b = new Paint();

    /* renamed from: c */
    public Paint f15293c = new Paint();

    /* renamed from: d */
    public Paint f15294d = new Paint();

    /* renamed from: e */
    public int f15295e;

    /* renamed from: f */
    public int f15296f;

    /* renamed from: g */
    public Bitmap f15297g;

    public C9084a(int i9) {
        this.f15291a = 10;
        this.f15291a = i9;
        this.f15293c.setColor(-1);
        this.f15294d.setColor(-3421237);
    }

    /* renamed from: a */
    public final void m14577a() {
        if (getBounds().width() <= 0 || getBounds().height() <= 0) {
            return;
        }
        this.f15297g = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f15297g);
        Rect rect = new Rect();
        boolean z9 = true;
        for (int i9 = 0; i9 <= this.f15296f; i9++) {
            boolean z10 = z9;
            for (int i10 = 0; i10 <= this.f15295e; i10++) {
                int i11 = this.f15291a;
                int i12 = i9 * i11;
                rect.top = i12;
                int i13 = i10 * i11;
                rect.left = i13;
                rect.bottom = i12 + i11;
                rect.right = i13 + i11;
                canvas.drawRect(rect, z10 ? this.f15293c : this.f15294d);
                z10 = !z10;
            }
            z9 = !z9;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f15297g;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f15297g, (Rect) null, getBounds(), this.f15292b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        this.f15295e = (int) Math.ceil(rect.width() / this.f15291a);
        this.f15296f = (int) Math.ceil(iHeight / this.f15291a);
        m14577a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        throw new UnsupportedOperationException("Alpha is not supported by this drawable.");
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("ColorFilter is not supported by this drawable.");
    }
}
