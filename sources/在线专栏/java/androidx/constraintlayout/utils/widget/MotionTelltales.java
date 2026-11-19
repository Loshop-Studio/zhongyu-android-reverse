package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0298f;

/* loaded from: classes.dex */
public class MotionTelltales extends MockView {

    /* renamed from: l */
    private Paint f1809l;

    /* renamed from: m */
    MotionLayout f1810m;

    /* renamed from: n */
    float[] f1811n;

    /* renamed from: o */
    Matrix f1812o;

    /* renamed from: p */
    int f1813p;

    /* renamed from: q */
    int f1814q;

    /* renamed from: r */
    float f1815r;

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1809l = new Paint();
        this.f1811n = new float[2];
        this.f1812o = new Matrix();
        this.f1813p = 0;
        this.f1814q = -65281;
        this.f1815r = 0.25f;
        m1586a(context, attributeSet);
    }

    /* renamed from: a */
    private void m1586a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0298f.f2241R6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C0298f.f2250S6) {
                    this.f1814q = typedArrayObtainStyledAttributes.getColor(index, this.f1814q);
                } else if (index == C0298f.f2268U6) {
                    this.f1813p = typedArrayObtainStyledAttributes.getInt(index, this.f1813p);
                } else if (index == C0298f.f2259T6) {
                    this.f1815r = typedArrayObtainStyledAttributes.getFloat(index, this.f1815r);
                }
            }
        }
        this.f1809l.setColor(this.f1814q);
        this.f1809l.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f1812o);
        if (this.f1810m == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f1810m = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i4 = 0; i4 < 5; i4++) {
            float f4 = fArr[i4];
            for (int i5 = 0; i5 < 5; i5++) {
                float f5 = fArr[i5];
                this.f1810m.m1206Z(this, f5, f4, this.f1811n, this.f1813p);
                this.f1812o.mapVectors(this.f1811n);
                float f6 = width * f5;
                float f7 = height * f4;
                float[] fArr2 = this.f1811n;
                float f8 = fArr2[0];
                float f9 = this.f1815r;
                float f10 = f7 - (fArr2[1] * f9);
                this.f1812o.mapVectors(fArr2);
                canvas.drawLine(f6, f7, f6 - (f8 * f9), f10, this.f1809l);
            }
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f1803f = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1809l = new Paint();
        this.f1811n = new float[2];
        this.f1812o = new Matrix();
        this.f1813p = 0;
        this.f1814q = -65281;
        this.f1815r = 0.25f;
        m1586a(context, attributeSet);
    }
}
