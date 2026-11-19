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
import com.xuexiang.xui.utils.AbstractC8042h;
import com.xuexiang.xui.widget.imageview.photoview.PhotoView;

/* loaded from: classes5.dex */
public class SmoothImageView extends PhotoView {

    /* renamed from: A */
    public static int f16322A = 400;

    /* renamed from: e */
    public Status f16323e;

    /* renamed from: f */
    public Paint f16324f;

    /* renamed from: g */
    public Matrix f16325g;

    /* renamed from: h */
    public C8163i f16326h;

    /* renamed from: i */
    public C8163i f16327i;

    /* renamed from: j */
    public C8163i f16328j;

    /* renamed from: k */
    public Rect f16329k;

    /* renamed from: l */
    public boolean f16330l;

    /* renamed from: m */
    public int f16331m;

    /* renamed from: n */
    public int f16332n;

    /* renamed from: o */
    public boolean f16333o;

    /* renamed from: p */
    public ValueAnimator f16334p;

    /* renamed from: q */
    public float f16335q;

    /* renamed from: r */
    public int f16336r;

    /* renamed from: s */
    public int f16337s;

    /* renamed from: t */
    public boolean f16338t;

    /* renamed from: u */
    public boolean f16339u;

    /* renamed from: v */
    public int f16340v;

    /* renamed from: w */
    public InterfaceC8161g f16341w;

    /* renamed from: x */
    public InterfaceC8162h f16342x;

    /* renamed from: y */
    public C8163i f16343y;

    /* renamed from: z */
    public InterfaceC8164j f16344z;

    public enum Status {
        STATE_NORMAL,
        STATE_IN,
        STATE_OUT,
        STATE_MOVE
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$a */
    public class C8155a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f16350a = 0;

        public C8155a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i10 = this.f16350a;
            if (i10 != 0) {
                SmoothImageView.this.offsetTopAndBottom(iIntValue - i10);
            }
            this.f16350a = iIntValue;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$b */
    public class C8156b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f16352a = 0;

        public C8156b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i10 = this.f16352a;
            if (i10 != 0) {
                SmoothImageView.this.offsetLeftAndRight(iIntValue - i10);
            }
            this.f16352a = iIntValue;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$c */
    public class C8157c implements ValueAnimator.AnimatorUpdateListener {
        public C8157c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (SmoothImageView.this.f16341w != null) {
                SmoothImageView.this.f16341w.mo12863a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$d */
    public class C8158d implements ValueAnimator.AnimatorUpdateListener {
        public C8158d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SmoothImageView.this.setScaleX(fFloatValue);
            SmoothImageView.this.setScaleY(fFloatValue);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$e */
    public class C8159e implements ValueAnimator.AnimatorUpdateListener {
        public C8159e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmoothImageView.this.f16328j.f16362g = ((Integer) valueAnimator.getAnimatedValue("animAlpha")).intValue();
            SmoothImageView.this.f16328j.f16363h = ((Float) valueAnimator.getAnimatedValue("animScale")).floatValue();
            SmoothImageView.this.f16328j.f16358c = ((Float) valueAnimator.getAnimatedValue("animLeft")).floatValue();
            SmoothImageView.this.f16328j.f16359d = ((Float) valueAnimator.getAnimatedValue("animTop")).floatValue();
            SmoothImageView.this.f16328j.f16360e = ((Float) valueAnimator.getAnimatedValue("animWidth")).floatValue();
            SmoothImageView.this.f16328j.f16361f = ((Float) valueAnimator.getAnimatedValue("animHeight")).floatValue();
            SmoothImageView.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$f */
    public class C8160f extends AnimatorListenerAdapter {
        public C8160f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (SmoothImageView.this.f16344z != null) {
                SmoothImageView.this.f16344z.mo12865a(SmoothImageView.this.f16323e);
            }
            if (SmoothImageView.this.f16323e == Status.STATE_IN) {
                SmoothImageView.this.f16323e = Status.STATE_NORMAL;
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
    public interface InterfaceC8161g {
        /* renamed from: a */
        void mo12863a(int i10);
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$h */
    public interface InterfaceC8162h {
        /* renamed from: a */
        void mo12864a();
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$i */
    public static class C8163i implements Cloneable {

        /* renamed from: c */
        public float f16358c;

        /* renamed from: d */
        public float f16359d;

        /* renamed from: e */
        public float f16360e;

        /* renamed from: f */
        public float f16361f;

        /* renamed from: g */
        public int f16362g;

        /* renamed from: h */
        public float f16363h;

        public C8163i() {
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C8163i clone() {
            try {
                return (C8163i) super.clone();
            } catch (CloneNotSupportedException e10) {
                e10.printStackTrace();
                return null;
            }
        }

        public /* synthetic */ C8163i(C8155a c8155a) {
            this();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$j */
    public interface InterfaceC8164j {
        /* renamed from: a */
        void mo12865a(Status status);
    }

    public SmoothImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16323e = Status.STATE_NORMAL;
        this.f16335q = 0.5f;
        this.f16338t = false;
        this.f16339u = false;
        this.f16340v = 0;
        m12898k();
    }

    public static void setDuration(int i10) {
        f16322A = i10;
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
    public final void m12896i() {
        C8163i c8163i = this.f16343y;
        if (c8163i != null) {
            C8163i c8163iClone = c8163i.clone();
            c8163iClone.f16359d = this.f16343y.f16359d + getTop();
            c8163iClone.f16358c = this.f16343y.f16358c + getLeft();
            c8163iClone.f16362g = this.f16340v;
            c8163iClone.f16363h = this.f16343y.f16363h - ((1.0f - getScaleX()) * this.f16343y.f16363h);
            this.f16328j = c8163iClone.clone();
            this.f16327i = c8163iClone.clone();
        }
    }

    /* renamed from: j */
    public boolean m12897j() {
        if (getScale() == 1.0f) {
            return true;
        }
        m12783c(1.0f, true);
        return false;
    }

    /* renamed from: k */
    public final void m12898k() {
        Paint paint = new Paint();
        this.f16324f = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f16324f.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f16325g = new Matrix();
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    /* renamed from: l */
    public final void m12899l() {
        if (getDrawable() == null) {
            return;
        }
        if ((this.f16326h != null && this.f16327i != null && this.f16328j != null) || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (getDrawable() instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) getDrawable()).getBitmap();
            this.f16331m = bitmap.getWidth();
            this.f16332n = bitmap.getHeight();
        } else if (getDrawable() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getDrawable();
            this.f16331m = colorDrawable.getIntrinsicWidth();
            this.f16332n = colorDrawable.getIntrinsicHeight();
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight(), Bitmap.Config.RGB_565);
            this.f16331m = bitmapCreateBitmap.getWidth();
            this.f16332n = bitmapCreateBitmap.getHeight();
        }
        C8155a c8155a = null;
        C8163i c8163i = new C8163i(c8155a);
        this.f16326h = c8163i;
        c8163i.f16362g = 0;
        if (this.f16329k == null) {
            this.f16329k = new Rect();
        }
        C8163i c8163i2 = this.f16326h;
        Rect rect = this.f16329k;
        c8163i2.f16358c = rect.left;
        c8163i2.f16359d = rect.top - AbstractC8042h.m12233g();
        this.f16326h.f16360e = this.f16329k.width();
        this.f16326h.f16361f = this.f16329k.height();
        this.f16326h.f16363h = Math.max(this.f16329k.width() / this.f16331m, this.f16329k.height() / this.f16332n);
        C8163i c8163i3 = new C8163i(c8155a);
        this.f16327i = c8163i3;
        c8163i3.f16363h = Math.min(getWidth() / this.f16331m, getHeight() / this.f16332n);
        C8163i c8163i4 = this.f16327i;
        c8163i4.f16362g = 255;
        float f10 = c8163i4.f16363h;
        int i10 = (int) (this.f16331m * f10);
        c8163i4.f16358c = (getWidth() - i10) / 2.0f;
        this.f16327i.f16359d = (getHeight() - r1) / 2.0f;
        C8163i c8163i5 = this.f16327i;
        c8163i5.f16360e = i10;
        c8163i5.f16361f = (int) (f10 * this.f16332n);
        Status status = this.f16323e;
        if (status == Status.STATE_IN) {
            this.f16328j = this.f16326h.clone();
        } else if (status == Status.STATE_OUT) {
            this.f16328j = c8163i5.clone();
        }
        this.f16343y = this.f16327i;
    }

    /* renamed from: m */
    public final float m12900m() {
        if (this.f16343y == null) {
            m12899l();
        }
        return Math.abs(getTop() / this.f16343y.f16361f);
    }

    /* renamed from: n */
    public final void m12901n() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getTop(), 0);
        valueAnimatorOfInt.addUpdateListener(new C8155a());
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(getLeft(), 0);
        valueAnimatorOfInt2.addUpdateListener(new C8156b());
        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(this.f16340v, 255);
        valueAnimatorOfInt3.addUpdateListener(new C8157c());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C8158d());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(f16322A);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfFloat, valueAnimatorOfInt3);
        animatorSet.start();
    }

    /* renamed from: o */
    public void m12902o(boolean z10, float f10) {
        this.f16333o = z10;
        this.f16335q = f10;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.PhotoView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16331m = 0;
        this.f16332n = 0;
        this.f16329k = null;
        this.f16324f = null;
        this.f16325g = null;
        this.f16326h = null;
        this.f16327i = null;
        this.f16328j = null;
        ValueAnimator valueAnimator = this.f16334p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16334p.clone();
            this.f16334p = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        Status status = this.f16323e;
        if (status != Status.STATE_OUT && status != Status.STATE_IN) {
            if (status == Status.STATE_MOVE) {
                this.f16324f.setAlpha(0);
                canvas.drawPaint(this.f16324f);
                super.onDraw(canvas);
                return;
            } else {
                this.f16324f.setAlpha(255);
                canvas.drawPaint(this.f16324f);
                super.onDraw(canvas);
                return;
            }
        }
        if (this.f16326h == null || this.f16327i == null || this.f16328j == null) {
            m12899l();
        }
        C8163i c8163i = this.f16328j;
        if (c8163i == null) {
            super.onDraw(canvas);
            return;
        }
        this.f16324f.setAlpha(c8163i.f16362g);
        canvas.drawPaint(this.f16324f);
        int saveCount = canvas.getSaveCount();
        Matrix matrix = this.f16325g;
        float f10 = this.f16328j.f16363h;
        matrix.setScale(f10, f10);
        float f11 = this.f16331m;
        C8163i c8163i2 = this.f16328j;
        float f12 = c8163i2.f16363h;
        this.f16325g.postTranslate((-((f11 * f12) - c8163i2.f16360e)) / 2.0f, (-((this.f16332n * f12) - c8163i2.f16361f)) / 2.0f);
        C8163i c8163i3 = this.f16328j;
        canvas.translate(c8163i3.f16358c, c8163i3.f16359d);
        C8163i c8163i4 = this.f16328j;
        canvas.clipRect(0.0f, 0.0f, c8163i4.f16360e, c8163i4.f16361f);
        canvas.concat(this.f16325g);
        getDrawable().draw(canvas);
        canvas.restoreToCount(saveCount);
        if (this.f16330l) {
            m12903p();
        }
    }

    /* renamed from: p */
    public final void m12903p() {
        this.f16330l = false;
        if (this.f16328j == null) {
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f16334p = valueAnimator;
        valueAnimator.setDuration(f16322A);
        this.f16334p.setInterpolator(new AccelerateDecelerateInterpolator());
        Status status = this.f16323e;
        if (status == Status.STATE_IN) {
            this.f16334p.setValues(PropertyValuesHolder.ofFloat("animScale", this.f16326h.f16363h, this.f16327i.f16363h), PropertyValuesHolder.ofInt("animAlpha", this.f16326h.f16362g, this.f16327i.f16362g), PropertyValuesHolder.ofFloat("animLeft", this.f16326h.f16358c, this.f16327i.f16358c), PropertyValuesHolder.ofFloat("animTop", this.f16326h.f16359d, this.f16327i.f16359d), PropertyValuesHolder.ofFloat("animWidth", this.f16326h.f16360e, this.f16327i.f16360e), PropertyValuesHolder.ofFloat("animHeight", this.f16326h.f16361f, this.f16327i.f16361f));
        } else if (status == Status.STATE_OUT) {
            this.f16334p.setValues(PropertyValuesHolder.ofFloat("animScale", this.f16327i.f16363h, this.f16326h.f16363h), PropertyValuesHolder.ofInt("animAlpha", this.f16327i.f16362g, this.f16326h.f16362g), PropertyValuesHolder.ofFloat("animLeft", this.f16327i.f16358c, this.f16326h.f16358c), PropertyValuesHolder.ofFloat("animTop", this.f16327i.f16359d, this.f16326h.f16359d), PropertyValuesHolder.ofFloat("animWidth", this.f16327i.f16360e, this.f16326h.f16360e), PropertyValuesHolder.ofFloat("animHeight", this.f16327i.f16361f, this.f16326h.f16361f));
        }
        this.f16334p.addUpdateListener(new C8159e());
        this.f16334p.addListener(new C8160f());
        this.f16334p.start();
    }

    /* renamed from: q */
    public void m12904q(InterfaceC8164j interfaceC8164j) {
        setOnTransformListener(interfaceC8164j);
        this.f16330l = true;
        this.f16323e = Status.STATE_IN;
        invalidate();
    }

    /* renamed from: r */
    public void m12905r(InterfaceC8164j interfaceC8164j) {
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
        setOnTransformListener(interfaceC8164j);
        this.f16330l = true;
        this.f16323e = Status.STATE_OUT;
        invalidate();
    }

    public void setAlphaChangeListener(InterfaceC8161g interfaceC8161g) {
        this.f16341w = interfaceC8161g;
    }

    public void setOnTransformListener(InterfaceC8164j interfaceC8164j) {
        this.f16344z = interfaceC8164j;
    }

    public void setThumbRect(Rect rect) {
        this.f16329k = rect;
    }

    public void setTransformOutListener(InterfaceC8162h interfaceC8162h) {
        this.f16342x = interfaceC8162h;
    }

    public SmoothImageView(Context context) {
        super(context);
        this.f16323e = Status.STATE_NORMAL;
        this.f16335q = 0.5f;
        this.f16338t = false;
        this.f16339u = false;
        this.f16340v = 0;
        m12898k();
    }
}
