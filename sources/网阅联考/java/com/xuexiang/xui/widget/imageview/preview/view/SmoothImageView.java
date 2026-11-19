package com.xuexiang.xui.widget.imageview.preview.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.utils.AbstractC3532g;
import com.xuexiang.xui.widget.imageview.photoview.PhotoView;

/* loaded from: classes2.dex */
public class SmoothImageView extends PhotoView {

    /* renamed from: y */
    public static int f3662y = 400;

    /* renamed from: c */
    public Status f3663c;

    /* renamed from: d */
    public Paint f3664d;

    /* renamed from: e */
    public Matrix f3665e;

    /* renamed from: f */
    public C3591i f3666f;

    /* renamed from: g */
    public C3591i f3667g;

    /* renamed from: h */
    public C3591i f3668h;

    /* renamed from: i */
    public Rect f3669i;

    /* renamed from: j */
    public boolean f3670j;

    /* renamed from: k */
    public int f3671k;

    /* renamed from: l */
    public int f3672l;

    /* renamed from: m */
    public boolean f3673m;

    /* renamed from: n */
    public ValueAnimator f3674n;

    /* renamed from: o */
    public float f3675o;

    /* renamed from: p */
    public int f3676p;

    /* renamed from: q */
    public int f3677q;

    /* renamed from: r */
    public boolean f3678r;

    /* renamed from: s */
    public boolean f3679s;

    /* renamed from: t */
    public int f3680t;

    /* renamed from: u */
    public InterfaceC3589g f3681u;

    /* renamed from: v */
    public InterfaceC3590h f3682v;

    /* renamed from: w */
    public C3591i f3683w;

    /* renamed from: x */
    public InterfaceC3592j f3684x;

    public enum Status {
        STATE_NORMAL,
        STATE_IN,
        STATE_OUT,
        STATE_MOVE
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$a */
    public class C3583a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f3690a = 0;

        public C3583a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i4 = this.f3690a;
            if (i4 != 0) {
                SmoothImageView.this.offsetTopAndBottom(iIntValue - i4);
            }
            this.f3690a = iIntValue;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$b */
    public class C3584b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f3692a = 0;

        public C3584b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i4 = this.f3692a;
            if (i4 != 0) {
                SmoothImageView.this.offsetLeftAndRight(iIntValue - i4);
            }
            this.f3692a = iIntValue;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$c */
    public class C3585c implements ValueAnimator.AnimatorUpdateListener {
        public C3585c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (SmoothImageView.this.f3681u != null) {
                SmoothImageView.this.f3681u.mo4417a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$d */
    public class C3586d implements ValueAnimator.AnimatorUpdateListener {
        public C3586d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SmoothImageView.this.setScaleX(fFloatValue);
            SmoothImageView.this.setScaleY(fFloatValue);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$e */
    public class C3587e implements ValueAnimator.AnimatorUpdateListener {
        public C3587e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmoothImageView.this.f3668h.f3702e = ((Integer) valueAnimator.getAnimatedValue("animAlpha")).intValue();
            SmoothImageView.this.f3668h.f3703f = ((Float) valueAnimator.getAnimatedValue("animScale")).floatValue();
            SmoothImageView.this.f3668h.f3698a = ((Float) valueAnimator.getAnimatedValue("animLeft")).floatValue();
            SmoothImageView.this.f3668h.f3699b = ((Float) valueAnimator.getAnimatedValue("animTop")).floatValue();
            SmoothImageView.this.f3668h.f3700c = ((Float) valueAnimator.getAnimatedValue("animWidth")).floatValue();
            SmoothImageView.this.f3668h.f3701d = ((Float) valueAnimator.getAnimatedValue("animHeight")).floatValue();
            SmoothImageView.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$f */
    public class C3588f extends AnimatorListenerAdapter {
        public C3588f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (SmoothImageView.this.f3684x != null) {
                SmoothImageView.this.f3684x.mo4419a(SmoothImageView.this.f3663c);
            }
            if (SmoothImageView.this.f3663c == Status.STATE_IN) {
                SmoothImageView.this.f3663c = Status.STATE_NORMAL;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (SmoothImageView.this.getTag(R$id.item_image_key) != null) {
                SmoothImageView.this.setTag(R$id.item_image_key, null);
                SmoothImageView.this.setOnLongClickListener(null);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$g */
    public interface InterfaceC3589g {
        /* renamed from: a */
        void mo4417a(int i4);
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$h */
    public interface InterfaceC3590h {
        /* renamed from: a */
        void mo4418a();
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$i */
    public static class C3591i implements Cloneable {

        /* renamed from: a */
        public float f3698a;

        /* renamed from: b */
        public float f3699b;

        /* renamed from: c */
        public float f3700c;

        /* renamed from: d */
        public float f3701d;

        /* renamed from: e */
        public int f3702e;

        /* renamed from: f */
        public float f3703f;

        public C3591i() {
        }

        public /* synthetic */ C3591i(C3583a c3583a) {
            this();
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3591i clone() {
            try {
                return (C3591i) super.clone();
            } catch (CloneNotSupportedException e4) {
                e4.printStackTrace();
                return null;
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$j */
    public interface InterfaceC3592j {
        /* renamed from: a */
        void mo4419a(Status status);
    }

    public SmoothImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3663c = Status.STATE_NORMAL;
        this.f3675o = 0.5f;
        this.f3678r = false;
        this.f3679s = false;
        this.f3680t = 0;
        m4454k();
    }

    public static void setDuration(int i4) {
        f3662y = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: i */
    public final void m4452i() {
        C3591i c3591i = this.f3683w;
        if (c3591i != null) {
            C3591i c3591iClone = c3591i.clone();
            c3591iClone.f3699b = this.f3683w.f3699b + getTop();
            c3591iClone.f3698a = this.f3683w.f3698a + getLeft();
            c3591iClone.f3702e = this.f3680t;
            c3591iClone.f3703f = this.f3683w.f3703f - ((1.0f - getScaleX()) * this.f3683w.f3703f);
            this.f3668h = c3591iClone.clone();
            this.f3667g = c3591iClone.clone();
        }
    }

    /* renamed from: j */
    public boolean m4453j() {
        if (getScale() == 1.0f) {
            return true;
        }
        m4338c(1.0f, true);
        return false;
    }

    /* renamed from: k */
    public final void m4454k() {
        Paint paint = new Paint();
        this.f3664d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f3664d.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f3665e = new Matrix();
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    /* renamed from: l */
    public final void m4455l() {
        if (getDrawable() == null) {
            return;
        }
        if ((this.f3666f != null && this.f3667g != null && this.f3668h != null) || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (getDrawable() instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) getDrawable()).getBitmap();
            this.f3671k = bitmap.getWidth();
            this.f3672l = bitmap.getHeight();
        } else if (getDrawable() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getDrawable();
            this.f3671k = colorDrawable.getIntrinsicWidth();
            this.f3672l = colorDrawable.getIntrinsicHeight();
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight(), Bitmap.Config.RGB_565);
            this.f3671k = bitmapCreateBitmap.getWidth();
            this.f3672l = bitmapCreateBitmap.getHeight();
        }
        C3583a c3583a = null;
        C3591i c3591i = new C3591i(c3583a);
        this.f3666f = c3591i;
        c3591i.f3702e = 0;
        if (this.f3669i == null) {
            this.f3669i = new Rect();
        }
        C3591i c3591i2 = this.f3666f;
        Rect rect = this.f3669i;
        c3591i2.f3698a = rect.left;
        c3591i2.f3699b = rect.top - AbstractC3532g.m4087i();
        this.f3666f.f3700c = this.f3669i.width();
        this.f3666f.f3701d = this.f3669i.height();
        this.f3666f.f3703f = Math.max(this.f3669i.width() / this.f3671k, this.f3669i.height() / this.f3672l);
        C3591i c3591i3 = new C3591i(c3583a);
        this.f3667g = c3591i3;
        c3591i3.f3703f = Math.min(getWidth() / this.f3671k, getHeight() / this.f3672l);
        C3591i c3591i4 = this.f3667g;
        c3591i4.f3702e = 255;
        float f4 = c3591i4.f3703f;
        int i4 = (int) (this.f3671k * f4);
        c3591i4.f3698a = (getWidth() - i4) / 2.0f;
        this.f3667g.f3699b = (getHeight() - r1) / 2.0f;
        C3591i c3591i5 = this.f3667g;
        c3591i5.f3700c = i4;
        c3591i5.f3701d = (int) (f4 * this.f3672l);
        Status status = this.f3663c;
        if (status == Status.STATE_IN) {
            this.f3668h = this.f3666f.clone();
        } else if (status == Status.STATE_OUT) {
            this.f3668h = c3591i5.clone();
        }
        this.f3683w = this.f3667g;
    }

    /* renamed from: m */
    public final float m4456m() {
        if (this.f3683w == null) {
            m4455l();
        }
        return Math.abs(getTop() / this.f3683w.f3701d);
    }

    /* renamed from: n */
    public final void m4457n() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getTop(), 0);
        valueAnimatorOfInt.addUpdateListener(new C3583a());
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(getLeft(), 0);
        valueAnimatorOfInt2.addUpdateListener(new C3584b());
        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(this.f3680t, 255);
        valueAnimatorOfInt3.addUpdateListener(new C3585c());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C3586d());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(f3662y);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfFloat, valueAnimatorOfInt3);
        animatorSet.start();
    }

    /* renamed from: o */
    public void m4458o(boolean z3, float f4) {
        this.f3673m = z3;
        this.f3675o = f4;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.PhotoView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3671k = 0;
        this.f3672l = 0;
        this.f3669i = null;
        this.f3664d = null;
        this.f3665e = null;
        this.f3666f = null;
        this.f3667g = null;
        this.f3668h = null;
        ValueAnimator valueAnimator = this.f3674n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f3674n.clone();
            this.f3674n = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        Status status = this.f3663c;
        if (status != Status.STATE_OUT && status != Status.STATE_IN) {
            if (status == Status.STATE_MOVE) {
                this.f3664d.setAlpha(0);
                canvas.drawPaint(this.f3664d);
                super.onDraw(canvas);
                return;
            } else {
                this.f3664d.setAlpha(255);
                canvas.drawPaint(this.f3664d);
                super.onDraw(canvas);
                return;
            }
        }
        if (this.f3666f == null || this.f3667g == null || this.f3668h == null) {
            m4455l();
        }
        C3591i c3591i = this.f3668h;
        if (c3591i == null) {
            super.onDraw(canvas);
            return;
        }
        this.f3664d.setAlpha(c3591i.f3702e);
        canvas.drawPaint(this.f3664d);
        int saveCount = canvas.getSaveCount();
        Matrix matrix = this.f3665e;
        float f4 = this.f3668h.f3703f;
        matrix.setScale(f4, f4);
        float f5 = this.f3671k;
        C3591i c3591i2 = this.f3668h;
        float f6 = c3591i2.f3703f;
        this.f3665e.postTranslate((-((f5 * f6) - c3591i2.f3700c)) / 2.0f, (-((this.f3672l * f6) - c3591i2.f3701d)) / 2.0f);
        C3591i c3591i3 = this.f3668h;
        canvas.translate(c3591i3.f3698a, c3591i3.f3699b);
        C3591i c3591i4 = this.f3668h;
        canvas.clipRect(0.0f, 0.0f, c3591i4.f3700c, c3591i4.f3701d);
        canvas.concat(this.f3665e);
        getDrawable().draw(canvas);
        canvas.restoreToCount(saveCount);
        if (this.f3670j) {
            m4459p();
        }
    }

    /* renamed from: p */
    public final void m4459p() {
        this.f3670j = false;
        if (this.f3668h == null) {
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f3674n = valueAnimator;
        valueAnimator.setDuration(f3662y);
        this.f3674n.setInterpolator(new AccelerateDecelerateInterpolator());
        Status status = this.f3663c;
        if (status == Status.STATE_IN) {
            this.f3674n.setValues(PropertyValuesHolder.ofFloat("animScale", this.f3666f.f3703f, this.f3667g.f3703f), PropertyValuesHolder.ofInt("animAlpha", this.f3666f.f3702e, this.f3667g.f3702e), PropertyValuesHolder.ofFloat("animLeft", this.f3666f.f3698a, this.f3667g.f3698a), PropertyValuesHolder.ofFloat("animTop", this.f3666f.f3699b, this.f3667g.f3699b), PropertyValuesHolder.ofFloat("animWidth", this.f3666f.f3700c, this.f3667g.f3700c), PropertyValuesHolder.ofFloat("animHeight", this.f3666f.f3701d, this.f3667g.f3701d));
        } else if (status == Status.STATE_OUT) {
            this.f3674n.setValues(PropertyValuesHolder.ofFloat("animScale", this.f3667g.f3703f, this.f3666f.f3703f), PropertyValuesHolder.ofInt("animAlpha", this.f3667g.f3702e, this.f3666f.f3702e), PropertyValuesHolder.ofFloat("animLeft", this.f3667g.f3698a, this.f3666f.f3698a), PropertyValuesHolder.ofFloat("animTop", this.f3667g.f3699b, this.f3666f.f3699b), PropertyValuesHolder.ofFloat("animWidth", this.f3667g.f3700c, this.f3666f.f3700c), PropertyValuesHolder.ofFloat("animHeight", this.f3667g.f3701d, this.f3666f.f3701d));
        }
        this.f3674n.addUpdateListener(new C3587e());
        this.f3674n.addListener(new C3588f());
        this.f3674n.start();
    }

    /* renamed from: q */
    public void m4460q(InterfaceC3592j interfaceC3592j) {
        setOnTransformListener(interfaceC3592j);
        this.f3670j = true;
        this.f3663c = Status.STATE_IN;
        invalidate();
    }

    /* renamed from: r */
    public void m4461r(InterfaceC3592j interfaceC3592j) {
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
        setOnTransformListener(interfaceC3592j);
        this.f3670j = true;
        this.f3663c = Status.STATE_OUT;
        invalidate();
    }

    public void setAlphaChangeListener(InterfaceC3589g interfaceC3589g) {
        this.f3681u = interfaceC3589g;
    }

    public void setOnTransformListener(InterfaceC3592j interfaceC3592j) {
        this.f3684x = interfaceC3592j;
    }

    public void setThumbRect(Rect rect) {
        this.f3669i = rect;
    }

    public void setTransformOutListener(InterfaceC3590h interfaceC3590h) {
        this.f3682v = interfaceC3590h;
    }
}
