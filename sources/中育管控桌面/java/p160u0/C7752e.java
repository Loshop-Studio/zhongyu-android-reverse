package p160u0;

import android.content.Context;
import android.util.Log;
import androidx.core.content.ContextCompat;
import p160u0.InterfaceC7749b;

/* renamed from: u0.e */
/* loaded from: classes3.dex */
public class C7752e implements InterfaceC7750c {
    @Override // p160u0.InterfaceC7750c
    /* renamed from: a */
    public InterfaceC7749b mo9259a(Context context, InterfaceC7749b.a aVar) {
        boolean z6 = ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        return z6 ? new C7751d(context, aVar) : new C7761n();
    }
}
