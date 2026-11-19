package p306q8;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: q8.c */
/* loaded from: classes5.dex */
public class C10757c extends AbstractC10756b {

    /* renamed from: j */
    public final ScaleGestureDetector f25906j;

    public C10757c(Context context) {
        super(context);
        this.f25906j = new ScaleGestureDetector(context, new a());
    }

    @Override // p306q8.AbstractC10756b, p306q8.AbstractC10755a, p306q8.InterfaceC10758d
    /* renamed from: a */
    public boolean mo22849a(MotionEvent motionEvent) {
        try {
            this.f25906j.onTouchEvent(motionEvent);
            return super.mo22849a(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    @Override // p306q8.InterfaceC10758d
    /* renamed from: d */
    public boolean mo22854d() {
        return this.f25906j.isInProgress();
    }

    /* renamed from: q8.c$a */
    public class a implements ScaleGestureDetector.OnScaleGestureListener {
        public a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            C10757c.this.f25897a.mo12821b(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }
}
