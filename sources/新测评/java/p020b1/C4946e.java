package p020b1;

import android.content.Context;
import android.util.Log;
import androidx.core.content.ContextCompat;
import p020b1.InterfaceC4943b;

/* renamed from: b1.e */
/* loaded from: classes3.dex */
public class C4946e implements InterfaceC4944c {
    @Override // p020b1.InterfaceC4944c
    /* renamed from: a */
    public InterfaceC4943b mo2331a(Context context, InterfaceC4943b.a aVar) {
        boolean z9 = ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        return z9 ? new C4945d(context, aVar) : new C4955n();
    }
}
