package p302q4;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: q4.b */
/* loaded from: classes5.dex */
public class C10726b {

    /* renamed from: a */
    public int f25798a = -1;

    /* renamed from: b */
    public int f25799b = 0;

    /* renamed from: c */
    public final ScaleGestureDetector f25800c;

    /* renamed from: d */
    public VelocityTracker f25801d;

    /* renamed from: e */
    public boolean f25802e;

    /* renamed from: f */
    public float f25803f;

    /* renamed from: g */
    public float f25804g;

    /* renamed from: h */
    public final float f25805h;

    /* renamed from: i */
    public final float f25806i;

    /* renamed from: j */
    public InterfaceC10727c f25807j;

    public C10726b(Context context, InterfaceC10727c interfaceC10727c) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f25806i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f25805h = viewConfiguration.getScaledTouchSlop();
        this.f25807j = interfaceC10727c;
        this.f25800c = new ScaleGestureDetector(context, new a());
    }

    /* renamed from: b */
    public final float m22717b(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f25799b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* renamed from: c */
    public final float m22718c(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f25799b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* renamed from: d */
    public boolean m22719d() {
        return this.f25802e;
    }

    /* renamed from: e */
    public boolean m22720e() {
        return this.f25800c.isInProgress();
    }

    /* renamed from: f */
    public boolean m22721f(MotionEvent motionEvent) {
        try {
            this.f25800c.onTouchEvent(motionEvent);
            return m22722g(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    /* renamed from: g */
    public final boolean m22722g(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f25798a = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f25801d = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.f25803f = m22717b(motionEvent);
            this.f25804g = m22718c(motionEvent);
            this.f25802e = false;
        } else if (action == 1) {
            this.f25798a = -1;
            if (this.f25802e && this.f25801d != null) {
                this.f25803f = m22717b(motionEvent);
                this.f25804g = m22718c(motionEvent);
                this.f25801d.addMovement(motionEvent);
                this.f25801d.computeCurrentVelocity(1000);
                float xVelocity = this.f25801d.getXVelocity();
                float yVelocity = this.f25801d.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f25806i) {
                    this.f25807j.mo22725c(this.f25803f, this.f25804g, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker = this.f25801d;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f25801d = null;
            }
        } else if (action == 2) {
            float fM22717b = m22717b(motionEvent);
            float fM22718c = m22718c(motionEvent);
            float f10 = fM22717b - this.f25803f;
            float f11 = fM22718c - this.f25804g;
            if (!this.f25802e) {
                this.f25802e = Math.sqrt((double) ((f10 * f10) + (f11 * f11))) >= ((double) this.f25805h);
            }
            if (this.f25802e) {
                this.f25807j.mo22723a(f10, f11);
                this.f25803f = fM22717b;
                this.f25804g = fM22718c;
                VelocityTracker velocityTracker2 = this.f25801d;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
            }
        } else if (action == 3) {
            this.f25798a = -1;
            VelocityTracker velocityTracker3 = this.f25801d;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f25801d = null;
            }
        } else if (action == 6) {
            int iM22795b = AbstractC10736l.m22795b(motionEvent.getAction());
            if (motionEvent.getPointerId(iM22795b) == this.f25798a) {
                int i10 = iM22795b == 0 ? 1 : 0;
                this.f25798a = motionEvent.getPointerId(i10);
                this.f25803f = motionEvent.getX(i10);
                this.f25804g = motionEvent.getY(i10);
            }
        }
        int i11 = this.f25798a;
        this.f25799b = motionEvent.findPointerIndex(i11 != -1 ? i11 : 0);
        return true;
    }

    /* renamed from: q4.b$a */
    public class a implements ScaleGestureDetector.OnScaleGestureListener {
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
            C10726b.this.f25807j.mo22724b(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }
}
