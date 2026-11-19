package p185x4;

import android.content.ComponentCallbacks2;
import android.content.Context;
import p164u4.AbstractC7773a;
import p199z4.AbstractC7950d;
import p199z4.InterfaceC7948b;

/* renamed from: x4.e */
/* loaded from: classes4.dex */
public abstract class AbstractC7860e {
    /* renamed from: a */
    public static Object m9535a(Context context) {
        ComponentCallbacks2 componentCallbacks2M9304a = AbstractC7773a.m9304a(context.getApplicationContext());
        AbstractC7950d.m9745a(componentCallbacks2M9304a instanceof InterfaceC7948b, "Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", componentCallbacks2M9304a.getClass());
        return ((InterfaceC7948b) componentCallbacks2M9304a).generatedComponent();
    }
}
