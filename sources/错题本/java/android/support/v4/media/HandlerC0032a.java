package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.session.AbstractC0048f;
import android.util.Log;
import androidx.media.MediaBrowserProtocol;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.media.a */
/* loaded from: classes.dex */
public final class HandlerC0032a extends Handler {

    /* renamed from: a */
    public final WeakReference f84a;

    /* renamed from: b */
    public WeakReference f85b;

    public HandlerC0032a(C0035d c0035d) {
        this.f84a = new WeakReference(c0035d);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.f85b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.f84a;
        if (weakReference2.get() == null) {
            return;
        }
        Bundle data = message.getData();
        AbstractC0048f.m134a(data);
        C0035d c0035d = (C0035d) weakReference2.get();
        Messenger messenger = (Messenger) this.f85b.get();
        try {
            int i = message.what;
            if (i == 1) {
                AbstractC0048f.m134a(data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS));
                data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID);
                c0035d.getClass();
                return;
            }
            if (i == 2) {
                c0035d.getClass();
                return;
            }
            if (i != 3) {
                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                return;
            }
            AbstractC0048f.m134a(data.getBundle(MediaBrowserProtocol.DATA_OPTIONS));
            AbstractC0048f.m134a(data.getBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS));
            String string = data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID);
            data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST);
            if (c0035d.f92g != messenger) {
                return;
            }
            if (c0035d.f90e.get(string) != null) {
                throw new ClassCastException();
            }
            if (C0040i.f98b) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaBrowserCompat", "Could not unparcel the data.");
            if (message.what == 1) {
                c0035d.getClass();
            }
        }
    }
}
