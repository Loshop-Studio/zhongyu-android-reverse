package p134q2;

import android.os.Handler;
import android.os.Message;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;

/* renamed from: q2.b */
/* loaded from: classes3.dex */
public final class HandlerC7622b extends Handler {

    /* renamed from: a */
    public final WheelView f10083a;

    public HandlerC7622b(WheelView wheelView) {
        this.f10083a = wheelView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i6 = message.what;
        if (i6 == 1000) {
            this.f10083a.invalidate();
        } else if (i6 == 2000) {
            this.f10083a.m4877i(WheelView.ACTION.FLING);
        } else {
            if (i6 != 3000) {
                return;
            }
            this.f10083a.m4875f();
        }
    }
}
