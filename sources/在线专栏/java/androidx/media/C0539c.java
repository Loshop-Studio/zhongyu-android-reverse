package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import androidx.media.C0538b;

/* renamed from: androidx.media.c */
/* loaded from: classes.dex */
class C0539c {

    /* renamed from: androidx.media.c$a */
    static class a extends C0538b.b {
        a(Context context, b bVar) {
            super(context, bVar);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
            ((b) this.f3576a).mo2962b(str, new C0538b.c<>(result));
        }
    }

    /* renamed from: androidx.media.c$b */
    public interface b extends C0538b.d {
        /* renamed from: b */
        void mo2962b(String str, C0538b.c<Parcel> cVar);
    }

    /* renamed from: a */
    public static Object m2990a(Context context, b bVar) {
        return new a(context, bVar);
    }
}
