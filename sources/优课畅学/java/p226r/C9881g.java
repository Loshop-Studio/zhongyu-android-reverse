package p226r;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5405d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p105g0.C8514b;
import p160l.C9230d;
import p226r.InterfaceC9888n;

/* renamed from: r.g */
/* loaded from: classes3.dex */
public class C9881g implements InterfaceC9888n {

    /* renamed from: a */
    public final d f19786a;

    /* renamed from: r.g$a */
    public static class a implements InterfaceC9889o {

        /* renamed from: a */
        public final d f19787a;

        public a(d dVar) {
            this.f19787a = dVar;
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public final InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9881g(this.f19787a);
        }
    }

    /* renamed from: r.g$b */
    public static class b extends a {

        /* renamed from: r.g$b$a */
        public class a implements d {
            @Override // p226r.C9881g.d
            /* renamed from: a */
            public Class mo18480a() {
                return ParcelFileDescriptor.class;
            }

            @Override // p226r.C9881g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo18481b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // p226r.C9881g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor mo18482c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* renamed from: r.g$d */
    public interface d {
        /* renamed from: a */
        Class mo18480a();

        /* renamed from: b */
        void mo18481b(Object obj);

        /* renamed from: c */
        Object mo18482c(File file);
    }

    /* renamed from: r.g$e */
    public static class e extends a {

        /* renamed from: r.g$e$a */
        public class a implements d {
            @Override // p226r.C9881g.d
            /* renamed from: a */
            public Class mo18480a() {
                return InputStream.class;
            }

            @Override // p226r.C9881g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo18481b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p226r.C9881g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream mo18482c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public C9881g(d dVar) {
        this.f19786a = dVar;
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9888n.a mo18446b(File file, int i10, int i11, C9230d c9230d) {
        return new InterfaceC9888n.a(new C8514b(file), new c(file, this.f19786a));
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18445a(File file) {
        return true;
    }

    /* renamed from: r.g$c */
    public static final class c implements InterfaceC5405d {

        /* renamed from: a */
        public final File f19788a;

        /* renamed from: b */
        public final d f19789b;

        /* renamed from: c */
        public Object f19790c;

        public c(File file, d dVar) {
            this.f19788a = file;
            this.f19789b = dVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: a */
        public Class mo2846a() {
            return this.f19789b.mo18480a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: b */
        public void mo2851b() {
            Object obj = this.f19790c;
            if (obj != null) {
                try {
                    this.f19789b.mo18481b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: d */
        public void mo2853d(Priority priority, InterfaceC5405d.a aVar) {
            try {
                Object objMo18482c = this.f19789b.mo18482c(this.f19788a);
                this.f19790c = objMo18482c;
                aVar.mo2859e(objMo18482c);
            } catch (FileNotFoundException e10) {
                Log.isLoggable("FileLoader", 3);
                aVar.mo2858c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        public void cancel() {
        }
    }
}
