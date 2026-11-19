package p070b.p074b.p075a.p076a.p104z;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import p070b.p074b.p075a.p076a.p101w.C0675g;
import p070b.p074b.p075a.p076a.p101w.C0678j;

/* renamed from: b.b.a.a.z.g */
/* loaded from: classes.dex */
public class C0695g extends C0675g {

    /* renamed from: A */
    public final RectF f4131A;

    /* renamed from: B */
    public int f4132B;

    /* renamed from: z */
    public final Paint f4133z;

    public C0695g() {
        this(null);
    }

    public C0695g(C0678j c0678j) {
        super(c0678j == null ? new C0678j() : c0678j);
        Paint paint = new Paint(1);
        this.f4133z = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f4131A = new RectF();
    }

    @Override // p070b.p074b.p075a.p076a.p101w.C0675g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else {
            this.f4132B = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }
        super.draw(canvas);
        canvas.drawRect(this.f4131A, this.f4133z);
        if (getCallback() instanceof View) {
            return;
        }
        canvas.restoreToCount(this.f4132B);
    }

    /* renamed from: x */
    public void m2331x(float f2, float f3, float f4, float f5) {
        RectF rectF = this.f4131A;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }
}
