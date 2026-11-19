package com.xuexiang.xui.widget.imageview.edit;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes5.dex */
public class BrushDrawingView extends View {

    /* renamed from: c */
    public float f16129c;

    /* renamed from: d */
    public float f16130d;

    /* renamed from: e */
    public int f16131e;

    /* renamed from: f */
    public final Stack f16132f;

    /* renamed from: g */
    public final Stack f16133g;

    /* renamed from: h */
    public final Paint f16134h;

    /* renamed from: i */
    public Canvas f16135i;

    /* renamed from: j */
    public boolean f16136j;

    /* renamed from: k */
    public Path f16137k;

    /* renamed from: l */
    public float f16138l;

    /* renamed from: m */
    public float f16139m;

    public BrushDrawingView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void m12739a() {
        this.f16136j = true;
        m12741c();
    }

    /* renamed from: b */
    public final void m12740b() {
        setLayerType(2, null);
        this.f16134h.setColor(ViewCompat.MEASURED_STATE_MASK);
        m12741c();
        setVisibility(8);
    }

    /* renamed from: c */
    public final void m12741c() {
        this.f16137k = new Path();
        this.f16134h.setAntiAlias(true);
        this.f16134h.setDither(true);
        this.f16134h.setStyle(Paint.Style.STROKE);
        this.f16134h.setStrokeJoin(Paint.Join.ROUND);
        this.f16134h.setStrokeCap(Paint.Cap.ROUND);
        this.f16134h.setStrokeWidth(this.f16129c);
        this.f16134h.setAlpha(this.f16131e);
        this.f16134h.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
    }

    /* renamed from: d */
    public final void m12742d(float f10, float f11) {
        float fAbs = Math.abs(f10 - this.f16138l);
        float fAbs2 = Math.abs(f11 - this.f16139m);
        if (fAbs >= 4.0f || fAbs2 >= 4.0f) {
            Path path = this.f16137k;
            float f12 = this.f16138l;
            float f13 = this.f16139m;
            path.quadTo(f12, f13, (f10 + f12) / 2.0f, (f11 + f13) / 2.0f);
            this.f16138l = f10;
            this.f16139m = f11;
        }
    }

    /* renamed from: e */
    public final void m12743e(float f10, float f11) {
        this.f16133g.clear();
        this.f16137k.reset();
        this.f16137k.moveTo(f10, f11);
        this.f16138l = f10;
        this.f16139m = f11;
    }

    /* renamed from: f */
    public final void m12744f() {
        this.f16137k.lineTo(this.f16138l, this.f16139m);
        this.f16135i.drawPath(this.f16137k, this.f16134h);
        this.f16132f.push(new C8137f(this.f16137k, this.f16134h));
        this.f16137k = new Path();
    }

    public int getBrushColor() {
        return this.f16134h.getColor();
    }

    public boolean getBrushDrawingMode() {
        return this.f16136j;
    }

    public float getBrushSize() {
        return this.f16129c;
    }

    @VisibleForTesting
    public Paint getDrawingPaint() {
        return this.f16134h;
    }

    @VisibleForTesting
    public Pair<Stack<C8137f>, Stack<C8137f>> getDrawingPath() {
        return new Pair<>(this.f16132f, this.f16133g);
    }

    public float getEraserSize() {
        return this.f16130d;
    }

    public int getOpacity() {
        return this.f16131e;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Iterator it = this.f16132f.iterator();
        while (it.hasNext()) {
            C8137f c8137f = (C8137f) it.next();
            canvas.drawPath(c8137f.m12763b(), c8137f.m12762a());
        }
        canvas.drawPath(this.f16137k, this.f16134h);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f16135i = new Canvas(Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f16136j) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            m12743e(x10, y10);
        } else if (action == 1) {
            m12744f();
        } else if (action == 2) {
            m12742d(x10, y10);
        }
        invalidate();
        return true;
    }

    public void setBrushColor(@ColorInt int i10) {
        this.f16134h.setColor(i10);
        setBrushDrawingMode(true);
    }

    public void setBrushDrawingMode(boolean z10) {
        this.f16136j = z10;
        if (z10) {
            setVisibility(0);
            m12739a();
        }
    }

    public void setBrushEraserColor(@ColorInt int i10) {
        this.f16134h.setColor(i10);
        setBrushDrawingMode(true);
    }

    public void setBrushEraserSize(float f10) {
        this.f16130d = f10;
        setBrushDrawingMode(true);
    }

    public void setBrushSize(float f10) {
        this.f16129c = f10;
        setBrushDrawingMode(true);
    }

    public void setBrushViewChangeListener(InterfaceC8133b interfaceC8133b) {
    }

    public void setOpacity(@IntRange(from = 0, m338to = 255) int i10) {
        this.f16131e = i10;
        setBrushDrawingMode(true);
    }

    public BrushDrawingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BrushDrawingView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16129c = 25.0f;
        this.f16130d = 50.0f;
        this.f16131e = 255;
        this.f16132f = new Stack();
        this.f16133g = new Stack();
        this.f16134h = new Paint();
        m12740b();
    }
}
