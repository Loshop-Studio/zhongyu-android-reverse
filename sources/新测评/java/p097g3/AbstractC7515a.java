package p097g3;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import p197p2.AbstractC8819c;

/* renamed from: g3.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7515a implements InterfaceC7518d {

    /* renamed from: a */
    public InterfaceC7519e f12372a;

    /* renamed from: b */
    public float f12373b;

    /* renamed from: c */
    public float f12374c;

    /* renamed from: d */
    public final float f12375d;

    /* renamed from: e */
    public final float f12376e;

    /* renamed from: f */
    public VelocityTracker f12377f;

    /* renamed from: g */
    public boolean f12378g;

    public AbstractC7515a(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f12376e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f12375d = viewConfiguration.getScaledTouchSlop();
    }

    @Override // p097g3.InterfaceC7518d
    /* renamed from: a */
    public boolean mo12229a(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int action = motionEvent.getAction();
        if (action == 0) {
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f12377f = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            } else {
                AbstractC8819c.m14783g("CupcakeGestureDetector", "Velocity tracker is null");
            }
            this.f12373b = mo12232e(motionEvent);
            this.f12374c = mo12233f(motionEvent);
            this.f12378g = false;
        } else if (action == 1) {
            if (this.f12378g && this.f12377f != null) {
                this.f12373b = mo12232e(motionEvent);
                this.f12374c = mo12233f(motionEvent);
                this.f12377f.addMovement(motionEvent);
                this.f12377f.computeCurrentVelocity(1000);
                float xVelocity = this.f12377f.getXVelocity();
                float yVelocity = this.f12377f.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f12376e) {
                    this.f12372a.mo5736c(this.f12373b, this.f12374c, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker2 = this.f12377f;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f12377f = null;
            }
        } else if (action == 2) {
            float fMo12232e = mo12232e(motionEvent);
            float fMo12233f = mo12233f(motionEvent);
            float f10 = fMo12232e - this.f12373b;
            float f11 = fMo12233f - this.f12374c;
            if (!this.f12378g) {
                this.f12378g = Math.sqrt((double) ((f10 * f10) + (f11 * f11))) >= ((double) this.f12375d);
            }
            if (this.f12378g) {
                this.f12372a.mo5732a(f10, f11);
                this.f12373b = fMo12232e;
                this.f12374c = fMo12233f;
                VelocityTracker velocityTracker3 = this.f12377f;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
            }
        } else if (action == 3 && (velocityTracker = this.f12377f) != null) {
            velocityTracker.recycle();
            this.f12377f = null;
        }
        return true;
    }

    @Override // p097g3.InterfaceC7518d
    /* renamed from: b */
    public void mo12230b(InterfaceC7519e interfaceC7519e) {
        this.f12372a = interfaceC7519e;
    }

    @Override // p097g3.InterfaceC7518d
    /* renamed from: c */
    public boolean mo12231c() {
        return this.f12378g;
    }

    /* renamed from: e */
    public abstract float mo12232e(MotionEvent motionEvent);

    /* renamed from: f */
    public abstract float mo12233f(MotionEvent motionEvent);
}
