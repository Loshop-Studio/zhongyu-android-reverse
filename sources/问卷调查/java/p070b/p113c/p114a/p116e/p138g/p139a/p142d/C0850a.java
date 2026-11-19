package p070b.p113c.p114a.p116e.p138g.p139a.p142d;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.concurrent.TimeUnit;
import p070b.p113c.p114a.p116e.p138g.p139a.p143e.C0852a;

/* renamed from: b.c.a.e.g.a.d.a */
/* loaded from: classes.dex */
public final class C0850a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final WheelView f4632a;

    public C0850a(WheelView wheelView) {
        this.f4632a = wheelView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        WheelView wheelView = this.f4632a;
        wheelView.m2774a();
        wheelView.f5340j = wheelView.f5339i.scheduleWithFixedDelay(new C0852a(wheelView, f3), 0L, 5L, TimeUnit.MILLISECONDS);
        return true;
    }
}
