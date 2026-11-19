package p104m0;

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
import com.bumptech.glide.load.data.InterfaceC4692d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p002a1.C0007b;
import p053f0.C6285d;
import p060g0.AbstractC6390b;
import p097l0.C7284r;
import p097l0.InterfaceC7280n;
import p097l0.InterfaceC7281o;

/* renamed from: m0.d */
/* loaded from: classes3.dex */
public final class C7370d implements InterfaceC7280n {

    /* renamed from: a */
    public final Context f9368a;

    /* renamed from: b */
    public final InterfaceC7280n f9369b;

    /* renamed from: c */
    public final InterfaceC7280n f9370c;

    /* renamed from: d */
    public final Class f9371d;

    /* renamed from: m0.d$a */
    public static abstract class a implements InterfaceC7281o {

        /* renamed from: a */
        public final Context f9372a;

        /* renamed from: b */
        public final Class f9373b;

        public a(Context context, Class cls) {
            this.f9372a = context;
            this.f9373b = cls;
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public final InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7370d(this.f9372a, c7284r.m8265d(File.class, this.f9373b), c7284r.m8265d(Uri.class, this.f9373b), this.f9373b);
        }
    }

    /* renamed from: m0.d$b */
    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: m0.d$c */
    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: m0.d$d */
    public static final class d implements InterfaceC4692d {

        /* renamed from: k */
        public static final String[] f9374k = {"_data"};

        /* renamed from: a */
        public final Context f9375a;

        /* renamed from: b */
        public final InterfaceC7280n f9376b;

        /* renamed from: c */
        public final InterfaceC7280n f9377c;

        /* renamed from: d */
        public final Uri f9378d;

        /* renamed from: e */
        public final int f9379e;

        /* renamed from: f */
        public final int f9380f;

        /* renamed from: g */
        public final C6285d f9381g;

        /* renamed from: h */
        public final Class f9382h;

        /* renamed from: i */
        public volatile boolean f9383i;

        /* renamed from: j */
        public volatile InterfaceC4692d f9384j;

        public d(Context context, InterfaceC7280n interfaceC7280n, InterfaceC7280n interfaceC7280n2, Uri uri, int i6, int i7, C6285d c6285d, Class cls) {
            this.f9375a = context.getApplicationContext();
            this.f9376b = interfaceC7280n;
            this.f9377c = interfaceC7280n2;
            this.f9378d = uri;
            this.f9379e = i6;
            this.f9380f = i7;
            this.f9381g = c6285d;
            this.f9382h = cls;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: a */
        public Class mo2580a() {
            return this.f9382h;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: b */
        public void mo2585b() {
            InterfaceC4692d interfaceC4692d = this.f9384j;
            if (interfaceC4692d != null) {
                interfaceC4692d.mo2585b();
            }
        }

        /* renamed from: c */
        public final InterfaceC7280n.a m8395c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f9376b.mo8191b(m8398h(this.f9378d), this.f9379e, this.f9380f, this.f9381g);
            }
            if (AbstractC6390b.m6898a(this.f9378d)) {
                return this.f9377c.mo8191b(this.f9378d, this.f9379e, this.f9380f, this.f9381g);
            }
            return this.f9377c.mo8191b(m8397g() ? MediaStore.setRequireOriginal(this.f9378d) : this.f9378d, this.f9379e, this.f9380f, this.f9381g);
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        public void cancel() {
            this.f9383i = true;
            InterfaceC4692d interfaceC4692d = this.f9384j;
            if (interfaceC4692d != null) {
                interfaceC4692d.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: d */
        public DataSource mo2587d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: e */
        public void mo2588e(Priority priority, InterfaceC4692d.a aVar) {
            try {
                InterfaceC4692d interfaceC4692dM8396f = m8396f();
                if (interfaceC4692dM8396f == null) {
                    aVar.mo2593c(new IllegalArgumentException("Failed to build fetcher for: " + this.f9378d));
                    return;
                }
                this.f9384j = interfaceC4692dM8396f;
                if (this.f9383i) {
                    cancel();
                } else {
                    interfaceC4692dM8396f.mo2588e(priority, aVar);
                }
            } catch (FileNotFoundException e6) {
                aVar.mo2593c(e6);
            }
        }

        /* renamed from: f */
        public final InterfaceC4692d m8396f() {
            InterfaceC7280n.a aVarM8395c = m8395c();
            if (aVarM8395c != null) {
                return aVarM8395c.f9232c;
            }
            return null;
        }

        /* renamed from: g */
        public final boolean m8397g() {
            return this.f9375a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        /* renamed from: h */
        public final File m8398h(Uri uri) {
            try {
                Cursor cursorQuery = this.f9375a.getContentResolver().query(uri, f9374k, null, null, null);
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
    }

    public C7370d(Context context, InterfaceC7280n interfaceC7280n, InterfaceC7280n interfaceC7280n2, Class cls) {
        this.f9368a = context.getApplicationContext();
        this.f9369b = interfaceC7280n;
        this.f9370c = interfaceC7280n2;
        this.f9371d = cls;
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC7280n.a mo8191b(Uri uri, int i6, int i7, C6285d c6285d) {
        return new InterfaceC7280n.a(new C0007b(uri), new d(this.f9368a, this.f9369b, this.f9370c, uri, i6, i7, c6285d, this.f9371d));
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo8190a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC6390b.m6900c(uri);
    }
}
