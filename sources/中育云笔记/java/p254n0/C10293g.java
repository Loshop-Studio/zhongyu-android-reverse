package p254n0;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5824d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p039c1.C5222d;
import p168h0.C9438e;
import p254n0.InterfaceC10300n;

/* renamed from: n0.g */
/* loaded from: classes3.dex */
public class C10293g implements InterfaceC10300n {

    /* renamed from: a */
    public final d f24509a;

    /* renamed from: n0.g$a */
    public static class a implements InterfaceC10301o {

        /* renamed from: a */
        public final d f24510a;

        public a(d dVar) {
            this.f24510a = dVar;
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public final InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10293g(this.f24510a);
        }
    }

    /* renamed from: n0.g$b */
    public static class b extends a {

        /* renamed from: n0.g$b$a */
        public class a implements d {
            @Override // p254n0.C10293g.d
            /* renamed from: a */
            public Class mo21453a() {
                return ParcelFileDescriptor.class;
            }

            @Override // p254n0.C10293g.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void close(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // p254n0.C10293g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor mo21454b(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* renamed from: n0.g$d */
    public interface d {
        /* renamed from: a */
        Class mo21453a();

        /* renamed from: b */
        Object mo21454b(File file);

        void close(Object obj);
    }

    /* renamed from: n0.g$e */
    public static class e extends a {

        /* renamed from: n0.g$e$a */
        public class a implements d {
            @Override // p254n0.C10293g.d
            /* renamed from: a */
            public Class mo21453a() {
                return InputStream.class;
            }

            @Override // p254n0.C10293g.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void close(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p254n0.C10293g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public InputStream mo21454b(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public C10293g(d dVar) {
        this.f24509a = dVar;
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC10300n.a mo21421b(File file, int i10, int i11, C9438e c9438e) {
        return new InterfaceC10300n.a(new C5222d(file), new c(file, this.f24509a));
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo21420a(File file) {
        return true;
    }

    /* renamed from: n0.g$c */
    public static final class c implements InterfaceC5824d {

        /* renamed from: c */
        public final File f24511c;

        /* renamed from: d */
        public final d f24512d;

        /* renamed from: e */
        public Object f24513e;

        public c(File file, d dVar) {
            this.f24511c = file;
            this.f24512d = dVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        /* renamed from: a */
        public Class mo4051a() {
            return this.f24512d.mo21453a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        /* renamed from: c */
        public void mo4057c(Priority priority, InterfaceC5824d.a aVar) {
            try {
                Object objMo21454b = this.f24512d.mo21454b(this.f24511c);
                this.f24513e = objMo21454b;
                aVar.mo4063d(objMo21454b);
            } catch (FileNotFoundException e10) {
                Log.isLoggable("FileLoader", 3);
                aVar.mo4062b(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public void cleanup() {
            Object obj = this.f24513e;
            if (obj != null) {
                try {
                    this.f24512d.close(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public void cancel() {
        }
    }
}
