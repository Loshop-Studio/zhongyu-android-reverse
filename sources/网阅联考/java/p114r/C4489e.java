package p114r;

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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p057f0.C3731b;
import p076j.C3794d;
import p081k.InterfaceC3843d;
import p088l.AbstractC4330b;
import p110q.C4468q;
import p110q.InterfaceC4464m;
import p110q.InterfaceC4465n;

/* renamed from: r.e */
/* loaded from: classes2.dex */
public final class C4489e implements InterfaceC4464m {

    /* renamed from: a */
    public final Context f5261a;

    /* renamed from: b */
    public final InterfaceC4464m f5262b;

    /* renamed from: c */
    public final InterfaceC4464m f5263c;

    /* renamed from: d */
    public final Class f5264d;

    /* renamed from: r.e$a */
    public static abstract class a implements InterfaceC4465n {

        /* renamed from: a */
        public final Context f5265a;

        /* renamed from: b */
        public final Class f5266b;

        public a(Context context, Class cls) {
            this.f5265a = context;
            this.f5266b = cls;
        }

        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public final InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4489e(this.f5265a, c4468q.m5732d(File.class, this.f5266b), c4468q.m5732d(Uri.class, this.f5266b), this.f5266b);
        }
    }

    /* renamed from: r.e$b */
    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: r.e$c */
    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: r.e$d */
    public static final class d implements InterfaceC3843d {

        /* renamed from: k */
        public static final String[] f5267k = {"_data"};

        /* renamed from: a */
        public final Context f5268a;

        /* renamed from: b */
        public final InterfaceC4464m f5269b;

        /* renamed from: c */
        public final InterfaceC4464m f5270c;

        /* renamed from: d */
        public final Uri f5271d;

        /* renamed from: e */
        public final int f5272e;

        /* renamed from: f */
        public final int f5273f;

        /* renamed from: g */
        public final C3794d f5274g;

        /* renamed from: h */
        public final Class f5275h;

        /* renamed from: i */
        public volatile boolean f5276i;

        /* renamed from: j */
        public volatile InterfaceC3843d f5277j;

        public d(Context context, InterfaceC4464m interfaceC4464m, InterfaceC4464m interfaceC4464m2, Uri uri, int i4, int i5, C3794d c3794d, Class cls) {
            this.f5268a = context.getApplicationContext();
            this.f5269b = interfaceC4464m;
            this.f5270c = interfaceC4464m2;
            this.f5271d = uri;
            this.f5272e = i4;
            this.f5273f = i5;
            this.f5274g = c3794d;
            this.f5275h = cls;
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: a */
        public Class mo5114a() {
            return this.f5275h;
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: b */
        public void mo5119b() {
            InterfaceC3843d interfaceC3843d = this.f5277j;
            if (interfaceC3843d != null) {
                interfaceC3843d.mo5119b();
            }
        }

        /* renamed from: c */
        public final InterfaceC4464m.a m5779c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f5269b.mo5671b(m5782h(this.f5271d), this.f5272e, this.f5273f, this.f5274g);
            }
            return this.f5270c.mo5671b(m5781g() ? MediaStore.setRequireOriginal(this.f5271d) : this.f5271d, this.f5272e, this.f5273f, this.f5274g);
        }

        @Override // p081k.InterfaceC3843d
        public void cancel() {
            this.f5276i = true;
            InterfaceC3843d interfaceC3843d = this.f5277j;
            if (interfaceC3843d != null) {
                interfaceC3843d.cancel();
            }
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: d */
        public DataSource mo5121d() {
            return DataSource.LOCAL;
        }

        /* renamed from: e */
        public final InterfaceC3843d m5780e() {
            InterfaceC4464m.a aVarM5779c = m5779c();
            if (aVarM5779c != null) {
                return aVarM5779c.f5195c;
            }
            return null;
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: f */
        public void mo5123f(Priority priority, InterfaceC3843d.a aVar) {
            try {
                InterfaceC3843d interfaceC3843dM5780e = m5780e();
                if (interfaceC3843dM5780e == null) {
                    aVar.mo1829c(new IllegalArgumentException("Failed to build fetcher for: " + this.f5271d));
                    return;
                }
                this.f5277j = interfaceC3843dM5780e;
                if (this.f5276i) {
                    cancel();
                } else {
                    interfaceC3843dM5780e.mo5123f(priority, aVar);
                }
            } catch (FileNotFoundException e4) {
                aVar.mo1829c(e4);
            }
        }

        /* renamed from: g */
        public final boolean m5781g() {
            return this.f5268a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        /* renamed from: h */
        public final File m5782h(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f5268a.getContentResolver().query(uri, f5267k, null, null, null);
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
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    public C4489e(Context context, InterfaceC4464m interfaceC4464m, InterfaceC4464m interfaceC4464m2, Class cls) {
        this.f5261a = context.getApplicationContext();
        this.f5262b = interfaceC4464m;
        this.f5263c = interfaceC4464m2;
        this.f5264d = cls;
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4464m.a mo5671b(Uri uri, int i4, int i5, C3794d c3794d) {
        return new InterfaceC4464m.a(new C3731b(uri), new d(this.f5261a, this.f5262b, this.f5263c, uri, i4, i5, c3794d, this.f5264d));
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5670a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC4330b.m5333b(uri);
    }
}
