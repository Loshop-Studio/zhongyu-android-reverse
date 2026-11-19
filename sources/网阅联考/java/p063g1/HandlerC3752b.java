package p063g1;

import android.os.Handler;
import android.os.Message;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;

/* renamed from: g1.b */
/* loaded from: classes2.dex */
public final class HandlerC3752b extends Handler {

    /* renamed from: a */
    public final WheelView f4402a;

    public HandlerC3752b(WheelView wheelView) {
        this.f4402a = wheelView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 1000) {
            this.f4402a.invalidate();
        } else if (i4 == 2000) {
            this.f4402a.m4499i(WheelView.ACTION.FLING);
        } else {
            if (i4 != 3000) {
                return;
            }
            this.f4402a.m4496f();
        }
    }
}
