package p281w3;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import p104f3.AbstractC7919c;

/* renamed from: w3.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9815a implements InterfaceC9818d {

    /* renamed from: a */
    public InterfaceC9819e f17484a;

    /* renamed from: b */
    public float f17485b;

    /* renamed from: c */
    public float f17486c;

    /* renamed from: d */
    public final float f17487d;

    /* renamed from: e */
    public final float f17488e;

    /* renamed from: f */
    public VelocityTracker f17489f;

    /* renamed from: g */
    public boolean f17490g;

    public AbstractC9815a(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f17488e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f17487d = viewConfiguration.getScaledTouchSlop();
    }

    @Override // p281w3.InterfaceC9818d
    /* renamed from: a */
    public boolean mo16675a(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int action = motionEvent.getAction();
        if (action == 0) {
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f17489f = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            } else {
                AbstractC7919c.m12474g("CupcakeGestureDetector", "Velocity tracker is null");
            }
            this.f17485b = mo16678e(motionEvent);
            this.f17486c = mo16679f(motionEvent);
            this.f17490g = false;
        } else if (action == 1) {
            if (this.f17490g && this.f17489f != null) {
                this.f17485b = mo16678e(motionEvent);
                this.f17486c = mo16679f(motionEvent);
                this.f17489f.addMovement(motionEvent);
                this.f17489f.computeCurrentVelocity(1000);
                float xVelocity = this.f17489f.getXVelocity();
                float yVelocity = this.f17489f.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f17488e) {
                    this.f17484a.mo6842c(this.f17485b, this.f17486c, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker2 = this.f17489f;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f17489f = null;
            }
        } else if (action == 2) {
            float fMo16678e = mo16678e(motionEvent);
            float fMo16679f = mo16679f(motionEvent);
            float f10 = fMo16678e - this.f17485b;
            float f11 = fMo16679f - this.f17486c;
            if (!this.f17490g) {
                this.f17490g = Math.sqrt((double) ((f10 * f10) + (f11 * f11))) >= ((double) this.f17487d);
            }
            if (this.f17490g) {
                this.f17484a.mo6838a(f10, f11);
                this.f17485b = fMo16678e;
                this.f17486c = fMo16679f;
                VelocityTracker velocityTracker3 = this.f17489f;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
            }
        } else if (action == 3 && (velocityTracker = this.f17489f) != null) {
            velocityTracker.recycle();
            this.f17489f = null;
        }
        return true;
    }

    @Override // p281w3.InterfaceC9818d
    /* renamed from: b */
    public void mo16676b(InterfaceC9819e interfaceC9819e) {
        this.f17484a = interfaceC9819e;
    }

    @Override // p281w3.InterfaceC9818d
    /* renamed from: c */
    public boolean mo16677c() {
        return this.f17490g;
    }

    /* renamed from: e */
    public abstract float mo16678e(MotionEvent motionEvent);

    /* renamed from: f */
    public abstract float mo16679f(MotionEvent motionEvent);
}
