package p097g3;

import android.content.Context;
import android.view.MotionEvent;
import p086f3.AbstractC7435a;

/* renamed from: g3.b */
/* loaded from: classes4.dex */
public abstract class AbstractC7516b extends AbstractC7515a {

    /* renamed from: h */
    public int f12379h;

    /* renamed from: i */
    public int f12380i;

    public AbstractC7516b(Context context) {
        super(context);
        this.f12379h = -1;
        this.f12380i = 0;
    }

    @Override // p097g3.AbstractC7515a, p097g3.InterfaceC7518d
    /* renamed from: a */
    public boolean mo12229a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f12379h = motionEvent.getPointerId(0);
        } else if (action == 1 || action == 3) {
            this.f12379h = -1;
        } else if (action == 6) {
            int iM11987a = AbstractC7435a.m11987a(motionEvent.getAction());
            if (motionEvent.getPointerId(iM11987a) == this.f12379h) {
                int i10 = iM11987a == 0 ? 1 : 0;
                this.f12379h = motionEvent.getPointerId(i10);
                this.f12373b = motionEvent.getX(i10);
                this.f12374c = motionEvent.getY(i10);
            }
        }
        int i11 = this.f12379h;
        this.f12380i = motionEvent.findPointerIndex(i11 != -1 ? i11 : 0);
        try {
            return super.mo12229a(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    @Override // p097g3.AbstractC7515a
    /* renamed from: e */
    public float mo12232e(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f12380i);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    @Override // p097g3.AbstractC7515a
    /* renamed from: f */
    public float mo12233f(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f12380i);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }
}
