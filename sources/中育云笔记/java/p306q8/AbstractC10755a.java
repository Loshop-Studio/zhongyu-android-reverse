package p306q8;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import p034b8.AbstractC5175c;

/* renamed from: q8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10755a implements InterfaceC10758d {

    /* renamed from: a */
    public InterfaceC10759e f25897a;

    /* renamed from: b */
    public float f25898b;

    /* renamed from: c */
    public float f25899c;

    /* renamed from: d */
    public final float f25900d;

    /* renamed from: e */
    public final float f25901e;

    /* renamed from: f */
    public VelocityTracker f25902f;

    /* renamed from: g */
    public boolean f25903g;

    public AbstractC10755a(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f25901e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f25900d = viewConfiguration.getScaledTouchSlop();
    }

    @Override // p306q8.InterfaceC10758d
    /* renamed from: a */
    public boolean mo22849a(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int action = motionEvent.getAction();
        if (action == 0) {
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f25902f = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            } else {
                AbstractC5175c.m2712f("CupcakeGestureDetector", "Velocity tracker is null");
            }
            this.f25898b = mo22852e(motionEvent);
            this.f25899c = mo22853f(motionEvent);
            this.f25903g = false;
        } else if (action == 1) {
            if (this.f25903g && this.f25902f != null) {
                this.f25898b = mo22852e(motionEvent);
                this.f25899c = mo22853f(motionEvent);
                this.f25902f.addMovement(motionEvent);
                this.f25902f.computeCurrentVelocity(1000);
                float xVelocity = this.f25902f.getXVelocity();
                float yVelocity = this.f25902f.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f25901e) {
                    this.f25897a.mo12823c(this.f25898b, this.f25899c, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker2 = this.f25902f;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f25902f = null;
            }
        } else if (action == 2) {
            float fMo22852e = mo22852e(motionEvent);
            float fMo22853f = mo22853f(motionEvent);
            float f10 = fMo22852e - this.f25898b;
            float f11 = fMo22853f - this.f25899c;
            if (!this.f25903g) {
                this.f25903g = Math.sqrt((double) ((f10 * f10) + (f11 * f11))) >= ((double) this.f25900d);
            }
            if (this.f25903g) {
                this.f25897a.mo12819a(f10, f11);
                this.f25898b = fMo22852e;
                this.f25899c = fMo22853f;
                VelocityTracker velocityTracker3 = this.f25902f;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
            }
        } else if (action == 3 && (velocityTracker = this.f25902f) != null) {
            velocityTracker.recycle();
            this.f25902f = null;
        }
        return true;
    }

    @Override // p306q8.InterfaceC10758d
    /* renamed from: b */
    public void mo22850b(InterfaceC10759e interfaceC10759e) {
        this.f25897a = interfaceC10759e;
    }

    @Override // p306q8.InterfaceC10758d
    /* renamed from: c */
    public boolean mo22851c() {
        return this.f25903g;
    }

    /* renamed from: e */
    public abstract float mo22852e(MotionEvent motionEvent);

    /* renamed from: f */
    public abstract float mo22853f(MotionEvent motionEvent);
}
