package p010a9;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;

/* renamed from: a9.a */
/* loaded from: classes5.dex */
public final class C0088a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: c */
    public final WheelView f76c;

    public C0088a(WheelView wheelView) {
        this.f76c = wheelView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f76c.m13023h(f11);
        return true;
    }
}
