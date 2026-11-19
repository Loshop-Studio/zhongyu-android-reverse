package p228s0;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5356d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p106h1.C7617b;
import p162m0.C8539d;
import p228s0.InterfaceC9112n;

/* renamed from: s0.g */
/* loaded from: classes3.dex */
public class C9105g implements InterfaceC9112n {

    /* renamed from: a */
    public final d f15751a;

    /* renamed from: s0.g$a */
    public static class a implements InterfaceC9113o {

        /* renamed from: a */
        public final d f15752a;

        public a(d dVar) {
            this.f15752a = dVar;
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public final InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9105g(this.f15752a);
        }
    }

    /* renamed from: s0.g$b */
    public static class b extends a {

        /* renamed from: s0.g$b$a */
        public class a implements d {
            @Override // p228s0.C9105g.d
            /* renamed from: a */
            public Class mo15389a() {
                return ParcelFileDescriptor.class;
            }

            @Override // p228s0.C9105g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo15390b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // p228s0.C9105g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor mo15391c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* renamed from: s0.g$d */
    public interface d {
        /* renamed from: a */
        Class mo15389a();

        /* renamed from: b */
        void mo15390b(Object obj);

        /* renamed from: c */
        Object mo15391c(File file);
    }

    /* renamed from: s0.g$e */
    public static class e extends a {

        /* renamed from: s0.g$e$a */
        public class a implements d {
            @Override // p228s0.C9105g.d
            /* renamed from: a */
            public Class mo15389a() {
                return InputStream.class;
            }

            @Override // p228s0.C9105g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo15390b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p228s0.C9105g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream mo15391c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public C9105g(d dVar) {
        this.f15751a = dVar;
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9112n.a mo15355b(File file, int i10, int i11, C8539d c8539d) {
        return new InterfaceC9112n.a(new C7617b(file), new c(file, this.f15751a));
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo15354a(File file) {
        return true;
    }

    /* renamed from: s0.g$c */
    public static final class c implements InterfaceC5356d {

        /* renamed from: a */
        public final File f15753a;

        /* renamed from: b */
        public final d f15754b;

        /* renamed from: c */
        public Object f15755c;

        public c(File file, d dVar) {
            this.f15753a = file;
            this.f15754b = dVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: a */
        public Class mo3399a() {
            return this.f15754b.mo15389a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: b */
        public void mo3404b() {
            Object obj = this.f15755c;
            if (obj != null) {
                try {
                    this.f15754b.mo15390b(obj);
                } catch (IOException unused) {
                }
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
                Object objMo15391c = this.f15754b.mo15391c(this.f15753a);
                this.f15755c = objMo15391c;
                aVar.mo3413f(objMo15391c);
            } catch (FileNotFoundException e10) {
                Log.isLoggable("FileLoader", 3);
                aVar.mo3412c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        public void cancel() {
        }
    }
}
