package p175m1;

import android.os.Handler;
import android.os.Message;
import com.contrarywind.view.WheelView;

/* renamed from: m1.b */
/* loaded from: classes3.dex */
public final class HandlerC8950b extends Handler {

    /* renamed from: a */
    public final WheelView f15012a;

    public HandlerC8950b(WheelView wheelView) {
        this.f15012a = wheelView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i9 = message.what;
        if (i9 == 1000) {
            this.f15012a.invalidate();
        } else if (i9 == 2000) {
            this.f15012a.m4023i(WheelView.ACTION.FLING);
        } else {
            if (i9 != 3000) {
                return;
            }
            this.f15012a.m4020f();
        }
    }
}
