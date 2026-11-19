package p142j0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C5471b;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p132i0.C8118g;
import p132i0.InterfaceC8115d;

/* renamed from: j0.c */
/* loaded from: classes3.dex */
public class C8201c implements InterfaceC8115d {

    /* renamed from: a */
    public final Uri f14206a;

    /* renamed from: b */
    public final C8203e f14207b;

    /* renamed from: c */
    public InputStream f14208c;

    /* renamed from: j0.c$a */
    public static class a implements InterfaceC8202d {

        /* renamed from: b */
        public static final String[] f14209b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f14210a;

        public a(ContentResolver contentResolver) {
            this.f14210a = contentResolver;
        }

        @Override // p142j0.InterfaceC8202d
        /* renamed from: a */
        public Cursor mo13216a(Uri uri) {
            return this.f14210a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f14209b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* renamed from: j0.c$b */
    public static class b implements InterfaceC8202d {

        /* renamed from: b */
        public static final String[] f14211b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f14212a;

        public b(ContentResolver contentResolver) {
            this.f14212a = contentResolver;
        }

        @Override // p142j0.InterfaceC8202d
        /* renamed from: a */
        public Cursor mo13216a(Uri uri) {
            return this.f14212a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f14211b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public C8201c(Uri uri, C8203e c8203e) {
        this.f14206a = uri;
        this.f14207b = c8203e;
    }

    /* renamed from: c */
    public static C8201c m13212c(Context context, Uri uri, InterfaceC8202d interfaceC8202d) {
        return new C8201c(uri, new C8203e(ComponentCallbacks2C5471b.m3006c(context).m3021j().m2993g(), interfaceC8202d, ComponentCallbacks2C5471b.m3006c(context).m3016e(), context.getContentResolver()));
    }

    /* renamed from: f */
    public static C8201c m13213f(Context context, Uri uri) {
        return m13212c(context, uri, new a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static C8201c m13214g(Context context, Uri uri) {
        return m13212c(context, uri, new b(context.getContentResolver()));
    }

    @Override // p132i0.InterfaceC8115d
    /* renamed from: a */
    public Class mo12978a() {
        return InputStream.class;
    }

    @Override // p132i0.InterfaceC8115d
    /* renamed from: b */
    public void mo12983b() throws IOException {
        InputStream inputStream = this.f14208c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // p132i0.InterfaceC8115d
    /* renamed from: d */
    public void mo12985d(Priority priority, InterfaceC8115d.a aVar) throws Throwable {
        try {
            InputStream inputStreamM13215h = m13215h();
            this.f14208c = inputStreamM13215h;
            aVar.mo3155f(inputStreamM13215h);
        } catch (FileNotFoundException e10) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.mo3154c(e10);
        }
    }

    @Override // p132i0.InterfaceC8115d
    /* renamed from: e */
    public DataSource mo12986e() {
        return DataSource.LOCAL;
    }

    /* renamed from: h */
    public final InputStream m13215h() throws Throwable {
        InputStream inputStreamM13220d = this.f14207b.m13220d(this.f14206a);
        int iM13217a = inputStreamM13220d != null ? this.f14207b.m13217a(this.f14206a) : -1;
        return iM13217a != -1 ? new C8118g(inputStreamM13220d, iM13217a) : inputStreamM13220d;
    }

    @Override // p132i0.InterfaceC8115d
    public void cancel() {
    }
}
