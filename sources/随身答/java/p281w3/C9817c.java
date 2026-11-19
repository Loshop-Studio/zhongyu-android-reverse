package p281w3;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: w3.c */
/* loaded from: classes4.dex */
public class C9817c extends AbstractC9816b {

    /* renamed from: j */
    public final ScaleGestureDetector f17493j;

    public C9817c(Context context) {
        super(context);
        this.f17493j = new ScaleGestureDetector(context, new a());
    }

    @Override // p281w3.AbstractC9816b, p281w3.AbstractC9815a, p281w3.InterfaceC9818d
    /* renamed from: a */
    public boolean mo16675a(MotionEvent motionEvent) {
        try {
            this.f17493j.onTouchEvent(motionEvent);
            return super.mo16675a(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    @Override // p281w3.InterfaceC9818d
    /* renamed from: d */
    public boolean mo16680d() {
        return this.f17493j.isInProgress();
    }

    /* renamed from: w3.c$a */
    public class a implements ScaleGestureDetector.OnScaleGestureListener {
        public a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            C9817c.this.f17484a.mo6840b(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
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
