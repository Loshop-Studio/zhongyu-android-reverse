package p094e4;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;

/* renamed from: e4.a */
/* loaded from: classes4.dex */
public final class C7844a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final WheelView f13182a;

    public C7844a(WheelView wheelView) {
        this.f13182a = wheelView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f13182a.m6964q(f11);
        return true;
    }
}
