package p293x0;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.github.barteksc.pdfviewer.PDFView;
import com.shockwave.pdfium.C6409a;
import p002a1.C0020a;
import p021b1.InterfaceC5028b;
import p070d1.AbstractC8274a;
import p117h1.C8708a;

/* renamed from: x0.d */
/* loaded from: classes3.dex */
public class GestureDetectorOnGestureListenerC10485d implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* renamed from: a */
    public PDFView f20846a;

    /* renamed from: b */
    public C10482a f20847b;

    /* renamed from: c */
    public GestureDetector f20848c;

    /* renamed from: d */
    public ScaleGestureDetector f20849d;

    /* renamed from: e */
    public boolean f20850e = false;

    /* renamed from: f */
    public boolean f20851f = false;

    /* renamed from: g */
    public boolean f20852g = false;

    public GestureDetectorOnGestureListenerC10485d(PDFView pDFView, C10482a c10482a) {
        this.f20846a = pDFView;
        this.f20847b = c10482a;
        this.f20848c = new GestureDetector(pDFView.getContext(), this);
        this.f20849d = new ScaleGestureDetector(pDFView.getContext(), this);
        pDFView.setOnTouchListener(this);
    }

    /* renamed from: a */
    public final boolean m19635a(float f10, float f11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        return this.f20846a.m3558C() ? fAbs2 > fAbs : fAbs > fAbs2;
    }

    /* renamed from: b */
    public final boolean m19636b(float f10, float f11) {
        int iM19669r;
        int iM19664m;
        PDFView pDFView = this.f20846a;
        C10487f c10487f = pDFView.f3718h;
        if (c10487f == null) {
            return false;
        }
        float f12 = (-pDFView.getCurrentXOffset()) + f10;
        float f13 = (-this.f20846a.getCurrentYOffset()) + f11;
        int iM19661j = c10487f.m19661j(this.f20846a.m3558C() ? f13 : f12, this.f20846a.getZoom());
        C8708a c8708aM19668q = c10487f.m19668q(iM19661j, this.f20846a.getZoom());
        if (this.f20846a.m3558C()) {
            iM19664m = (int) c10487f.m19669r(iM19661j, this.f20846a.getZoom());
            iM19669r = (int) c10487f.m19664m(iM19661j, this.f20846a.getZoom());
        } else {
            iM19669r = (int) c10487f.m19669r(iM19661j, this.f20846a.getZoom());
            iM19664m = (int) c10487f.m19664m(iM19661j, this.f20846a.getZoom());
        }
        for (C6409a.b bVar : c10487f.m19663l(iM19661j)) {
            RectF rectFM19670s = c10487f.m19670s(iM19661j, iM19664m, iM19669r, (int) c8708aM19668q.m14208b(), (int) c8708aM19668q.m14207a(), bVar.m4103a());
            rectFM19670s.sort();
            if (rectFM19670s.contains(f12, f13)) {
                this.f20846a.f3729s.m19986a(new C0020a(f10, f11, f12, f13, rectFM19670s, bVar));
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m19637c() {
        this.f20852g = false;
    }

    /* renamed from: d */
    public void m19638d() {
        this.f20852g = true;
    }

    /* renamed from: e */
    public final void m19639e() {
        InterfaceC5028b scrollHandle = this.f20846a.getScrollHandle();
        if (scrollHandle == null || !scrollHandle.mo2071c()) {
            return;
        }
        scrollHandle.mo2069a();
    }

    /* renamed from: f */
    public final void m19640f(float f10, float f11) {
        float height;
        float f12;
        int currentXOffset = (int) this.f20846a.getCurrentXOffset();
        int currentYOffset = (int) this.f20846a.getCurrentYOffset();
        PDFView pDFView = this.f20846a;
        C10487f c10487f = pDFView.f3718h;
        float f13 = -c10487f.m19664m(pDFView.getCurrentPage(), this.f20846a.getZoom());
        float fM19662k = f13 - c10487f.m19662k(this.f20846a.getCurrentPage(), this.f20846a.getZoom());
        float f14 = 0.0f;
        if (this.f20846a.m3558C()) {
            f12 = -(this.f20846a.m3582a0(c10487f.m19659h()) - this.f20846a.getWidth());
            height = fM19662k + this.f20846a.getHeight();
            f14 = f13;
            f13 = 0.0f;
        } else {
            float width = fM19662k + this.f20846a.getWidth();
            height = -(this.f20846a.m3582a0(c10487f.m19657f()) - this.f20846a.getHeight());
            f12 = width;
        }
        this.f20847b.m19613g(currentXOffset, currentYOffset, (int) f10, (int) f11, (int) f12, (int) f13, (int) height, (int) f14);
    }

    /* renamed from: g */
    public final void m19641g(MotionEvent motionEvent) {
        this.f20846a.m3567L();
        m19639e();
        if (this.f20847b.m19612f()) {
            return;
        }
        this.f20846a.m3574S();
    }

    /* renamed from: h */
    public final void m19642h(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10;
        float x11;
        if (m19635a(f10, f11)) {
            int i10 = -1;
            if (!this.f20846a.m3558C() ? f10 <= 0.0f : f11 <= 0.0f) {
                i10 = 1;
            }
            if (this.f20846a.m3558C()) {
                x10 = motionEvent2.getY();
                x11 = motionEvent.getY();
            } else {
                x10 = motionEvent2.getX();
                x11 = motionEvent.getX();
            }
            float f12 = x10 - x11;
            int iMax = Math.max(0, Math.min(this.f20846a.getPageCount() - 1, this.f20846a.m3595s(this.f20846a.getCurrentXOffset() - (this.f20846a.getZoom() * f12), this.f20846a.getCurrentYOffset() - (f12 * this.f20846a.getZoom())) + i10));
            this.f20847b.m19614h(-this.f20846a.m3580Y(iMax, this.f20846a.m3596t(iMax)));
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (!this.f20846a.m3601y()) {
            return false;
        }
        if (this.f20846a.getZoom() < this.f20846a.getMidZoom()) {
            this.f20846a.m3587f0(motionEvent.getX(), motionEvent.getY(), this.f20846a.getMidZoom());
            return true;
        }
        if (this.f20846a.getZoom() < this.f20846a.getMaxZoom()) {
            this.f20846a.m3587f0(motionEvent.getX(), motionEvent.getY(), this.f20846a.getMaxZoom());
            return true;
        }
        this.f20846a.m3577V();
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f20847b.m19619m();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        float fM3582a0;
        int height;
        if (!this.f20846a.m3557B()) {
            return false;
        }
        if (this.f20846a.m3556A()) {
            if (this.f20846a.m3573R()) {
                m19640f(f10, f11);
            } else {
                m19642h(motionEvent, motionEvent2, f10, f11);
            }
            return true;
        }
        int currentXOffset = (int) this.f20846a.getCurrentXOffset();
        int currentYOffset = (int) this.f20846a.getCurrentYOffset();
        PDFView pDFView = this.f20846a;
        C10487f c10487f = pDFView.f3718h;
        if (pDFView.m3558C()) {
            f12 = -(this.f20846a.m3582a0(c10487f.m19659h()) - this.f20846a.getWidth());
            fM3582a0 = c10487f.m19656e(this.f20846a.getZoom());
            height = this.f20846a.getHeight();
        } else {
            f12 = -(c10487f.m19656e(this.f20846a.getZoom()) - this.f20846a.getWidth());
            fM3582a0 = this.f20846a.m3582a0(c10487f.m19657f());
            height = this.f20846a.getHeight();
        }
        this.f20847b.m19613g(currentXOffset, currentYOffset, (int) f10, (int) f11, (int) f12, 0, (int) (-(fM3582a0 - height)), 0);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.f20846a.f3729s.m19988c(motionEvent);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float zoom = this.f20846a.getZoom() * scaleFactor;
        float fMin = Math.min(AbstractC8274a.b.f15672b, this.f20846a.getMinZoom());
        float fMin2 = Math.min(AbstractC8274a.b.f15671a, this.f20846a.getMaxZoom());
        if (zoom < fMin) {
            scaleFactor = fMin / this.f20846a.getZoom();
        } else if (zoom > fMin2) {
            scaleFactor = fMin2 / this.f20846a.getZoom();
        }
        this.f20846a.m3583b0(scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f20851f = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f20846a.m3567L();
        m19639e();
        this.f20851f = false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f20850e = true;
        if (this.f20846a.m3559D() || this.f20846a.m3557B()) {
            this.f20846a.m3568M(-f10, -f11);
        }
        if (!this.f20851f || this.f20846a.m3588l()) {
            this.f20846a.m3566K();
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        InterfaceC5028b scrollHandle;
        boolean zM19993h = this.f20846a.f3729s.m19993h(motionEvent);
        boolean zM19636b = m19636b(motionEvent.getX(), motionEvent.getY());
        if (!zM19993h && !zM19636b && (scrollHandle = this.f20846a.getScrollHandle()) != null && !this.f20846a.m3589m()) {
            if (scrollHandle.mo2071c()) {
                scrollHandle.hide();
            } else {
                scrollHandle.show();
            }
        }
        this.f20846a.performClick();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f20852g) {
            return false;
        }
        boolean z10 = this.f20848c.onTouchEvent(motionEvent) || this.f20849d.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && this.f20850e) {
            this.f20850e = false;
            m19641g(motionEvent);
        }
        return z10;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }
}
