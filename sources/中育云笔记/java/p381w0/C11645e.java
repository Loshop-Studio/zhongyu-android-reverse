package p381w0;

import android.content.Context;
import android.util.Log;
import androidx.core.content.ContextCompat;
import p381w0.InterfaceC11642b;

/* renamed from: w0.e */
/* loaded from: classes3.dex */
public class C11645e implements InterfaceC11643c {
    @Override // p381w0.InterfaceC11643c
    /* renamed from: a */
    public InterfaceC11642b mo25760a(Context context, InterfaceC11642b.a aVar) {
        boolean z10 = ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        return z10 ? new C11644d(context, aVar) : new C11654n();
    }
}
