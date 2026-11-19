package p069h2;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import p133q1.AbstractC7620c;

/* renamed from: h2.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6448a implements InterfaceC6451d {

    /* renamed from: a */
    public InterfaceC6452e f8199a;

    /* renamed from: b */
    public float f8200b;

    /* renamed from: c */
    public float f8201c;

    /* renamed from: d */
    public final float f8202d;

    /* renamed from: e */
    public final float f8203e;

    /* renamed from: f */
    public VelocityTracker f8204f;

    /* renamed from: g */
    public boolean f8205g;

    public AbstractC6448a(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f8203e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f8202d = viewConfiguration.getScaledTouchSlop();
    }

    @Override // p069h2.InterfaceC6451d
    /* renamed from: a */
    public boolean mo7091a(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int action = motionEvent.getAction();
        if (action == 0) {
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f8204f = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            } else {
                AbstractC7620c.m9064f("CupcakeGestureDetector", "Velocity tracker is null");
            }
            this.f8200b = mo7094e(motionEvent);
            this.f8201c = mo7095f(motionEvent);
            this.f8205g = false;
        } else if (action == 1) {
            if (this.f8205g && this.f8204f != null) {
                this.f8200b = mo7094e(motionEvent);
                this.f8201c = mo7095f(motionEvent);
                this.f8204f.addMovement(motionEvent);
                this.f8204f.computeCurrentVelocity(1000);
                float xVelocity = this.f8204f.getXVelocity();
                float yVelocity = this.f8204f.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f8203e) {
                    this.f8199a.mo4755c(this.f8200b, this.f8201c, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker2 = this.f8204f;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f8204f = null;
            }
        } else if (action == 2) {
            float fMo7094e = mo7094e(motionEvent);
            float fMo7095f = mo7095f(motionEvent);
            float f6 = fMo7094e - this.f8200b;
            float f7 = fMo7095f - this.f8201c;
            if (!this.f8205g) {
                this.f8205g = Math.sqrt((double) ((f6 * f6) + (f7 * f7))) >= ((double) this.f8202d);
            }
            if (this.f8205g) {
                this.f8199a.mo4751a(f6, f7);
                this.f8200b = fMo7094e;
                this.f8201c = fMo7095f;
                VelocityTracker velocityTracker3 = this.f8204f;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
            }
        } else if (action == 3 && (velocityTracker = this.f8204f) != null) {
            velocityTracker.recycle();
            this.f8204f = null;
        }
        return true;
    }

    @Override // p069h2.InterfaceC6451d
    /* renamed from: b */
    public boolean mo7092b() {
        return this.f8205g;
    }

    @Override // p069h2.InterfaceC6451d
    /* renamed from: c */
    public void mo7093c(InterfaceC6452e interfaceC6452e) {
        this.f8199a = interfaceC6452e;
    }

    /* renamed from: e */
    public abstract float mo7094e(MotionEvent motionEvent);

    /* renamed from: f */
    public abstract float mo7095f(MotionEvent motionEvent);
}
