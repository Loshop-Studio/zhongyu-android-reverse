package p095f2;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import p184n1.AbstractC9363c;

/* renamed from: f2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC8425a implements InterfaceC8428d {

    /* renamed from: a */
    public InterfaceC8429e f15994a;

    /* renamed from: b */
    public float f15995b;

    /* renamed from: c */
    public float f15996c;

    /* renamed from: d */
    public final float f15997d;

    /* renamed from: e */
    public final float f15998e;

    /* renamed from: f */
    public VelocityTracker f15999f;

    /* renamed from: g */
    public boolean f16000g;

    public AbstractC8425a(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f15998e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f15997d = viewConfiguration.getScaledTouchSlop();
    }

    @Override // p095f2.InterfaceC8428d
    /* renamed from: a */
    public void mo13762a(InterfaceC8429e interfaceC8429e) {
        this.f15994a = interfaceC8429e;
    }

    @Override // p095f2.InterfaceC8428d
    /* renamed from: b */
    public boolean mo13763b() {
        return this.f16000g;
    }

    /* renamed from: d */
    public abstract float mo13764d(MotionEvent motionEvent);

    /* renamed from: e */
    public abstract float mo13765e(MotionEvent motionEvent);

    @Override // p095f2.InterfaceC8428d
    public boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int action = motionEvent.getAction();
        if (action == 0) {
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f15999f = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            } else {
                AbstractC9363c.m17252f("CupcakeGestureDetector", "Velocity tracker is null");
            }
            this.f15995b = mo13764d(motionEvent);
            this.f15996c = mo13765e(motionEvent);
            this.f16000g = false;
        } else if (action == 1) {
            if (this.f16000g && this.f15999f != null) {
                this.f15995b = mo13764d(motionEvent);
                this.f15996c = mo13765e(motionEvent);
                this.f15999f.addMovement(motionEvent);
                this.f15999f.computeCurrentVelocity(1000);
                float xVelocity = this.f15999f.getXVelocity();
                float yVelocity = this.f15999f.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f15998e) {
                    this.f15994a.mo6930c(this.f15995b, this.f15996c, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker2 = this.f15999f;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f15999f = null;
            }
        } else if (action == 2) {
            float fMo13764d = mo13764d(motionEvent);
            float fMo13765e = mo13765e(motionEvent);
            float f10 = fMo13764d - this.f15995b;
            float f11 = fMo13765e - this.f15996c;
            if (!this.f16000g) {
                this.f16000g = Math.sqrt((double) ((f10 * f10) + (f11 * f11))) >= ((double) this.f15997d);
            }
            if (this.f16000g) {
                this.f15994a.mo6926a(f10, f11);
                this.f15995b = fMo13764d;
                this.f15996c = fMo13765e;
                VelocityTracker velocityTracker3 = this.f15999f;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
            }
        } else if (action == 3 && (velocityTracker = this.f15999f) != null) {
            velocityTracker.recycle();
            this.f15999f = null;
        }
        return true;
    }
}
