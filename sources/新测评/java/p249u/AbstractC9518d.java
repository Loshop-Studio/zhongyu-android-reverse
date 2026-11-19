package p249u;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import p260v.AbstractC9626e;

/* renamed from: u.d */
/* loaded from: classes3.dex */
public abstract class AbstractC9518d {
    /* renamed from: a */
    public static final InterfaceC9516b m15880a(Context context) {
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(applicationContext, ConnectivityManager.class);
        if (connectivityManager == null || !AbstractC9626e.m15994b(applicationContext, "android.permission.ACCESS_NETWORK_STATE")) {
            return InterfaceC9516b.f16615b;
        }
        try {
            return new C9517c(connectivityManager);
        } catch (Exception unused) {
            return InterfaceC9516b.f16615b;
        }
    }
}
