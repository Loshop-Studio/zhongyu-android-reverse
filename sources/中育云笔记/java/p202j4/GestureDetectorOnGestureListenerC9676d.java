package p202j4;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.github.barteksc.pdfviewer.PDFView;
import com.shockwave.pdfium.C7519a;
import p205j7.C9686a;
import p246m4.C10198a;
import p258n4.InterfaceC10316a;
import p288p4.AbstractC10627a;

/* renamed from: j4.d */
/* loaded from: classes5.dex */
public class GestureDetectorOnGestureListenerC9676d implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* renamed from: c */
    public PDFView f22411c;

    /* renamed from: d */
    public C9673a f22412d;

    /* renamed from: e */
    public GestureDetector f22413e;

    /* renamed from: f */
    public ScaleGestureDetector f22414f;

    /* renamed from: g */
    public boolean f22415g = false;

    /* renamed from: h */
    public boolean f22416h = false;

    /* renamed from: i */
    public boolean f22417i = false;

    public GestureDetectorOnGestureListenerC9676d(PDFView pDFView, C9673a c9673a) {
        this.f22411c = pDFView;
        this.f22412d = c9673a;
        this.f22413e = new GestureDetector(pDFView.getContext(), this);
        this.f22414f = new ScaleGestureDetector(pDFView.getContext(), this);
        pDFView.setOnTouchListener(this);
    }

    /* renamed from: a */
    public final boolean m19090a(float f10, float f11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        return this.f22411c.m7849C() ? fAbs2 > fAbs : fAbs > fAbs2;
    }

    /* renamed from: b */
    public final boolean m19091b(float f10, float f11) {
        int iM19124r;
        int iM19119m;
        PDFView pDFView = this.f22411c;
        C9678f c9678f = pDFView.f10801j;
        if (c9678f == null) {
            return false;
        }
        float f12 = (-pDFView.getCurrentXOffset()) + f10;
        float f13 = (-this.f22411c.getCurrentYOffset()) + f11;
        int iM19116j = c9678f.m19116j(this.f22411c.m7849C() ? f13 : f12, this.f22411c.getZoom());
        C9686a c9686aM19123q = c9678f.m19123q(iM19116j, this.f22411c.getZoom());
        if (this.f22411c.m7849C()) {
            iM19119m = (int) c9678f.m19124r(iM19116j, this.f22411c.getZoom());
            iM19124r = (int) c9678f.m19119m(iM19116j, this.f22411c.getZoom());
        } else {
            iM19124r = (int) c9678f.m19124r(iM19116j, this.f22411c.getZoom());
            iM19119m = (int) c9678f.m19119m(iM19116j, this.f22411c.getZoom());
        }
        for (C7519a.b bVar : c9678f.m19118l(iM19116j)) {
            RectF rectFM19125s = c9678f.m19125s(iM19116j, iM19119m, iM19124r, (int) c9686aM19123q.m19174b(), (int) c9686aM19123q.m19173a(), bVar.m9716a());
            rectFM19125s.sort();
            if (rectFM19125s.contains(f12, f13)) {
                this.f22411c.f10812u.m21139a(new C10198a(f10, f11, f12, f13, rectFM19125s, bVar));
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m19092c() {
        this.f22417i = false;
    }

    /* renamed from: d */
    public void m19093d() {
        this.f22417i = true;
    }

    /* renamed from: e */
    public final void m19094e() {
        InterfaceC10316a scrollHandle = this.f22411c.getScrollHandle();
        if (scrollHandle == null || !scrollHandle.mo7907c()) {
            return;
        }
        scrollHandle.mo7905a();
    }

    /* renamed from: f */
    public final void m19095f(float f10, float f11) {
        float height;
        float f12;
        int currentXOffset = (int) this.f22411c.getCurrentXOffset();
        int currentYOffset = (int) this.f22411c.getCurrentYOffset();
        PDFView pDFView = this.f22411c;
        C9678f c9678f = pDFView.f10801j;
        float f13 = -c9678f.m19119m(pDFView.getCurrentPage(), this.f22411c.getZoom());
        float fM19117k = f13 - c9678f.m19117k(this.f22411c.getCurrentPage(), this.f22411c.getZoom());
        float f14 = 0.0f;
        if (this.f22411c.m7849C()) {
            f12 = -(this.f22411c.m7873a0(c9678f.m19114h()) - this.f22411c.getWidth());
            height = fM19117k + this.f22411c.getHeight();
            f14 = f13;
            f13 = 0.0f;
        } else {
            float width = fM19117k + this.f22411c.getWidth();
            height = -(this.f22411c.m7873a0(c9678f.m19112f()) - this.f22411c.getHeight());
            f12 = width;
        }
        this.f22412d.m19068g(currentXOffset, currentYOffset, (int) f10, (int) f11, (int) f12, (int) f13, (int) height, (int) f14);
    }

    /* renamed from: g */
    public final void m19096g(MotionEvent motionEvent) {
        this.f22411c.m7858L();
        m19094e();
        if (this.f22412d.m19067f()) {
            return;
        }
        this.f22411c.m7865S();
    }

    /* renamed from: h */
    public final void m19097h(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10;
        float x11;
        if (m19090a(f10, f11)) {
            int i10 = -1;
            if (!this.f22411c.m7849C() ? f10 <= 0.0f : f11 <= 0.0f) {
                i10 = 1;
            }
            if (this.f22411c.m7849C()) {
                x10 = motionEvent2.getY();
                x11 = motionEvent.getY();
            } else {
                x10 = motionEvent2.getX();
                x11 = motionEvent.getX();
            }
            float f12 = x10 - x11;
            int iMax = Math.max(0, Math.min(this.f22411c.getPageCount() - 1, this.f22411c.m7886s(this.f22411c.getCurrentXOffset() - (this.f22411c.getZoom() * f12), this.f22411c.getCurrentYOffset() - (f12 * this.f22411c.getZoom())) + i10));
            this.f22412d.m19069h(-this.f22411c.m7871Y(iMax, this.f22411c.m7887t(iMax)));
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (!this.f22411c.m7892y()) {
            return false;
        }
        if (this.f22411c.getZoom() < this.f22411c.getMidZoom()) {
            this.f22411c.m7878f0(motionEvent.getX(), motionEvent.getY(), this.f22411c.getMidZoom());
            return true;
        }
        if (this.f22411c.getZoom() < this.f22411c.getMaxZoom()) {
            this.f22411c.m7878f0(motionEvent.getX(), motionEvent.getY(), this.f22411c.getMaxZoom());
            return true;
        }
        this.f22411c.m7868V();
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f22412d.m19074m();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        float fM7873a0;
        int height;
        if (!this.f22411c.m7848B()) {
            return false;
        }
        if (this.f22411c.m7847A()) {
            if (this.f22411c.m7864R()) {
                m19095f(f10, f11);
            } else {
                m19097h(motionEvent, motionEvent2, f10, f11);
            }
            return true;
        }
        int currentXOffset = (int) this.f22411c.getCurrentXOffset();
        int currentYOffset = (int) this.f22411c.getCurrentYOffset();
        PDFView pDFView = this.f22411c;
        C9678f c9678f = pDFView.f10801j;
        if (pDFView.m7849C()) {
            f12 = -(this.f22411c.m7873a0(c9678f.m19114h()) - this.f22411c.getWidth());
            fM7873a0 = c9678f.m19111e(this.f22411c.getZoom());
            height = this.f22411c.getHeight();
        } else {
            f12 = -(c9678f.m19111e(this.f22411c.getZoom()) - this.f22411c.getWidth());
            fM7873a0 = this.f22411c.m7873a0(c9678f.m19112f());
            height = this.f22411c.getHeight();
        }
        this.f22412d.m19068g(currentXOffset, currentYOffset, (int) f10, (int) f11, (int) f12, 0, (int) (-(fM7873a0 - height)), 0);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.f22411c.f10812u.m21141c(motionEvent);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float zoom = this.f22411c.getZoom() * scaleFactor;
        float fMin = Math.min(AbstractC10627a.b.f25609b, this.f22411c.getMinZoom());
        float fMin2 = Math.min(AbstractC10627a.b.f25608a, this.f22411c.getMaxZoom());
        if (zoom < fMin) {
            scaleFactor = fMin / this.f22411c.getZoom();
        } else if (zoom > fMin2) {
            scaleFactor = fMin2 / this.f22411c.getZoom();
        }
        this.f22411c.m7874b0(scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f22416h = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f22411c.m7858L();
        m19094e();
        this.f22416h = false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f22415g = true;
        if (this.f22411c.m7850D() || this.f22411c.m7848B()) {
            this.f22411c.m7859M(-f10, -f11);
        }
        if (!this.f22416h || this.f22411c.m7879l()) {
            this.f22411c.m7857K();
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        InterfaceC10316a scrollHandle;
        boolean zM21146h = this.f22411c.f10812u.m21146h(motionEvent);
        boolean zM19091b = m19091b(motionEvent.getX(), motionEvent.getY());
        if (!zM21146h && !zM19091b && (scrollHandle = this.f22411c.getScrollHandle()) != null && !this.f22411c.m7880m()) {
            if (scrollHandle.mo7907c()) {
                scrollHandle.hide();
            } else {
                scrollHandle.show();
            }
        }
        this.f22411c.performClick();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f22417i) {
            return false;
        }
        boolean z10 = this.f22413e.onTouchEvent(motionEvent) || this.f22414f.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && this.f22415g) {
            this.f22415g = false;
            m19096g(motionEvent);
        }
        return z10;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }
}
