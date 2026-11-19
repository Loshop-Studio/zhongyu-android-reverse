package p070b.p113c.p114a.p116e.p138g.p139a.p143e;

import android.os.Handler;
import android.os.Message;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import p070b.p113c.p114a.p116e.p138g.p139a.RunnableC0847a;

/* renamed from: b.c.a.e.g.a.e.b */
/* loaded from: classes.dex */
public final class HandlerC0853b extends Handler {

    /* renamed from: a */
    public final WheelView f4636a;

    public HandlerC0853b(WheelView wheelView) {
        this.f4636a = wheelView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1000) {
            this.f4636a.invalidate();
            return;
        }
        if (i == 2000) {
            this.f4636a.m2779f(WheelView.EnumC0977a.FLING);
        } else {
            if (i != 3000) {
                return;
            }
            WheelView wheelView = this.f4636a;
            if (wheelView.f5336f != null) {
                wheelView.postDelayed(new RunnableC0847a(wheelView), 200L);
            }
        }
    }
}
