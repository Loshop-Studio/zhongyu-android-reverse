package p293x0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import com.github.barteksc.pdfviewer.PDFView;

/* renamed from: x0.a */
/* loaded from: classes3.dex */
public class C10482a {

    /* renamed from: a */
    public PDFView f20823a;

    /* renamed from: b */
    public ValueAnimator f20824b;

    /* renamed from: c */
    public OverScroller f20825c;

    /* renamed from: d */
    public boolean f20826d = false;

    /* renamed from: e */
    public boolean f20827e = false;

    /* renamed from: x0.a$a */
    public class a extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C10482a.this.f20823a.m3567L();
            C10482a.this.f20827e = false;
            C10482a.this.m19611e();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C10482a.this.f20823a.m3567L();
            C10482a.this.f20827e = false;
            C10482a.this.m19611e();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C10482a.this.f20823a.m3569N(((Float) valueAnimator.getAnimatedValue()).floatValue(), C10482a.this.f20823a.getCurrentYOffset());
            C10482a.this.f20823a.m3566K();
        }
    }

    /* renamed from: x0.a$b */
    public class b extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C10482a.this.f20823a.m3567L();
            C10482a.this.f20827e = false;
            C10482a.this.m19611e();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C10482a.this.f20823a.m3567L();
            C10482a.this.f20827e = false;
            C10482a.this.m19611e();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C10482a.this.f20823a.m3569N(C10482a.this.f20823a.getCurrentXOffset(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
            C10482a.this.f20823a.m3566K();
        }
    }

    public C10482a(PDFView pDFView) {
        this.f20823a = pDFView;
        this.f20825c = new OverScroller(pDFView.getContext());
    }

    /* renamed from: d */
    public void m19610d() {
        if (this.f20825c.computeScrollOffset()) {
            this.f20823a.m3569N(this.f20825c.getCurrX(), this.f20825c.getCurrY());
            this.f20823a.m3566K();
        } else if (this.f20826d) {
            this.f20826d = false;
            this.f20823a.m3567L();
            m19611e();
            this.f20823a.m3574S();
        }
    }

    /* renamed from: e */
    public final void m19611e() {
        if (this.f20823a.getScrollHandle() != null) {
            this.f20823a.getScrollHandle().mo2069a();
        }
    }

    /* renamed from: f */
    public boolean m19612f() {
        return this.f20826d || this.f20827e;
    }

    /* renamed from: g */
    public void m19613g(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        m19618l();
        this.f20826d = true;
        this.f20825c.fling(i10, i11, i12, i13, i14, i15, i16, i17);
    }

    /* renamed from: h */
    public void m19614h(float f10) {
        if (this.f20823a.m3558C()) {
            m19616j(this.f20823a.getCurrentYOffset(), f10);
        } else {
            m19615i(this.f20823a.getCurrentXOffset(), f10);
        }
        this.f20827e = true;
    }

    /* renamed from: i */
    public void m19615i(float f10, float f11) {
        m19618l();
        this.f20824b = ValueAnimator.ofFloat(f10, f11);
        a aVar = new a();
        this.f20824b.setInterpolator(new DecelerateInterpolator());
        this.f20824b.addUpdateListener(aVar);
        this.f20824b.addListener(aVar);
        this.f20824b.setDuration(400L);
        this.f20824b.start();
    }

    /* renamed from: j */
    public void m19616j(float f10, float f11) {
        m19618l();
        this.f20824b = ValueAnimator.ofFloat(f10, f11);
        b bVar = new b();
        this.f20824b.setInterpolator(new DecelerateInterpolator());
        this.f20824b.addUpdateListener(bVar);
        this.f20824b.addListener(bVar);
        this.f20824b.setDuration(400L);
        this.f20824b.start();
    }

    /* renamed from: k */
    public void m19617k(float f10, float f11, float f12, float f13) {
        m19618l();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f12, f13);
        this.f20824b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        c cVar = new c(f10, f11);
        this.f20824b.addUpdateListener(cVar);
        this.f20824b.addListener(cVar);
        this.f20824b.setDuration(400L);
        this.f20824b.start();
    }

    /* renamed from: l */
    public void m19618l() {
        ValueAnimator valueAnimator = this.f20824b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f20824b = null;
        }
        m19619m();
    }

    /* renamed from: m */
    public void m19619m() {
        this.f20826d = false;
        this.f20825c.forceFinished(true);
    }

    /* renamed from: x0.a$c */
    public class c implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

        /* renamed from: a */
        public final float f20830a;

        /* renamed from: b */
        public final float f20831b;

        public c(float f10, float f11) {
            this.f20830a = f10;
            this.f20831b = f11;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C10482a.this.f20823a.m3567L();
            C10482a.this.m19611e();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C10482a.this.f20823a.m3567L();
            C10482a.this.f20823a.m3574S();
            C10482a.this.m19611e();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C10482a.this.f20823a.m3584c0(((Float) valueAnimator.getAnimatedValue()).floatValue(), new PointF(this.f20830a, this.f20831b));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
