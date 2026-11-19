package p327s;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import p338t.AbstractC11197e;

/* renamed from: s.d */
/* loaded from: classes3.dex */
public abstract class AbstractC11011d {
    /* renamed from: a */
    public static final InterfaceC11009b m24328a(Context context) {
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(applicationContext, ConnectivityManager.class);
        if (connectivityManager == null || !AbstractC11197e.m24907b(applicationContext, "android.permission.ACCESS_NETWORK_STATE")) {
            return InterfaceC11009b.f26581b;
        }
        try {
            return new C11010c(connectivityManager);
        } catch (Exception unused) {
            return InterfaceC11009b.f26581b;
        }
    }
}
