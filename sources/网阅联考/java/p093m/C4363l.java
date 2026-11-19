package p093m;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: m.l */
/* loaded from: classes2.dex */
public class C4363l {

    /* renamed from: a */
    public boolean f4895a;

    /* renamed from: b */
    public final Handler f4896b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: m.l$a */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((InterfaceC4361j) message.obj).recycle();
            return true;
        }
    }

    /* renamed from: a */
    public synchronized void m5380a(InterfaceC4361j interfaceC4361j, boolean z3) {
        if (this.f4895a || z3) {
            this.f4896b.obtainMessage(1, interfaceC4361j).sendToTarget();
        } else {
            this.f4895a = true;
            interfaceC4361j.recycle();
            this.f4895a = false;
        }
    }
}
