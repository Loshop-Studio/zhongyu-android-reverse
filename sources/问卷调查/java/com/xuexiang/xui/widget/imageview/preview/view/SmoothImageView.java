package com.xuexiang.xui.widget.imageview.preview.view;

import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import p070b.p113c.p114a.p116e.p128f.p130b.C0819c;
import p070b.p113c.p114a.p116e.p128f.p130b.ViewOnTouchListenerC0821e;
import p070b.p113c.p114a.p116e.p128f.p133c.p136e.C0839e;
import p070b.p113c.p114a.p116e.p128f.p133c.p137f.C0845a;
import p070b.p113c.p114a.p116e.p128f.p133c.p137f.C0846b;

/* loaded from: classes.dex */
public class SmoothImageView extends C0819c {

    /* renamed from: B */
    public static int f5273B = 400;

    /* renamed from: A */
    public InterfaceC0976i f5274A;

    /* renamed from: f */
    public EnumC0974g f5275f;

    /* renamed from: g */
    public Paint f5276g;

    /* renamed from: h */
    public Matrix f5277h;

    /* renamed from: i */
    public C0975h f5278i;

    /* renamed from: j */
    public C0975h f5279j;

    /* renamed from: k */
    public C0975h f5280k;

    /* renamed from: l */
    public Rect f5281l;

    /* renamed from: m */
    public boolean f5282m;

    /* renamed from: n */
    public int f5283n;

    /* renamed from: o */
    public int f5284o;

    /* renamed from: p */
    public boolean f5285p;

    /* renamed from: q */
    public ValueAnimator f5286q;

    /* renamed from: r */
    public float f5287r;

    /* renamed from: s */
    public int f5288s;

    /* renamed from: t */
    public int f5289t;

    /* renamed from: u */
    public boolean f5290u;

    /* renamed from: v */
    public boolean f5291v;

    /* renamed from: w */
    public int f5292w;

    /* renamed from: x */
    public InterfaceC0972e f5293x;

    /* renamed from: y */
    public InterfaceC0973f f5294y;

    /* renamed from: z */
    public C0975h f5295z;

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$a */
    public class C0968a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f5296a = 0;

        public C0968a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i = this.f5296a;
            if (i != 0) {
                SmoothImageView.this.offsetTopAndBottom(iIntValue - i);
            }
            this.f5296a = iIntValue;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$b */
    public class C0969b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f5298a = 0;

        public C0969b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i = this.f5298a;
            if (i != 0) {
                SmoothImageView.this.offsetLeftAndRight(iIntValue - i);
            }
            this.f5298a = iIntValue;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$c */
    public class C0970c implements ValueAnimator.AnimatorUpdateListener {
        public C0970c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            InterfaceC0972e interfaceC0972e = SmoothImageView.this.f5293x;
            if (interfaceC0972e != null) {
                ((C0839e) interfaceC0972e).m2555a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$d */
    public class C0971d implements ValueAnimator.AnimatorUpdateListener {
        public C0971d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SmoothImageView.this.setScaleX(fFloatValue);
            SmoothImageView.this.setScaleY(fFloatValue);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$e */
    public interface InterfaceC0972e {
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$f */
    public interface InterfaceC0973f {
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$g */
    public enum EnumC0974g {
        STATE_NORMAL,
        STATE_IN,
        STATE_OUT,
        STATE_MOVE
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$h */
    public static class C0975h implements Cloneable {

        /* renamed from: b */
        public float f5307b;

        /* renamed from: c */
        public float f5308c;

        /* renamed from: d */
        public float f5309d;

        /* renamed from: e */
        public float f5310e;

        /* renamed from: f */
        public int f5311f;

        /* renamed from: g */
        public float f5312g;

        public C0975h() {
        }

        public C0975h(C0968a c0968a) {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0975h clone() {
            try {
                return (C0975h) super.clone();
            } catch (CloneNotSupportedException e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$i */
    public interface InterfaceC0976i {
        /* renamed from: a */
        void mo2556a(EnumC0974g enumC0974g);
    }

    public SmoothImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5275f = EnumC0974g.STATE_NORMAL;
        this.f5287r = 0.5f;
        this.f5290u = false;
        this.f5291v = false;
        this.f5292w = 0;
        Paint paint = new Paint();
        this.f5276g = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f5276g.setColor(-16777216);
        this.f5277h = new Matrix();
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    public static void setDuration(int i) {
        f5273B = i;
    }

    /* renamed from: d */
    public final void m2767d() {
        C0975h c0975h = this.f5295z;
        if (c0975h != null) {
            C0975h c0975hClone = c0975h.clone();
            c0975hClone.f5308c = this.f5295z.f5308c + getTop();
            c0975hClone.f5307b = this.f5295z.f5307b + getLeft();
            c0975hClone.f5311f = this.f5292w;
            c0975hClone.f5312g = this.f5295z.f5312g - ((1.0f - getScaleX()) * this.f5295z.f5312g);
            this.f5280k = c0975hClone.clone();
            this.f5279j = c0975hClone.clone();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: e */
    public boolean m2768e() {
        if (getScale() == 1.0f) {
            return true;
        }
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e == null) {
            return false;
        }
        viewOnTouchListenerC0821e.m2537r(1.0f, true);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0135  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2769f() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.m2769f():void");
    }

    /* renamed from: g */
    public final float m2770g() {
        if (this.f5295z == null) {
            m2769f();
        }
        return Math.abs(getTop() / this.f5295z.f5310e);
    }

    /* renamed from: h */
    public final void m2771h() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getTop(), 0);
        valueAnimatorOfInt.addUpdateListener(new C0968a());
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(getLeft(), 0);
        valueAnimatorOfInt2.addUpdateListener(new C0969b());
        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(this.f5292w, 255);
        valueAnimatorOfInt3.addUpdateListener(new C0970c());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C0971d());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(f5273B);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfFloat, valueAnimatorOfInt3);
        animatorSet.start();
    }

    /* renamed from: i */
    public void m2772i(InterfaceC0976i interfaceC0976i) {
        if (getTop() != 0) {
            offsetTopAndBottom(-getTop());
        }
        if (getLeft() != 0) {
            offsetLeftAndRight(-getLeft());
        }
        if (getScaleX() != 1.0f) {
            setScaleX(1.0f);
            setScaleY(1.0f);
        }
        setOnTransformListener(interfaceC0976i);
        this.f5282m = true;
        this.f5275f = EnumC0974g.STATE_OUT;
        invalidate();
    }

    @Override // p070b.p113c.p114a.p116e.p128f.p130b.C0819c, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5283n = 0;
        this.f5284o = 0;
        this.f5281l = null;
        this.f5276g = null;
        this.f5277h = null;
        this.f5278i = null;
        this.f5279j = null;
        this.f5280k = null;
        ValueAnimator valueAnimator = this.f5286q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5286q.clone();
            this.f5286q = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        EnumC0974g enumC0974g = EnumC0974g.STATE_IN;
        if (getDrawable() == null) {
            return;
        }
        EnumC0974g enumC0974g2 = this.f5275f;
        EnumC0974g enumC0974g3 = EnumC0974g.STATE_OUT;
        if (enumC0974g2 != enumC0974g3 && enumC0974g2 != enumC0974g) {
            if (enumC0974g2 == EnumC0974g.STATE_MOVE) {
                this.f5276g.setAlpha(0);
            } else {
                this.f5276g.setAlpha(255);
            }
            canvas.drawPaint(this.f5276g);
            super.onDraw(canvas);
            return;
        }
        if (this.f5278i == null || this.f5279j == null || this.f5280k == null) {
            m2769f();
        }
        C0975h c0975h = this.f5280k;
        if (c0975h == null) {
            super.onDraw(canvas);
            return;
        }
        this.f5276g.setAlpha(c0975h.f5311f);
        canvas.drawPaint(this.f5276g);
        int saveCount = canvas.getSaveCount();
        Matrix matrix = this.f5277h;
        float f2 = this.f5280k.f5312g;
        matrix.setScale(f2, f2);
        float f3 = this.f5283n;
        C0975h c0975h2 = this.f5280k;
        float f4 = c0975h2.f5312g;
        this.f5277h.postTranslate((-((f3 * f4) - c0975h2.f5309d)) / 2.0f, (-((this.f5284o * f4) - c0975h2.f5310e)) / 2.0f);
        C0975h c0975h3 = this.f5280k;
        canvas.translate(c0975h3.f5307b, c0975h3.f5308c);
        C0975h c0975h4 = this.f5280k;
        canvas.clipRect(0.0f, 0.0f, c0975h4.f5309d, c0975h4.f5310e);
        canvas.concat(this.f5277h);
        getDrawable().draw(canvas);
        canvas.restoreToCount(saveCount);
        if (this.f5282m) {
            this.f5282m = false;
            if (this.f5280k == null) {
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f5286q = valueAnimator;
            valueAnimator.setDuration(f5273B);
            this.f5286q.setInterpolator(new AccelerateDecelerateInterpolator());
            EnumC0974g enumC0974g4 = this.f5275f;
            if (enumC0974g4 == enumC0974g) {
                this.f5286q.setValues(PropertyValuesHolder.ofFloat("animScale", this.f5278i.f5312g, this.f5279j.f5312g), PropertyValuesHolder.ofInt("animAlpha", this.f5278i.f5311f, this.f5279j.f5311f), PropertyValuesHolder.ofFloat("animLeft", this.f5278i.f5307b, this.f5279j.f5307b), PropertyValuesHolder.ofFloat("animTop", this.f5278i.f5308c, this.f5279j.f5308c), PropertyValuesHolder.ofFloat("animWidth", this.f5278i.f5309d, this.f5279j.f5309d), PropertyValuesHolder.ofFloat("animHeight", this.f5278i.f5310e, this.f5279j.f5310e));
            } else if (enumC0974g4 == enumC0974g3) {
                this.f5286q.setValues(PropertyValuesHolder.ofFloat("animScale", this.f5279j.f5312g, this.f5278i.f5312g), PropertyValuesHolder.ofInt("animAlpha", this.f5279j.f5311f, this.f5278i.f5311f), PropertyValuesHolder.ofFloat("animLeft", this.f5279j.f5307b, this.f5278i.f5307b), PropertyValuesHolder.ofFloat("animTop", this.f5279j.f5308c, this.f5278i.f5308c), PropertyValuesHolder.ofFloat("animWidth", this.f5279j.f5309d, this.f5278i.f5309d), PropertyValuesHolder.ofFloat("animHeight", this.f5279j.f5310e, this.f5278i.f5310e));
            }
            this.f5286q.addUpdateListener(new C0845a(this));
            this.f5286q.addListener(new C0846b(this));
            this.f5286q.start();
        }
    }

    public void setAlphaChangeListener(InterfaceC0972e interfaceC0972e) {
        this.f5293x = interfaceC0972e;
    }

    public void setOnTransformListener(InterfaceC0976i interfaceC0976i) {
        this.f5274A = interfaceC0976i;
    }

    public void setThumbRect(Rect rect) {
        this.f5281l = rect;
    }

    public void setTransformOutListener(InterfaceC0973f interfaceC0973f) {
        this.f5294y = interfaceC0973f;
    }
}
