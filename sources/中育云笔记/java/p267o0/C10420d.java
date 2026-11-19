package p267o0;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5824d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p039c1.C5222d;
import p168h0.C9438e;
import p184i0.AbstractC9558b;
import p254n0.C10304r;
import p254n0.InterfaceC10300n;
import p254n0.InterfaceC10301o;

/* renamed from: o0.d */
/* loaded from: classes3.dex */
public final class C10420d implements InterfaceC10300n {

    /* renamed from: a */
    public final Context f24802a;

    /* renamed from: b */
    public final InterfaceC10300n f24803b;

    /* renamed from: c */
    public final InterfaceC10300n f24804c;

    /* renamed from: d */
    public final Class f24805d;

    /* renamed from: o0.d$a */
    public static abstract class a implements InterfaceC10301o {

        /* renamed from: a */
        public final Context f24806a;

        /* renamed from: b */
        public final Class f24807b;

        public a(Context context, Class cls) {
            this.f24806a = context;
            this.f24807b = cls;
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public final InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10420d(this.f24806a, c10304r.m21491d(File.class, this.f24807b), c10304r.m21491d(Uri.class, this.f24807b), this.f24807b);
        }
    }

    /* renamed from: o0.d$b */
    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: o0.d$c */
    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: o0.d$d */
    public static final class d implements InterfaceC5824d {

        /* renamed from: m */
        public static final String[] f24808m = {"_data"};

        /* renamed from: c */
        public final Context f24809c;

        /* renamed from: d */
        public final InterfaceC10300n f24810d;

        /* renamed from: e */
        public final InterfaceC10300n f24811e;

        /* renamed from: f */
        public final Uri f24812f;

        /* renamed from: g */
        public final int f24813g;

        /* renamed from: h */
        public final int f24814h;

        /* renamed from: i */
        public final C9438e f24815i;

        /* renamed from: j */
        public final Class f24816j;

        /* renamed from: k */
        public volatile boolean f24817k;

        /* renamed from: l */
        public volatile InterfaceC5824d f24818l;

        public d(Context context, InterfaceC10300n interfaceC10300n, InterfaceC10300n interfaceC10300n2, Uri uri, int i10, int i11, C9438e c9438e, Class cls) {
            this.f24809c = context.getApplicationContext();
            this.f24810d = interfaceC10300n;
            this.f24811e = interfaceC10300n2;
            this.f24812f = uri;
            this.f24813g = i10;
            this.f24814h = i11;
            this.f24815i = c9438e;
            this.f24816j = cls;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        /* renamed from: a */
        public Class mo4051a() {
            return this.f24816j;
        }

        /* renamed from: b */
        public final InterfaceC10300n.a m21816b() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f24810d.mo21421b(m21819f(this.f24812f), this.f24813g, this.f24814h, this.f24815i);
            }
            if (AbstractC9558b.m18791a(this.f24812f)) {
                return this.f24811e.mo21421b(this.f24812f, this.f24813g, this.f24814h, this.f24815i);
            }
            return this.f24811e.mo21421b(m21818e() ? MediaStore.setRequireOriginal(this.f24812f) : this.f24812f, this.f24813g, this.f24814h, this.f24815i);
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        /* renamed from: c */
        public void mo4057c(Priority priority, InterfaceC5824d.a aVar) {
            try {
                InterfaceC5824d interfaceC5824dM21817d = m21817d();
                if (interfaceC5824dM21817d == null) {
                    aVar.mo4062b(new IllegalArgumentException("Failed to build fetcher for: " + this.f24812f));
                    return;
                }
                this.f24818l = interfaceC5824dM21817d;
                if (this.f24817k) {
                    cancel();
                } else {
                    interfaceC5824dM21817d.mo4057c(priority, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.mo4062b(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public void cancel() {
            this.f24817k = true;
            InterfaceC5824d interfaceC5824d = this.f24818l;
            if (interfaceC5824d != null) {
                interfaceC5824d.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public void cleanup() {
            InterfaceC5824d interfaceC5824d = this.f24818l;
            if (interfaceC5824d != null) {
                interfaceC5824d.cleanup();
            }
        }

        /* renamed from: d */
        public final InterfaceC5824d m21817d() {
            InterfaceC10300n.a aVarM21816b = m21816b();
            if (aVarM21816b != null) {
                return aVarM21816b.f24544c;
            }
            return null;
        }

        /* renamed from: e */
        public final boolean m21818e() {
            return this.f24809c.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        /* renamed from: f */
        public final File m21819f(Uri uri) {
            try {
                Cursor cursorQuery = this.f24809c.getContentResolver().query(uri, f24808m, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } finally {
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }
    }

    public C10420d(Context context, InterfaceC10300n interfaceC10300n, InterfaceC10300n interfaceC10300n2, Class cls) {
        this.f24802a = context.getApplicationContext();
        this.f24803b = interfaceC10300n;
        this.f24804c = interfaceC10300n2;
        this.f24805d = cls;
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC10300n.a mo21421b(Uri uri, int i10, int i11, C9438e c9438e) {
        return new InterfaceC10300n.a(new C5222d(uri), new d(this.f24802a, this.f24803b, this.f24804c, uri, i10, i11, c9438e, this.f24805d));
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo21420a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC9558b.m18793c(uri);
    }
}
