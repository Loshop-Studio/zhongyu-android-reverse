package p069h2;

import android.content.Context;
import android.view.MotionEvent;
import p062g2.AbstractC6395a;

/* renamed from: h2.b */
/* loaded from: classes3.dex */
public abstract class AbstractC6449b extends AbstractC6448a {

    /* renamed from: h */
    public int f8206h;

    /* renamed from: i */
    public int f8207i;

    public AbstractC6449b(Context context) {
        super(context);
        this.f8206h = -1;
        this.f8207i = 0;
    }

    @Override // p069h2.AbstractC6448a, p069h2.InterfaceC6451d
    /* renamed from: a */
    public boolean mo7091a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f8206h = motionEvent.getPointerId(0);
        } else if (action == 1 || action == 3) {
            this.f8206h = -1;
        } else if (action == 6) {
            int iM6913a = AbstractC6395a.m6913a(motionEvent.getAction());
            if (motionEvent.getPointerId(iM6913a) == this.f8206h) {
                int i6 = iM6913a == 0 ? 1 : 0;
                this.f8206h = motionEvent.getPointerId(i6);
                this.f8200b = motionEvent.getX(i6);
                this.f8201c = motionEvent.getY(i6);
            }
        }
        int i7 = this.f8206h;
        this.f8207i = motionEvent.findPointerIndex(i7 != -1 ? i7 : 0);
        try {
            return super.mo7091a(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    @Override // p069h2.AbstractC6448a
    /* renamed from: e */
    public float mo7094e(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f8207i);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    @Override // p069h2.AbstractC6448a
    /* renamed from: f */
    public float mo7095f(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f8207i);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }
}
