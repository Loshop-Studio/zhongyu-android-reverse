package com.friday.lecture.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class GlobalCanvasView extends View implements View.OnTouchListener {

    /* renamed from: n */
    public static final C6164a f8945n = new C6164a(null);

    /* renamed from: o */
    public static final int f8946o = 8;

    /* renamed from: c */
    public float f8947c;

    /* renamed from: d */
    public int f8948d;

    /* renamed from: e */
    public float f8949e;

    /* renamed from: f */
    public Path f8950f;

    /* renamed from: g */
    public final Paint f8951g;

    /* renamed from: h */
    public final Paint f8952h;

    /* renamed from: i */
    public float f8953i;

    /* renamed from: j */
    public float f8954j;

    /* renamed from: k */
    public Bitmap f8955k;

    /* renamed from: l */
    public Canvas f8956l;

    /* renamed from: m */
    public int f8957m;

    /* renamed from: com.friday.lecture.widget.GlobalCanvasView$a */
    public static final class C6164a {
        public /* synthetic */ C6164a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C6164a() {
        }
    }

    /* renamed from: com.friday.lecture.widget.GlobalCanvasView$b */
    public interface InterfaceC6165b {
    }

    public GlobalCanvasView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8947c = 3.0f;
        this.f8948d = Color.parseColor("#FF4931");
        this.f8949e = 120.0f;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setOnTouchListener(this);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(this.f8948d);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(this.f8947c);
        this.f8951g = paint;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        paint2.setAlpha(0);
        paint2.setStyle(style);
        paint2.setStrokeJoin(join);
        paint2.setStrokeWidth(this.f8949e);
        this.f8952h = paint2;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        AbstractC9979u.m20293f(displayMetrics, "getDisplayMetrics(...)");
        this.f8955k = Bitmap.createBitmap(displayMetrics.widthPixels, displayMetrics.heightPixels, Bitmap.Config.ARGB_8888);
        Bitmap bitmap = this.f8955k;
        AbstractC9979u.m20291d(bitmap);
        this.f8956l = new Canvas(bitmap);
        this.f8950f = new Path();
        invalidate();
    }

    /* renamed from: a */
    public final void m6854a() {
        this.f8950f.reset();
        this.f8955k = null;
        System.gc();
        invalidate();
    }

    /* renamed from: b */
    public final void m6855b(float f10, float f11) {
        Path path = this.f8950f;
        float f12 = this.f8953i;
        float f13 = this.f8954j;
        float f14 = 2;
        path.quadTo(f12, f13, (f10 + f12) / f14, (f11 + f13) / f14);
        this.f8953i = f10;
        this.f8954j = f11;
        if (this.f8957m == 1) {
            this.f8956l.drawPath(this.f8950f, this.f8952h);
        } else {
            this.f8956l.drawPath(this.f8950f, this.f8951g);
        }
    }

    /* renamed from: c */
    public final void m6856c(float f10, float f11) {
        if (this.f8955k == null) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            AbstractC9979u.m20293f(displayMetrics, "getDisplayMetrics(...)");
            this.f8955k = Bitmap.createBitmap(displayMetrics.widthPixels, displayMetrics.heightPixels, Bitmap.Config.ARGB_8888);
            Bitmap bitmap = this.f8955k;
            AbstractC9979u.m20291d(bitmap);
            this.f8956l = new Canvas(bitmap);
        }
        this.f8950f.reset();
        this.f8950f.moveTo(f10, f11);
        this.f8953i = f10;
        this.f8954j = f11;
        if (this.f8957m == 1) {
            this.f8956l.drawPath(this.f8950f, this.f8952h);
        } else {
            this.f8956l.drawPath(this.f8950f, this.f8951g);
        }
    }

    /* renamed from: d */
    public final void m6857d() {
        this.f8950f.lineTo(this.f8953i, this.f8954j);
        if (this.f8957m == 1) {
            this.f8956l.drawPath(this.f8950f, this.f8952h);
        } else {
            this.f8956l.drawPath(this.f8950f, this.f8951g);
        }
    }

    public final Bitmap getBitmap() {
        return this.f8955k;
    }

    public final int getMode() {
        return this.f8957m;
    }

    public final int getPaintColor() {
        return this.f8948d;
    }

    public final float getPaintSize() {
        return this.f8947c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC9979u.m20294g(canvas, "canvas");
        Bitmap bitmap = this.f8955k;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View arg0, MotionEvent event) {
        AbstractC9979u.m20294g(arg0, "arg0");
        AbstractC9979u.m20294g(event, "event");
        if (this.f8957m == 2) {
            return false;
        }
        float x10 = event.getX();
        float y10 = event.getY();
        int action = event.getAction();
        if (action == 0) {
            m6856c(x10, y10);
        } else if (action == 1) {
            m6857d();
        } else if (action == 2) {
            m6855b(x10, y10);
        }
        invalidate();
        return true;
    }

    public final void setBitmap(Bitmap bitmap) {
        this.f8955k = bitmap;
    }

    public final void setMode(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            this.f8957m = i10;
        }
    }

    public final void setOnDrawChangedListener(InterfaceC6165b interfaceC6165b) {
    }

    public final void setPaintColor(int i10) {
        this.f8948d = i10;
        this.f8951g.setColor(i10);
    }

    public final void setPaintSize(float f10) {
        this.f8947c = f10;
        this.f8951g.setStrokeWidth(f10);
    }
}
