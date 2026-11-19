package p344t5;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: t5.f */
/* loaded from: classes5.dex */
public class HandlerC11232f extends Handler {

    /* renamed from: a */
    public WeakReference f26943a;

    /* renamed from: t5.f$a */
    public interface a {
        /* renamed from: a */
        void mo24987a(Message message);
    }

    public HandlerC11232f(a aVar) {
        this.f26943a = new WeakReference(aVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        a aVar = (a) this.f26943a.get();
        if (aVar != null) {
            aVar.mo24987a(message);
        }
    }
}
