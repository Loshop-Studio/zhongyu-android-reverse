package p306q8;

import android.content.Context;
import android.view.MotionEvent;
import p292p8.AbstractC10636a;

/* renamed from: q8.b */
/* loaded from: classes5.dex */
public abstract class AbstractC10756b extends AbstractC10755a {

    /* renamed from: h */
    public int f25904h;

    /* renamed from: i */
    public int f25905i;

    public AbstractC10756b(Context context) {
        super(context);
        this.f25904h = -1;
        this.f25905i = 0;
    }

    @Override // p306q8.AbstractC10755a, p306q8.InterfaceC10758d
    /* renamed from: a */
    public boolean mo22849a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f25904h = motionEvent.getPointerId(0);
        } else if (action == 1 || action == 3) {
            this.f25904h = -1;
        } else if (action == 6) {
            int iM22502a = AbstractC10636a.m22502a(motionEvent.getAction());
            if (motionEvent.getPointerId(iM22502a) == this.f25904h) {
                int i10 = iM22502a == 0 ? 1 : 0;
                this.f25904h = motionEvent.getPointerId(i10);
                this.f25898b = motionEvent.getX(i10);
                this.f25899c = motionEvent.getY(i10);
            }
        }
        int i11 = this.f25904h;
        this.f25905i = motionEvent.findPointerIndex(i11 != -1 ? i11 : 0);
        try {
            return super.mo22849a(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    @Override // p306q8.AbstractC10755a
    /* renamed from: e */
    public float mo22852e(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f25905i);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    @Override // p306q8.AbstractC10755a
    /* renamed from: f */
    public float mo22853f(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f25905i);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }
}
