package androidx.core.view;

import android.view.MotionEvent;

/* renamed from: androidx.core.view.j */
/* loaded from: classes.dex */
public final class C0347j {
    @Deprecated
    /* renamed from: a */
    public static int m1947a(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    /* renamed from: b */
    public static boolean m1948b(MotionEvent motionEvent, int i4) {
        return (motionEvent.getSource() & i4) == i4;
    }
}
