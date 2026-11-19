package android.support.v4.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.session.AbstractBinderC0044b;
import android.support.v4.media.session.C0043a;
import android.support.v4.media.session.InterfaceC0045c;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import androidx.core.app.BundleCompat;
import androidx.media.MediaBrowserProtocol;
import java.lang.ref.WeakReference;
import p129o2.C6268a;

/* renamed from: android.support.v4.media.j */
/* loaded from: classes.dex */
public final class C0041j extends MediaBrowser.ConnectionCallback {

    /* renamed from: a */
    public final C6268a f100a;

    public C0041j(C6268a c6268a) {
        this.f100a = c6268a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        InterfaceC0045c interfaceC0045c;
        AbstractC0034c abstractC0034c = (AbstractC0034c) this.f100a.f10022b;
        InterfaceC0033b interfaceC0033b = abstractC0034c.mConnectionCallbackInternal;
        if (interfaceC0033b != null) {
            C0035d c0035d = (C0035d) interfaceC0033b;
            HandlerC0032a handlerC0032a = c0035d.f89d;
            MediaBrowser mediaBrowser = c0035d.f87b;
            Bundle extras = mediaBrowser.getExtras();
            if (extras != null) {
                int i = 0;
                Object[] objArr = 0;
                extras.getInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
                IBinder binder = BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
                if (binder != null) {
                    Bundle bundle = c0035d.f88c;
                    C0039h c0039h = new C0039h(i, (boolean) (objArr == true ? 1 : 0));
                    c0039h.f96b = new Messenger(binder);
                    c0039h.f97c = bundle;
                    c0035d.f91f = c0039h;
                    Messenger messenger = new Messenger(handlerC0032a);
                    c0035d.f92g = messenger;
                    handlerC0032a.getClass();
                    handlerC0032a.f85b = new WeakReference(messenger);
                    try {
                        C0039h c0039h2 = c0035d.f91f;
                        Context context = c0035d.f86a;
                        Messenger messenger2 = c0035d.f92g;
                        c0039h2.getClass();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
                        bundle2.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, (Bundle) c0039h2.f97c);
                        c0039h2.m105C(6, bundle2, messenger2);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                IBinder binder2 = BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_SESSION_BINDER);
                int i8 = AbstractBinderC0044b.f128c;
                if (binder2 == null) {
                    interfaceC0045c = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0045c)) {
                        C0043a c0043a = new C0043a();
                        c0043a.f127c = binder2;
                        interfaceC0045c = c0043a;
                    } else {
                        interfaceC0045c = (InterfaceC0045c) iInterfaceQueryLocalInterface;
                    }
                }
                if (interfaceC0045c != null) {
                    c0035d.f93h = MediaSessionCompat$Token.m132a(mediaBrowser.getSessionToken(), interfaceC0045c);
                }
            }
        }
        abstractC0034c.onConnected();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        AbstractC0034c abstractC0034c = (AbstractC0034c) this.f100a.f10022b;
        InterfaceC0033b interfaceC0033b = abstractC0034c.mConnectionCallbackInternal;
        abstractC0034c.onConnectionFailed();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        AbstractC0034c abstractC0034c = (AbstractC0034c) this.f100a.f10022b;
        InterfaceC0033b interfaceC0033b = abstractC0034c.mConnectionCallbackInternal;
        if (interfaceC0033b != null) {
            C0035d c0035d = (C0035d) interfaceC0033b;
            c0035d.f91f = null;
            c0035d.f92g = null;
            c0035d.f93h = null;
            HandlerC0032a handlerC0032a = c0035d.f89d;
            handlerC0032a.getClass();
            handlerC0032a.f85b = new WeakReference(null);
        }
        abstractC0034c.onConnectionSuspended();
    }
}
