package p016b0;

import android.os.Handler;
import android.os.Message;

/* renamed from: b0.j0 */
/* loaded from: classes2.dex */
public final class C3078j0 implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ int f1460a;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f1460a) {
            case 0:
                if (message.what != 1) {
                    return false;
                }
                ((InterfaceC3072g0) message.obj).recycle();
                return true;
            case 1:
                if (message.what != 1000) {
                    return false;
                }
                throw null;
            default:
                if (message.what != 1000) {
                    return false;
                }
                throw null;
        }
    }
}
