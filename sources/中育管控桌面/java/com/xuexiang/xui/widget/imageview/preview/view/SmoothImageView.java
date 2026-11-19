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
import com.xuexiang.xui.utils.AbstractC5860h;
import com.xuexiang.xui.widget.imageview.photoview.PhotoView;

/* loaded from: classes3.dex */
public class SmoothImageView extends PhotoView {

    /* renamed from: y */
    public static int f5183y = 400;

    /* renamed from: c */
    public Status f5184c;

    /* renamed from: d */
    public Paint f5185d;

    /* renamed from: e */
    public Matrix f5186e;

    /* renamed from: f */
    public C5930i f5187f;

    /* renamed from: g */
    public C5930i f5188g;

    /* renamed from: h */
    public C5930i f5189h;

    /* renamed from: i */
    public Rect f5190i;

    /* renamed from: j */
    public boolean f5191j;

    /* renamed from: k */
    public int f5192k;

    /* renamed from: l */
    public int f5193l;

    /* renamed from: m */
    public boolean f5194m;

    /* renamed from: n */
    public ValueAnimator f5195n;

    /* renamed from: o */
    public float f5196o;

    /* renamed from: p */
    public int f5197p;

    /* renamed from: q */
    public int f5198q;

    /* renamed from: r */
    public boolean f5199r;

    /* renamed from: s */
    public boolean f5200s;

    /* renamed from: t */
    public int f5201t;

    /* renamed from: u */
    public InterfaceC5928g f5202u;

    /* renamed from: v */
    public InterfaceC5929h f5203v;

    /* renamed from: w */
    public C5930i f5204w;

    /* renamed from: x */
    public InterfaceC5931j f5205x;

    public enum Status {
        STATE_NORMAL,
        STATE_IN,
        STATE_OUT,
        STATE_MOVE
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$a */
    public class C5922a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f5211a = 0;

        public C5922a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i6 = this.f5211a;
            if (i6 != 0) {
                SmoothImageView.this.offsetTopAndBottom(iIntValue - i6);
            }
            this.f5211a = iIntValue;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$b */
    public class C5923b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f5213a = 0;

        public C5923b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i6 = this.f5213a;
            if (i6 != 0) {
                SmoothImageView.this.offsetLeftAndRight(iIntValue - i6);
            }
            this.f5213a = iIntValue;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$c */
    public class C5924c implements ValueAnimator.AnimatorUpdateListener {
        public C5924c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (SmoothImageView.this.f5202u != null) {
                SmoothImageView.this.f5202u.mo4795a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$d */
    public class C5925d implements ValueAnimator.AnimatorUpdateListener {
        public C5925d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SmoothImageView.this.setScaleX(fFloatValue);
            SmoothImageView.this.setScaleY(fFloatValue);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$e */
    public class C5926e implements ValueAnimator.AnimatorUpdateListener {
        public C5926e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmoothImageView.this.f5189h.f5223e = ((Integer) valueAnimator.getAnimatedValue("animAlpha")).intValue();
            SmoothImageView.this.f5189h.f5224f = ((Float) valueAnimator.getAnimatedValue("animScale")).floatValue();
            SmoothImageView.this.f5189h.f5219a = ((Float) valueAnimator.getAnimatedValue("animLeft")).floatValue();
            SmoothImageView.this.f5189h.f5220b = ((Float) valueAnimator.getAnimatedValue("animTop")).floatValue();
            SmoothImageView.this.f5189h.f5221c = ((Float) valueAnimator.getAnimatedValue("animWidth")).floatValue();
            SmoothImageView.this.f5189h.f5222d = ((Float) valueAnimator.getAnimatedValue("animHeight")).floatValue();
            SmoothImageView.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$f */
    public class C5927f extends AnimatorListenerAdapter {
        public C5927f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (SmoothImageView.this.f5205x != null) {
                SmoothImageView.this.f5205x.mo4797a(SmoothImageView.this.f5184c);
            }
            if (SmoothImageView.this.f5184c == Status.STATE_IN) {
                SmoothImageView.this.f5184c = Status.STATE_NORMAL;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SmoothImageView smoothImageView = SmoothImageView.this;
            int i6 = R$id.item_image_key;
            if (smoothImageView.getTag(i6) != null) {
                SmoothImageView.this.setTag(i6, null);
                SmoothImageView.this.setOnLongClickListener(null);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$g */
    public interface InterfaceC5928g {
        /* renamed from: a */
        void mo4795a(int i6);
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$h */
    public interface InterfaceC5929h {
        /* renamed from: a */
        void mo4796a();
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$i */
    public static class C5930i implements Cloneable {

        /* renamed from: a */
        public float f5219a;

        /* renamed from: b */
        public float f5220b;

        /* renamed from: c */
        public float f5221c;

        /* renamed from: d */
        public float f5222d;

        /* renamed from: e */
        public int f5223e;

        /* renamed from: f */
        public float f5224f;

        public C5930i() {
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5930i clone() {
            try {
                return (C5930i) super.clone();
            } catch (CloneNotSupportedException e6) {
                e6.printStackTrace();
                return null;
            }
        }

        public /* synthetic */ C5930i(C5922a c5922a) {
            this();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$j */
    public interface InterfaceC5931j {
        /* renamed from: a */
        void mo4797a(Status status);
    }

    public SmoothImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5184c = Status.STATE_NORMAL;
        this.f5196o = 0.5f;
        this.f5199r = false;
        this.f5200s = false;
        this.f5201t = 0;
        m4832k();
    }

    public static void setDuration(int i6) {
        f5183y = i6;
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
    public final void m4830i() {
        C5930i c5930i = this.f5204w;
        if (c5930i != null) {
            C5930i c5930iClone = c5930i.clone();
            c5930iClone.f5220b = this.f5204w.f5220b + getTop();
            c5930iClone.f5219a = this.f5204w.f5219a + getLeft();
            c5930iClone.f5223e = this.f5201t;
            c5930iClone.f5224f = this.f5204w.f5224f - ((1.0f - getScaleX()) * this.f5204w.f5224f);
            this.f5189h = c5930iClone.clone();
            this.f5188g = c5930iClone.clone();
        }
    }

    /* renamed from: j */
    public boolean m4831j() {
        if (getScale() == 1.0f) {
            return true;
        }
        m4715c(1.0f, true);
        return false;
    }

    /* renamed from: k */
    public final void m4832k() {
        Paint paint = new Paint();
        this.f5185d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f5185d.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f5186e = new Matrix();
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    /* renamed from: l */
    public final void m4833l() {
        if (getDrawable() == null) {
            return;
        }
        if ((this.f5187f != null && this.f5188g != null && this.f5189h != null) || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (getDrawable() instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) getDrawable()).getBitmap();
            this.f5192k = bitmap.getWidth();
            this.f5193l = bitmap.getHeight();
        } else if (getDrawable() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getDrawable();
            this.f5192k = colorDrawable.getIntrinsicWidth();
            this.f5193l = colorDrawable.getIntrinsicHeight();
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight(), Bitmap.Config.RGB_565);
            this.f5192k = bitmapCreateBitmap.getWidth();
            this.f5193l = bitmapCreateBitmap.getHeight();
        }
        C5922a c5922a = null;
        C5930i c5930i = new C5930i(c5922a);
        this.f5187f = c5930i;
        c5930i.f5223e = 0;
        if (this.f5190i == null) {
            this.f5190i = new Rect();
        }
        C5930i c5930i2 = this.f5187f;
        Rect rect = this.f5190i;
        c5930i2.f5219a = rect.left;
        c5930i2.f5220b = rect.top - AbstractC5860h.m4406j();
        this.f5187f.f5221c = this.f5190i.width();
        this.f5187f.f5222d = this.f5190i.height();
        this.f5187f.f5224f = Math.max(this.f5190i.width() / this.f5192k, this.f5190i.height() / this.f5193l);
        C5930i c5930i3 = new C5930i(c5922a);
        this.f5188g = c5930i3;
        c5930i3.f5224f = Math.min(getWidth() / this.f5192k, getHeight() / this.f5193l);
        C5930i c5930i4 = this.f5188g;
        c5930i4.f5223e = 255;
        float f6 = c5930i4.f5224f;
        int i6 = (int) (this.f5192k * f6);
        c5930i4.f5219a = (getWidth() - i6) / 2.0f;
        this.f5188g.f5220b = (getHeight() - r1) / 2.0f;
        C5930i c5930i5 = this.f5188g;
        c5930i5.f5221c = i6;
        c5930i5.f5222d = (int) (f6 * this.f5193l);
        Status status = this.f5184c;
        if (status == Status.STATE_IN) {
            this.f5189h = this.f5187f.clone();
        } else if (status == Status.STATE_OUT) {
            this.f5189h = c5930i5.clone();
        }
        this.f5204w = this.f5188g;
    }

    /* renamed from: m */
    public final float m4834m() {
        if (this.f5204w == null) {
            m4833l();
        }
        return Math.abs(getTop() / this.f5204w.f5222d);
    }

    /* renamed from: n */
    public final void m4835n() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getTop(), 0);
        valueAnimatorOfInt.addUpdateListener(new C5922a());
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(getLeft(), 0);
        valueAnimatorOfInt2.addUpdateListener(new C5923b());
        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(this.f5201t, 255);
        valueAnimatorOfInt3.addUpdateListener(new C5924c());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C5925d());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(f5183y);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfFloat, valueAnimatorOfInt3);
        animatorSet.start();
    }

    /* renamed from: o */
    public void m4836o(boolean z6, float f6) {
        this.f5194m = z6;
        this.f5196o = f6;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.PhotoView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5192k = 0;
        this.f5193l = 0;
        this.f5190i = null;
        this.f5185d = null;
        this.f5186e = null;
        this.f5187f = null;
        this.f5188g = null;
        this.f5189h = null;
        ValueAnimator valueAnimator = this.f5195n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5195n.clone();
            this.f5195n = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        Status status = this.f5184c;
        if (status != Status.STATE_OUT && status != Status.STATE_IN) {
            if (status == Status.STATE_MOVE) {
                this.f5185d.setAlpha(0);
                canvas.drawPaint(this.f5185d);
                super.onDraw(canvas);
                return;
            } else {
                this.f5185d.setAlpha(255);
                canvas.drawPaint(this.f5185d);
                super.onDraw(canvas);
                return;
            }
        }
        if (this.f5187f == null || this.f5188g == null || this.f5189h == null) {
            m4833l();
        }
        C5930i c5930i = this.f5189h;
        if (c5930i == null) {
            super.onDraw(canvas);
            return;
        }
        this.f5185d.setAlpha(c5930i.f5223e);
        canvas.drawPaint(this.f5185d);
        int saveCount = canvas.getSaveCount();
        Matrix matrix = this.f5186e;
        float f6 = this.f5189h.f5224f;
        matrix.setScale(f6, f6);
        float f7 = this.f5192k;
        C5930i c5930i2 = this.f5189h;
        float f8 = c5930i2.f5224f;
        this.f5186e.postTranslate((-((f7 * f8) - c5930i2.f5221c)) / 2.0f, (-((this.f5193l * f8) - c5930i2.f5222d)) / 2.0f);
        C5930i c5930i3 = this.f5189h;
        canvas.translate(c5930i3.f5219a, c5930i3.f5220b);
        C5930i c5930i4 = this.f5189h;
        canvas.clipRect(0.0f, 0.0f, c5930i4.f5221c, c5930i4.f5222d);
        canvas.concat(this.f5186e);
        getDrawable().draw(canvas);
        canvas.restoreToCount(saveCount);
        if (this.f5191j) {
            m4837p();
        }
    }

    /* renamed from: p */
    public final void m4837p() {
        this.f5191j = false;
        if (this.f5189h == null) {
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f5195n = valueAnimator;
        valueAnimator.setDuration(f5183y);
        this.f5195n.setInterpolator(new AccelerateDecelerateInterpolator());
        Status status = this.f5184c;
        if (status == Status.STATE_IN) {
            this.f5195n.setValues(PropertyValuesHolder.ofFloat("animScale", this.f5187f.f5224f, this.f5188g.f5224f), PropertyValuesHolder.ofInt("animAlpha", this.f5187f.f5223e, this.f5188g.f5223e), PropertyValuesHolder.ofFloat("animLeft", this.f5187f.f5219a, this.f5188g.f5219a), PropertyValuesHolder.ofFloat("animTop", this.f5187f.f5220b, this.f5188g.f5220b), PropertyValuesHolder.ofFloat("animWidth", this.f5187f.f5221c, this.f5188g.f5221c), PropertyValuesHolder.ofFloat("animHeight", this.f5187f.f5222d, this.f5188g.f5222d));
        } else if (status == Status.STATE_OUT) {
            this.f5195n.setValues(PropertyValuesHolder.ofFloat("animScale", this.f5188g.f5224f, this.f5187f.f5224f), PropertyValuesHolder.ofInt("animAlpha", this.f5188g.f5223e, this.f5187f.f5223e), PropertyValuesHolder.ofFloat("animLeft", this.f5188g.f5219a, this.f5187f.f5219a), PropertyValuesHolder.ofFloat("animTop", this.f5188g.f5220b, this.f5187f.f5220b), PropertyValuesHolder.ofFloat("animWidth", this.f5188g.f5221c, this.f5187f.f5221c), PropertyValuesHolder.ofFloat("animHeight", this.f5188g.f5222d, this.f5187f.f5222d));
        }
        this.f5195n.addUpdateListener(new C5926e());
        this.f5195n.addListener(new C5927f());
        this.f5195n.start();
    }

    /* renamed from: q */
    public void m4838q(InterfaceC5931j interfaceC5931j) {
        setOnTransformListener(interfaceC5931j);
        this.f5191j = true;
        this.f5184c = Status.STATE_IN;
        invalidate();
    }

    /* renamed from: r */
    public void m4839r(InterfaceC5931j interfaceC5931j) {
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
        setOnTransformListener(interfaceC5931j);
        this.f5191j = true;
        this.f5184c = Status.STATE_OUT;
        invalidate();
    }

    public void setAlphaChangeListener(InterfaceC5928g interfaceC5928g) {
        this.f5202u = interfaceC5928g;
    }

    public void setOnTransformListener(InterfaceC5931j interfaceC5931j) {
        this.f5205x = interfaceC5931j;
    }

    public void setThumbRect(Rect rect) {
        this.f5190i = rect;
    }

    public void setTransformOutListener(InterfaceC5929h interfaceC5929h) {
        this.f5203v = interfaceC5929h;
    }
}
