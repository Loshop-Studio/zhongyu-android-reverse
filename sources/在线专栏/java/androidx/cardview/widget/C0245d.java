package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.d */
/* loaded from: classes.dex */
class C0245d extends Drawable {

    /* renamed from: a */
    private float f1268a;

    /* renamed from: c */
    private final RectF f1270c;

    /* renamed from: d */
    private final Rect f1271d;

    /* renamed from: e */
    private float f1272e;

    /* renamed from: h */
    private ColorStateList f1275h;

    /* renamed from: i */
    private PorterDuffColorFilter f1276i;

    /* renamed from: j */
    private ColorStateList f1277j;

    /* renamed from: f */
    private boolean f1273f = false;

    /* renamed from: g */
    private boolean f1274g = true;

    /* renamed from: k */
    private PorterDuff.Mode f1278k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private final Paint f1269b = new Paint(5);

    C0245d(ColorStateList colorStateList, float f4) {
        this.f1268a = f4;
        m1076e(colorStateList);
        this.f1270c = new RectF();
        this.f1271d = new Rect();
    }

    /* renamed from: a */
    private PorterDuffColorFilter m1075a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: e */
    private void m1076e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1275h = colorStateList;
        this.f1269b.setColor(colorStateList.getColorForState(getState(), this.f1275h.getDefaultColor()));
    }

    /* renamed from: i */
    private void m1077i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1270c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1271d.set(rect);
        if (this.f1273f) {
            this.f1271d.inset((int) Math.ceil(C0246e.m1084a(this.f1272e, this.f1268a, this.f1274g)), (int) Math.ceil(C0246e.m1085b(this.f1272e, this.f1268a, this.f1274g)));
            this.f1270c.set(this.f1271d);
        }
    }

    /* renamed from: b */
    public ColorStateList m1078b() {
        return this.f1275h;
    }

    /* renamed from: c */
    float m1079c() {
        return this.f1272e;
    }

    /* renamed from: d */
    public float m1080d() {
        return this.f1268a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z3;
        Paint paint = this.f1269b;
        if (this.f1276i == null || paint.getColorFilter() != null) {
            z3 = false;
        } else {
            paint.setColorFilter(this.f1276i);
            z3 = true;
        }
        RectF rectF = this.f1270c;
        float f4 = this.f1268a;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        if (z3) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: f */
    public void m1081f(ColorStateList colorStateList) {
        m1076e(colorStateList);
        invalidateSelf();
    }

    /* renamed from: g */
    void m1082g(float f4, boolean z3, boolean z4) {
        if (f4 == this.f1272e && this.f1273f == z3 && this.f1274g == z4) {
            return;
        }
        this.f1272e = f4;
        this.f1273f = z3;
        this.f1274g = z4;
        m1077i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1271d, this.f1268a);
    }

    /* renamed from: h */
    void m1083h(float f4) {
        if (f4 == this.f1268a) {
            return;
        }
        this.f1268a = f4;
        m1077i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1277j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1275h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m1077i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1275h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z3 = colorForState != this.f1269b.getColor();
        if (z3) {
            this.f1269b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1277j;
        if (colorStateList2 == null || (mode = this.f1278k) == null) {
            return z3;
        }
        this.f1276i = m1075a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f1269b.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1269b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1277j = colorStateList;
        this.f1276i = m1075a(colorStateList, this.f1278k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1278k = mode;
        this.f1276i = m1075a(this.f1277j, mode);
        invalidateSelf();
    }
}
