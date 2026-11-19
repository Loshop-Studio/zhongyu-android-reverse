package p088l;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C2858c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p081k.C3846g;
import p081k.InterfaceC3843d;

/* renamed from: l.c */
/* loaded from: classes2.dex */
public class C4331c implements InterfaceC3843d {

    /* renamed from: a */
    public final Uri f4829a;

    /* renamed from: b */
    public final C4333e f4830b;

    /* renamed from: c */
    public InputStream f4831c;

    /* renamed from: l.c$a */
    public static class a implements InterfaceC4332d {

        /* renamed from: b */
        public static final String[] f4832b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f4833a;

        public a(ContentResolver contentResolver) {
            this.f4833a = contentResolver;
        }

        @Override // p088l.InterfaceC4332d
        /* renamed from: a */
        public Cursor mo5341a(Uri uri) {
            return this.f4833a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f4832b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* renamed from: l.c$b */
    public static class b implements InterfaceC4332d {

        /* renamed from: b */
        public static final String[] f4834b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f4835a;

        public b(ContentResolver contentResolver) {
            this.f4835a = contentResolver;
        }

        @Override // p088l.InterfaceC4332d
        /* renamed from: a */
        public Cursor mo5341a(Uri uri) {
            return this.f4835a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f4834b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public C4331c(Uri uri, C4333e c4333e) {
        this.f4829a = uri;
        this.f4830b = c4333e;
    }

    /* renamed from: c */
    public static C4331c m5337c(Context context, Uri uri, InterfaceC4332d interfaceC4332d) {
        return new C4331c(uri, new C4333e(ComponentCallbacks2C2858c.m1680c(context).m1695j().m1666g(), interfaceC4332d, ComponentCallbacks2C2858c.m1680c(context).m1690e(), context.getContentResolver()));
    }

    /* renamed from: e */
    public static C4331c m5338e(Context context, Uri uri) {
        return m5337c(context, uri, new a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static C4331c m5339g(Context context, Uri uri) {
        return m5337c(context, uri, new b(context.getContentResolver()));
    }

    @Override // p081k.InterfaceC3843d
    /* renamed from: a */
    public Class mo5114a() {
        return InputStream.class;
    }

    @Override // p081k.InterfaceC3843d
    /* renamed from: b */
    public void mo5119b() throws IOException {
        InputStream inputStream = this.f4831c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // p081k.InterfaceC3843d
    public void cancel() {
    }

    @Override // p081k.InterfaceC3843d
    /* renamed from: d */
    public DataSource mo5121d() {
        return DataSource.LOCAL;
    }

    @Override // p081k.InterfaceC3843d
    /* renamed from: f */
    public void mo5123f(Priority priority, InterfaceC3843d.a aVar) throws Throwable {
        try {
            InputStream inputStreamM5340h = m5340h();
            this.f4831c = inputStreamM5340h;
            aVar.mo1830e(inputStreamM5340h);
        } catch (FileNotFoundException e4) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.mo1829c(e4);
        }
    }

    /* renamed from: h */
    public final InputStream m5340h() throws Throwable {
        InputStream inputStreamM5345d = this.f4830b.m5345d(this.f4829a);
        int iM5342a = inputStreamM5345d != null ? this.f4830b.m5342a(this.f4829a) : -1;
        return iM5342a != -1 ? new C3846g(inputStreamM5345d, iM5342a) : inputStreamM5345d;
    }
}
