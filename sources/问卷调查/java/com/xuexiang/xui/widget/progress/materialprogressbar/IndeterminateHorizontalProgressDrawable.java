package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.Keep;
import p070b.p113c.p114a.C0787a;
import p070b.p113c.p114a.p116e.p144h.p145a.AbstractC0857c;
import p070b.p113c.p114a.p116e.p144h.p145a.C0855a;
import p070b.p113c.p114a.p116e.p144h.p145a.C0866l;
import p070b.p113c.p114a.p116e.p144h.p145a.C0867m;
import p070b.p113c.p114a.p116e.p144h.p145a.C0868n;
import p070b.p113c.p114a.p116e.p144h.p145a.C0869o;
import p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0874t;
import p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0875u;

/* loaded from: classes.dex */
public class IndeterminateHorizontalProgressDrawable extends AbstractC0857c implements InterfaceC0874t, InterfaceC0875u {

    /* renamed from: q */
    public static final RectF f5394q = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* renamed from: r */
    public static final RectF f5395r = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* renamed from: s */
    public static final RectF f5396s = new RectF(-144.0f, -1.0f, 144.0f, 1.0f);

    /* renamed from: t */
    public static final RectTransformX f5397t = new RectTransformX(-522.6f, 0.1f);

    /* renamed from: u */
    public static final RectTransformX f5398u = new RectTransformX(-197.6f, 0.1f);

    /* renamed from: k */
    public int f5399k;

    /* renamed from: l */
    public int f5400l;

    /* renamed from: m */
    public boolean f5401m;

    /* renamed from: n */
    public float f5402n;

    /* renamed from: o */
    public RectTransformX f5403o;

    /* renamed from: p */
    public RectTransformX f5404p;

    public static class RectTransformX {

        /* renamed from: a */
        public float f5405a;

        /* renamed from: b */
        public float f5406b;

        public RectTransformX(float f2, float f3) {
            this.f5405a = f2;
            this.f5406b = f3;
        }

        public RectTransformX(RectTransformX rectTransformX) {
            this.f5405a = rectTransformX.f5405a;
            this.f5406b = rectTransformX.f5406b;
        }

        @Keep
        public void setScaleX(float f2) {
            this.f5406b = f2;
        }

        @Keep
        public void setTranslateX(float f2) {
            this.f5405a = f2;
        }
    }

    public IndeterminateHorizontalProgressDrawable(Context context) {
        super(context);
        this.f5401m = true;
        this.f5403o = new RectTransformX(f5397t);
        this.f5404p = new RectTransformX(f5398u);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f5399k = Math.round(4.0f * f2);
        this.f5400l = Math.round(f2 * 16.0f);
        this.f5402n = C0787a.m2464D(context, R.attr.disabledAlpha, 0.0f);
        RectTransformX rectTransformX = this.f5403o;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(rectTransformX, "translateX", (String) null, C0855a.f4641a);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setInterpolator(C0867m.f4671b);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(rectTransformX, (String) null, "scaleX", C0855a.f4642b);
        objectAnimatorOfFloat2.setDuration(2000L);
        objectAnimatorOfFloat2.setInterpolator(C0866l.f4669b);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        RectTransformX rectTransformX2 = this.f5404p;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(rectTransformX2, "translateX", (String) null, C0855a.f4643c);
        objectAnimatorOfFloat3.setDuration(2000L);
        objectAnimatorOfFloat3.setInterpolator(C0869o.f4675b);
        objectAnimatorOfFloat3.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(rectTransformX2, (String) null, "scaleX", C0855a.f4644d);
        objectAnimatorOfFloat4.setDuration(2000L);
        objectAnimatorOfFloat4.setInterpolator(C0868n.f4673b);
        objectAnimatorOfFloat4.setRepeatCount(-1);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        this.f4652j = new Animator[]{animatorSet, animatorSet2};
    }

    /* renamed from: i */
    public static void m2782i(Canvas canvas, RectTransformX rectTransformX, Paint paint) {
        int iSave = canvas.save();
        canvas.translate(rectTransformX.f5405a, 0.0f);
        canvas.scale(rectTransformX.f5406b, 1.0f);
        canvas.drawRect(f5396s, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0875u
    /* renamed from: a */
    public boolean mo2567a() {
        return this.f5401m;
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0875u
    /* renamed from: b */
    public void mo2568b(boolean z) {
        if (this.f5401m != z) {
            this.f5401m = z;
            invalidateSelf();
        }
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.AbstractC0858d
    /* renamed from: f */
    public void mo2565f(Canvas canvas, int i, int i2, Paint paint) {
        float f2 = i;
        RectF rectF = this.f4654i ? f5395r : f5394q;
        canvas.scale(f2 / rectF.width(), i2 / rectF.height());
        canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        if (this.f5401m) {
            paint.setAlpha(Math.round(this.f4645b * this.f5402n));
            canvas.drawRect(f5394q, paint);
            paint.setAlpha(this.f4645b);
        }
        m2782i(canvas, this.f5404p, paint);
        m2782i(canvas, this.f5403o, paint);
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.AbstractC0858d
    /* renamed from: g */
    public void mo2566g(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f4654i ? this.f5400l : this.f5399k;
    }
}
