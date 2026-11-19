package p184o0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: o0.l */
/* loaded from: classes3.dex */
public class C8692l {

    /* renamed from: a */
    public boolean f14452a;

    /* renamed from: b */
    public final Handler f14453b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: o0.l$a */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((InterfaceC8690j) message.obj).recycle();
            return true;
        }
    }

    /* renamed from: a */
    public synchronized void m14296a(InterfaceC8690j interfaceC8690j, boolean z9) {
        try {
            if (this.f14452a || z9) {
                this.f14453b.obtainMessage(1, interfaceC8690j).sendToTarget();
            } else {
                this.f14452a = true;
                interfaceC8690j.recycle();
                this.f14452a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
