package p403x6;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: x6.b */
/* loaded from: classes5.dex */
public class C11799b {

    /* renamed from: a */
    public int f27987a = -1;

    /* renamed from: b */
    public int f27988b = 0;

    /* renamed from: c */
    public final ScaleGestureDetector f27989c;

    /* renamed from: d */
    public VelocityTracker f27990d;

    /* renamed from: e */
    public boolean f27991e;

    /* renamed from: f */
    public float f27992f;

    /* renamed from: g */
    public float f27993g;

    /* renamed from: h */
    public final float f27994h;

    /* renamed from: i */
    public final float f27995i;

    /* renamed from: j */
    public InterfaceC11800c f27996j;

    public C11799b(Context context, InterfaceC11800c interfaceC11800c) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f27995i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f27994h = viewConfiguration.getScaledTouchSlop();
        this.f27996j = interfaceC11800c;
        this.f27989c = new ScaleGestureDetector(context, new a());
    }

    /* renamed from: b */
    public final float m26048b(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f27988b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* renamed from: c */
    public final float m26049c(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f27988b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* renamed from: d */
    public boolean m26050d() {
        return this.f27991e;
    }

    /* renamed from: e */
    public boolean m26051e() {
        return this.f27989c.isInProgress();
    }

    /* renamed from: f */
    public boolean m26052f(MotionEvent motionEvent) {
        try {
            this.f27989c.onTouchEvent(motionEvent);
            return m26053g(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    /* renamed from: g */
    public final boolean m26053g(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f27987a = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f27990d = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.f27992f = m26048b(motionEvent);
            this.f27993g = m26049c(motionEvent);
            this.f27991e = false;
        } else if (action == 1) {
            this.f27987a = -1;
            if (this.f27991e && this.f27990d != null) {
                this.f27992f = m26048b(motionEvent);
                this.f27993g = m26049c(motionEvent);
                this.f27990d.addMovement(motionEvent);
                this.f27990d.computeCurrentVelocity(1000);
                float xVelocity = this.f27990d.getXVelocity();
                float yVelocity = this.f27990d.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f27995i) {
                    this.f27996j.mo26056c(this.f27992f, this.f27993g, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker = this.f27990d;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f27990d = null;
            }
        } else if (action == 2) {
            float fM26048b = m26048b(motionEvent);
            float fM26049c = m26049c(motionEvent);
            float f10 = fM26048b - this.f27992f;
            float f11 = fM26049c - this.f27993g;
            if (!this.f27991e) {
                this.f27991e = Math.sqrt((double) ((f10 * f10) + (f11 * f11))) >= ((double) this.f27994h);
            }
            if (this.f27991e) {
                this.f27996j.mo26054a(f10, f11);
                this.f27992f = fM26048b;
                this.f27993g = fM26049c;
                VelocityTracker velocityTracker2 = this.f27990d;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
            }
        } else if (action == 3) {
            this.f27987a = -1;
            VelocityTracker velocityTracker3 = this.f27990d;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f27990d = null;
            }
        } else if (action == 6) {
            int iM26127b = AbstractC11809l.m26127b(motionEvent.getAction());
            if (motionEvent.getPointerId(iM26127b) == this.f27987a) {
                int i10 = iM26127b == 0 ? 1 : 0;
                this.f27987a = motionEvent.getPointerId(i10);
                this.f27992f = motionEvent.getX(i10);
                this.f27993g = motionEvent.getY(i10);
            }
        }
        int i11 = this.f27987a;
        this.f27988b = motionEvent.findPointerIndex(i11 != -1 ? i11 : 0);
        return true;
    }

    /* renamed from: x6.b$a */
    public class a implements ScaleGestureDetector.OnScaleGestureListener {

        /* renamed from: c */
        public float f27997c;

        /* renamed from: d */
        public float f27998d = 0.0f;

        public a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            if (scaleFactor < 0.0f) {
                return true;
            }
            C11799b.this.f27996j.mo26057d(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), scaleGestureDetector.getFocusX() - this.f27997c, scaleGestureDetector.getFocusY() - this.f27998d);
            this.f27997c = scaleGestureDetector.getFocusX();
            this.f27998d = scaleGestureDetector.getFocusY();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            this.f27997c = scaleGestureDetector.getFocusX();
            this.f27998d = scaleGestureDetector.getFocusY();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }
}
