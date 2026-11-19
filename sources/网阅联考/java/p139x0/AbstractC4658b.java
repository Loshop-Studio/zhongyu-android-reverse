package p139x0;

import android.content.Context;
import android.view.MotionEvent;
import p135w0.AbstractC4638a;

/* renamed from: x0.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4658b extends AbstractC4657a {

    /* renamed from: h */
    public int f5956h;

    /* renamed from: i */
    public int f5957i;

    public AbstractC4658b(Context context) {
        super(context);
        this.f5956h = -1;
        this.f5957i = 0;
    }

    @Override // p139x0.AbstractC4657a
    /* renamed from: d */
    public float mo6558d(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f5957i);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    @Override // p139x0.AbstractC4657a
    /* renamed from: e */
    public float mo6559e(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f5957i);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    @Override // p139x0.AbstractC4657a, p139x0.InterfaceC4660d
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f5956h = motionEvent.getPointerId(0);
        } else if (action == 1 || action == 3) {
            this.f5956h = -1;
        } else if (action == 6) {
            int iM6459a = AbstractC4638a.m6459a(motionEvent.getAction());
            if (motionEvent.getPointerId(iM6459a) == this.f5956h) {
                int i4 = iM6459a == 0 ? 1 : 0;
                this.f5956h = motionEvent.getPointerId(i4);
                this.f5950b = motionEvent.getX(i4);
                this.f5951c = motionEvent.getY(i4);
            }
        }
        int i5 = this.f5956h;
        this.f5957i = motionEvent.findPointerIndex(i5 != -1 ? i5 : 0);
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }
}
