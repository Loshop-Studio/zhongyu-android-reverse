package p067h0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: h0.l */
/* loaded from: classes3.dex */
public class C6442l {

    /* renamed from: a */
    public boolean f8142a;

    /* renamed from: b */
    public final Handler f8143b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: h0.l$a */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((InterfaceC6440j) message.obj).recycle();
            return true;
        }
    }

    /* renamed from: a */
    public synchronized void m7055a(InterfaceC6440j interfaceC6440j, boolean z6) {
        try {
            if (this.f8142a || z6) {
                this.f8143b.obtainMessage(1, interfaceC6440j).sendToTarget();
            } else {
                this.f8142a = true;
                interfaceC6440j.recycle();
                this.f8142a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
