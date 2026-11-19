package com.zykj.mistake.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public class LineBottomProView extends LineBaseProView {

    /* renamed from: G */
    public Paint f8089G;

    /* renamed from: H */
    public int f8090H;

    /* renamed from: I */
    public int f8091I;

    /* renamed from: J */
    public int f8092J;

    public LineBottomProView(Context context) {
        this(context, null);
    }

    @Override // com.zykj.mistake.widget.BaseProView
    /* renamed from: b */
    public final void mo4477b() {
        this.f8089G.setAntiAlias(true);
        this.f8089G.setColor(this.f8066o.getColor());
        int i = this.f8054c;
        int i8 = this.f8053b;
        if (i == i8) {
            this.f8054c = (i8 / 5) * 2;
        }
        if (this.f8091I == -1) {
            this.f8091I = (i8 / 5) * 2;
        }
        if (this.f8090H == -1) {
            this.f8090H = this.f8091I * 2;
        }
        if (this.f8092J == -1) {
            this.f8092J = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        }
    }

    public Paint getBoxPaint() {
        return this.f8089G;
    }

    public int getBoxRadius() {
        return this.f8092J;
    }

    public int getBoxWidth() {
        return this.f8090H;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Path path = this.f8082E;
        path.reset();
        Path path2 = this.f8083F;
        path2.reset();
        int i = (int) ((this.f8071t / this.f8070s) * (this.f8052a - this.f8090H));
        int i8 = this.f8053b - this.f8054c;
        if (this.f8079B) {
            float f = this.f8084v;
            this.f8080C = new float[]{f, f, f, f, f, f, f, f};
            float f7 = this.f8078A;
            this.f8081D = new float[]{f, f, f7, f7, f7, f7, f, f};
        } else {
            float f8 = this.f8085w;
            float f9 = this.f8087y;
            float f10 = this.f8088z;
            float f11 = this.f8086x;
            this.f8080C = new float[]{f8, f8, f9, f9, f10, f10, f11, f11};
            float f12 = this.f8078A;
            this.f8081D = new float[]{f8, f8, f12, f12, f12, f12, f11, f11};
        }
        float f13 = i8;
        RectF rectF = new RectF(this.f8090H / 2, f13, this.f8052a - r7, this.f8054c + i8);
        float[] fArr = this.f8080C;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction);
        path2.addRoundRect(new RectF(this.f8090H / 2, f13, r7 + i, i8 + this.f8054c), this.f8081D, direction);
        path2.op(path, Path.Op.INTERSECT);
        canvas.drawPath(path, this.f8065n);
        canvas.drawPath(path2, this.f8066o);
        RectF rectF2 = new RectF(i, 0.0f, this.f8090H + i, this.f8091I);
        float f14 = this.f8092J;
        canvas.drawRoundRect(rectF2, f14, f14, this.f8089G);
        Path path3 = new Path();
        path3.moveTo(((this.f8090H / 2) + i) - ((int) TypedValue.applyDimension(2, 4.0f, getResources().getDisplayMetrics())), this.f8091I);
        path3.lineTo(((int) TypedValue.applyDimension(2, 4.0f, getResources().getDisplayMetrics())) + (this.f8090H / 2) + i, this.f8091I);
        path3.lineTo((this.f8090H / 2) + i, (this.f8053b - this.f8054c) - 2);
        path3.close();
        canvas.drawPath(path3, this.f8089G);
        String str = this.f8057f;
        int i9 = (this.f8090H / 2) + i;
        Rect rect = new Rect();
        this.f8067p.getTextBounds(str, 0, str.length(), rect);
        float fWidth = i9 - (rect.width() / 2);
        Paint paint = this.f8067p;
        int i10 = this.f8091I;
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i11 = fontMetricsInt.bottom - fontMetricsInt.top;
        canvas.drawText(str, fWidth, ((i10 + i11) / 2) - ((i11 / 2) - r6), this.f8067p);
    }

    public void setBoxPaint(Paint paint) {
        this.f8089G = paint;
    }

    public void setBoxRadius(int i) {
        this.f8092J = i;
        invalidate();
    }

    public void setBoxWidth(int i) {
        this.f8090H = i;
        invalidate();
    }

    public LineBottomProView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LineBottomProView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8089G = new Paint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LineBottomProView);
        this.f8090H = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.LineBottomProView_box_width, -1);
        this.f8091I = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.LineBottomProView_box_height, -1);
        this.f8092J = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.LineBottomProView_box_radius, -1);
    }
}
