package p281w3;

import android.content.Context;
import android.view.MotionEvent;
import p271v3.AbstractC9761a;

/* renamed from: w3.b */
/* loaded from: classes4.dex */
public abstract class AbstractC9816b extends AbstractC9815a {

    /* renamed from: h */
    public int f17491h;

    /* renamed from: i */
    public int f17492i;

    public AbstractC9816b(Context context) {
        super(context);
        this.f17491h = -1;
        this.f17492i = 0;
    }

    @Override // p281w3.AbstractC9815a, p281w3.InterfaceC9818d
    /* renamed from: a */
    public boolean mo16675a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f17491h = motionEvent.getPointerId(0);
        } else if (action == 1 || action == 3) {
            this.f17491h = -1;
        } else if (action == 6) {
            int iM16445a = AbstractC9761a.m16445a(motionEvent.getAction());
            if (motionEvent.getPointerId(iM16445a) == this.f17491h) {
                int i9 = iM16445a == 0 ? 1 : 0;
                this.f17491h = motionEvent.getPointerId(i9);
                this.f17485b = motionEvent.getX(i9);
                this.f17486c = motionEvent.getY(i9);
            }
        }
        int i10 = this.f17491h;
        this.f17492i = motionEvent.findPointerIndex(i10 != -1 ? i10 : 0);
        try {
            return super.mo16675a(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    @Override // p281w3.AbstractC9815a
    /* renamed from: e */
    public float mo16678e(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f17492i);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    @Override // p281w3.AbstractC9815a
    /* renamed from: f */
    public float mo16679f(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f17492i);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }
}
