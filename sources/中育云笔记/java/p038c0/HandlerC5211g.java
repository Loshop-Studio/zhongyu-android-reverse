package p038c0;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;

/* renamed from: c0.g */
/* loaded from: classes3.dex */
public class HandlerC5211g extends Handler {

    /* renamed from: a */
    public final /* synthetic */ AbstractServiceC5205a f3079a;

    public HandlerC5211g(AbstractServiceC5205a abstractServiceC5205a) {
        this.f3079a = abstractServiceC5205a;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Intent intent;
        if (message == null || (intent = (Intent) message.getData().getParcelable("intent")) == null) {
            return;
        }
        this.f3079a.onStartCommand(intent, 0, 0);
    }
}
