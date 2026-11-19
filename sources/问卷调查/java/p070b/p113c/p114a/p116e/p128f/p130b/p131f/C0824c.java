package p070b.p113c.p114a.p116e.p128f.p130b.p131f;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import p070b.p113c.p114a.p116e.p128f.p130b.ViewOnTouchListenerC0821e;

@TargetApi(8)
/* renamed from: b.c.a.e.f.b.f.c */
/* loaded from: classes.dex */
public class C0824c extends C0823b {

    /* renamed from: j */
    public final ScaleGestureDetector f4604j;

    /* renamed from: b.c.a.e.f.b.f.c$a */
    public class a implements ScaleGestureDetector.OnScaleGestureListener {
        public a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            ((ViewOnTouchListenerC0821e) C0824c.this.f4595a).m2533m(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
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

    public C0824c(Context context) {
        super(context);
        this.f4604j = new ScaleGestureDetector(context, new a());
    }

    @Override // p070b.p113c.p114a.p116e.p128f.p130b.p131f.C0822a
    /* renamed from: c */
    public boolean mo2544c() {
        return this.f4604j.isInProgress();
    }

    @Override // p070b.p113c.p114a.p116e.p128f.p130b.p131f.C0823b, p070b.p113c.p114a.p116e.p128f.p130b.p131f.C0822a
    /* renamed from: d */
    public boolean mo2545d(MotionEvent motionEvent) {
        try {
            this.f4604j.onTouchEvent(motionEvent);
            super.mo2545d(motionEvent);
            return true;
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }
}
