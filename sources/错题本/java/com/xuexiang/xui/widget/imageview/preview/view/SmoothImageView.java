package com.xuexiang.xui.widget.imageview.preview.view;

import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import androidx.compose.material3.AbstractC1923c;
import androidx.core.view.ViewCompat;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.widget.imageview.photoview.PhotoView;
import com.xuexiang.xui.widget.imageview.preview.p034ui.PreviewActivity;
import p189w2.C6702a;
import p197x2.C6743a;
import p197x2.C6744b;
import p197x2.C6747e;
import p197x2.InterfaceC6745c;
import p197x2.InterfaceC6746d;

/* loaded from: classes3.dex */
public class SmoothImageView extends PhotoView {

    /* renamed from: x */
    public static int f4492x = 400;

    /* renamed from: c */
    public Status f4493c;

    /* renamed from: d */
    public Paint f4494d;

    /* renamed from: e */
    public Matrix f4495e;

    /* renamed from: f */
    public C6747e f4496f;

    /* renamed from: g */
    public C6747e f4497g;

    /* renamed from: h */
    public C6747e f4498h;

    /* renamed from: i */
    public Rect f4499i;

    /* renamed from: j */
    public boolean f4500j;

    /* renamed from: k */
    public int f4501k;

    /* renamed from: l */
    public int f4502l;

    /* renamed from: m */
    public ValueAnimator f4503m;

    /* renamed from: n */
    public final float f4504n;

    /* renamed from: o */
    public int f4505o;

    /* renamed from: p */
    public int f4506p;

    /* renamed from: q */
    public boolean f4507q;

    /* renamed from: r */
    public boolean f4508r;

    /* renamed from: s */
    public int f4509s;

    /* renamed from: t */
    public InterfaceC6745c f4510t;

    /* renamed from: u */
    public InterfaceC6746d f4511u;

    /* renamed from: v */
    public C6747e f4512v;

    /* renamed from: w */
    public InterfaceC4183b f4513w;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        public static final Status STATE_IN;
        public static final Status STATE_MOVE;
        public static final Status STATE_NORMAL;
        public static final Status STATE_OUT;

        /* renamed from: a */
        public static final /* synthetic */ Status[] f4514a;

        static {
            Status status = new Status("STATE_NORMAL", 0);
            STATE_NORMAL = status;
            Status status2 = new Status("STATE_IN", 1);
            STATE_IN = status2;
            Status status3 = new Status("STATE_OUT", 2);
            STATE_OUT = status3;
            Status status4 = new Status("STATE_MOVE", 3);
            STATE_MOVE = status4;
            f4514a = new Status[]{status, status2, status3, status4};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f4514a.clone();
        }
    }

    public SmoothImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4493c = Status.STATE_NORMAL;
        this.f4504n = 0.5f;
        this.f4507q = false;
        this.f4508r = false;
        this.f4509s = 0;
        m3513b();
    }

    public static void setDuration(int i) {
        f4492x = i;
    }

    /* renamed from: a */
    public final void m3512a() {
        C6747e c6747e = this.f4512v;
        if (c6747e != null) {
            C6747e c6747eClone = c6747e.clone();
            c6747eClone.f11412b = this.f4512v.f11412b + getTop();
            c6747eClone.f11411a = this.f4512v.f11411a + getLeft();
            c6747eClone.f11415e = this.f4509s;
            c6747eClone.f11416f = this.f4512v.f11416f - ((1.0f - getScaleX()) * this.f4512v.f11416f);
            this.f4498h = c6747eClone.clone();
            this.f4497g = c6747eClone.clone();
        }
    }

    /* renamed from: b */
    public final void m3513b() {
        Paint paint = new Paint();
        this.f4494d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f4494d.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f4495e = new Matrix();
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    /* renamed from: c */
    public final void m3514c() {
        if (getDrawable() == null) {
            return;
        }
        if ((this.f4496f != null && this.f4497g != null && this.f4498h != null) || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (getDrawable() instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) getDrawable()).getBitmap();
            this.f4501k = bitmap.getWidth();
            this.f4502l = bitmap.getHeight();
        } else if (getDrawable() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getDrawable();
            this.f4501k = colorDrawable.getIntrinsicWidth();
            this.f4502l = colorDrawable.getIntrinsicHeight();
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight(), Bitmap.Config.RGB_565);
            this.f4501k = bitmapCreateBitmap.getWidth();
            this.f4502l = bitmapCreateBitmap.getHeight();
        }
        C6747e c6747e = new C6747e();
        this.f4496f = c6747e;
        c6747e.f11415e = 0;
        if (this.f4499i == null) {
            this.f4499i = new Rect();
        }
        C6747e c6747e2 = this.f4496f;
        Rect rect = this.f4499i;
        c6747e2.f11411a = rect.left;
        int i = rect.top;
        c6747e2.f11412b = i - (Resources.getSystem().getIdentifier("status_bar_height", "dimen", "android") > 0 ? r3.getDimensionPixelSize(r4) : 0);
        this.f4496f.f11413c = this.f4499i.width();
        this.f4496f.f11414d = this.f4499i.height();
        this.f4496f.f11416f = Math.max(this.f4499i.width() / this.f4501k, this.f4499i.height() / this.f4502l);
        C6747e c6747e3 = new C6747e();
        this.f4497g = c6747e3;
        c6747e3.f11416f = Math.min(getWidth() / this.f4501k, getHeight() / this.f4502l);
        C6747e c6747e4 = this.f4497g;
        c6747e4.f11415e = 255;
        float f = c6747e4.f11416f;
        int i8 = (int) (this.f4501k * f);
        c6747e4.f11411a = (getWidth() - i8) / 2.0f;
        this.f4497g.f11412b = (getHeight() - r1) / 2.0f;
        C6747e c6747e5 = this.f4497g;
        c6747e5.f11413c = i8;
        c6747e5.f11414d = (int) (f * this.f4502l);
        Status status = this.f4493c;
        if (status == Status.STATE_IN) {
            this.f4498h = this.f4496f.clone();
        } else if (status == Status.STATE_OUT) {
            this.f4498h = c6747e5.clone();
        }
        this.f4512v = this.f4497g;
    }

    /* renamed from: d */
    public final float m3515d() {
        if (this.f4512v == null) {
            m3514c();
        }
        return Math.abs(getTop() / this.f4512v.f11414d);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PreviewActivity previewActivity;
        PreviewActivity previewActivity2;
        int action = motionEvent.getAction();
        if (getScale() != 1.0f) {
            if ((action == 1 || action == 3) && this.f4507q) {
                if (m3515d() <= this.f4504n) {
                    m3516e();
                    return true;
                }
                m3512a();
                setTag(R$id.item_image_key, Boolean.TRUE);
                InterfaceC6746d interfaceC6746d = this.f4511u;
                if (interfaceC6746d != null && (previewActivity = (PreviewActivity) ((C6702a) interfaceC6746d).f11314a.getActivity()) != null) {
                    previewActivity.m3507q();
                }
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                    }
                } else if (this.f4508r || motionEvent.getPointerCount() != 1) {
                    int x3 = (int) motionEvent.getX();
                    int y2 = (int) motionEvent.getY();
                    int i = x3 - this.f4505o;
                    int i8 = y2 - this.f4506p;
                    if (!this.f4507q && (Math.abs(i) > Math.abs(i8) || Math.abs(i8) < 5)) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    if (motionEvent.getPointerCount() == 1) {
                        this.f4493c = Status.STATE_MOVE;
                        offsetLeftAndRight(i);
                        offsetTopAndBottom(i8);
                        float fM3515d = m3515d();
                        float f = 1.0f - (0.1f * fM3515d);
                        setScaleY(f);
                        setScaleX(f);
                        this.f4507q = true;
                        this.f4509s = (int) AbstractC1923c.m1061y(fM3515d, 0.5f, 1.0f, 255.0f);
                        invalidate();
                        if (this.f4509s < 0) {
                            this.f4509s = 0;
                        }
                        InterfaceC6745c interfaceC6745c = this.f4510t;
                        if (interfaceC6745c != null) {
                            ((C6702a) interfaceC6745c).m6404a(this.f4509s);
                            return true;
                        }
                        return true;
                    }
                }
            }
            if (this.f4507q) {
                if (m3515d() <= this.f4504n) {
                    m3516e();
                    return true;
                }
                m3512a();
                setTag(R$id.item_image_key, Boolean.TRUE);
                InterfaceC6746d interfaceC6746d2 = this.f4511u;
                if (interfaceC6746d2 != null && (previewActivity2 = (PreviewActivity) ((C6702a) interfaceC6746d2).f11314a.getActivity()) != null) {
                    previewActivity2.m3507q();
                    return true;
                }
                return true;
            }
        } else {
            this.f4505o = (int) motionEvent.getX();
            this.f4506p = (int) motionEvent.getY();
            if (this.f4512v == null) {
                m3514c();
            }
            this.f4508r = false;
            C6747e c6747e = this.f4512v;
            if (c6747e != null) {
                float f7 = c6747e.f11412b;
                int i9 = (int) f7;
                int i10 = (int) (c6747e.f11414d + f7);
                int i11 = this.f4506p;
                if (i11 >= i9 && i10 >= i11) {
                    this.f4508r = true;
                }
            }
            this.f4507q = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final void m3516e() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getTop(), 0);
        valueAnimatorOfInt.addUpdateListener(new C6743a(this, 0));
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(getLeft(), 0);
        valueAnimatorOfInt2.addUpdateListener(new C6743a(this, 1));
        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(this.f4509s, 255);
        valueAnimatorOfInt3.addUpdateListener(new C6744b(this, 0));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C6744b(this, 1));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(f4492x);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfFloat, valueAnimatorOfInt3);
        animatorSet.start();
    }

    /* renamed from: f */
    public final void m3517f(InterfaceC4183b interfaceC4183b) {
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
        setOnTransformListener(interfaceC4183b);
        this.f4500j = true;
        this.f4493c = Status.STATE_OUT;
        invalidate();
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.PhotoView, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4501k = 0;
        this.f4502l = 0;
        this.f4499i = null;
        this.f4494d = null;
        this.f4495e = null;
        this.f4496f = null;
        this.f4497g = null;
        this.f4498h = null;
        ValueAnimator valueAnimator = this.f4503m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f4503m.clone();
            this.f4503m = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        Status status = this.f4493c;
        Status status2 = Status.STATE_OUT;
        if (status != status2 && status != Status.STATE_IN) {
            if (status == Status.STATE_MOVE) {
                this.f4494d.setAlpha(0);
                canvas.drawPaint(this.f4494d);
                super.onDraw(canvas);
                return;
            } else {
                this.f4494d.setAlpha(255);
                canvas.drawPaint(this.f4494d);
                super.onDraw(canvas);
                return;
            }
        }
        if (this.f4496f == null || this.f4497g == null || this.f4498h == null) {
            m3514c();
        }
        C6747e c6747e = this.f4498h;
        if (c6747e == null) {
            super.onDraw(canvas);
            return;
        }
        this.f4494d.setAlpha(c6747e.f11415e);
        canvas.drawPaint(this.f4494d);
        int saveCount = canvas.getSaveCount();
        Matrix matrix = this.f4495e;
        float f = this.f4498h.f11416f;
        matrix.setScale(f, f);
        float f7 = this.f4501k;
        C6747e c6747e2 = this.f4498h;
        float f8 = c6747e2.f11416f;
        this.f4495e.postTranslate((-((f7 * f8) - c6747e2.f11413c)) / 2.0f, (-((this.f4502l * f8) - c6747e2.f11414d)) / 2.0f);
        C6747e c6747e3 = this.f4498h;
        canvas.translate(c6747e3.f11411a, c6747e3.f11412b);
        C6747e c6747e4 = this.f4498h;
        canvas.clipRect(0.0f, 0.0f, c6747e4.f11413c, c6747e4.f11414d);
        canvas.concat(this.f4495e);
        getDrawable().draw(canvas);
        canvas.restoreToCount(saveCount);
        if (this.f4500j) {
            this.f4500j = false;
            if (this.f4498h == null) {
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f4503m = valueAnimator;
            valueAnimator.setDuration(f4492x);
            this.f4503m.setInterpolator(new AccelerateDecelerateInterpolator());
            Status status3 = this.f4493c;
            if (status3 == Status.STATE_IN) {
                this.f4503m.setValues(PropertyValuesHolder.ofFloat("animScale", this.f4496f.f11416f, this.f4497g.f11416f), PropertyValuesHolder.ofInt("animAlpha", this.f4496f.f11415e, this.f4497g.f11415e), PropertyValuesHolder.ofFloat("animLeft", this.f4496f.f11411a, this.f4497g.f11411a), PropertyValuesHolder.ofFloat("animTop", this.f4496f.f11412b, this.f4497g.f11412b), PropertyValuesHolder.ofFloat("animWidth", this.f4496f.f11413c, this.f4497g.f11413c), PropertyValuesHolder.ofFloat("animHeight", this.f4496f.f11414d, this.f4497g.f11414d));
            } else if (status3 == status2) {
                this.f4503m.setValues(PropertyValuesHolder.ofFloat("animScale", this.f4497g.f11416f, this.f4496f.f11416f), PropertyValuesHolder.ofInt("animAlpha", this.f4497g.f11415e, this.f4496f.f11415e), PropertyValuesHolder.ofFloat("animLeft", this.f4497g.f11411a, this.f4496f.f11411a), PropertyValuesHolder.ofFloat("animTop", this.f4497g.f11412b, this.f4496f.f11412b), PropertyValuesHolder.ofFloat("animWidth", this.f4497g.f11413c, this.f4496f.f11413c), PropertyValuesHolder.ofFloat("animHeight", this.f4497g.f11414d, this.f4496f.f11414d));
            }
            this.f4503m.addUpdateListener(new C6744b(this, 2));
            this.f4503m.addListener(new C4182a(this));
            this.f4503m.start();
        }
    }

    public void setAlphaChangeListener(InterfaceC6745c interfaceC6745c) {
        this.f4510t = interfaceC6745c;
    }

    public void setOnTransformListener(InterfaceC4183b interfaceC4183b) {
        this.f4513w = interfaceC4183b;
    }

    public void setThumbRect(Rect rect) {
        this.f4499i = rect;
    }

    public void setTransformOutListener(InterfaceC6746d interfaceC6746d) {
        this.f4511u = interfaceC6746d;
    }

    public SmoothImageView(Context context) {
        super(context);
        this.f4493c = Status.STATE_NORMAL;
        this.f4504n = 0.5f;
        this.f4507q = false;
        this.f4508r = false;
        this.f4509s = 0;
        m3513b();
    }
}
