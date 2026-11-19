package p208p0;

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
import p080d1.C7737b;
import p122h0.C8084d;
import p132i0.InterfaceC8115d;
import p142j0.AbstractC8200b;
import p194o0.C9150q;
import p194o0.InterfaceC9146m;
import p194o0.InterfaceC9147n;

/* renamed from: p0.e */
/* loaded from: classes3.dex */
public final class C9308e implements InterfaceC9146m {

    /* renamed from: a */
    public final Context f16120a;

    /* renamed from: b */
    public final InterfaceC9146m f16121b;

    /* renamed from: c */
    public final InterfaceC9146m f16122c;

    /* renamed from: d */
    public final Class f16123d;

    /* renamed from: p0.e$a */
    public static abstract class a implements InterfaceC9147n {

        /* renamed from: a */
        public final Context f16124a;

        /* renamed from: b */
        public final Class f16125b;

        public a(Context context, Class cls) {
            this.f16124a = context;
            this.f16125b = cls;
        }

        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public final InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9308e(this.f16124a, c9150q.m14716d(File.class, this.f16125b), c9150q.m14716d(Uri.class, this.f16125b), this.f16125b);
        }
    }

    /* renamed from: p0.e$b */
    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: p0.e$c */
    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: p0.e$d */
    public static final class d implements InterfaceC8115d {

        /* renamed from: k */
        public static final String[] f16126k = {"_data"};

        /* renamed from: a */
        public final Context f16127a;

        /* renamed from: b */
        public final InterfaceC9146m f16128b;

        /* renamed from: c */
        public final InterfaceC9146m f16129c;

        /* renamed from: d */
        public final Uri f16130d;

        /* renamed from: e */
        public final int f16131e;

        /* renamed from: f */
        public final int f16132f;

        /* renamed from: g */
        public final C8084d f16133g;

        /* renamed from: h */
        public final Class f16134h;

        /* renamed from: i */
        public volatile boolean f16135i;

        /* renamed from: j */
        public volatile InterfaceC8115d f16136j;

        public d(Context context, InterfaceC9146m interfaceC9146m, InterfaceC9146m interfaceC9146m2, Uri uri, int i9, int i10, C8084d c8084d, Class cls) {
            this.f16127a = context.getApplicationContext();
            this.f16128b = interfaceC9146m;
            this.f16129c = interfaceC9146m2;
            this.f16130d = uri;
            this.f16131e = i9;
            this.f16132f = i10;
            this.f16133g = c8084d;
            this.f16134h = cls;
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: a */
        public Class mo12978a() {
            return this.f16134h;
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: b */
        public void mo12983b() {
            InterfaceC8115d interfaceC8115d = this.f16136j;
            if (interfaceC8115d != null) {
                interfaceC8115d.mo12983b();
            }
        }

        /* renamed from: c */
        public final InterfaceC9146m.a m15164c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f16128b.mo14656b(m15167h(this.f16130d), this.f16131e, this.f16132f, this.f16133g);
            }
            return this.f16129c.mo14656b(m15166g() ? MediaStore.setRequireOriginal(this.f16130d) : this.f16130d, this.f16131e, this.f16132f, this.f16133g);
        }

        @Override // p132i0.InterfaceC8115d
        public void cancel() {
            this.f16135i = true;
            InterfaceC8115d interfaceC8115d = this.f16136j;
            if (interfaceC8115d != null) {
                interfaceC8115d.cancel();
            }
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: d */
        public void mo12985d(Priority priority, InterfaceC8115d.a aVar) {
            try {
                InterfaceC8115d interfaceC8115dM15165f = m15165f();
                if (interfaceC8115dM15165f == null) {
                    aVar.mo3154c(new IllegalArgumentException("Failed to build fetcher for: " + this.f16130d));
                    return;
                }
                this.f16136j = interfaceC8115dM15165f;
                if (this.f16135i) {
                    cancel();
                } else {
                    interfaceC8115dM15165f.mo12985d(priority, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.mo3154c(e10);
            }
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: e */
        public DataSource mo12986e() {
            return DataSource.LOCAL;
        }

        /* renamed from: f */
        public final InterfaceC8115d m15165f() {
            InterfaceC9146m.a aVarM15164c = m15164c();
            if (aVarM15164c != null) {
                return aVarM15164c.f15426c;
            }
            return null;
        }

        /* renamed from: g */
        public final boolean m15166g() {
            return this.f16127a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        /* renamed from: h */
        public final File m15167h(Uri uri) {
            try {
                Cursor cursorQuery = this.f16127a.getContentResolver().query(uri, f16126k, null, null, null);
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

    public C9308e(Context context, InterfaceC9146m interfaceC9146m, InterfaceC9146m interfaceC9146m2, Class cls) {
        this.f16120a = context.getApplicationContext();
        this.f16121b = interfaceC9146m;
        this.f16122c = interfaceC9146m2;
        this.f16123d = cls;
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9146m.a mo14656b(Uri uri, int i9, int i10, C8084d c8084d) {
        return new InterfaceC9146m.a(new C7737b(uri), new d(this.f16120a, this.f16121b, this.f16122c, uri, i9, i10, c8084d, this.f16123d));
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo14655a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC8200b.m13208b(uri);
    }
}
