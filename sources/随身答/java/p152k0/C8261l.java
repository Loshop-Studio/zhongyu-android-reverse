package p152k0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: k0.l */
/* loaded from: classes3.dex */
public class C8261l {

    /* renamed from: a */
    public boolean f14353a;

    /* renamed from: b */
    public final Handler f14354b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: k0.l$a */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((InterfaceC8259j) message.obj).recycle();
            return true;
        }
    }

    /* renamed from: a */
    public synchronized void m13307a(InterfaceC8259j interfaceC8259j, boolean z9) {
        try {
            if (this.f14353a || z9) {
                this.f14354b.obtainMessage(1, interfaceC8259j).sendToTarget();
            } else {
                this.f14353a = true;
                interfaceC8259j.recycle();
                this.f14353a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
