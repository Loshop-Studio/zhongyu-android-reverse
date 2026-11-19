package p187o3;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;

/* renamed from: o3.a */
/* loaded from: classes4.dex */
public final class C8698a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final WheelView f14467a;

    public C8698a(WheelView wheelView) {
        this.f14467a = wheelView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f14467a.m5866q(f11);
        return true;
    }
}
