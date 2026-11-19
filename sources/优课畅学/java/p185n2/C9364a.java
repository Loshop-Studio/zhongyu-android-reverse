package p185n2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;

/* renamed from: n2.a */
/* loaded from: classes4.dex */
public final class C9364a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final WheelView f18500a;

    public C9364a(WheelView wheelView) {
        this.f18500a = wheelView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f18500a.m7051h(f11);
        return true;
    }
}
