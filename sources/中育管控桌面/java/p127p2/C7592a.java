package p127p2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;

/* renamed from: p2.a */
/* loaded from: classes3.dex */
public final class C7592a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final WheelView f10053a;

    public C7592a(WheelView wheelView) {
        this.f10053a = wheelView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
        this.f10053a.m4876h(f7);
        return true;
    }
}
