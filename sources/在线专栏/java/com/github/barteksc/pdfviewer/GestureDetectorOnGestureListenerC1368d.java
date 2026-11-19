package com.github.barteksc.pdfviewer;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import p123n1.InterfaceC2888h;
import p137p1.InterfaceC2996a;
import p145r1.C3027b;

/* renamed from: com.github.barteksc.pdfviewer.d */
/* loaded from: classes.dex */
class GestureDetectorOnGestureListenerC1368d implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* renamed from: a */
    private PDFView f7324a;

    /* renamed from: b */
    private C1365a f7325b;

    /* renamed from: c */
    private GestureDetector f7326c;

    /* renamed from: d */
    private ScaleGestureDetector f7327d;

    /* renamed from: f */
    private boolean f7329f;

    /* renamed from: g */
    private boolean f7330g = false;

    /* renamed from: h */
    private boolean f7331h = false;

    /* renamed from: e */
    private boolean f7328e = false;

    public GestureDetectorOnGestureListenerC1368d(PDFView pDFView, C1365a c1365a) {
        this.f7324a = pDFView;
        this.f7325b = c1365a;
        this.f7329f = pDFView.m5630E();
        this.f7326c = new GestureDetector(pDFView.getContext(), this);
        this.f7327d = new ScaleGestureDetector(pDFView.getContext(), this);
        pDFView.setOnTouchListener(this);
    }

    /* renamed from: b */
    private void m5699b() {
        if (this.f7324a.getScrollHandle() == null || !this.f7324a.getScrollHandle().m10101e()) {
            return;
        }
        this.f7324a.getScrollHandle().m10098b();
    }

    /* renamed from: a */
    public void m5700a(boolean z3) {
        if (z3) {
            this.f7326c.setOnDoubleTapListener(this);
        } else {
            this.f7326c.setOnDoubleTapListener(null);
        }
    }

    /* renamed from: c */
    public boolean m5701c() {
        return this.f7324a.m5631F();
    }

    /* renamed from: d */
    public void m5702d(MotionEvent motionEvent) {
        this.f7324a.m5637N();
        m5699b();
    }

    /* renamed from: e */
    public void m5703e(boolean z3) {
        this.f7328e = z3;
    }

    /* renamed from: f */
    public void m5704f(boolean z3) {
        this.f7329f = z3;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.f7324a.getZoom() < this.f7324a.getMidZoom()) {
            this.f7324a.m5653d0(motionEvent.getX(), motionEvent.getY(), this.f7324a.getMidZoom());
            return true;
        }
        if (this.f7324a.getZoom() < this.f7324a.getMaxZoom()) {
            this.f7324a.m5653d0(motionEvent.getX(), motionEvent.getY(), this.f7324a.getMaxZoom());
            return true;
        }
        this.f7324a.m5645V();
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f7325b.m5685j();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f4, float f5) {
        float f6;
        float fM5648Y;
        int height;
        int currentXOffset = (int) this.f7324a.getCurrentXOffset();
        int currentYOffset = (int) this.f7324a.getCurrentYOffset();
        if (this.f7324a.m5630E()) {
            PDFView pDFView = this.f7324a;
            f6 = -(pDFView.m5648Y(pDFView.getOptimalPageWidth()) - this.f7324a.getWidth());
            fM5648Y = this.f7324a.m5654p();
            height = this.f7324a.getHeight();
        } else {
            f6 = -(this.f7324a.m5654p() - this.f7324a.getWidth());
            PDFView pDFView2 = this.f7324a;
            fM5648Y = pDFView2.m5648Y(pDFView2.getOptimalPageHeight());
            height = this.f7324a.getHeight();
        }
        this.f7325b.m5680e(currentXOffset, currentYOffset, (int) f4, (int) f5, (int) f6, 0, (int) (-(fM5648Y - height)), 0);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float zoom;
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float zoom2 = this.f7324a.getZoom() * scaleFactor;
        float f4 = C3027b.b.f11737b;
        if (zoom2 >= f4) {
            f4 = C3027b.b.f11736a;
            if (zoom2 > f4) {
                zoom = this.f7324a.getZoom();
            }
            this.f7324a.m5649Z(scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
            return true;
        }
        zoom = this.f7324a.getZoom();
        scaleFactor = f4 / zoom;
        this.f7324a.m5649Z(scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f7331h = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f7324a.m5637N();
        m5699b();
        this.f7331h = false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f4, float f5) {
        this.f7330g = true;
        if (m5701c() || this.f7328e) {
            this.f7324a.m5638O(-f4, -f5);
        }
        if (!this.f7331h || this.f7324a.m5655t()) {
            this.f7324a.m5636M();
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        InterfaceC2996a scrollHandle;
        InterfaceC2888h onTapListener = this.f7324a.getOnTapListener();
        if ((onTapListener == null || !onTapListener.m9921a(motionEvent)) && (scrollHandle = this.f7324a.getScrollHandle()) != null && !this.f7324a.m5656u()) {
            if (scrollHandle.m10101e()) {
                scrollHandle.hide();
            } else {
                scrollHandle.show();
            }
        }
        this.f7324a.performClick();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z3 = this.f7326c.onTouchEvent(motionEvent) || this.f7327d.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && this.f7330g) {
            this.f7330g = false;
            m5702d(motionEvent);
        }
        return z3;
    }
}
