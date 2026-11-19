package p068h1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import com.github.barteksc.pdfviewer.PDFView;

/* renamed from: h1.a */
/* loaded from: classes3.dex */
public class C6443a {

    /* renamed from: a */
    public PDFView f8144a;

    /* renamed from: b */
    public ValueAnimator f8145b;

    /* renamed from: c */
    public OverScroller f8146c;

    /* renamed from: d */
    public boolean f8147d = false;

    /* renamed from: h1.a$a */
    public class a extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C6443a.this.f8144a.m3380M();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C6443a.this.f8144a.m3380M();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C6443a.this.f8144a.m3382O(((Float) valueAnimator.getAnimatedValue()).floatValue(), C6443a.this.f8144a.getCurrentYOffset());
            C6443a.this.f8144a.m3379L();
        }
    }

    /* renamed from: h1.a$b */
    public class b extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C6443a.this.f8144a.m3380M();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C6443a.this.f8144a.m3380M();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C6443a.this.f8144a.m3382O(C6443a.this.f8144a.getCurrentXOffset(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
            C6443a.this.f8144a.m3379L();
        }
    }

    public C6443a(PDFView pDFView) {
        this.f8144a = pDFView;
        this.f8146c = new OverScroller(pDFView.getContext());
    }

    /* renamed from: c */
    public void m7058c() {
        if (this.f8146c.computeScrollOffset()) {
            this.f8144a.m3382O(this.f8146c.getCurrX(), this.f8146c.getCurrY());
            this.f8144a.m3379L();
        } else if (this.f8147d) {
            this.f8147d = false;
            this.f8144a.m3380M();
            m7059d();
        }
    }

    /* renamed from: d */
    public final void m7059d() {
        this.f8144a.getScrollHandle();
    }

    /* renamed from: e */
    public void m7060e(int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        m7064i();
        this.f8147d = true;
        this.f8146c.fling(i6, i7, i8, i9, i10, i11, i12, i13);
    }

    /* renamed from: f */
    public void m7061f(float f6, float f7) {
        m7064i();
        this.f8145b = ValueAnimator.ofFloat(f6, f7);
        a aVar = new a();
        this.f8145b.setInterpolator(new DecelerateInterpolator());
        this.f8145b.addUpdateListener(aVar);
        this.f8145b.addListener(aVar);
        this.f8145b.setDuration(400L);
        this.f8145b.start();
    }

    /* renamed from: g */
    public void m7062g(float f6, float f7) {
        m7064i();
        this.f8145b = ValueAnimator.ofFloat(f6, f7);
        b bVar = new b();
        this.f8145b.setInterpolator(new DecelerateInterpolator());
        this.f8145b.addUpdateListener(bVar);
        this.f8145b.addListener(bVar);
        this.f8145b.setDuration(400L);
        this.f8145b.start();
    }

    /* renamed from: h */
    public void m7063h(float f6, float f7, float f8, float f9) {
        m7064i();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f8, f9);
        this.f8145b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        c cVar = new c(f6, f7);
        this.f8145b.addUpdateListener(cVar);
        this.f8145b.addListener(cVar);
        this.f8145b.setDuration(400L);
        this.f8145b.start();
    }

    /* renamed from: i */
    public void m7064i() {
        ValueAnimator valueAnimator = this.f8145b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8145b = null;
        }
        m7065j();
    }

    /* renamed from: j */
    public void m7065j() {
        this.f8147d = false;
        this.f8146c.forceFinished(true);
    }

    /* renamed from: h1.a$c */
    public class c implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

        /* renamed from: a */
        public final float f8150a;

        /* renamed from: b */
        public final float f8151b;

        public c(float f6, float f7) {
            this.f8150a = f6;
            this.f8151b = f7;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C6443a.this.f8144a.m3380M();
            C6443a.this.m7059d();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C6443a.this.f8144a.m3393Z(((Float) valueAnimator.getAnimatedValue()).floatValue(), new PointF(this.f8150a, this.f8151b));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
