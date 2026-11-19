package p097g3;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: g3.c */
/* loaded from: classes4.dex */
public class C7517c extends AbstractC7516b {

    /* renamed from: j */
    public final ScaleGestureDetector f12381j;

    public C7517c(Context context) {
        super(context);
        this.f12381j = new ScaleGestureDetector(context, new a());
    }

    @Override // p097g3.AbstractC7516b, p097g3.AbstractC7515a, p097g3.InterfaceC7518d
    /* renamed from: a */
    public boolean mo12229a(MotionEvent motionEvent) {
        try {
            this.f12381j.onTouchEvent(motionEvent);
            return super.mo12229a(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    @Override // p097g3.InterfaceC7518d
    /* renamed from: d */
    public boolean mo12234d() {
        return this.f12381j.isInProgress();
    }

    /* renamed from: g3.c$a */
    public class a implements ScaleGestureDetector.OnScaleGestureListener {
        public a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            C7517c.this.f12372a.mo5734b(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
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
