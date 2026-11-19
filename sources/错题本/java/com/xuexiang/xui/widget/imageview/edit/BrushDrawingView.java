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
import androidx.collection.ScatterMapKt;
import androidx.core.view.ViewCompat;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes3.dex */
public class BrushDrawingView extends View {

    /* renamed from: a */
    public float f4389a;

    /* renamed from: b */
    public float f4390b;

    /* renamed from: c */
    public int f4391c;

    /* renamed from: d */
    public final Stack f4392d;

    /* renamed from: e */
    public final Stack f4393e;

    /* renamed from: f */
    public final Paint f4394f;

    /* renamed from: g */
    public Canvas f4395g;

    /* renamed from: h */
    public boolean f4396h;

    /* renamed from: i */
    public Path f4397i;

    /* renamed from: j */
    public float f4398j;

    /* renamed from: k */
    public float f4399k;

    public BrushDrawingView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void m3501a() {
        this.f4397i = new Path();
        Paint paint = this.f4394f;
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(this.f4389a);
        paint.setAlpha(this.f4391c);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
    }

    public int getBrushColor() {
        return this.f4394f.getColor();
    }

    public boolean getBrushDrawingMode() {
        return this.f4396h;
    }

    public float getBrushSize() {
        return this.f4389a;
    }

    @VisibleForTesting
    public Paint getDrawingPaint() {
        return this.f4394f;
    }

    @VisibleForTesting
    public Pair<Stack<C4180e>, Stack<C4180e>> getDrawingPath() {
        return new Pair<>(this.f4392d, this.f4393e);
    }

    public float getEraserSize() {
        return this.f4390b;
    }

    public int getOpacity() {
        return this.f4391c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Iterator it = this.f4392d.iterator();
        while (it.hasNext()) {
            C4180e c4180e = (C4180e) it.next();
            canvas.drawPath(c4180e.f4416b, c4180e.f4415a);
        }
        canvas.drawPath(this.f4397i, this.f4394f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        this.f4395g = new Canvas(Bitmap.createBitmap(i, i8, Bitmap.Config.ARGB_8888));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f4396h) {
            return false;
        }
        float x3 = motionEvent.getX();
        float y2 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f4393e.clear();
            this.f4397i.reset();
            this.f4397i.moveTo(x3, y2);
            this.f4398j = x3;
            this.f4399k = y2;
        } else if (action == 1) {
            this.f4397i.lineTo(this.f4398j, this.f4399k);
            Canvas canvas = this.f4395g;
            Path path = this.f4397i;
            Paint paint = this.f4394f;
            canvas.drawPath(path, paint);
            this.f4392d.push(new C4180e(this.f4397i, paint));
            this.f4397i = new Path();
        } else if (action == 2) {
            float fAbs = Math.abs(x3 - this.f4398j);
            float fAbs2 = Math.abs(y2 - this.f4399k);
            if (fAbs >= 4.0f || fAbs2 >= 4.0f) {
                Path path2 = this.f4397i;
                float f = this.f4398j;
                float f7 = this.f4399k;
                path2.quadTo(f, f7, (x3 + f) / 2.0f, (y2 + f7) / 2.0f);
                this.f4398j = x3;
                this.f4399k = y2;
            }
        }
        invalidate();
        return true;
    }

    public void setBrushColor(@ColorInt int i) {
        this.f4394f.setColor(i);
        setBrushDrawingMode(true);
    }

    public void setBrushDrawingMode(boolean z8) {
        this.f4396h = z8;
        if (z8) {
            setVisibility(0);
            this.f4396h = true;
            m3501a();
        }
    }

    public void setBrushEraserColor(@ColorInt int i) {
        this.f4394f.setColor(i);
        setBrushDrawingMode(true);
    }

    public void setBrushEraserSize(float f) {
        this.f4390b = f;
        setBrushDrawingMode(true);
    }

    public void setBrushSize(float f) {
        this.f4389a = f;
        setBrushDrawingMode(true);
    }

    public void setBrushViewChangeListener(InterfaceC4176a interfaceC4176a) {
    }

    public void setOpacity(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m247to = ScatterMapKt.Sentinel) int i) {
        this.f4391c = i;
        setBrushDrawingMode(true);
    }

    public BrushDrawingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BrushDrawingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4389a = 25.0f;
        this.f4390b = 50.0f;
        this.f4391c = 255;
        this.f4392d = new Stack();
        this.f4393e = new Stack();
        Paint paint = new Paint();
        this.f4394f = paint;
        setLayerType(2, null);
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        m3501a();
        setVisibility(8);
    }
}
