package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import androidx.core.app.BundleCompat;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
/* loaded from: classes.dex */
class ResultReceiverC0042x50fd9e4a extends ResultReceiver {

    /* renamed from: a */
    public WeakReference f101a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        InterfaceC0045c interfaceC0045c;
        C0047e c0047e = (C0047e) this.f101a.get();
        if (c0047e == null || bundle == null) {
            return;
        }
        synchronized (c0047e.f131b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = c0047e.f134e;
            IBinder binder = BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER");
            int i8 = AbstractBinderC0044b.f128c;
            if (binder == null) {
                interfaceC0045c = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0045c)) {
                    C0043a c0043a = new C0043a();
                    c0043a.f127c = binder;
                    interfaceC0045c = c0043a;
                } else {
                    interfaceC0045c = (InterfaceC0045c) iInterfaceQueryLocalInterface;
                }
            }
            mediaSessionCompat$Token.f106b = interfaceC0045c;
            MediaSessionCompat$Token mediaSessionCompat$Token2 = c0047e.f134e;
            bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
            mediaSessionCompat$Token2.getClass();
            c0047e.m133a();
        }
    }
}
