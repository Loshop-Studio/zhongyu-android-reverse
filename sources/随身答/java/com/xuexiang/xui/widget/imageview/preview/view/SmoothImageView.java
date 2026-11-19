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
import com.xuexiang.xui.utils.AbstractC6802h;
import com.xuexiang.xui.widget.imageview.photoview.PhotoView;

/* loaded from: classes4.dex */
public class SmoothImageView extends PhotoView {

    /* renamed from: y */
    public static int f7716y = 400;

    /* renamed from: c */
    public Status f7717c;

    /* renamed from: d */
    public Paint f7718d;

    /* renamed from: e */
    public Matrix f7719e;

    /* renamed from: f */
    public C6871i f7720f;

    /* renamed from: g */
    public C6871i f7721g;

    /* renamed from: h */
    public C6871i f7722h;

    /* renamed from: i */
    public Rect f7723i;

    /* renamed from: j */
    public boolean f7724j;

    /* renamed from: k */
    public int f7725k;

    /* renamed from: l */
    public int f7726l;

    /* renamed from: m */
    public boolean f7727m;

    /* renamed from: n */
    public ValueAnimator f7728n;

    /* renamed from: o */
    public float f7729o;

    /* renamed from: p */
    public int f7730p;

    /* renamed from: q */
    public int f7731q;

    /* renamed from: r */
    public boolean f7732r;

    /* renamed from: s */
    public boolean f7733s;

    /* renamed from: t */
    public int f7734t;

    /* renamed from: u */
    public InterfaceC6869g f7735u;

    /* renamed from: v */
    public InterfaceC6870h f7736v;

    /* renamed from: w */
    public C6871i f7737w;

    /* renamed from: x */
    public InterfaceC6872j f7738x;

    public enum Status {
        STATE_NORMAL,
        STATE_IN,
        STATE_OUT,
        STATE_MOVE
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$a */
    public class C6863a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f7744a = 0;

        public C6863a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i9 = this.f7744a;
            if (i9 != 0) {
                SmoothImageView.this.offsetTopAndBottom(iIntValue - i9);
            }
            this.f7744a = iIntValue;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$b */
    public class C6864b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f7746a = 0;

        public C6864b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i9 = this.f7746a;
            if (i9 != 0) {
                SmoothImageView.this.offsetLeftAndRight(iIntValue - i9);
            }
            this.f7746a = iIntValue;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$c */
    public class C6865c implements ValueAnimator.AnimatorUpdateListener {
        public C6865c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (SmoothImageView.this.f7735u != null) {
                SmoothImageView.this.f7735u.mo6882a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$d */
    public class C6866d implements ValueAnimator.AnimatorUpdateListener {
        public C6866d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SmoothImageView.this.setScaleX(fFloatValue);
            SmoothImageView.this.setScaleY(fFloatValue);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$e */
    public class C6867e implements ValueAnimator.AnimatorUpdateListener {
        public C6867e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmoothImageView.this.f7722h.f7756e = ((Integer) valueAnimator.getAnimatedValue("animAlpha")).intValue();
            SmoothImageView.this.f7722h.f7757f = ((Float) valueAnimator.getAnimatedValue("animScale")).floatValue();
            SmoothImageView.this.f7722h.f7752a = ((Float) valueAnimator.getAnimatedValue("animLeft")).floatValue();
            SmoothImageView.this.f7722h.f7753b = ((Float) valueAnimator.getAnimatedValue("animTop")).floatValue();
            SmoothImageView.this.f7722h.f7754c = ((Float) valueAnimator.getAnimatedValue("animWidth")).floatValue();
            SmoothImageView.this.f7722h.f7755d = ((Float) valueAnimator.getAnimatedValue("animHeight")).floatValue();
            SmoothImageView.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$f */
    public class C6868f extends AnimatorListenerAdapter {
        public C6868f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (SmoothImageView.this.f7738x != null) {
                SmoothImageView.this.f7738x.mo6884a(SmoothImageView.this.f7717c);
            }
            if (SmoothImageView.this.f7717c == Status.STATE_IN) {
                SmoothImageView.this.f7717c = Status.STATE_NORMAL;
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
    public interface InterfaceC6869g {
        /* renamed from: a */
        void mo6882a(int i9);
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$h */
    public interface InterfaceC6870h {
        /* renamed from: a */
        void mo6883a();
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$i */
    public static class C6871i implements Cloneable {

        /* renamed from: a */
        public float f7752a;

        /* renamed from: b */
        public float f7753b;

        /* renamed from: c */
        public float f7754c;

        /* renamed from: d */
        public float f7755d;

        /* renamed from: e */
        public int f7756e;

        /* renamed from: f */
        public float f7757f;

        public C6871i() {
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C6871i clone() {
            try {
                return (C6871i) super.clone();
            } catch (CloneNotSupportedException e10) {
                e10.printStackTrace();
                return null;
            }
        }

        public /* synthetic */ C6871i(C6863a c6863a) {
            this();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$j */
    public interface InterfaceC6872j {
        /* renamed from: a */
        void mo6884a(Status status);
    }

    public SmoothImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7717c = Status.STATE_NORMAL;
        this.f7729o = 0.5f;
        this.f7732r = false;
        this.f7733s = false;
        this.f7734t = 0;
        m6919k();
    }

    public static void setDuration(int i9) {
        f7716y = i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: i */
    public final void m6917i() {
        C6871i c6871i = this.f7737w;
        if (c6871i != null) {
            C6871i c6871iClone = c6871i.clone();
            c6871iClone.f7753b = this.f7737w.f7753b + getTop();
            c6871iClone.f7752a = this.f7737w.f7752a + getLeft();
            c6871iClone.f7756e = this.f7734t;
            c6871iClone.f7757f = this.f7737w.f7757f - ((1.0f - getScaleX()) * this.f7737w.f7757f);
            this.f7722h = c6871iClone.clone();
            this.f7721g = c6871iClone.clone();
        }
    }

    /* renamed from: j */
    public boolean m6918j() {
        if (getScale() == 1.0f) {
            return true;
        }
        m6802c(1.0f, true);
        return false;
    }

    /* renamed from: k */
    public final void m6919k() {
        Paint paint = new Paint();
        this.f7718d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f7718d.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f7719e = new Matrix();
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    /* renamed from: l */
    public final void m6920l() {
        if (getDrawable() == null) {
            return;
        }
        if ((this.f7720f != null && this.f7721g != null && this.f7722h != null) || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (getDrawable() instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) getDrawable()).getBitmap();
            this.f7725k = bitmap.getWidth();
            this.f7726l = bitmap.getHeight();
        } else if (getDrawable() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getDrawable();
            this.f7725k = colorDrawable.getIntrinsicWidth();
            this.f7726l = colorDrawable.getIntrinsicHeight();
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight(), Bitmap.Config.RGB_565);
            this.f7725k = bitmapCreateBitmap.getWidth();
            this.f7726l = bitmapCreateBitmap.getHeight();
        }
        C6863a c6863a = null;
        C6871i c6871i = new C6871i(c6863a);
        this.f7720f = c6871i;
        c6871i.f7756e = 0;
        if (this.f7723i == null) {
            this.f7723i = new Rect();
        }
        C6871i c6871i2 = this.f7720f;
        Rect rect = this.f7723i;
        c6871i2.f7752a = rect.left;
        c6871i2.f7753b = rect.top - AbstractC6802h.m6497i();
        this.f7720f.f7754c = this.f7723i.width();
        this.f7720f.f7755d = this.f7723i.height();
        this.f7720f.f7757f = Math.max(this.f7723i.width() / this.f7725k, this.f7723i.height() / this.f7726l);
        C6871i c6871i3 = new C6871i(c6863a);
        this.f7721g = c6871i3;
        c6871i3.f7757f = Math.min(getWidth() / this.f7725k, getHeight() / this.f7726l);
        C6871i c6871i4 = this.f7721g;
        c6871i4.f7756e = 255;
        float f10 = c6871i4.f7757f;
        int i9 = (int) (this.f7725k * f10);
        c6871i4.f7752a = (getWidth() - i9) / 2.0f;
        this.f7721g.f7753b = (getHeight() - r1) / 2.0f;
        C6871i c6871i5 = this.f7721g;
        c6871i5.f7754c = i9;
        c6871i5.f7755d = (int) (f10 * this.f7726l);
        Status status = this.f7717c;
        if (status == Status.STATE_IN) {
            this.f7722h = this.f7720f.clone();
        } else if (status == Status.STATE_OUT) {
            this.f7722h = c6871i5.clone();
        }
        this.f7737w = this.f7721g;
    }

    /* renamed from: m */
    public final float m6921m() {
        if (this.f7737w == null) {
            m6920l();
        }
        return Math.abs(getTop() / this.f7737w.f7755d);
    }

    /* renamed from: n */
    public final void m6922n() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getTop(), 0);
        valueAnimatorOfInt.addUpdateListener(new C6863a());
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(getLeft(), 0);
        valueAnimatorOfInt2.addUpdateListener(new C6864b());
        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(this.f7734t, 255);
        valueAnimatorOfInt3.addUpdateListener(new C6865c());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C6866d());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(f7716y);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfFloat, valueAnimatorOfInt3);
        animatorSet.start();
    }

    /* renamed from: o */
    public void m6923o(boolean z9, float f10) {
        this.f7727m = z9;
        this.f7729o = f10;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.PhotoView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7725k = 0;
        this.f7726l = 0;
        this.f7723i = null;
        this.f7718d = null;
        this.f7719e = null;
        this.f7720f = null;
        this.f7721g = null;
        this.f7722h = null;
        ValueAnimator valueAnimator = this.f7728n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7728n.clone();
            this.f7728n = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        Status status = this.f7717c;
        if (status != Status.STATE_OUT && status != Status.STATE_IN) {
            if (status == Status.STATE_MOVE) {
                this.f7718d.setAlpha(0);
                canvas.drawPaint(this.f7718d);
                super.onDraw(canvas);
                return;
            } else {
                this.f7718d.setAlpha(255);
                canvas.drawPaint(this.f7718d);
                super.onDraw(canvas);
                return;
            }
        }
        if (this.f7720f == null || this.f7721g == null || this.f7722h == null) {
            m6920l();
        }
        C6871i c6871i = this.f7722h;
        if (c6871i == null) {
            super.onDraw(canvas);
            return;
        }
        this.f7718d.setAlpha(c6871i.f7756e);
        canvas.drawPaint(this.f7718d);
        int saveCount = canvas.getSaveCount();
        Matrix matrix = this.f7719e;
        float f10 = this.f7722h.f7757f;
        matrix.setScale(f10, f10);
        float f11 = this.f7725k;
        C6871i c6871i2 = this.f7722h;
        float f12 = c6871i2.f7757f;
        this.f7719e.postTranslate((-((f11 * f12) - c6871i2.f7754c)) / 2.0f, (-((this.f7726l * f12) - c6871i2.f7755d)) / 2.0f);
        C6871i c6871i3 = this.f7722h;
        canvas.translate(c6871i3.f7752a, c6871i3.f7753b);
        C6871i c6871i4 = this.f7722h;
        canvas.clipRect(0.0f, 0.0f, c6871i4.f7754c, c6871i4.f7755d);
        canvas.concat(this.f7719e);
        getDrawable().draw(canvas);
        canvas.restoreToCount(saveCount);
        if (this.f7724j) {
            m6924p();
        }
    }

    /* renamed from: p */
    public final void m6924p() {
        this.f7724j = false;
        if (this.f7722h == null) {
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f7728n = valueAnimator;
        valueAnimator.setDuration(f7716y);
        this.f7728n.setInterpolator(new AccelerateDecelerateInterpolator());
        Status status = this.f7717c;
        if (status == Status.STATE_IN) {
            this.f7728n.setValues(PropertyValuesHolder.ofFloat("animScale", this.f7720f.f7757f, this.f7721g.f7757f), PropertyValuesHolder.ofInt("animAlpha", this.f7720f.f7756e, this.f7721g.f7756e), PropertyValuesHolder.ofFloat("animLeft", this.f7720f.f7752a, this.f7721g.f7752a), PropertyValuesHolder.ofFloat("animTop", this.f7720f.f7753b, this.f7721g.f7753b), PropertyValuesHolder.ofFloat("animWidth", this.f7720f.f7754c, this.f7721g.f7754c), PropertyValuesHolder.ofFloat("animHeight", this.f7720f.f7755d, this.f7721g.f7755d));
        } else if (status == Status.STATE_OUT) {
            this.f7728n.setValues(PropertyValuesHolder.ofFloat("animScale", this.f7721g.f7757f, this.f7720f.f7757f), PropertyValuesHolder.ofInt("animAlpha", this.f7721g.f7756e, this.f7720f.f7756e), PropertyValuesHolder.ofFloat("animLeft", this.f7721g.f7752a, this.f7720f.f7752a), PropertyValuesHolder.ofFloat("animTop", this.f7721g.f7753b, this.f7720f.f7753b), PropertyValuesHolder.ofFloat("animWidth", this.f7721g.f7754c, this.f7720f.f7754c), PropertyValuesHolder.ofFloat("animHeight", this.f7721g.f7755d, this.f7720f.f7755d));
        }
        this.f7728n.addUpdateListener(new C6867e());
        this.f7728n.addListener(new C6868f());
        this.f7728n.start();
    }

    /* renamed from: q */
    public void m6925q(InterfaceC6872j interfaceC6872j) {
        setOnTransformListener(interfaceC6872j);
        this.f7724j = true;
        this.f7717c = Status.STATE_IN;
        invalidate();
    }

    /* renamed from: r */
    public void m6926r(InterfaceC6872j interfaceC6872j) {
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
        setOnTransformListener(interfaceC6872j);
        this.f7724j = true;
        this.f7717c = Status.STATE_OUT;
        invalidate();
    }

    public void setAlphaChangeListener(InterfaceC6869g interfaceC6869g) {
        this.f7735u = interfaceC6869g;
    }

    public void setOnTransformListener(InterfaceC6872j interfaceC6872j) {
        this.f7738x = interfaceC6872j;
    }

    public void setThumbRect(Rect rect) {
        this.f7723i = rect;
    }

    public void setTransformOutListener(InterfaceC6870h interfaceC6870h) {
        this.f7736v = interfaceC6870h;
    }
}
