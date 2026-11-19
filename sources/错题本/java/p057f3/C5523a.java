package p057f3;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.util.concurrent.TimeUnit;
import p065g3.C5600a;
import p148r2.ViewOnTouchListenerC6457k;

/* renamed from: f3.a */
/* loaded from: classes3.dex */
public final class C5523a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final /* synthetic */ int f8558a = 0;

    /* renamed from: b */
    public final Object f8559b;

    public C5523a(WheelView wheelView) {
        this.f8559b = wheelView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f7) {
        switch (this.f8558a) {
            case 0:
                WheelView wheelView = (WheelView) this.f8559b;
                wheelView.m3535a();
                wheelView.f4594e = wheelView.f4593d.scheduleWithFixedDelay(new C5600a(wheelView, f7), 0L, 5L, TimeUnit.MILLISECONDS);
                return true;
            default:
                ((ViewOnTouchListenerC6457k) this.f8559b).getClass();
                return false;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        switch (this.f8558a) {
            case 1:
                ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = (ViewOnTouchListenerC6457k) this.f8559b;
                if (viewOnTouchListenerC6457k.f10615q != null && viewOnTouchListenerC6457k.m6117g().getY() == 0.0f && viewOnTouchListenerC6457k.m6117g().getX() == 0.0f) {
                    viewOnTouchListenerC6457k.f10615q.onLongClick(viewOnTouchListenerC6457k.m6117g());
                    break;
                }
                break;
            default:
                super.onLongPress(motionEvent);
                break;
        }
    }

    public C5523a(ViewOnTouchListenerC6457k viewOnTouchListenerC6457k) {
        this.f8559b = viewOnTouchListenerC6457k;
    }
}
