package p237s;

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
import com.bumptech.glide.load.data.InterfaceC5405d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p105g0.C8514b;
import p160l.C9230d;
import p171m.AbstractC9287b;
import p226r.C9892r;
import p226r.InterfaceC9888n;
import p226r.InterfaceC9889o;

/* renamed from: s.d */
/* loaded from: classes3.dex */
public final class C9958d implements InterfaceC9888n {

    /* renamed from: a */
    public final Context f19947a;

    /* renamed from: b */
    public final InterfaceC9888n f19948b;

    /* renamed from: c */
    public final InterfaceC9888n f19949c;

    /* renamed from: d */
    public final Class f19950d;

    /* renamed from: s.d$a */
    public static abstract class a implements InterfaceC9889o {

        /* renamed from: a */
        public final Context f19951a;

        /* renamed from: b */
        public final Class f19952b;

        public a(Context context, Class cls) {
            this.f19951a = context;
            this.f19952b = cls;
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public final InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9958d(this.f19951a, c9892r.m18520d(File.class, this.f19952b), c9892r.m18520d(Uri.class, this.f19952b), this.f19952b);
        }
    }

    /* renamed from: s.d$b */
    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: s.d$c */
    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: s.d$d */
    public static final class d implements InterfaceC5405d {

        /* renamed from: k */
        public static final String[] f19953k = {"_data"};

        /* renamed from: a */
        public final Context f19954a;

        /* renamed from: b */
        public final InterfaceC9888n f19955b;

        /* renamed from: c */
        public final InterfaceC9888n f19956c;

        /* renamed from: d */
        public final Uri f19957d;

        /* renamed from: e */
        public final int f19958e;

        /* renamed from: f */
        public final int f19959f;

        /* renamed from: g */
        public final C9230d f19960g;

        /* renamed from: h */
        public final Class f19961h;

        /* renamed from: i */
        public volatile boolean f19962i;

        /* renamed from: j */
        public volatile InterfaceC5405d f19963j;

        public d(Context context, InterfaceC9888n interfaceC9888n, InterfaceC9888n interfaceC9888n2, Uri uri, int i10, int i11, C9230d c9230d, Class cls) {
            this.f19954a = context.getApplicationContext();
            this.f19955b = interfaceC9888n;
            this.f19956c = interfaceC9888n2;
            this.f19957d = uri;
            this.f19958e = i10;
            this.f19959f = i11;
            this.f19960g = c9230d;
            this.f19961h = cls;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: a */
        public Class mo2846a() {
            return this.f19961h;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: b */
        public void mo2851b() {
            InterfaceC5405d interfaceC5405d = this.f19963j;
            if (interfaceC5405d != null) {
                interfaceC5405d.mo2851b();
            }
        }

        /* renamed from: c */
        public final InterfaceC9888n.a m18607c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f19955b.mo18446b(m18610g(this.f19957d), this.f19958e, this.f19959f, this.f19960g);
            }
            if (AbstractC9287b.m17080a(this.f19957d)) {
                return this.f19956c.mo18446b(this.f19957d, this.f19958e, this.f19959f, this.f19960g);
            }
            return this.f19956c.mo18446b(m18609f() ? MediaStore.setRequireOriginal(this.f19957d) : this.f19957d, this.f19958e, this.f19959f, this.f19960g);
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        public void cancel() {
            this.f19962i = true;
            InterfaceC5405d interfaceC5405d = this.f19963j;
            if (interfaceC5405d != null) {
                interfaceC5405d.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: d */
        public void mo2853d(Priority priority, InterfaceC5405d.a aVar) {
            try {
                InterfaceC5405d interfaceC5405dM18608e = m18608e();
                if (interfaceC5405dM18608e == null) {
                    aVar.mo2858c(new IllegalArgumentException("Failed to build fetcher for: " + this.f19957d));
                    return;
                }
                this.f19963j = interfaceC5405dM18608e;
                if (this.f19962i) {
                    cancel();
                } else {
                    interfaceC5405dM18608e.mo2853d(priority, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.mo2858c(e10);
            }
        }

        /* renamed from: e */
        public final InterfaceC5405d m18608e() {
            InterfaceC9888n.a aVarM18607c = m18607c();
            if (aVarM18607c != null) {
                return aVarM18607c.f19821c;
            }
            return null;
        }

        /* renamed from: f */
        public final boolean m18609f() {
            return this.f19954a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        /* renamed from: g */
        public final File m18610g(Uri uri) {
            try {
                Cursor cursorQuery = this.f19954a.getContentResolver().query(uri, f19953k, null, null, null);
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

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }
    }

    public C9958d(Context context, InterfaceC9888n interfaceC9888n, InterfaceC9888n interfaceC9888n2, Class cls) {
        this.f19947a = context.getApplicationContext();
        this.f19948b = interfaceC9888n;
        this.f19949c = interfaceC9888n2;
        this.f19950d = cls;
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9888n.a mo18446b(Uri uri, int i10, int i11, C9230d c9230d) {
        return new InterfaceC9888n.a(new C8514b(uri), new d(this.f19947a, this.f19948b, this.f19949c, uri, i10, i11, c9230d, this.f19950d));
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18445a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC9287b.m17082c(uri);
    }
}
