package p184i0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C5810b;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5827g;
import com.bumptech.glide.load.data.InterfaceC5824d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: i0.c */
/* loaded from: classes3.dex */
public class C9559c implements InterfaceC5824d {

    /* renamed from: c */
    public final Uri f22060c;

    /* renamed from: d */
    public final C9561e f22061d;

    /* renamed from: e */
    public InputStream f22062e;

    /* renamed from: i0.c$a */
    public static class a implements InterfaceC9560d {

        /* renamed from: b */
        public static final String[] f22063b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f22064a;

        public a(ContentResolver contentResolver) {
            this.f22064a = contentResolver;
        }

        @Override // p184i0.InterfaceC9560d
        /* renamed from: a */
        public Cursor mo18801a(Uri uri) {
            return this.f22064a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f22063b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* renamed from: i0.c$b */
    public static class b implements InterfaceC9560d {

        /* renamed from: b */
        public static final String[] f22065b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f22066a;

        public b(ContentResolver contentResolver) {
            this.f22066a = contentResolver;
        }

        @Override // p184i0.InterfaceC9560d
        /* renamed from: a */
        public Cursor mo18801a(Uri uri) {
            return this.f22066a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f22065b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public C9559c(Uri uri, C9561e c9561e) {
        this.f22060c = uri;
        this.f22061d = c9561e;
    }

    /* renamed from: b */
    public static C9559c m18797b(Context context, Uri uri, InterfaceC9560d interfaceC9560d) {
        return new C9559c(uri, new C9561e(ComponentCallbacks2C5810b.m3940c(context).m3956j().m3927g(), interfaceC9560d, ComponentCallbacks2C5810b.m3940c(context).m3951e(), context.getContentResolver()));
    }

    /* renamed from: d */
    public static C9559c m18798d(Context context, Uri uri) {
        return m18797b(context, uri, new a(context.getContentResolver()));
    }

    /* renamed from: e */
    public static C9559c m18799e(Context context, Uri uri) {
        return m18797b(context, uri, new b(context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    /* renamed from: a */
    public Class mo4051a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    /* renamed from: c */
    public void mo4057c(Priority priority, InterfaceC5824d.a aVar) throws Throwable {
        try {
            InputStream inputStreamM18800f = m18800f();
            this.f22062e = inputStreamM18800f;
            aVar.mo4063d(inputStreamM18800f);
        } catch (FileNotFoundException e10) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.mo4062b(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    public void cleanup() throws IOException {
        InputStream inputStream = this.f22062e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: f */
    public final InputStream m18800f() throws Throwable {
        InputStream inputStreamM18805d = this.f22061d.m18805d(this.f22060c);
        int iM18802a = inputStreamM18805d != null ? this.f22061d.m18802a(this.f22060c) : -1;
        return iM18802a != -1 ? new C5827g(inputStreamM18805d, iM18802a) : inputStreamM18805d;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    public void cancel() {
    }
}
