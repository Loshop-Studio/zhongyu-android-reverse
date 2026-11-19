package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.collection.ArrayMap;
import androidx.media.MediaBrowserProtocol;

/* renamed from: android.support.v4.media.d */
/* loaded from: classes.dex */
public class C0035d implements InterfaceC0033b {

    /* renamed from: a */
    public final Context f86a;

    /* renamed from: b */
    public final MediaBrowser f87b;

    /* renamed from: c */
    public final Bundle f88c;

    /* renamed from: d */
    public final HandlerC0032a f89d = new HandlerC0032a(this);

    /* renamed from: e */
    public final ArrayMap f90e = new ArrayMap();

    /* renamed from: f */
    public C0039h f91f;

    /* renamed from: g */
    public Messenger f92g;

    /* renamed from: h */
    public MediaSessionCompat$Token f93h;

    public C0035d(Context context, ComponentName componentName, AbstractC0034c abstractC0034c) {
        this.f86a = context;
        Bundle bundle = new Bundle();
        this.f88c = bundle;
        bundle.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
        abstractC0034c.setInternalConnectionCallback(this);
        this.f87b = new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) abstractC0034c.mConnectionCallbackObj, bundle);
    }
}
