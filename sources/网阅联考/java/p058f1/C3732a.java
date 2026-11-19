package p058f1;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;

/* renamed from: f1.a */
/* loaded from: classes2.dex */
public final class C3732a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final WheelView f4358a;

    public C3732a(WheelView wheelView) {
        this.f4358a = wheelView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f4, float f5) {
        this.f4358a.m4498h(f5);
        return true;
    }
}
