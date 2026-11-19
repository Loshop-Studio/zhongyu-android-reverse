package p171m;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C5391b;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5408g;
import com.bumptech.glide.load.data.InterfaceC5405d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: m.c */
/* loaded from: classes3.dex */
public class C9288c implements InterfaceC5405d {

    /* renamed from: a */
    public final Uri f18300a;

    /* renamed from: b */
    public final C9290e f18301b;

    /* renamed from: c */
    public InputStream f18302c;

    /* renamed from: m.c$a */
    public static class a implements InterfaceC9289d {

        /* renamed from: b */
        public static final String[] f18303b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f18304a;

        public a(ContentResolver contentResolver) {
            this.f18304a = contentResolver;
        }

        @Override // p171m.InterfaceC9289d
        /* renamed from: a */
        public Cursor mo17090a(Uri uri) {
            return this.f18304a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f18303b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* renamed from: m.c$b */
    public static class b implements InterfaceC9289d {

        /* renamed from: b */
        public static final String[] f18305b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f18306a;

        public b(ContentResolver contentResolver) {
            this.f18306a = contentResolver;
        }

        @Override // p171m.InterfaceC9289d
        /* renamed from: a */
        public Cursor mo17090a(Uri uri) {
            return this.f18306a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f18305b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public C9288c(Uri uri, C9290e c9290e) {
        this.f18300a = uri;
        this.f18301b = c9290e;
    }

    /* renamed from: c */
    public static C9288c m17086c(Context context, Uri uri, InterfaceC9289d interfaceC9289d) {
        return new C9288c(uri, new C9290e(ComponentCallbacks2C5391b.m2732c(context).m2747j().m2719g(), interfaceC9289d, ComponentCallbacks2C5391b.m2732c(context).m2742e(), context.getContentResolver()));
    }

    /* renamed from: e */
    public static C9288c m17087e(Context context, Uri uri) {
        return m17086c(context, uri, new a(context.getContentResolver()));
    }

    /* renamed from: f */
    public static C9288c m17088f(Context context, Uri uri) {
        return m17086c(context, uri, new b(context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    /* renamed from: a */
    public Class mo2846a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    /* renamed from: b */
    public void mo2851b() throws IOException {
        InputStream inputStream = this.f18302c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    /* renamed from: d */
    public void mo2853d(Priority priority, InterfaceC5405d.a aVar) throws Throwable {
        try {
            InputStream inputStreamM17089g = m17089g();
            this.f18302c = inputStreamM17089g;
            aVar.mo2859e(inputStreamM17089g);
        } catch (FileNotFoundException e10) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.mo2858c(e10);
        }
    }

    /* renamed from: g */
    public final InputStream m17089g() throws Throwable {
        InputStream inputStreamM17094d = this.f18301b.m17094d(this.f18300a);
        int iM17091a = inputStreamM17094d != null ? this.f18301b.m17091a(this.f18300a) : -1;
        return iM17091a != -1 ? new C5408g(inputStreamM17094d, iM17091a) : inputStreamM17094d;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    public void cancel() {
    }
}
