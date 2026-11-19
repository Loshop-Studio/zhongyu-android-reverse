package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: android.support.v4.media.session.e */
/* loaded from: classes.dex */
public final class C0047e {

    /* renamed from: a */
    public final MediaController f130a;

    /* renamed from: b */
    public final Object f131b = new Object();

    /* renamed from: c */
    public final ArrayList f132c = new ArrayList();

    /* renamed from: d */
    public final HashMap f133d = new HashMap();

    /* renamed from: e */
    public final MediaSessionCompat$Token f134e;

    public C0047e(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f134e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.f105a);
        this.f130a = mediaController;
        if (mediaSessionCompat$Token.f106b == null) {
            ResultReceiverC0042x50fd9e4a resultReceiverC0042x50fd9e4a = new ResultReceiverC0042x50fd9e4a(null);
            resultReceiverC0042x50fd9e4a.f101a = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, resultReceiverC0042x50fd9e4a);
        }
    }

    /* renamed from: a */
    public final void m133a() {
        if (this.f134e.f106b == null) {
            return;
        }
        ArrayList arrayList = this.f132c;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            this.f133d.put(null, new BinderC0046d());
            throw null;
        }
    }
}
