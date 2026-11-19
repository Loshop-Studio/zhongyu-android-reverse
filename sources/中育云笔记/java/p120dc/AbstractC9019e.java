package p120dc;

import ac.AbstractC0102a;
import android.content.ComponentCallbacks2;
import android.content.Context;
import p151fc.AbstractC9221d;
import p151fc.InterfaceC9219b;

/* renamed from: dc.e */
/* loaded from: classes6.dex */
public abstract class AbstractC9019e {
    /* renamed from: a */
    public static Object m17618a(Context context) {
        ComponentCallbacks2 componentCallbacks2M274a = AbstractC0102a.m274a(context.getApplicationContext());
        AbstractC9221d.m18137a(componentCallbacks2M274a instanceof InterfaceC9219b, "Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", componentCallbacks2M274a.getClass());
        return ((InterfaceC9219b) componentCallbacks2M274a).generatedComponent();
    }
}
