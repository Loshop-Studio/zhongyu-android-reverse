package p060g0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C4678c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C4695g;
import com.bumptech.glide.load.data.InterfaceC4692d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: g0.c */
/* loaded from: classes3.dex */
public class C6391c implements InterfaceC4692d {

    /* renamed from: a */
    public final Uri f8010a;

    /* renamed from: b */
    public final C6393e f8011b;

    /* renamed from: c */
    public InputStream f8012c;

    /* renamed from: g0.c$a */
    public static class a implements InterfaceC6392d {

        /* renamed from: b */
        public static final String[] f8013b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f8014a;

        public a(ContentResolver contentResolver) {
            this.f8014a = contentResolver;
        }

        @Override // p060g0.InterfaceC6392d
        /* renamed from: a */
        public Cursor mo6908a(Uri uri) {
            return this.f8014a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f8013b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* renamed from: g0.c$b */
    public static class b implements InterfaceC6392d {

        /* renamed from: b */
        public static final String[] f8015b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f8016a;

        public b(ContentResolver contentResolver) {
            this.f8016a = contentResolver;
        }

        @Override // p060g0.InterfaceC6392d
        /* renamed from: a */
        public Cursor mo6908a(Uri uri) {
            return this.f8016a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f8015b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public C6391c(Uri uri, C6393e c6393e) {
        this.f8010a = uri;
        this.f8011b = c6393e;
    }

    /* renamed from: c */
    public static C6391c m6904c(Context context, Uri uri, InterfaceC6392d interfaceC6392d) {
        return new C6391c(uri, new C6393e(ComponentCallbacks2C4678c.m2470c(context).m2485j().m2456g(), interfaceC6392d, ComponentCallbacks2C4678c.m2470c(context).m2480e(), context.getContentResolver()));
    }

    /* renamed from: f */
    public static C6391c m6905f(Context context, Uri uri) {
        return m6904c(context, uri, new a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static C6391c m6906g(Context context, Uri uri) {
        return m6904c(context, uri, new b(context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d
    /* renamed from: a */
    public Class mo2580a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d
    /* renamed from: b */
    public void mo2585b() throws IOException {
        InputStream inputStream = this.f8012c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d
    /* renamed from: d */
    public DataSource mo2587d() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d
    /* renamed from: e */
    public void mo2588e(Priority priority, InterfaceC4692d.a aVar) throws Throwable {
        try {
            InputStream inputStreamM6907h = m6907h();
            this.f8012c = inputStreamM6907h;
            aVar.mo2594f(inputStreamM6907h);
        } catch (FileNotFoundException e6) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.mo2593c(e6);
        }
    }

    /* renamed from: h */
    public final InputStream m6907h() throws Throwable {
        InputStream inputStreamM6912d = this.f8011b.m6912d(this.f8010a);
        int iM6909a = inputStreamM6912d != null ? this.f8011b.m6909a(this.f8010a) : -1;
        return iM6909a != -1 ? new C4695g(inputStreamM6912d, iM6909a) : inputStreamM6912d;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d
    public void cancel() {
    }
}
