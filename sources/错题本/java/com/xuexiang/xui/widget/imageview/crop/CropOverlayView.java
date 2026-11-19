package com.xuexiang.xui.widget.imageview.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import com.xuexiang.xui.R$attr;
import kotlin.collections.AbstractC5806u;

/* loaded from: classes3.dex */
public class CropOverlayView extends View {

    /* renamed from: x */
    public static final float f4362x;

    /* renamed from: y */
    public static final float f4363y;

    /* renamed from: a */
    public Paint f4364a;

    /* renamed from: b */
    public Paint f4365b;

    /* renamed from: c */
    public Paint f4366c;

    /* renamed from: d */
    public Paint f4367d;

    /* renamed from: e */
    public Rect f4368e;

    /* renamed from: f */
    public float f4369f;

    /* renamed from: g */
    public float f4370g;

    /* renamed from: h */
    public Pair f4371h;

    /* renamed from: i */
    public Handle f4372i;

    /* renamed from: j */
    public boolean f4373j;

    /* renamed from: k */
    public int f4374k;

    /* renamed from: l */
    public int f4375l;

    /* renamed from: m */
    public float f4376m;

    /* renamed from: n */
    public int f4377n;

    /* renamed from: o */
    public boolean f4378o;

    /* renamed from: p */
    public float f4379p;

    /* renamed from: q */
    public float f4380q;

    /* renamed from: r */
    public float f4381r;

    /* renamed from: s */
    public int f4382s;

    /* renamed from: t */
    public int f4383t;

    /* renamed from: u */
    public Bitmap f4384u;

    /* renamed from: v */
    public int f4385v;

    /* renamed from: w */
    public int f4386w;

    static {
        float f = (5.0f / 2.0f) - (3.0f / 2.0f);
        f4362x = f;
        f4363y = (5.0f / 2.0f) + f;
    }

    public CropOverlayView(Context context) {
        super(context);
        this.f4373j = false;
        this.f4374k = 1;
        this.f4375l = 1;
        this.f4376m = 1 / 1;
        this.f4378o = false;
        this.f4382s = 0;
        this.f4383t = 0;
        this.f4384u = null;
        this.f4385v = 0;
        this.f4386w = 0;
        m3497c(context);
    }

    /* renamed from: f */
    public static boolean m3494f() {
        return Math.abs(Edge.LEFT.getCoordinate() - Edge.RIGHT.getCoordinate()) >= 100.0f && Math.abs(Edge.TOP.getCoordinate() - Edge.BOTTOM.getCoordinate()) >= 100.0f;
    }

    /* renamed from: a */
    public final void m3495a(Canvas canvas) {
        float fWidth = this.f4368e.width();
        float f = this.f4382s / fWidth;
        float fHeight = this.f4383t / this.f4368e.height();
        int width = (int) (Edge.getWidth() * f);
        int height = (int) (Edge.getHeight() * fHeight);
        this.f4364a.setStrokeWidth(0.0f);
        this.f4364a.setTextAlign(Paint.Align.CENTER);
        this.f4364a.setTextSize(25.0f);
        canvas.drawText(width + "x" + height, (Edge.RIGHT.getCoordinate() / 2.0f) + (Edge.LEFT.getCoordinate() / 2.0f), (Edge.BOTTOM.getCoordinate() / 2.0f) + (Edge.TOP.getCoordinate() / 2.0f), this.f4364a);
    }

    /* renamed from: b */
    public final void m3496b(Canvas canvas) {
        float coordinate = Edge.LEFT.getCoordinate();
        float coordinate2 = Edge.TOP.getCoordinate();
        float coordinate3 = Edge.RIGHT.getCoordinate();
        float coordinate4 = Edge.BOTTOM.getCoordinate();
        float width = Edge.getWidth() / 3.0f;
        float f = coordinate + width;
        canvas.drawLine(f, coordinate2, f, coordinate4, this.f4365b);
        float f7 = coordinate3 - width;
        canvas.drawLine(f7, coordinate2, f7, coordinate4, this.f4365b);
        float height = Edge.getHeight() / 3.0f;
        float f8 = coordinate2 + height;
        canvas.drawLine(coordinate, f8, coordinate3, f8, this.f4365b);
        float f9 = coordinate4 - height;
        canvas.drawLine(coordinate, f9, coordinate3, f9, this.f4365b);
    }

    /* renamed from: c */
    public final void m3497c(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f4369f = TypedValue.applyDimension(1, 24.0f, context.getResources().getDisplayMetrics());
        this.f4370g = TypedValue.applyDimension(1, 6.0f, displayMetrics);
        float fApplyDimension = TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics());
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#AAFFFFFF"));
        paint.setStrokeWidth(fApplyDimension);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f4364a = paint;
        Paint paint2 = new Paint();
        paint2.setColor(Color.parseColor("#AAFFFFFF"));
        paint2.setStrokeWidth(1.0f);
        this.f4365b = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(Color.parseColor("#B0000000"));
        this.f4367d = paint3;
        float fApplyDimension2 = TypedValue.applyDimension(1, 5.0f, context.getResources().getDisplayMetrics());
        Paint paint4 = new Paint();
        paint4.setColor(AbstractC5806u.m5252F(context, R$attr.colorAccent, 0));
        paint4.setStrokeWidth(fApplyDimension2);
        paint4.setStyle(style);
        this.f4366c = paint4;
        this.f4380q = TypedValue.applyDimension(1, f4362x, displayMetrics);
        this.f4379p = TypedValue.applyDimension(1, f4363y, displayMetrics);
        this.f4381r = TypedValue.applyDimension(1, 20.0f, displayMetrics);
        this.f4377n = 1;
    }

    /* renamed from: d */
    public final void m3498d(Rect rect) {
        if (!this.f4378o) {
            this.f4378o = true;
        }
        if (!this.f4373j) {
            float fWidth = rect.width() * 0.1f;
            float fHeight = rect.height() * 0.1f;
            Edge.LEFT.setCoordinate(rect.left + fWidth);
            Edge.TOP.setCoordinate(rect.top + fHeight);
            Edge.RIGHT.setCoordinate(rect.right - fWidth);
            Edge.BOTTOM.setCoordinate(rect.bottom - fHeight);
            return;
        }
        if (rect.width() / rect.height() > this.f4376m) {
            Edge edge = Edge.TOP;
            edge.setCoordinate(rect.top);
            Edge edge2 = Edge.BOTTOM;
            edge2.setCoordinate(rect.bottom);
            float width = getWidth() / 2.0f;
            float fMax = Math.max(40.0f, (edge2.getCoordinate() - edge.getCoordinate()) * this.f4376m);
            if (fMax == 40.0f) {
                this.f4376m = 40.0f / (edge2.getCoordinate() - edge.getCoordinate());
            }
            float f = fMax / 2.0f;
            Edge.LEFT.setCoordinate(width - f);
            Edge.RIGHT.setCoordinate(width + f);
            return;
        }
        Edge edge3 = Edge.LEFT;
        edge3.setCoordinate(rect.left);
        Edge edge4 = Edge.RIGHT;
        edge4.setCoordinate(rect.right);
        float height = getHeight() / 2.0f;
        float fMax2 = Math.max(40.0f, (edge4.getCoordinate() - edge3.getCoordinate()) / this.f4376m);
        if (fMax2 == 40.0f) {
            float coordinate = edge4.getCoordinate() - edge3.getCoordinate();
            if (coordinate > 0.0f) {
                this.f4376m = coordinate / 40.0f;
            }
        }
        float f7 = fMax2 / 2.0f;
        Edge.TOP.setCoordinate(height - f7);
        Edge.BOTTOM.setCoordinate(height + f7);
    }

    /* renamed from: e */
    public final void m3499e() {
        if (this.f4378o) {
            m3498d(this.f4368e);
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.f4368e;
        Edge edge = Edge.LEFT;
        float coordinate = edge.getCoordinate();
        Edge edge2 = Edge.TOP;
        float coordinate2 = edge2.getCoordinate();
        Edge edge3 = Edge.RIGHT;
        float coordinate3 = edge3.getCoordinate();
        Edge edge4 = Edge.BOTTOM;
        float coordinate4 = edge4.getCoordinate();
        canvas.drawRect(rect.left, rect.top, rect.right, coordinate2, this.f4367d);
        canvas.drawRect(rect.left, coordinate4, rect.right, rect.bottom, this.f4367d);
        canvas.drawRect(rect.left, coordinate2, coordinate, coordinate4, this.f4367d);
        canvas.drawRect(coordinate3, coordinate2, rect.right, coordinate4, this.f4367d);
        if (m3494f()) {
            int i = this.f4377n;
            if (i == 2) {
                m3496b(canvas);
                m3495a(canvas);
            } else if (i == 1 && this.f4372i != null) {
                m3496b(canvas);
                m3495a(canvas);
            }
        }
        canvas.drawRect(edge.getCoordinate(), edge2.getCoordinate(), edge3.getCoordinate(), edge4.getCoordinate(), this.f4364a);
        float coordinate5 = edge.getCoordinate();
        float coordinate6 = edge2.getCoordinate();
        float coordinate7 = edge3.getCoordinate();
        float coordinate8 = edge4.getCoordinate();
        Bitmap bitmap = this.f4384u;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, coordinate5 - (this.f4385v / 2.0f), coordinate6 - (this.f4386w / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f4384u, coordinate7 - (this.f4385v / 2.0f), coordinate6 - (this.f4386w / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f4384u, coordinate5 - (this.f4385v / 2.0f), coordinate8 - (this.f4386w / 2.0f), (Paint) null);
            canvas.drawBitmap(this.f4384u, coordinate7 - (this.f4385v / 2.0f), coordinate8 - (this.f4386w / 2.0f), (Paint) null);
            return;
        }
        float f = coordinate5 - this.f4380q;
        canvas.drawLine(f, coordinate6 - this.f4379p, f, coordinate6 + this.f4381r, this.f4366c);
        float f7 = coordinate6 - this.f4380q;
        canvas.drawLine(coordinate5, f7, coordinate5 + this.f4381r, f7, this.f4366c);
        float f8 = coordinate7 + this.f4380q;
        canvas.drawLine(f8, coordinate6 - this.f4379p, f8, coordinate6 + this.f4381r, this.f4366c);
        float f9 = coordinate6 - this.f4380q;
        canvas.drawLine(coordinate7, f9, coordinate7 - this.f4381r, f9, this.f4366c);
        float f10 = coordinate5 - this.f4380q;
        canvas.drawLine(f10, coordinate8 + this.f4379p, f10, coordinate8 - this.f4381r, this.f4366c);
        float f11 = coordinate8 + this.f4380q;
        canvas.drawLine(coordinate5, f11, coordinate5 + this.f4381r, f11, this.f4366c);
        float f12 = coordinate7 + this.f4380q;
        canvas.drawLine(f12, coordinate8 + this.f4379p, f12, coordinate8 - this.f4381r, this.f4366c);
        float f13 = coordinate8 + this.f4380q;
        canvas.drawLine(coordinate7, f13, coordinate7 - this.f4381r, f13, this.f4366c);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        m3498d(this.f4368e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
    
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.crop.CropOverlayView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAspectRatioX(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f4374k = i;
        this.f4376m = i / this.f4375l;
        m3499e();
    }

    public void setAspectRatioY(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        this.f4375l = i;
        this.f4376m = this.f4374k / i;
        m3499e();
    }

    public void setBitmapRect(Rect rect) {
        this.f4368e = rect;
        m3498d(rect);
    }

    public void setBorderAndGuidelineColor(@ColorInt int i) {
        this.f4364a.setColor(i);
        this.f4365b.setColor(i);
        m3499e();
    }

    public void setBorderColor(@ColorInt int i) {
        this.f4364a.setColor(i);
        m3499e();
    }

    public void setBorderWidth(@Dimension float f) {
        this.f4364a.setStrokeWidth(f);
        m3499e();
    }

    public void setCornerColor(@ColorInt int i) {
        this.f4366c.setColor(i);
        m3499e();
    }

    public void setCornerWidth(@Dimension float f) {
        this.f4366c.setStrokeWidth(f);
        m3499e();
    }

    public void setCropOverlayCornerBitmap(Bitmap bitmap) {
        this.f4384u = bitmap;
        if (bitmap != null) {
            this.f4385v = bitmap.getWidth();
            this.f4386w = this.f4384u.getHeight();
        }
    }

    public void setFixedAspectRatio(boolean z8) {
        this.f4373j = z8;
        m3499e();
    }

    public void setGuidelineColor(@ColorInt int i) {
        this.f4365b.setColor(i);
        m3499e();
    }

    public void setGuidelineWidth(@Dimension float f) {
        this.f4365b.setStrokeWidth(f);
        m3499e();
    }

    public void setGuidelines(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("Guideline value must be set between 0 and 2. See documentation.");
        }
        this.f4377n = i;
        m3499e();
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4373j = false;
        this.f4374k = 1;
        this.f4375l = 1;
        this.f4376m = 1 / 1;
        this.f4378o = false;
        this.f4382s = 0;
        this.f4383t = 0;
        this.f4384u = null;
        this.f4385v = 0;
        this.f4386w = 0;
        m3497c(context);
    }
}
