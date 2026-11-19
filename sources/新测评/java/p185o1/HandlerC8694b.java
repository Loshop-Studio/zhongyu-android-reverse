package p185o1;

import android.os.Handler;
import android.os.Message;
import com.contrarywind.view.WheelView;

/* renamed from: o1.b */
/* loaded from: classes3.dex */
public final class HandlerC8694b extends Handler {

    /* renamed from: a */
    public final WheelView f14457a;

    public HandlerC8694b(WheelView wheelView) {
        this.f14457a = wheelView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1000) {
            this.f14457a.invalidate();
        } else if (i10 == 2000) {
            this.f14457a.m3999i(WheelView.ACTION.FLING);
        } else {
            if (i10 != 3000) {
                return;
            }
            this.f14457a.m3996f();
        }
    }
}
