package p198p3;

import android.os.Handler;
import android.os.Message;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;

/* renamed from: p3.b */
/* loaded from: classes4.dex */
public final class HandlerC8821b extends Handler {

    /* renamed from: a */
    public final WheelView f14999a;

    public HandlerC8821b(WheelView wheelView) {
        this.f14999a = wheelView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1000) {
            this.f14999a.invalidate();
        } else if (i10 == 2000) {
            this.f14999a.m5867r(WheelView.ACTION.FLING);
        } else {
            if (i10 != 3000) {
                return;
            }
            this.f14999a.m5864n();
        }
    }
}
