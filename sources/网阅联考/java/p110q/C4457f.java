package p110q;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p057f0.C3731b;
import p076j.C3794d;
import p081k.InterfaceC3843d;
import p110q.InterfaceC4464m;

/* renamed from: q.f */
/* loaded from: classes2.dex */
public class C4457f implements InterfaceC4464m {

    /* renamed from: a */
    public final d f5160a;

    /* renamed from: q.f$a */
    public static class a implements InterfaceC4465n {

        /* renamed from: a */
        public final d f5161a;

        public a(d dVar) {
            this.f5161a = dVar;
        }

        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public final InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4457f(this.f5161a);
        }
    }

    /* renamed from: q.f$b */
    public static class b extends a {

        /* renamed from: q.f$b$a */
        public class a implements d {
            @Override // p110q.C4457f.d
            /* renamed from: a */
            public Class mo5692a() {
                return ParcelFileDescriptor.class;
            }

            @Override // p110q.C4457f.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo5693b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // p110q.C4457f.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor mo5694c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* renamed from: q.f$c */
    public static final class c implements InterfaceC3843d {

        /* renamed from: a */
        public final File f5162a;

        /* renamed from: b */
        public final d f5163b;

        /* renamed from: c */
        public Object f5164c;

        public c(File file, d dVar) {
            this.f5162a = file;
            this.f5163b = dVar;
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: a */
        public Class mo5114a() {
            return this.f5163b.mo5692a();
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: b */
        public void mo5119b() {
            Object obj = this.f5164c;
            if (obj != null) {
                try {
                    this.f5163b.mo5693b(obj);
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
        public void mo5123f(Priority priority, InterfaceC3843d.a aVar) {
            try {
                Object objMo5694c = this.f5163b.mo5694c(this.f5162a);
                this.f5164c = objMo5694c;
                aVar.mo1830e(objMo5694c);
            } catch (FileNotFoundException e4) {
                Log.isLoggable("FileLoader", 3);
                aVar.mo1829c(e4);
            }
        }
    }

    /* renamed from: q.f$d */
    public interface d {
        /* renamed from: a */
        Class mo5692a();

        /* renamed from: b */
        void mo5693b(Object obj);

        /* renamed from: c */
        Object mo5694c(File file);
    }

    /* renamed from: q.f$e */
    public static class e extends a {

        /* renamed from: q.f$e$a */
        public class a implements d {
            @Override // p110q.C4457f.d
            /* renamed from: a */
            public Class mo5692a() {
                return InputStream.class;
            }

            @Override // p110q.C4457f.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo5693b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p110q.C4457f.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream mo5694c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public C4457f(d dVar) {
        this.f5160a = dVar;
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4464m.a mo5671b(File file, int i4, int i5, C3794d c3794d) {
        return new InterfaceC4464m.a(new C3731b(file), new c(file, this.f5160a));
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5670a(File file) {
        return true;
    }
}
