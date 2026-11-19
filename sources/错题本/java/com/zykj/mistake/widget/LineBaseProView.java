package com.zykj.mistake.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import com.blankj.utilcode.util.RunnableC3379a0;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public abstract class LineBaseProView extends BaseProView {

    /* renamed from: A */
    public float f8078A;

    /* renamed from: B */
    public boolean f8079B;

    /* renamed from: C */
    public float[] f8080C;

    /* renamed from: D */
    public float[] f8081D;

    /* renamed from: E */
    public final Path f8082E;

    /* renamed from: F */
    public final Path f8083F;

    /* renamed from: v */
    public float f8084v;

    /* renamed from: w */
    public float f8085w;

    /* renamed from: x */
    public float f8086x;

    /* renamed from: y */
    public float f8087y;

    /* renamed from: z */
    public float f8088z;

    public LineBaseProView(Context context) {
        this(context, null);
    }

    @Override // com.zykj.mistake.widget.BaseProView
    /* renamed from: a */
    public final void mo4476a() {
        if (this.f8079B && this.f8084v == -1.0f) {
            this.f8084v = this.f8054c / 2;
        }
    }

    @Override // com.zykj.mistake.widget.BaseProView
    /* renamed from: d */
    public final void mo4479d(int... iArr) {
        post(new RunnableC3379a0(7, this, false, iArr));
    }

    public float getLeftBottomRadius() {
        return this.f8086x;
    }

    public float getLeftTopRadius() {
        return this.f8085w;
    }

    public float getProgressRadius() {
        return this.f8078A;
    }

    public float getRadius() {
        return this.f8084v;
    }

    public float getRightBottomRadius() {
        return this.f8088z;
    }

    public float getRightTopRadius() {
        return this.f8087y;
    }

    public void setLeftBottomRadius(float f) {
        this.f8086x = f;
    }

    public void setLeftTopRadius(float f) {
        this.f8085w = f;
    }

    public void setProgressRadius(float f) {
        this.f8078A = f;
    }

    public void setRadius(boolean z8) {
        this.f8079B = z8;
    }

    public void setRightBottomRadius(float f) {
        this.f8088z = f;
    }

    public void setRightTopRadius(float f) {
        this.f8087y = f;
    }

    public LineBaseProView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setRadius(float f) {
        this.f8084v = f;
    }

    public LineBaseProView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8079B = true;
        this.f8082E = new Path();
        this.f8083F = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LineBaseProView);
        this.f8084v = typedArrayObtainStyledAttributes.getDimension(R.styleable.LineBaseProView_background_radius, -1.0f);
        this.f8085w = typedArrayObtainStyledAttributes.getDimension(R.styleable.LineBaseProView_left_top_radius, 0.0f);
        this.f8086x = typedArrayObtainStyledAttributes.getDimension(R.styleable.LineBaseProView_left_bottom_radius, 0.0f);
        this.f8087y = typedArrayObtainStyledAttributes.getDimension(R.styleable.LineBaseProView_right_top_radius, 0.0f);
        this.f8088z = typedArrayObtainStyledAttributes.getDimension(R.styleable.LineBaseProView_right_bottom_radius, 0.0f);
        this.f8078A = typedArrayObtainStyledAttributes.getDimension(R.styleable.LineBaseProView_progress_radius, 0.0f);
        if (this.f8084v == -1.0f) {
            this.f8079B = true;
        }
        if (this.f8085w == 0.0f || this.f8086x == 0.0f || this.f8087y == 0.0f || this.f8088z == 0.0f) {
            this.f8079B = true;
        }
    }
}
