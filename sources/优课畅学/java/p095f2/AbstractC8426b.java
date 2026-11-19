package p095f2;

import android.content.Context;
import android.view.MotionEvent;
import p083e2.AbstractC8349a;

/* renamed from: f2.b */
/* loaded from: classes4.dex */
public abstract class AbstractC8426b extends AbstractC8425a {

    /* renamed from: h */
    public int f16001h;

    /* renamed from: i */
    public int f16002i;

    public AbstractC8426b(Context context) {
        super(context);
        this.f16001h = -1;
        this.f16002i = 0;
    }

    @Override // p095f2.AbstractC8425a
    /* renamed from: d */
    public float mo13764d(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f16002i);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    @Override // p095f2.AbstractC8425a
    /* renamed from: e */
    public float mo13765e(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f16002i);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    @Override // p095f2.AbstractC8425a, p095f2.InterfaceC8428d
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f16001h = motionEvent.getPointerId(0);
        } else if (action == 1 || action == 3) {
            this.f16001h = -1;
        } else if (action == 6) {
            int iM13591a = AbstractC8349a.m13591a(motionEvent.getAction());
            if (motionEvent.getPointerId(iM13591a) == this.f16001h) {
                int i10 = iM13591a == 0 ? 1 : 0;
                this.f16001h = motionEvent.getPointerId(i10);
                this.f15995b = motionEvent.getX(i10);
                this.f15996c = motionEvent.getY(i10);
            }
        }
        int i11 = this.f16001h;
        this.f16002i = motionEvent.findPointerIndex(i11 != -1 ? i11 : 0);
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }
}
