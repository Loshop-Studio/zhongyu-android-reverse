package p035b9;

import android.os.Handler;
import android.os.Message;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;

/* renamed from: b9.b */
/* loaded from: classes5.dex */
public final class HandlerC5177b extends Handler {

    /* renamed from: a */
    public final WheelView f3040a;

    public HandlerC5177b(WheelView wheelView) {
        this.f3040a = wheelView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1000) {
            this.f3040a.invalidate();
        } else if (i10 == 2000) {
            this.f3040a.m13024i(WheelView.ACTION.FLING);
        } else {
            if (i10 != 3000) {
                return;
            }
            this.f3040a.m13022f();
        }
    }
}
