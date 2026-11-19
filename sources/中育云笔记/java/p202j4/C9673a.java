package p202j4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import com.github.barteksc.pdfviewer.PDFView;

/* renamed from: j4.a */
/* loaded from: classes5.dex */
public class C9673a {

    /* renamed from: a */
    public PDFView f22388a;

    /* renamed from: b */
    public ValueAnimator f22389b;

    /* renamed from: c */
    public OverScroller f22390c;

    /* renamed from: d */
    public boolean f22391d = false;

    /* renamed from: e */
    public boolean f22392e = false;

    /* renamed from: j4.a$a */
    public class a extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C9673a.this.f22388a.m7858L();
            C9673a.this.f22392e = false;
            C9673a.this.m19066e();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C9673a.this.f22388a.m7858L();
            C9673a.this.f22392e = false;
            C9673a.this.m19066e();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C9673a.this.f22388a.m7860N(((Float) valueAnimator.getAnimatedValue()).floatValue(), C9673a.this.f22388a.getCurrentYOffset());
            C9673a.this.f22388a.m7857K();
        }
    }

    /* renamed from: j4.a$b */
    public class b extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C9673a.this.f22388a.m7858L();
            C9673a.this.f22392e = false;
            C9673a.this.m19066e();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C9673a.this.f22388a.m7858L();
            C9673a.this.f22392e = false;
            C9673a.this.m19066e();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C9673a.this.f22388a.m7860N(C9673a.this.f22388a.getCurrentXOffset(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
            C9673a.this.f22388a.m7857K();
        }
    }

    public C9673a(PDFView pDFView) {
        this.f22388a = pDFView;
        this.f22390c = new OverScroller(pDFView.getContext());
    }

    /* renamed from: d */
    public void m19065d() {
        if (this.f22390c.computeScrollOffset()) {
            this.f22388a.m7860N(this.f22390c.getCurrX(), this.f22390c.getCurrY());
            this.f22388a.m7857K();
        } else if (this.f22391d) {
            this.f22391d = false;
            this.f22388a.m7858L();
            m19066e();
            this.f22388a.m7865S();
        }
    }

    /* renamed from: e */
    public final void m19066e() {
        if (this.f22388a.getScrollHandle() != null) {
            this.f22388a.getScrollHandle().mo7905a();
        }
    }

    /* renamed from: f */
    public boolean m19067f() {
        return this.f22391d || this.f22392e;
    }

    /* renamed from: g */
    public void m19068g(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        m19073l();
        this.f22391d = true;
        this.f22390c.fling(i10, i11, i12, i13, i14, i15, i16, i17);
    }

    /* renamed from: h */
    public void m19069h(float f10) {
        if (this.f22388a.m7849C()) {
            m19071j(this.f22388a.getCurrentYOffset(), f10);
        } else {
            m19070i(this.f22388a.getCurrentXOffset(), f10);
        }
        this.f22392e = true;
    }

    /* renamed from: i */
    public void m19070i(float f10, float f11) {
        m19073l();
        this.f22389b = ValueAnimator.ofFloat(f10, f11);
        a aVar = new a();
        this.f22389b.setInterpolator(new DecelerateInterpolator());
        this.f22389b.addUpdateListener(aVar);
        this.f22389b.addListener(aVar);
        this.f22389b.setDuration(400L);
        this.f22389b.start();
    }

    /* renamed from: j */
    public void m19071j(float f10, float f11) {
        m19073l();
        this.f22389b = ValueAnimator.ofFloat(f10, f11);
        b bVar = new b();
        this.f22389b.setInterpolator(new DecelerateInterpolator());
        this.f22389b.addUpdateListener(bVar);
        this.f22389b.addListener(bVar);
        this.f22389b.setDuration(400L);
        this.f22389b.start();
    }

    /* renamed from: k */
    public void m19072k(float f10, float f11, float f12, float f13) {
        m19073l();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f12, f13);
        this.f22389b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        c cVar = new c(f10, f11);
        this.f22389b.addUpdateListener(cVar);
        this.f22389b.addListener(cVar);
        this.f22389b.setDuration(400L);
        this.f22389b.start();
    }

    /* renamed from: l */
    public void m19073l() {
        ValueAnimator valueAnimator = this.f22389b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f22389b = null;
        }
        m19074m();
    }

    /* renamed from: m */
    public void m19074m() {
        this.f22391d = false;
        this.f22390c.forceFinished(true);
    }

    /* renamed from: j4.a$c */
    public class c implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

        /* renamed from: a */
        public final float f22395a;

        /* renamed from: b */
        public final float f22396b;

        public c(float f10, float f11) {
            this.f22395a = f10;
            this.f22396b = f11;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C9673a.this.f22388a.m7858L();
            C9673a.this.m19066e();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C9673a.this.f22388a.m7858L();
            C9673a.this.f22388a.m7865S();
            C9673a.this.m19066e();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C9673a.this.f22388a.m7875c0(((Float) valueAnimator.getAnimatedValue()).floatValue(), new PointF(this.f22395a, this.f22396b));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
