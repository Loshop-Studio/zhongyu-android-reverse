package p070b.p113c.p114a.p116e.p128f.p130b.p131f;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.MotionEvent;

@TargetApi(5)
/* renamed from: b.c.a.e.f.b.f.b */
/* loaded from: classes.dex */
public class C0823b extends C0822a {

    /* renamed from: h */
    public int f4602h;

    /* renamed from: i */
    public int f4603i;

    public C0823b(Context context) {
        super(context);
        this.f4602h = -1;
        this.f4603i = 0;
    }

    @Override // p070b.p113c.p114a.p116e.p128f.p130b.p131f.C0822a
    /* renamed from: a */
    public float mo2542a(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f4603i);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    @Override // p070b.p113c.p114a.p116e.p128f.p130b.p131f.C0822a
    /* renamed from: b */
    public float mo2543b(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f4603i);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    @Override // p070b.p113c.p114a.p116e.p128f.p130b.p131f.C0822a
    /* renamed from: d */
    public boolean mo2545d(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f4602h = motionEvent.getPointerId(0);
        } else if (action == 1 || action == 3) {
            this.f4602h = -1;
        } else if (action == 6) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            if (motionEvent.getPointerId(action2) == this.f4602h) {
                int i = action2 == 0 ? 1 : 0;
                this.f4602h = motionEvent.getPointerId(i);
                this.f4596b = motionEvent.getX(i);
                this.f4597c = motionEvent.getY(i);
            }
        }
        int i2 = this.f4602h;
        this.f4603i = motionEvent.findPointerIndex(i2 != -1 ? i2 : 0);
        try {
            super.mo2545d(motionEvent);
        } catch (IllegalArgumentException unused) {
        }
        return true;
    }
}
