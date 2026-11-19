package p001a0;

import android.content.Context;
import android.util.Log;
import androidx.core.content.ContextCompat;
import p001a0.InterfaceC0002b;

/* renamed from: a0.e */
/* loaded from: classes3.dex */
public class C0005e implements InterfaceC0003c {
    @Override // p001a0.InterfaceC0003c
    /* renamed from: a */
    public InterfaceC0002b mo3a(Context context, InterfaceC0002b.a aVar) {
        boolean z10 = ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        return z10 ? new C0004d(context, aVar) : new C0014n();
    }
}
