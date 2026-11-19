package p173n0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C5342b;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5359g;
import com.bumptech.glide.load.data.InterfaceC5356d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: n0.c */
/* loaded from: classes3.dex */
public class C8614c implements InterfaceC5356d {

    /* renamed from: a */
    public final Uri f14257a;

    /* renamed from: b */
    public final C8616e f14258b;

    /* renamed from: c */
    public InputStream f14259c;

    /* renamed from: n0.c$a */
    public static class a implements InterfaceC8615d {

        /* renamed from: b */
        public static final String[] f14260b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f14261a;

        public a(ContentResolver contentResolver) {
            this.f14261a = contentResolver;
        }

        @Override // p173n0.InterfaceC8615d
        /* renamed from: a */
        public Cursor mo14186a(Uri uri) {
            return this.f14261a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f14260b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* renamed from: n0.c$b */
    public static class b implements InterfaceC8615d {

        /* renamed from: b */
        public static final String[] f14262b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f14263a;

        public b(ContentResolver contentResolver) {
            this.f14263a = contentResolver;
        }

        @Override // p173n0.InterfaceC8615d
        /* renamed from: a */
        public Cursor mo14186a(Uri uri) {
            return this.f14263a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f14262b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public C8614c(Uri uri, C8616e c8616e) {
        this.f14257a = uri;
        this.f14258b = c8616e;
    }

    /* renamed from: c */
    public static C8614c m14182c(Context context, Uri uri, InterfaceC8615d interfaceC8615d) {
        return new C8614c(uri, new C8616e(ComponentCallbacks2C5342b.m3291c(context).m3306j().m3278g(), interfaceC8615d, ComponentCallbacks2C5342b.m3291c(context).m3301e(), context.getContentResolver()));
    }

    /* renamed from: f */
    public static C8614c m14183f(Context context, Uri uri) {
        return m14182c(context, uri, new a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static C8614c m14184g(Context context, Uri uri) {
        return m14182c(context, uri, new b(context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d
    /* renamed from: a */
    public Class mo3399a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d
    /* renamed from: b */
    public void mo3404b() throws IOException {
        InputStream inputStream = this.f14259c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d
    /* renamed from: d */
    public DataSource mo3406d() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d
    /* renamed from: e */
    public void mo3407e(Priority priority, InterfaceC5356d.a aVar) throws Throwable {
        try {
            InputStream inputStreamM14185h = m14185h();
            this.f14259c = inputStreamM14185h;
            aVar.mo3413f(inputStreamM14185h);
        } catch (FileNotFoundException e10) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.mo3412c(e10);
        }
    }

    /* renamed from: h */
    public final InputStream m14185h() throws Throwable {
        InputStream inputStreamM14190d = this.f14258b.m14190d(this.f14257a);
        int iM14187a = inputStreamM14190d != null ? this.f14258b.m14187a(this.f14257a) : -1;
        return iM14187a != -1 ? new C5359g(inputStreamM14190d, iM14187a) : inputStreamM14190d;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d
    public void cancel() {
    }
}
