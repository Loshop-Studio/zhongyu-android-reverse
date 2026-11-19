package androidx.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media.b */
/* loaded from: classes.dex */
class C0538b {

    /* renamed from: androidx.media.b$a */
    static class a {

        /* renamed from: a */
        final String f3574a;

        /* renamed from: b */
        final Bundle f3575b;
    }

    /* renamed from: androidx.media.b$b */
    static class b extends MediaBrowserService {

        /* renamed from: a */
        final d f3576a;

        b(Context context, d dVar) {
            attachBaseContext(context);
            this.f3576a = dVar;
        }

        @Override // android.service.media.MediaBrowserService
        public MediaBrowserService.BrowserRoot onGetRoot(String str, int i4, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            a aVarMo2960d = this.f3576a.mo2960d(str, i4, bundle == null ? null : new Bundle(bundle));
            if (aVarMo2960d == null) {
                return null;
            }
            return new MediaBrowserService.BrowserRoot(aVarMo2960d.f3574a, aVarMo2960d.f3575b);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
            this.f3576a.mo2959a(str, new c<>(result));
        }
    }

    /* renamed from: androidx.media.b$c */
    static class c<T> {

        /* renamed from: a */
        MediaBrowserService.Result f3577a;

        c(MediaBrowserService.Result result) {
            this.f3577a = result;
        }

        /* renamed from: a */
        List<MediaBrowser.MediaItem> m2988a(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m2989b(T t3) {
            if (t3 instanceof List) {
                this.f3577a.sendResult(m2988a((List) t3));
                return;
            }
            if (!(t3 instanceof Parcel)) {
                this.f3577a.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) t3;
            parcel.setDataPosition(0);
            this.f3577a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }
    }

    /* renamed from: androidx.media.b$d */
    public interface d {
        /* renamed from: a */
        void mo2959a(String str, c<List<Parcel>> cVar);

        /* renamed from: d */
        a mo2960d(String str, int i4, Bundle bundle);
    }

    /* renamed from: a */
    public static Object m2985a(Context context, d dVar) {
        return new b(context, dVar);
    }

    /* renamed from: b */
    public static IBinder m2986b(Object obj, Intent intent) {
        return ((MediaBrowserService) obj).onBind(intent);
    }

    /* renamed from: c */
    public static void m2987c(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }
}
