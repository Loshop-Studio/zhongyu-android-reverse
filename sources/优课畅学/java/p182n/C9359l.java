package p182n;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: n.l */
/* loaded from: classes3.dex */
public class C9359l {

    /* renamed from: a */
    public boolean f18494a;

    /* renamed from: b */
    public final Handler f18495b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: n.l$a */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((InterfaceC9357j) message.obj).recycle();
            return true;
        }
    }

    /* renamed from: a */
    public synchronized void m17242a(InterfaceC9357j interfaceC9357j, boolean z10) {
        try {
            if (this.f18494a || z10) {
                this.f18495b.obtainMessage(1, interfaceC9357j).sendToTarget();
            } else {
                this.f18494a = true;
                interfaceC9357j.recycle();
                this.f18494a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
