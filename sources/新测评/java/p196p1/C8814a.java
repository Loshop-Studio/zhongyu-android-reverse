package p196p1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: p1.a */
/* loaded from: classes.dex */
public class C8814a extends Drawable {

    /* renamed from: a */
    public int f14985a;

    /* renamed from: b */
    public Paint f14986b = new Paint();

    /* renamed from: c */
    public Paint f14987c = new Paint();

    /* renamed from: d */
    public Paint f14988d = new Paint();

    /* renamed from: e */
    public int f14989e;

    /* renamed from: f */
    public int f14990f;

    /* renamed from: g */
    public Bitmap f14991g;

    public C8814a(int i10) {
        this.f14985a = 10;
        this.f14985a = i10;
        this.f14987c.setColor(-1);
        this.f14988d.setColor(-3421237);
    }

    /* renamed from: a */
    public final void m14771a() {
        if (getBounds().width() <= 0 || getBounds().height() <= 0) {
            return;
        }
        this.f14991g = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f14991g);
        Rect rect = new Rect();
        boolean z9 = true;
        for (int i10 = 0; i10 <= this.f14990f; i10++) {
            boolean z10 = z9;
            for (int i11 = 0; i11 <= this.f14989e; i11++) {
                int i12 = this.f14985a;
                int i13 = i10 * i12;
                rect.top = i13;
                int i14 = i11 * i12;
                rect.left = i14;
                rect.bottom = i13 + i12;
                rect.right = i14 + i12;
                canvas.drawRect(rect, z10 ? this.f14987c : this.f14988d);
                z10 = !z10;
            }
            z9 = !z9;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f14991g;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f14991g, (Rect) null, getBounds(), this.f14986b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        this.f14989e = (int) Math.ceil(rect.width() / this.f14985a);
        this.f14990f = (int) Math.ceil(iHeight / this.f14985a);
        m14771a();
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
