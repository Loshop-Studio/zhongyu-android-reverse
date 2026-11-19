package p196o2;

import android.os.Handler;
import android.os.Message;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;

/* renamed from: o2.b */
/* loaded from: classes4.dex */
public final class HandlerC9513b extends Handler {

    /* renamed from: a */
    public final WheelView f18892a;

    public HandlerC9513b(WheelView wheelView) {
        this.f18892a = wheelView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1000) {
            this.f18892a.invalidate();
        } else if (i10 == 2000) {
            this.f18892a.m7052i(WheelView.ACTION.FLING);
        } else {
            if (i10 != 3000) {
                return;
            }
            this.f18892a.m7050f();
        }
    }
}
