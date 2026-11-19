package com.github.barteksc.pdfviewer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;

/* renamed from: com.github.barteksc.pdfviewer.a */
/* loaded from: classes.dex */
class C1365a {

    /* renamed from: a */
    private PDFView f7299a;

    /* renamed from: b */
    private ValueAnimator f7300b;

    /* renamed from: c */
    private OverScroller f7301c;

    /* renamed from: d */
    private boolean f7302d = false;

    /* renamed from: com.github.barteksc.pdfviewer.a$a */
    class a extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C1365a.this.f7299a.m5637N();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1365a.this.f7299a.m5637N();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C1365a.this.f7299a.m5639P(((Float) valueAnimator.getAnimatedValue()).floatValue(), C1365a.this.f7299a.getCurrentYOffset());
            C1365a.this.f7299a.m5636M();
        }
    }

    /* renamed from: com.github.barteksc.pdfviewer.a$b */
    class b extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C1365a.this.f7299a.m5637N();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1365a.this.f7299a.m5637N();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C1365a.this.f7299a.m5639P(C1365a.this.f7299a.getCurrentXOffset(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
            C1365a.this.f7299a.m5636M();
        }
    }

    /* renamed from: com.github.barteksc.pdfviewer.a$c */
    class c implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

        /* renamed from: a */
        private final float f7305a;

        /* renamed from: b */
        private final float f7306b;

        public c(float f4, float f5) {
            this.f7305a = f4;
            this.f7306b = f5;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1365a.this.f7299a.m5637N();
            C1365a.this.m5678d();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C1365a.this.f7299a.m5650a0(((Float) valueAnimator.getAnimatedValue()).floatValue(), new PointF(this.f7305a, this.f7306b));
        }
    }

    public C1365a(PDFView pDFView) {
        this.f7299a = pDFView;
        this.f7301c = new OverScroller(pDFView.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m5678d() {
        if (this.f7299a.getScrollHandle() != null) {
            this.f7299a.getScrollHandle().m10098b();
        }
    }

    /* renamed from: c */
    void m5679c() {
        if (this.f7301c.computeScrollOffset()) {
            this.f7299a.m5639P(this.f7301c.getCurrX(), this.f7301c.getCurrY());
            this.f7299a.m5636M();
        } else if (this.f7302d) {
            this.f7302d = false;
            this.f7299a.m5637N();
            m5678d();
        }
    }

    /* renamed from: e */
    public void m5680e(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        m5684i();
        this.f7302d = true;
        this.f7301c.fling(i4, i5, i6, i7, i8, i9, i10, i11);
    }

    /* renamed from: f */
    public void m5681f(float f4, float f5) {
        m5684i();
        this.f7300b = ValueAnimator.ofFloat(f4, f5);
        a aVar = new a();
        this.f7300b.setInterpolator(new DecelerateInterpolator());
        this.f7300b.addUpdateListener(aVar);
        this.f7300b.addListener(aVar);
        this.f7300b.setDuration(400L);
        this.f7300b.start();
    }

    /* renamed from: g */
    public void m5682g(float f4, float f5) {
        m5684i();
        this.f7300b = ValueAnimator.ofFloat(f4, f5);
        b bVar = new b();
        this.f7300b.setInterpolator(new DecelerateInterpolator());
        this.f7300b.addUpdateListener(bVar);
        this.f7300b.addListener(bVar);
        this.f7300b.setDuration(400L);
        this.f7300b.start();
    }

    /* renamed from: h */
    public void m5683h(float f4, float f5, float f6, float f7) {
        m5684i();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f6, f7);
        this.f7300b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        c cVar = new c(f4, f5);
        this.f7300b.addUpdateListener(cVar);
        this.f7300b.addListener(cVar);
        this.f7300b.setDuration(400L);
        this.f7300b.start();
    }

    /* renamed from: i */
    public void m5684i() {
        ValueAnimator valueAnimator = this.f7300b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7300b = null;
        }
        m5685j();
    }

    /* renamed from: j */
    public void m5685j() {
        this.f7302d = false;
        this.f7301c.forceFinished(true);
    }
}
