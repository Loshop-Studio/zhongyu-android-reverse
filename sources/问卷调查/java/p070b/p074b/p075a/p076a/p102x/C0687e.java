package p070b.p074b.p075a.p076a.p102x;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* renamed from: b.b.a.a.x.e */
/* loaded from: classes.dex */
public class C0687e {

    /* renamed from: c */
    public static C0687e f4111c;

    /* renamed from: a */
    public final Object f4112a = new Object();

    /* renamed from: b */
    public final Handler f4113b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: b.b.a.a.x.e$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C0687e c0687e = C0687e.this;
            b bVar = (b) message.obj;
            synchronized (c0687e.f4112a) {
                if (bVar == null) {
                    Objects.requireNonNull(bVar);
                    throw null;
                }
            }
            return true;
        }
    }

    /* renamed from: b.b.a.a.x.e$b */
    public static class b {
    }
}
