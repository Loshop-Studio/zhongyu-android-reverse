package com.xuexiang.xui.widget.imageview.preview.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.utils.AbstractC6878h;
import com.xuexiang.xui.widget.imageview.photoview.PhotoView;

/* loaded from: classes4.dex */
public class SmoothImageView extends PhotoView {

    /* renamed from: y */
    public static int f7875y = 400;

    /* renamed from: c */
    public Status f7876c;

    /* renamed from: d */
    public Paint f7877d;

    /* renamed from: e */
    public Matrix f7878e;

    /* renamed from: f */
    public C6957i f7879f;

    /* renamed from: g */
    public C6957i f7880g;

    /* renamed from: h */
    public C6957i f7881h;

    /* renamed from: i */
    public Rect f7882i;

    /* renamed from: j */
    public boolean f7883j;

    /* renamed from: k */
    public int f7884k;

    /* renamed from: l */
    public int f7885l;

    /* renamed from: m */
    public boolean f7886m;

    /* renamed from: n */
    public ValueAnimator f7887n;

    /* renamed from: o */
    public float f7888o;

    /* renamed from: p */
    public int f7889p;

    /* renamed from: q */
    public int f7890q;

    /* renamed from: r */
    public boolean f7891r;

    /* renamed from: s */
    public boolean f7892s;

    /* renamed from: t */
    public int f7893t;

    /* renamed from: u */
    public InterfaceC6955g f7894u;

    /* renamed from: v */
    public InterfaceC6956h f7895v;

    /* renamed from: w */
    public C6957i f7896w;

    /* renamed from: x */
    public InterfaceC6958j f7897x;

    public enum Status {
        STATE_NORMAL,
        STATE_IN,
        STATE_OUT,
        STATE_MOVE
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$a */
    public class C6949a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f7903a = 0;

        public C6949a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i10 = this.f7903a;
            if (i10 != 0) {
                SmoothImageView.this.offsetTopAndBottom(iIntValue - i10);
            }
            this.f7903a = iIntValue;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$b */
    public class C6950b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f7905a = 0;

        public C6950b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i10 = this.f7905a;
            if (i10 != 0) {
                SmoothImageView.this.offsetLeftAndRight(iIntValue - i10);
            }
            this.f7905a = iIntValue;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$c */
    public class C6951c implements ValueAnimator.AnimatorUpdateListener {
        public C6951c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (SmoothImageView.this.f7894u != null) {
                SmoothImageView.this.f7894u.mo6970a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$d */
    public class C6952d implements ValueAnimator.AnimatorUpdateListener {
        public C6952d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SmoothImageView.this.setScaleX(fFloatValue);
            SmoothImageView.this.setScaleY(fFloatValue);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$e */
    public class C6953e implements ValueAnimator.AnimatorUpdateListener {
        public C6953e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmoothImageView.this.f7881h.f7915e = ((Integer) valueAnimator.getAnimatedValue("animAlpha")).intValue();
            SmoothImageView.this.f7881h.f7916f = ((Float) valueAnimator.getAnimatedValue("animScale")).floatValue();
            SmoothImageView.this.f7881h.f7911a = ((Float) valueAnimator.getAnimatedValue("animLeft")).floatValue();
            SmoothImageView.this.f7881h.f7912b = ((Float) valueAnimator.getAnimatedValue("animTop")).floatValue();
            SmoothImageView.this.f7881h.f7913c = ((Float) valueAnimator.getAnimatedValue("animWidth")).floatValue();
            SmoothImageView.this.f7881h.f7914d = ((Float) valueAnimator.getAnimatedValue("animHeight")).floatValue();
            SmoothImageView.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$f */
    public class C6954f extends AnimatorListenerAdapter {
        public C6954f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (SmoothImageView.this.f7897x != null) {
                SmoothImageView.this.f7897x.mo6972a(SmoothImageView.this.f7876c);
            }
            if (SmoothImageView.this.f7876c == Status.STATE_IN) {
                SmoothImageView.this.f7876c = Status.STATE_NORMAL;
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
    public interface InterfaceC6955g {
        /* renamed from: a */
        void mo6970a(int i10);
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$h */
    public interface InterfaceC6956h {
        /* renamed from: a */
        void mo6971a();
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$i */
    public static class C6957i implements Cloneable {

        /* renamed from: a */
        public float f7911a;

        /* renamed from: b */
        public float f7912b;

        /* renamed from: c */
        public float f7913c;

        /* renamed from: d */
        public float f7914d;

        /* renamed from: e */
        public int f7915e;

        /* renamed from: f */
        public float f7916f;

        public C6957i() {
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C6957i clone() {
            try {
                return (C6957i) super.clone();
            } catch (CloneNotSupportedException e10) {
                e10.printStackTrace();
                return null;
            }
        }

        public /* synthetic */ C6957i(C6949a c6949a) {
            this();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$j */
    public interface InterfaceC6958j {
        /* renamed from: a */
        void mo6972a(Status status);
    }

    public SmoothImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7876c = Status.STATE_NORMAL;
        this.f7888o = 0.5f;
        this.f7891r = false;
        this.f7892s = false;
        this.f7893t = 0;
        m7007k();
    }

    public static void setDuration(int i10) {
        f7875y = i10;
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
    public final void m7005i() {
        C6957i c6957i = this.f7896w;
        if (c6957i != null) {
            C6957i c6957iClone = c6957i.clone();
            c6957iClone.f7912b = this.f7896w.f7912b + getTop();
            c6957iClone.f7911a = this.f7896w.f7911a + getLeft();
            c6957iClone.f7915e = this.f7893t;
            c6957iClone.f7916f = this.f7896w.f7916f - ((1.0f - getScaleX()) * this.f7896w.f7916f);
            this.f7881h = c6957iClone.clone();
            this.f7880g = c6957iClone.clone();
        }
    }

    /* renamed from: j */
    public boolean m7006j() {
        if (getScale() == 1.0f) {
            return true;
        }
        m6890c(1.0f, true);
        return false;
    }

    /* renamed from: k */
    public final void m7007k() {
        Paint paint = new Paint();
        this.f7877d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f7877d.setColor(-16777216);
        this.f7878e = new Matrix();
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    /* renamed from: l */
    public final void m7008l() {
        if (getDrawable() == null) {
            return;
        }
        if ((this.f7879f != null && this.f7880g != null && this.f7881h != null) || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (getDrawable() instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) getDrawable()).getBitmap();
            this.f7884k = bitmap.getWidth();
            this.f7885l = bitmap.getHeight();
        } else if (getDrawable() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getDrawable();
            this.f7884k = colorDrawable.getIntrinsicWidth();
            this.f7885l = colorDrawable.getIntrinsicHeight();
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight(), Bitmap.Config.RGB_565);
            this.f7884k = bitmapCreateBitmap.getWidth();
            this.f7885l = bitmapCreateBitmap.getHeight();
        }
        C6949a c6949a = null;
        C6957i c6957i = new C6957i(c6949a);
        this.f7879f = c6957i;
        c6957i.f7915e = 0;
        if (this.f7882i == null) {
            this.f7882i = new Rect();
        }
        C6957i c6957i2 = this.f7879f;
        Rect rect = this.f7882i;
        c6957i2.f7911a = rect.left;
        c6957i2.f7912b = rect.top - AbstractC6878h.m6499j();
        this.f7879f.f7913c = this.f7882i.width();
        this.f7879f.f7914d = this.f7882i.height();
        this.f7879f.f7916f = Math.max(this.f7882i.width() / this.f7884k, this.f7882i.height() / this.f7885l);
        C6957i c6957i3 = new C6957i(c6949a);
        this.f7880g = c6957i3;
        c6957i3.f7916f = Math.min(getWidth() / this.f7884k, getHeight() / this.f7885l);
        C6957i c6957i4 = this.f7880g;
        c6957i4.f7915e = 255;
        float f10 = c6957i4.f7916f;
        int i10 = (int) (this.f7884k * f10);
        c6957i4.f7911a = (getWidth() - i10) / 2.0f;
        this.f7880g.f7912b = (getHeight() - r1) / 2.0f;
        C6957i c6957i5 = this.f7880g;
        c6957i5.f7913c = i10;
        c6957i5.f7914d = (int) (f10 * this.f7885l);
        Status status = this.f7876c;
        if (status == Status.STATE_IN) {
            this.f7881h = this.f7879f.clone();
        } else if (status == Status.STATE_OUT) {
            this.f7881h = c6957i5.clone();
        }
        this.f7896w = this.f7880g;
    }

    /* renamed from: m */
    public final float m7009m() {
        if (this.f7896w == null) {
            m7008l();
        }
        return Math.abs(getTop() / this.f7896w.f7914d);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v2 ??, still in use, count: 5, list:
          (r7v2 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener) from 0x0059: INVOKE (r7v2 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener), (r0v2 ?? I:boolean) DIRECT call: com.tencent.smtt.audio.core.db.ApnHelper.PlayListApnTypeListener.onResult(boolean):void A[MD:(boolean):void (s)] (LINE:90)
          (r7v2 ?? I:android.animation.AnimatorSet) from 0x005f: INVOKE (r7v2 ?? I:android.animation.AnimatorSet), (r8v1 long) VIRTUAL call: android.animation.AnimatorSet.setDuration(long):android.animation.AnimatorSet A[MD:(long):android.animation.AnimatorSet (c)] (LINE:96)
          (r7v2 ?? I:android.animation.AnimatorSet) from 0x0067: INVOKE (r7v2 ?? I:android.animation.AnimatorSet), (r8v2 android.view.animation.AccelerateDecelerateInterpolator) VIRTUAL call: android.animation.AnimatorSet.setInterpolator(android.animation.TimeInterpolator):void A[MD:(android.animation.TimeInterpolator):void (c)] (LINE:104)
          (r7v2 ?? I:android.animation.AnimatorSet) from 0x0076: INVOKE (r7v2 ?? I:android.animation.AnimatorSet), (r8v4 android.animation.Animator[]) VIRTUAL call: android.animation.AnimatorSet.playTogether(android.animation.Animator[]):void A[MD:(android.animation.Animator[]):void VARARG (c)] (LINE:119)
          (r7v2 ?? I:android.animation.AnimatorSet) from 0x0079: INVOKE (r7v2 ?? I:android.animation.AnimatorSet) VIRTUAL call: android.animation.AnimatorSet.start():void A[MD:():void (c)] (LINE:122)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.animation.ValueAnimator, boolean] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.animation.AnimatorSet, com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener] */
    /* renamed from: n */
    public final void m7010n() {
        /*
            r10 = this;
            int r0 = r10.getTop()
            r1 = 0
            int[] r0 = new int[]{r0, r1}
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$a r2 = new com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$a
            r2.<init>()
            r0.addUpdateListener(r2)
            int r2 = r10.getLeft()
            int[] r2 = new int[]{r2, r1}
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r2)
            com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$b r3 = new com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$b
            r3.<init>()
            r2.addUpdateListener(r3)
            int r3 = r10.f7893t
            r4 = 255(0xff, float:3.57E-43)
            int[] r3 = new int[]{r3, r4}
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofInt(r3)
            com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$c r4 = new com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$c
            r4.<init>()
            r3.addUpdateListener(r4)
            float r4 = r10.getScaleX()
            r5 = 2
            float[] r6 = new float[r5]
            r6[r1] = r4
            r4 = 1
            r7 = 1065353216(0x3f800000, float:1.0)
            r6[r4] = r7
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofFloat(r6)
            com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$d r7 = new com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView$d
            r7.<init>()
            r6.addUpdateListener(r7)
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.onResult(r0)
            int r8 = com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.f7875y
            long r8 = (long) r8
            r7.setDuration(r8)
            android.view.animation.AccelerateDecelerateInterpolator r8 = new android.view.animation.AccelerateDecelerateInterpolator
            r8.<init>()
            r7.setInterpolator(r8)
            r8 = 4
            android.animation.Animator[] r8 = new android.animation.Animator[r8]
            r8[r1] = r0
            r8[r4] = r2
            r8[r5] = r6
            r0 = 3
            r8[r0] = r3
            r7.playTogether(r8)
            r7.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView.m7010n():void");
    }

    /* renamed from: o */
    public void m7011o(boolean z10, float f10) {
        this.f7886m = z10;
        this.f7888o = f10;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.PhotoView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7884k = 0;
        this.f7885l = 0;
        this.f7882i = null;
        this.f7877d = null;
        this.f7878e = null;
        this.f7879f = null;
        this.f7880g = null;
        this.f7881h = null;
        ValueAnimator valueAnimator = this.f7887n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7887n.clone();
            this.f7887n = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        Status status = this.f7876c;
        if (status != Status.STATE_OUT && status != Status.STATE_IN) {
            if (status == Status.STATE_MOVE) {
                this.f7877d.setAlpha(0);
                canvas.drawPaint(this.f7877d);
                super.onDraw(canvas);
                return;
            } else {
                this.f7877d.setAlpha(255);
                canvas.drawPaint(this.f7877d);
                super.onDraw(canvas);
                return;
            }
        }
        if (this.f7879f == null || this.f7880g == null || this.f7881h == null) {
            m7008l();
        }
        C6957i c6957i = this.f7881h;
        if (c6957i == null) {
            super.onDraw(canvas);
            return;
        }
        this.f7877d.setAlpha(c6957i.f7915e);
        canvas.drawPaint(this.f7877d);
        int saveCount = canvas.getSaveCount();
        Matrix matrix = this.f7878e;
        float f10 = this.f7881h.f7916f;
        matrix.setScale(f10, f10);
        float f11 = this.f7884k;
        C6957i c6957i2 = this.f7881h;
        float f12 = c6957i2.f7916f;
        this.f7878e.postTranslate((-((f11 * f12) - c6957i2.f7913c)) / 2.0f, (-((this.f7885l * f12) - c6957i2.f7914d)) / 2.0f);
        C6957i c6957i3 = this.f7881h;
        canvas.translate(c6957i3.f7911a, c6957i3.f7912b);
        C6957i c6957i4 = this.f7881h;
        canvas.clipRect(0.0f, 0.0f, c6957i4.f7913c, c6957i4.f7914d);
        canvas.concat(this.f7878e);
        getDrawable().draw(canvas);
        canvas.restoreToCount(saveCount);
        if (this.f7883j) {
            m7012p();
        }
    }

    /* renamed from: p */
    public final void m7012p() {
        this.f7883j = false;
        if (this.f7881h == null) {
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f7887n = valueAnimator;
        valueAnimator.setDuration(f7875y);
        this.f7887n.setInterpolator(new AccelerateDecelerateInterpolator());
        Status status = this.f7876c;
        if (status == Status.STATE_IN) {
            this.f7887n.setValues(PropertyValuesHolder.ofFloat("animScale", this.f7879f.f7916f, this.f7880g.f7916f), PropertyValuesHolder.ofInt("animAlpha", this.f7879f.f7915e, this.f7880g.f7915e), PropertyValuesHolder.ofFloat("animLeft", this.f7879f.f7911a, this.f7880g.f7911a), PropertyValuesHolder.ofFloat("animTop", this.f7879f.f7912b, this.f7880g.f7912b), PropertyValuesHolder.ofFloat("animWidth", this.f7879f.f7913c, this.f7880g.f7913c), PropertyValuesHolder.ofFloat("animHeight", this.f7879f.f7914d, this.f7880g.f7914d));
        } else if (status == Status.STATE_OUT) {
            this.f7887n.setValues(PropertyValuesHolder.ofFloat("animScale", this.f7880g.f7916f, this.f7879f.f7916f), PropertyValuesHolder.ofInt("animAlpha", this.f7880g.f7915e, this.f7879f.f7915e), PropertyValuesHolder.ofFloat("animLeft", this.f7880g.f7911a, this.f7879f.f7911a), PropertyValuesHolder.ofFloat("animTop", this.f7880g.f7912b, this.f7879f.f7912b), PropertyValuesHolder.ofFloat("animWidth", this.f7880g.f7913c, this.f7879f.f7913c), PropertyValuesHolder.ofFloat("animHeight", this.f7880g.f7914d, this.f7879f.f7914d));
        }
        this.f7887n.addUpdateListener(new C6953e());
        this.f7887n.addListener(new C6954f());
        this.f7887n.start();
    }

    /* renamed from: q */
    public void m7013q(InterfaceC6958j interfaceC6958j) {
        setOnTransformListener(interfaceC6958j);
        this.f7883j = true;
        this.f7876c = Status.STATE_IN;
        invalidate();
    }

    /* renamed from: r */
    public void m7014r(InterfaceC6958j interfaceC6958j) {
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
        setOnTransformListener(interfaceC6958j);
        this.f7883j = true;
        this.f7876c = Status.STATE_OUT;
        invalidate();
    }

    public void setAlphaChangeListener(InterfaceC6955g interfaceC6955g) {
        this.f7894u = interfaceC6955g;
    }

    public void setOnTransformListener(InterfaceC6958j interfaceC6958j) {
        this.f7897x = interfaceC6958j;
    }

    public void setThumbRect(Rect rect) {
        this.f7882i = rect;
    }

    public void setTransformOutListener(InterfaceC6956h interfaceC6956h) {
        this.f7895v = interfaceC6956h;
    }
}
