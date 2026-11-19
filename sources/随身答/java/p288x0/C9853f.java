package p288x0;

import android.content.Context;
import android.util.Log;
import androidx.core.content.ContextCompat;
import p288x0.InterfaceC9850c;

/* renamed from: x0.f */
/* loaded from: classes3.dex */
public class C9853f implements InterfaceC9851d {
    @Override // p288x0.InterfaceC9851d
    /* renamed from: a */
    public InterfaceC9850c mo16791a(Context context, InterfaceC9850c.a aVar) {
        boolean z9 = ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        return z9 ? new C9852e(context, aVar) : new C9857j();
    }
}
