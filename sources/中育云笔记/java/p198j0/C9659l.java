package p198j0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: j0.l */
/* loaded from: classes3.dex */
public class C9659l {

    /* renamed from: a */
    public boolean f22385a;

    /* renamed from: b */
    public final Handler f22386b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: j0.l$a */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((InterfaceC9657j) message.obj).recycle();
            return true;
        }
    }

    /* renamed from: a */
    public synchronized void m19060a(InterfaceC9657j interfaceC9657j, boolean z10) {
        try {
            if (this.f22385a || z10) {
                this.f22386b.obtainMessage(1, interfaceC9657j).sendToTarget();
            } else {
                this.f22385a = true;
                interfaceC9657j.recycle();
                this.f22385a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
