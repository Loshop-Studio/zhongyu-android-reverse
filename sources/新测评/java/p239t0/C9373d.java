package p239t0;

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
import com.bumptech.glide.load.data.InterfaceC5356d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p106h1.C7617b;
import p162m0.C8539d;
import p173n0.AbstractC8613b;
import p228s0.C9116r;
import p228s0.InterfaceC9112n;
import p228s0.InterfaceC9113o;

/* renamed from: t0.d */
/* loaded from: classes3.dex */
public final class C9373d implements InterfaceC9112n {

    /* renamed from: a */
    public final Context f16263a;

    /* renamed from: b */
    public final InterfaceC9112n f16264b;

    /* renamed from: c */
    public final InterfaceC9112n f16265c;

    /* renamed from: d */
    public final Class f16266d;

    /* renamed from: t0.d$a */
    public static abstract class a implements InterfaceC9113o {

        /* renamed from: a */
        public final Context f16267a;

        /* renamed from: b */
        public final Class f16268b;

        public a(Context context, Class cls) {
            this.f16267a = context;
            this.f16268b = cls;
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public final InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9373d(this.f16267a, c9116r.m15429d(File.class, this.f16268b), c9116r.m15429d(Uri.class, this.f16268b), this.f16268b);
        }
    }

    /* renamed from: t0.d$b */
    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: t0.d$c */
    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: t0.d$d */
    public static final class d implements InterfaceC5356d {

        /* renamed from: k */
        public static final String[] f16269k = {"_data"};

        /* renamed from: a */
        public final Context f16270a;

        /* renamed from: b */
        public final InterfaceC9112n f16271b;

        /* renamed from: c */
        public final InterfaceC9112n f16272c;

        /* renamed from: d */
        public final Uri f16273d;

        /* renamed from: e */
        public final int f16274e;

        /* renamed from: f */
        public final int f16275f;

        /* renamed from: g */
        public final C8539d f16276g;

        /* renamed from: h */
        public final Class f16277h;

        /* renamed from: i */
        public volatile boolean f16278i;

        /* renamed from: j */
        public volatile InterfaceC5356d f16279j;

        public d(Context context, InterfaceC9112n interfaceC9112n, InterfaceC9112n interfaceC9112n2, Uri uri, int i10, int i11, C8539d c8539d, Class cls) {
            this.f16270a = context.getApplicationContext();
            this.f16271b = interfaceC9112n;
            this.f16272c = interfaceC9112n2;
            this.f16273d = uri;
            this.f16274e = i10;
            this.f16275f = i11;
            this.f16276g = c8539d;
            this.f16277h = cls;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: a */
        public Class mo3399a() {
            return this.f16277h;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: b */
        public void mo3404b() {
            InterfaceC5356d interfaceC5356d = this.f16279j;
            if (interfaceC5356d != null) {
                interfaceC5356d.mo3404b();
            }
        }

        /* renamed from: c */
        public final InterfaceC9112n.a m15663c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f16271b.mo15355b(m15666h(this.f16273d), this.f16274e, this.f16275f, this.f16276g);
            }
            if (AbstractC8613b.m14176a(this.f16273d)) {
                return this.f16272c.mo15355b(this.f16273d, this.f16274e, this.f16275f, this.f16276g);
            }
            return this.f16272c.mo15355b(m15665g() ? MediaStore.setRequireOriginal(this.f16273d) : this.f16273d, this.f16274e, this.f16275f, this.f16276g);
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        public void cancel() {
            this.f16278i = true;
            InterfaceC5356d interfaceC5356d = this.f16279j;
            if (interfaceC5356d != null) {
                interfaceC5356d.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: d */
        public DataSource mo3406d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: e */
        public void mo3407e(Priority priority, InterfaceC5356d.a aVar) {
            try {
                InterfaceC5356d interfaceC5356dM15664f = m15664f();
                if (interfaceC5356dM15664f == null) {
                    aVar.mo3412c(new IllegalArgumentException("Failed to build fetcher for: " + this.f16273d));
                    return;
                }
                this.f16279j = interfaceC5356dM15664f;
                if (this.f16278i) {
                    cancel();
                } else {
                    interfaceC5356dM15664f.mo3407e(priority, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.mo3412c(e10);
            }
        }

        /* renamed from: f */
        public final InterfaceC5356d m15664f() {
            InterfaceC9112n.a aVarM15663c = m15663c();
            if (aVarM15663c != null) {
                return aVarM15663c.f15786c;
            }
            return null;
        }

        /* renamed from: g */
        public final boolean m15665g() {
            return this.f16270a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        /* renamed from: h */
        public final File m15666h(Uri uri) {
            try {
                Cursor cursorQuery = this.f16270a.getContentResolver().query(uri, f16269k, null, null, null);
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

    public C9373d(Context context, InterfaceC9112n interfaceC9112n, InterfaceC9112n interfaceC9112n2, Class cls) {
        this.f16263a = context.getApplicationContext();
        this.f16264b = interfaceC9112n;
        this.f16265c = interfaceC9112n2;
        this.f16266d = cls;
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9112n.a mo15355b(Uri uri, int i10, int i11, C8539d c8539d) {
        return new InterfaceC9112n.a(new C7617b(uri), new d(this.f16263a, this.f16264b, this.f16265c, uri, i10, i11, c8539d, this.f16266d));
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo15354a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC8613b.m14178c(uri);
    }
}
