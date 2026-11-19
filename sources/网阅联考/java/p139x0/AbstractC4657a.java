package p139x0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import p082k0.AbstractC3857c;

/* renamed from: x0.a */
/* loaded from: classes2.dex */
public abstract class AbstractC4657a implements InterfaceC4660d {

    /* renamed from: a */
    public InterfaceC4661e f5949a;

    /* renamed from: b */
    public float f5950b;

    /* renamed from: c */
    public float f5951c;

    /* renamed from: d */
    public final float f5952d;

    /* renamed from: e */
    public final float f5953e;

    /* renamed from: f */
    public VelocityTracker f5954f;

    /* renamed from: g */
    public boolean f5955g;

    public AbstractC4657a(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5953e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5952d = viewConfiguration.getScaledTouchSlop();
    }

    @Override // p139x0.InterfaceC4660d
    /* renamed from: a */
    public void mo6556a(InterfaceC4661e interfaceC4661e) {
        this.f5949a = interfaceC4661e;
    }

    @Override // p139x0.InterfaceC4660d
    /* renamed from: b */
    public boolean mo6557b() {
        return this.f5955g;
    }

    /* renamed from: d */
    public abstract float mo6558d(MotionEvent motionEvent);

    /* renamed from: e */
    public abstract float mo6559e(MotionEvent motionEvent);

    @Override // p139x0.InterfaceC4660d
    public boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int action = motionEvent.getAction();
        if (action == 0) {
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f5954f = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            } else {
                AbstractC3857c.m5164f("CupcakeGestureDetector", "Velocity tracker is null");
            }
            this.f5950b = mo6558d(motionEvent);
            this.f5951c = mo6559e(motionEvent);
            this.f5955g = false;
        } else if (action == 1) {
            if (this.f5955g && this.f5954f != null) {
                this.f5950b = mo6558d(motionEvent);
                this.f5951c = mo6559e(motionEvent);
                this.f5954f.addMovement(motionEvent);
                this.f5954f.computeCurrentVelocity(1000);
                float xVelocity = this.f5954f.getXVelocity();
                float yVelocity = this.f5954f.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f5953e) {
                    this.f5949a.mo4376b(this.f5950b, this.f5951c, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker2 = this.f5954f;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f5954f = null;
            }
        } else if (action == 2) {
            float fMo6558d = mo6558d(motionEvent);
            float fMo6559e = mo6559e(motionEvent);
            float f4 = fMo6558d - this.f5950b;
            float f5 = fMo6559e - this.f5951c;
            if (!this.f5955g) {
                this.f5955g = Math.sqrt((double) ((f4 * f4) + (f5 * f5))) >= ((double) this.f5952d);
            }
            if (this.f5955g) {
                this.f5949a.mo4378c(f4, f5);
                this.f5950b = fMo6558d;
                this.f5951c = fMo6559e;
                VelocityTracker velocityTracker3 = this.f5954f;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
            }
        } else if (action == 3 && (velocityTracker = this.f5954f) != null) {
            velocityTracker.recycle();
            this.f5954f = null;
        }
        return true;
    }
}
