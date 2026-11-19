package p194o0;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p080d1.C7737b;
import p122h0.C8084d;
import p132i0.InterfaceC8115d;
import p194o0.InterfaceC9146m;

/* renamed from: o0.f */
/* loaded from: classes3.dex */
public class C9139f implements InterfaceC9146m {

    /* renamed from: a */
    public final d f15391a;

    /* renamed from: o0.f$a */
    public static class a implements InterfaceC9147n {

        /* renamed from: a */
        public final d f15392a;

        public a(d dVar) {
            this.f15392a = dVar;
        }

        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public final InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9139f(this.f15392a);
        }
    }

    /* renamed from: o0.f$b */
    public static class b extends a {

        /* renamed from: o0.f$b$a */
        public class a implements d {
            @Override // p194o0.C9139f.d
            /* renamed from: a */
            public Class mo14676a() {
                return ParcelFileDescriptor.class;
            }

            @Override // p194o0.C9139f.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo14677b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // p194o0.C9139f.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor mo14678c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* renamed from: o0.f$d */
    public interface d {
        /* renamed from: a */
        Class mo14676a();

        /* renamed from: b */
        void mo14677b(Object obj);

        /* renamed from: c */
        Object mo14678c(File file);
    }

    /* renamed from: o0.f$e */
    public static class e extends a {

        /* renamed from: o0.f$e$a */
        public class a implements d {
            @Override // p194o0.C9139f.d
            /* renamed from: a */
            public Class mo14676a() {
                return InputStream.class;
            }

            @Override // p194o0.C9139f.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo14677b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p194o0.C9139f.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream mo14678c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public C9139f(d dVar) {
        this.f15391a = dVar;
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9146m.a mo14656b(File file, int i9, int i10, C8084d c8084d) {
        return new InterfaceC9146m.a(new C7737b(file), new c(file, this.f15391a));
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo14655a(File file) {
        return true;
    }

    /* renamed from: o0.f$c */
    public static final class c implements InterfaceC8115d {

        /* renamed from: a */
        public final File f15393a;

        /* renamed from: b */
        public final d f15394b;

        /* renamed from: c */
        public Object f15395c;

        public c(File file, d dVar) {
            this.f15393a = file;
            this.f15394b = dVar;
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: a */
        public Class mo12978a() {
            return this.f15394b.mo14676a();
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: b */
        public void mo12983b() {
            Object obj = this.f15395c;
            if (obj != null) {
                try {
                    this.f15394b.mo14677b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: d */
        public void mo12985d(Priority priority, InterfaceC8115d.a aVar) {
            try {
                Object objMo14678c = this.f15394b.mo14678c(this.f15393a);
                this.f15395c = objMo14678c;
                aVar.mo3155f(objMo14678c);
            } catch (FileNotFoundException e10) {
                Log.isLoggable("FileLoader", 3);
                aVar.mo3154c(e10);
            }
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: e */
        public DataSource mo12986e() {
            return DataSource.LOCAL;
        }

        @Override // p132i0.InterfaceC8115d
        public void cancel() {
        }
    }
}
