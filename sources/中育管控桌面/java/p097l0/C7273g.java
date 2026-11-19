package p097l0;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC4692d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p002a1.C0007b;
import p053f0.C6285d;
import p097l0.InterfaceC7280n;

/* renamed from: l0.g */
/* loaded from: classes3.dex */
public class C7273g implements InterfaceC7280n {

    /* renamed from: a */
    public final d f9197a;

    /* renamed from: l0.g$a */
    public static class a implements InterfaceC7281o {

        /* renamed from: a */
        public final d f9198a;

        public a(d dVar) {
            this.f9198a = dVar;
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public final InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7273g(this.f9198a);
        }
    }

    /* renamed from: l0.g$b */
    public static class b extends a {

        /* renamed from: l0.g$b$a */
        public class a implements d {
            @Override // p097l0.C7273g.d
            /* renamed from: a */
            public Class mo8225a() {
                return ParcelFileDescriptor.class;
            }

            @Override // p097l0.C7273g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo8226b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // p097l0.C7273g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor mo8227c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* renamed from: l0.g$d */
    public interface d {
        /* renamed from: a */
        Class mo8225a();

        /* renamed from: b */
        void mo8226b(Object obj);

        /* renamed from: c */
        Object mo8227c(File file);
    }

    /* renamed from: l0.g$e */
    public static class e extends a {

        /* renamed from: l0.g$e$a */
        public class a implements d {
            @Override // p097l0.C7273g.d
            /* renamed from: a */
            public Class mo8225a() {
                return InputStream.class;
            }

            @Override // p097l0.C7273g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo8226b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p097l0.C7273g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream mo8227c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public C7273g(d dVar) {
        this.f9197a = dVar;
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC7280n.a mo8191b(File file, int i6, int i7, C6285d c6285d) {
        return new InterfaceC7280n.a(new C0007b(file), new c(file, this.f9197a));
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo8190a(File file) {
        return true;
    }

    /* renamed from: l0.g$c */
    public static final class c implements InterfaceC4692d {

        /* renamed from: a */
        public final File f9199a;

        /* renamed from: b */
        public final d f9200b;

        /* renamed from: c */
        public Object f9201c;

        public c(File file, d dVar) {
            this.f9199a = file;
            this.f9200b = dVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: a */
        public Class mo2580a() {
            return this.f9200b.mo8225a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: b */
        public void mo2585b() {
            Object obj = this.f9201c;
            if (obj != null) {
                try {
                    this.f9200b.mo8226b(obj);
                } catch (IOException unused) {
                }
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
                Object objMo8227c = this.f9200b.mo8227c(this.f9199a);
                this.f9201c = objMo8227c;
                aVar.mo2594f(objMo8227c);
            } catch (FileNotFoundException e6) {
                Log.isLoggable("FileLoader", 3);
                aVar.mo2593c(e6);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        public void cancel() {
        }
    }
}
