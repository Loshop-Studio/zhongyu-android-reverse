package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.media.C0539c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media.d */
/* loaded from: classes.dex */
class C0540d {

    /* renamed from: a */
    static Field f3578a;

    /* renamed from: androidx.media.d$a */
    static class a extends C0539c.a {
        a(Context context, c cVar) {
            super(context, cVar);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            ((c) this.f3576a).mo2964c(str, new b(result), bundle);
        }
    }

    /* renamed from: androidx.media.d$b */
    static class b {

        /* renamed from: a */
        MediaBrowserService.Result f3579a;

        b(MediaBrowserService.Result result) {
            this.f3579a = result;
        }

        /* renamed from: a */
        List<MediaBrowser.MediaItem> m2992a(List<Parcel> list) {
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

        /* renamed from: b */
        public void m2993b(List<Parcel> list, int i4) throws IllegalAccessException, IllegalArgumentException {
            try {
                C0540d.f3578a.setInt(this.f3579a, i4);
            } catch (IllegalAccessException e4) {
                Log.w("MBSCompatApi26", e4);
            }
            this.f3579a.sendResult(m2992a(list));
        }
    }

    /* renamed from: androidx.media.d$c */
    public interface c extends C0539c.b {
        /* renamed from: c */
        void mo2964c(String str, b bVar, Bundle bundle);
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            f3578a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e4) {
            Log.w("MBSCompatApi26", e4);
        }
    }

    /* renamed from: a */
    public static Object m2991a(Context context, c cVar) {
        return new a(context, cVar);
    }
}
