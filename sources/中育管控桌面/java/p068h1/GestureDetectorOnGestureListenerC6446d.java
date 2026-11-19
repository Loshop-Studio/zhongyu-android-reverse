package p068h1;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.github.barteksc.pdfviewer.PDFView;
import p105m1.AbstractC7375b;

/* renamed from: h1.d */
/* loaded from: classes3.dex */
public class GestureDetectorOnGestureListenerC6446d implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* renamed from: a */
    public PDFView f8169a;

    /* renamed from: b */
    public C6443a f8170b;

    /* renamed from: c */
    public GestureDetector f8171c;

    /* renamed from: d */
    public ScaleGestureDetector f8172d;

    /* renamed from: f */
    public boolean f8174f;

    /* renamed from: g */
    public boolean f8175g = false;

    /* renamed from: h */
    public boolean f8176h = false;

    /* renamed from: e */
    public boolean f8173e = false;

    public GestureDetectorOnGestureListenerC6446d(PDFView pDFView, C6443a c6443a) {
        this.f8169a = pDFView;
        this.f8170b = c6443a;
        this.f8174f = pDFView.m3371D();
        this.f8171c = new GestureDetector(pDFView.getContext(), this);
        this.f8172d = new ScaleGestureDetector(pDFView.getContext(), this);
        pDFView.setOnTouchListener(this);
    }

    /* renamed from: a */
    public void m7079a(boolean z6) {
        if (z6) {
            this.f8171c.setOnDoubleTapListener(this);
        } else {
            this.f8171c.setOnDoubleTapListener(null);
        }
    }

    /* renamed from: b */
    public final void m7080b() {
        this.f8169a.getScrollHandle();
    }

    /* renamed from: c */
    public boolean m7081c() {
        return this.f8169a.m3372E();
    }

    /* renamed from: d */
    public void m7082d(MotionEvent motionEvent) {
        this.f8169a.m3380M();
        m7080b();
    }

    /* renamed from: e */
    public void m7083e(boolean z6) {
        this.f8173e = z6;
    }

    /* renamed from: f */
    public void m7084f(boolean z6) {
        this.f8174f = z6;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.f8169a.getZoom() < this.f8169a.getMidZoom()) {
            this.f8169a.m3396c0(motionEvent.getX(), motionEvent.getY(), this.f8169a.getMidZoom());
            return true;
        }
        if (this.f8169a.getZoom() < this.f8169a.getMaxZoom()) {
            this.f8169a.m3396c0(motionEvent.getX(), motionEvent.getY(), this.f8169a.getMaxZoom());
            return true;
        }
        this.f8169a.m3388U();
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f8170b.m7065j();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
        float f8;
        float fM3391X;
        int height;
        int currentXOffset = (int) this.f8169a.getCurrentXOffset();
        int currentYOffset = (int) this.f8169a.getCurrentYOffset();
        if (this.f8169a.m3371D()) {
            PDFView pDFView = this.f8169a;
            f8 = -(pDFView.m3391X(pDFView.getOptimalPageWidth()) - this.f8169a.getWidth());
            fM3391X = this.f8169a.m3397p();
            height = this.f8169a.getHeight();
        } else {
            f8 = -(this.f8169a.m3397p() - this.f8169a.getWidth());
            PDFView pDFView2 = this.f8169a;
            fM3391X = pDFView2.m3391X(pDFView2.getOptimalPageHeight());
            height = this.f8169a.getHeight();
        }
        this.f8170b.m7060e(currentXOffset, currentYOffset, (int) f6, (int) f7, (int) f8, 0, (int) (-(fM3391X - height)), 0);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float zoom;
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float zoom2 = this.f8169a.getZoom() * scaleFactor;
        float f6 = AbstractC7375b.b.f9393b;
        if (zoom2 >= f6) {
            f6 = AbstractC7375b.b.f9392a;
            if (zoom2 > f6) {
                zoom = this.f8169a.getZoom();
            }
            this.f8169a.m3392Y(scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
            return true;
        }
        zoom = this.f8169a.getZoom();
        scaleFactor = f6 / zoom;
        this.f8169a.m3392Y(scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f8176h = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f8169a.m3380M();
        m7080b();
        this.f8176h = false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
        this.f8175g = true;
        if (m7081c() || this.f8173e) {
            this.f8169a.m3381N(-f6, -f7);
        }
        if (!this.f8176h || this.f8169a.m3401t()) {
            this.f8169a.m3379L();
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.f8169a.getOnTapListener();
        this.f8169a.getScrollHandle();
        this.f8169a.performClick();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z6 = this.f8171c.onTouchEvent(motionEvent) || this.f8172d.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && this.f8175g) {
            this.f8175g = false;
            m7082d(motionEvent);
        }
        return z6;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }
}
