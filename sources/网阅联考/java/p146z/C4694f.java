package p146z;

import android.content.Context;
import android.util.Log;
import androidx.core.content.ContextCompat;
import p146z.InterfaceC4691c;

/* renamed from: z.f */
/* loaded from: classes2.dex */
public class C4694f implements InterfaceC4692d {
    @Override // p146z.InterfaceC4692d
    /* renamed from: a */
    public InterfaceC4691c mo6658a(Context context, InterfaceC4691c.a aVar) {
        boolean z3 = ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        return z3 ? new C4693e(context, aVar) : new C4698j();
    }
}
