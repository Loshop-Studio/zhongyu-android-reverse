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
import com.xuexiang.xui.utils.AbstractC6483h;
import com.xuexiang.xui.widget.imageview.photoview.PhotoView;

/* loaded from: classes4.dex */
public class SmoothImageView extends PhotoView {

    /* renamed from: y */
    public static int f6458y = 400;

    /* renamed from: c */
    public Status f6459c;

    /* renamed from: d */
    public Paint f6460d;

    /* renamed from: e */
    public Matrix f6461e;

    /* renamed from: f */
    public C6551i f6462f;

    /* renamed from: g */
    public C6551i f6463g;

    /* renamed from: h */
    public C6551i f6464h;

    /* renamed from: i */
    public Rect f6465i;

    /* renamed from: j */
    public boolean f6466j;

    /* renamed from: k */
    public int f6467k;

    /* renamed from: l */
    public int f6468l;

    /* renamed from: m */
    public boolean f6469m;

    /* renamed from: n */
    public ValueAnimator f6470n;

    /* renamed from: o */
    public float f6471o;

    /* renamed from: p */
    public int f6472p;

    /* renamed from: q */
    public int f6473q;

    /* renamed from: r */
    public boolean f6474r;

    /* renamed from: s */
    public boolean f6475s;

    /* renamed from: t */
    public int f6476t;

    /* renamed from: u */
    public InterfaceC6549g f6477u;

    /* renamed from: v */
    public InterfaceC6550h f6478v;

    /* renamed from: w */
    public C6551i f6479w;

    /* renamed from: x */
    public InterfaceC6552j f6480x;

    public enum Status {
        STATE_NORMAL,
        STATE_IN,
        STATE_OUT,
        STATE_MOVE
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$a */
    public class C6543a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f6486a = 0;

        public C6543a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i10 = this.f6486a;
            if (i10 != 0) {
                SmoothImageView.this.offsetTopAndBottom(iIntValue - i10);
            }
            this.f6486a = iIntValue;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$b */
    public class C6544b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f6488a = 0;

        public C6544b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i10 = this.f6488a;
            if (i10 != 0) {
                SmoothImageView.this.offsetLeftAndRight(iIntValue - i10);
            }
            this.f6488a = iIntValue;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$c */
    public class C6545c implements ValueAnimator.AnimatorUpdateListener {
        public C6545c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (SmoothImageView.this.f6477u != null) {
                SmoothImageView.this.f6477u.mo5776a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$d */
    public class C6546d implements ValueAnimator.AnimatorUpdateListener {
        public C6546d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SmoothImageView.this.setScaleX(fFloatValue);
            SmoothImageView.this.setScaleY(fFloatValue);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$e */
    public class C6547e implements ValueAnimator.AnimatorUpdateListener {
        public C6547e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmoothImageView.this.f6464h.f6498e = ((Integer) valueAnimator.getAnimatedValue("animAlpha")).intValue();
            SmoothImageView.this.f6464h.f6499f = ((Float) valueAnimator.getAnimatedValue("animScale")).floatValue();
            SmoothImageView.this.f6464h.f6494a = ((Float) valueAnimator.getAnimatedValue("animLeft")).floatValue();
            SmoothImageView.this.f6464h.f6495b = ((Float) valueAnimator.getAnimatedValue("animTop")).floatValue();
            SmoothImageView.this.f6464h.f6496c = ((Float) valueAnimator.getAnimatedValue("animWidth")).floatValue();
            SmoothImageView.this.f6464h.f6497d = ((Float) valueAnimator.getAnimatedValue("animHeight")).floatValue();
            SmoothImageView.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$f */
    public class C6548f extends AnimatorListenerAdapter {
        public C6548f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (SmoothImageView.this.f6480x != null) {
                SmoothImageView.this.f6480x.mo5778a(SmoothImageView.this.f6459c);
            }
            if (SmoothImageView.this.f6459c == Status.STATE_IN) {
                SmoothImageView.this.f6459c = Status.STATE_NORMAL;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SmoothImageView smoothImageView = SmoothImageView.this;
            int i10 = R$id.item_image_key;
            if (smoothImageView.getTag(i10) != null) {
                SmoothImageView.this.setTag(i10, null);
                SmoothImageView.this.setOnLongClickListener(null);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$g */
    public interface InterfaceC6549g {
        /* renamed from: a */
        void mo5776a(int i10);
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$h */
    public interface InterfaceC6550h {
        /* renamed from: a */
        void mo5777a();
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$i */
    public static class C6551i implements Cloneable {

        /* renamed from: a */
        public float f6494a;

        /* renamed from: b */
        public float f6495b;

        /* renamed from: c */
        public float f6496c;

        /* renamed from: d */
        public float f6497d;

        /* renamed from: e */
        public int f6498e;

        /* renamed from: f */
        public float f6499f;

        public C6551i() {
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C6551i clone() {
            try {
                return (C6551i) super.clone();
            } catch (CloneNotSupportedException e10) {
                e10.printStackTrace();
                return null;
            }
        }

        public /* synthetic */ C6551i(C6543a c6543a) {
            this();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$j */
    public interface InterfaceC6552j {
        /* renamed from: a */
        void mo5778a(Status status);
    }

    public SmoothImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6459c = Status.STATE_NORMAL;
        this.f6471o = 0.5f;
        this.f6474r = false;
        this.f6475s = false;
        this.f6476t = 0;
        m5813k();
    }

    public static void setDuration(int i10) {
        f6458y = i10;
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
    public final void m5811i() {
        C6551i c6551i = this.f6479w;
        if (c6551i != null) {
            C6551i c6551iClone = c6551i.clone();
            c6551iClone.f6495b = this.f6479w.f6495b + getTop();
            c6551iClone.f6494a = this.f6479w.f6494a + getLeft();
            c6551iClone.f6498e = this.f6476t;
            c6551iClone.f6499f = this.f6479w.f6499f - ((1.0f - getScaleX()) * this.f6479w.f6499f);
            this.f6464h = c6551iClone.clone();
            this.f6463g = c6551iClone.clone();
        }
    }

    /* renamed from: j */
    public boolean m5812j() {
        if (getScale() == 1.0f) {
            return true;
        }
        m5696c(1.0f, true);
        return false;
    }

    /* renamed from: k */
    public final void m5813k() {
        Paint paint = new Paint();
        this.f6460d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f6460d.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f6461e = new Matrix();
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    /* renamed from: l */
    public final void m5814l() {
        if (getDrawable() == null) {
            return;
        }
        if ((this.f6462f != null && this.f6463g != null && this.f6464h != null) || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (getDrawable() instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) getDrawable()).getBitmap();
            this.f6467k = bitmap.getWidth();
            this.f6468l = bitmap.getHeight();
        } else if (getDrawable() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getDrawable();
            this.f6467k = colorDrawable.getIntrinsicWidth();
            this.f6468l = colorDrawable.getIntrinsicHeight();
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight(), Bitmap.Config.RGB_565);
            this.f6467k = bitmapCreateBitmap.getWidth();
            this.f6468l = bitmapCreateBitmap.getHeight();
        }
        C6543a c6543a = null;
        C6551i c6551i = new C6551i(c6543a);
        this.f6462f = c6551i;
        c6551i.f6498e = 0;
        if (this.f6465i == null) {
            this.f6465i = new Rect();
        }
        C6551i c6551i2 = this.f6462f;
        Rect rect = this.f6465i;
        c6551i2.f6494a = rect.left;
        c6551i2.f6495b = rect.top - AbstractC6483h.m5400i();
        this.f6462f.f6496c = this.f6465i.width();
        this.f6462f.f6497d = this.f6465i.height();
        this.f6462f.f6499f = Math.max(this.f6465i.width() / this.f6467k, this.f6465i.height() / this.f6468l);
        C6551i c6551i3 = new C6551i(c6543a);
        this.f6463g = c6551i3;
        c6551i3.f6499f = Math.min(getWidth() / this.f6467k, getHeight() / this.f6468l);
        C6551i c6551i4 = this.f6463g;
        c6551i4.f6498e = 255;
        float f10 = c6551i4.f6499f;
        int i10 = (int) (this.f6467k * f10);
        c6551i4.f6494a = (getWidth() - i10) / 2.0f;
        this.f6463g.f6495b = (getHeight() - r1) / 2.0f;
        C6551i c6551i5 = this.f6463g;
        c6551i5.f6496c = i10;
        c6551i5.f6497d = (int) (f10 * this.f6468l);
        Status status = this.f6459c;
        if (status == Status.STATE_IN) {
            this.f6464h = this.f6462f.clone();
        } else if (status == Status.STATE_OUT) {
            this.f6464h = c6551i5.clone();
        }
        this.f6479w = this.f6463g;
    }

    /* renamed from: m */
    public final float m5815m() {
        if (this.f6479w == null) {
            m5814l();
        }
        return Math.abs(getTop() / this.f6479w.f6497d);
    }

    /* renamed from: n */
    public final void m5816n() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getTop(), 0);
        valueAnimatorOfInt.addUpdateListener(new C6543a());
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(getLeft(), 0);
        valueAnimatorOfInt2.addUpdateListener(new C6544b());
        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(this.f6476t, 255);
        valueAnimatorOfInt3.addUpdateListener(new C6545c());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C6546d());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(f6458y);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfFloat, valueAnimatorOfInt3);
        animatorSet.start();
    }

    /* renamed from: o */
    public void m5817o(boolean z9, float f10) {
        this.f6469m = z9;
        this.f6471o = f10;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.PhotoView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6467k = 0;
        this.f6468l = 0;
        this.f6465i = null;
        this.f6460d = null;
        this.f6461e = null;
        this.f6462f = null;
        this.f6463g = null;
        this.f6464h = null;
        ValueAnimator valueAnimator = this.f6470n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f6470n.clone();
            this.f6470n = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        Status status = this.f6459c;
        if (status != Status.STATE_OUT && status != Status.STATE_IN) {
            if (status == Status.STATE_MOVE) {
                this.f6460d.setAlpha(0);
                canvas.drawPaint(this.f6460d);
                super.onDraw(canvas);
                return;
            } else {
                this.f6460d.setAlpha(255);
                canvas.drawPaint(this.f6460d);
                super.onDraw(canvas);
                return;
            }
        }
        if (this.f6462f == null || this.f6463g == null || this.f6464h == null) {
            m5814l();
        }
        C6551i c6551i = this.f6464h;
        if (c6551i == null) {
            super.onDraw(canvas);
            return;
        }
        this.f6460d.setAlpha(c6551i.f6498e);
        canvas.drawPaint(this.f6460d);
        int saveCount = canvas.getSaveCount();
        Matrix matrix = this.f6461e;
        float f10 = this.f6464h.f6499f;
        matrix.setScale(f10, f10);
        float f11 = this.f6467k;
        C6551i c6551i2 = this.f6464h;
        float f12 = c6551i2.f6499f;
        this.f6461e.postTranslate((-((f11 * f12) - c6551i2.f6496c)) / 2.0f, (-((this.f6468l * f12) - c6551i2.f6497d)) / 2.0f);
        C6551i c6551i3 = this.f6464h;
        canvas.translate(c6551i3.f6494a, c6551i3.f6495b);
        C6551i c6551i4 = this.f6464h;
        canvas.clipRect(0.0f, 0.0f, c6551i4.f6496c, c6551i4.f6497d);
        canvas.concat(this.f6461e);
        getDrawable().draw(canvas);
        canvas.restoreToCount(saveCount);
        if (this.f6466j) {
            m5818p();
        }
    }

    /* renamed from: p */
    public final void m5818p() {
        this.f6466j = false;
        if (this.f6464h == null) {
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f6470n = valueAnimator;
        valueAnimator.setDuration(f6458y);
        this.f6470n.setInterpolator(new AccelerateDecelerateInterpolator());
        Status status = this.f6459c;
        if (status == Status.STATE_IN) {
            this.f6470n.setValues(PropertyValuesHolder.ofFloat("animScale", this.f6462f.f6499f, this.f6463g.f6499f), PropertyValuesHolder.ofInt("animAlpha", this.f6462f.f6498e, this.f6463g.f6498e), PropertyValuesHolder.ofFloat("animLeft", this.f6462f.f6494a, this.f6463g.f6494a), PropertyValuesHolder.ofFloat("animTop", this.f6462f.f6495b, this.f6463g.f6495b), PropertyValuesHolder.ofFloat("animWidth", this.f6462f.f6496c, this.f6463g.f6496c), PropertyValuesHolder.ofFloat("animHeight", this.f6462f.f6497d, this.f6463g.f6497d));
        } else if (status == Status.STATE_OUT) {
            this.f6470n.setValues(PropertyValuesHolder.ofFloat("animScale", this.f6463g.f6499f, this.f6462f.f6499f), PropertyValuesHolder.ofInt("animAlpha", this.f6463g.f6498e, this.f6462f.f6498e), PropertyValuesHolder.ofFloat("animLeft", this.f6463g.f6494a, this.f6462f.f6494a), PropertyValuesHolder.ofFloat("animTop", this.f6463g.f6495b, this.f6462f.f6495b), PropertyValuesHolder.ofFloat("animWidth", this.f6463g.f6496c, this.f6462f.f6496c), PropertyValuesHolder.ofFloat("animHeight", this.f6463g.f6497d, this.f6462f.f6497d));
        }
        this.f6470n.addUpdateListener(new C6547e());
        this.f6470n.addListener(new C6548f());
        this.f6470n.start();
    }

    /* renamed from: q */
    public void m5819q(InterfaceC6552j interfaceC6552j) {
        setOnTransformListener(interfaceC6552j);
        this.f6466j = true;
        this.f6459c = Status.STATE_IN;
        invalidate();
    }

    /* renamed from: r */
    public void m5820r(InterfaceC6552j interfaceC6552j) {
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
        setOnTransformListener(interfaceC6552j);
        this.f6466j = true;
        this.f6459c = Status.STATE_OUT;
        invalidate();
    }

    public void setAlphaChangeListener(InterfaceC6549g interfaceC6549g) {
        this.f6477u = interfaceC6549g;
    }

    public void setOnTransformListener(InterfaceC6552j interfaceC6552j) {
        this.f6480x = interfaceC6552j;
    }

    public void setThumbRect(Rect rect) {
        this.f6465i = rect;
    }

    public void setTransformOutListener(InterfaceC6550h interfaceC6550h) {
        this.f6478v = interfaceC6550h;
    }
}
