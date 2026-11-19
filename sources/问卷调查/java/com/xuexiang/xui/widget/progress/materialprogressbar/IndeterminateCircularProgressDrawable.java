package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.Interpolator;
import androidx.annotation.Keep;
import p070b.p113c.p114a.p116e.p144h.p145a.AbstractC0857c;
import p070b.p113c.p114a.p116e.p144h.p145a.C0855a;
import p070b.p113c.p114a.p116e.p144h.p145a.C0870p;
import p070b.p113c.p114a.p116e.p144h.p145a.C0871q;
import p070b.p113c.p114a.p116e.p144h.p145a.C0872r;
import p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0874t;

/* loaded from: classes.dex */
public class IndeterminateCircularProgressDrawable extends AbstractC0857c implements InterfaceC0874t {

    /* renamed from: o */
    public static final RectF f5383o = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);

    /* renamed from: p */
    public static final RectF f5384p = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);

    /* renamed from: q */
    public static final RectF f5385q = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    /* renamed from: k */
    public int f5386k;

    /* renamed from: l */
    public int f5387l;

    /* renamed from: m */
    public RingPathTransform f5388m;

    /* renamed from: n */
    public RingRotation f5389n;

    public static class RingPathTransform {

        /* renamed from: a */
        public float f5390a;

        /* renamed from: b */
        public float f5391b;

        /* renamed from: c */
        public float f5392c;

        public RingPathTransform() {
        }

        public RingPathTransform(C0980a c0980a) {
        }

        @Keep
        public void setTrimPathEnd(float f2) {
            this.f5391b = f2;
        }

        @Keep
        public void setTrimPathOffset(float f2) {
            this.f5392c = f2;
        }

        @Keep
        public void setTrimPathStart(float f2) {
            this.f5390a = f2;
        }
    }

    public static class RingRotation {

        /* renamed from: a */
        public float f5393a;

        public RingRotation() {
        }

        public RingRotation(C0980a c0980a) {
        }

        @Keep
        public void setRotation(float f2) {
            this.f5393a = f2;
        }
    }

    public IndeterminateCircularProgressDrawable(Context context) {
        super(context);
        this.f5388m = new RingPathTransform(null);
        this.f5389n = new RingRotation(null);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f5386k = Math.round(42.0f * f2);
        this.f5387l = Math.round(f2 * 48.0f);
        RingPathTransform ringPathTransform = this.f5388m;
        Path path = C0855a.f4641a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(ringPathTransform, "trimPathStart", 0.0f, 0.75f);
        objectAnimatorOfFloat.setDuration(1333L);
        objectAnimatorOfFloat.setInterpolator(C0872r.f4680b);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(ringPathTransform, "trimPathEnd", 0.0f, 0.75f);
        objectAnimatorOfFloat2.setDuration(1333L);
        objectAnimatorOfFloat2.setInterpolator(C0871q.f4678b);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(ringPathTransform, "trimPathOffset", 0.0f, 0.25f);
        objectAnimatorOfFloat3.setDuration(1333L);
        Interpolator interpolator = C0870p.f4676a;
        objectAnimatorOfFloat3.setInterpolator(interpolator);
        objectAnimatorOfFloat3.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f5389n, "rotation", 0.0f, 720.0f);
        objectAnimatorOfFloat4.setDuration(6665L);
        objectAnimatorOfFloat4.setInterpolator(interpolator);
        objectAnimatorOfFloat4.setRepeatCount(-1);
        this.f4652j = new Animator[]{animatorSet, objectAnimatorOfFloat4};
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.AbstractC0858d
    /* renamed from: f */
    public void mo2565f(Canvas canvas, int i, int i2, Paint paint) {
        float f2 = i;
        RectF rectF = this.f4654i ? f5384p : f5383o;
        canvas.scale(f2 / rectF.width(), i2 / rectF.height());
        canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        int iSave = canvas.save();
        canvas.rotate(this.f5389n.f5393a);
        RingPathTransform ringPathTransform = this.f5388m;
        float f3 = ringPathTransform.f5392c;
        canvas.drawArc(f5385q, ((f3 + r2) * 360.0f) - 90.0f, (ringPathTransform.f5391b - ringPathTransform.f5390a) * 360.0f, false, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.AbstractC0858d
    /* renamed from: g */
    public void mo2566g(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setStrokeJoin(Paint.Join.MITER);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f4654i ? this.f5387l : this.f5386k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f4654i ? this.f5387l : this.f5386k;
    }
}
