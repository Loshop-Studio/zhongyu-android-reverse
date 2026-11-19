package p105f4;

import android.os.Handler;
import android.os.Message;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;

/* renamed from: f4.b */
/* loaded from: classes4.dex */
public final class HandlerC7921b extends Handler {

    /* renamed from: a */
    public final WheelView f13347a;

    public HandlerC7921b(WheelView wheelView) {
        this.f13347a = wheelView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i9 = message.what;
        if (i9 == 1000) {
            this.f13347a.invalidate();
        } else if (i9 == 2000) {
            this.f13347a.m6965r(WheelView.ACTION.FLING);
        } else {
            if (i9 != 3000) {
                return;
            }
            this.f13347a.m6962n();
        }
    }
}
