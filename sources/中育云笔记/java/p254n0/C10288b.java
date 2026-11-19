package p254n0;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5824d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p039c1.C5222d;
import p168h0.C9438e;
import p254n0.InterfaceC10300n;

/* renamed from: n0.b */
/* loaded from: classes3.dex */
public class C10288b implements InterfaceC10300n {

    /* renamed from: a */
    public final b f24487a;

    /* renamed from: n0.b$a */
    public static class a implements InterfaceC10301o {

        /* renamed from: n0.b$a$a, reason: collision with other inner class name */
        public class C12145a implements b {
            public C12145a() {
            }

            @Override // p254n0.C10288b.b
            /* renamed from: a */
            public Class mo21428a() {
                return ByteBuffer.class;
            }

            @Override // p254n0.C10288b.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer mo21429b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10288b(new C12145a());
        }
    }

    /* renamed from: n0.b$b */
    public interface b {
        /* renamed from: a */
        Class mo21428a();

        /* renamed from: b */
        Object mo21429b(byte[] bArr);
    }

    /* renamed from: n0.b$d */
    public static class d implements InterfaceC10301o {

        /* renamed from: n0.b$d$a */
        public class a implements b {
            public a() {
            }

            @Override // p254n0.C10288b.b
            /* renamed from: a */
            public Class mo21428a() {
                return InputStream.class;
            }

            @Override // p254n0.C10288b.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream mo21429b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10288b(new a());
        }
    }

    public C10288b(b bVar) {
        this.f24487a = bVar;
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC10300n.a mo21421b(byte[] bArr, int i10, int i11, C9438e c9438e) {
        return new InterfaceC10300n.a(new C5222d(bArr), new c(bArr, this.f24487a));
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo21420a(byte[] bArr) {
        return true;
    }

    /* renamed from: n0.b$c */
    public static class c implements InterfaceC5824d {

        /* renamed from: c */
        public final byte[] f24489c;

        /* renamed from: d */
        public final b f24490d;

        public c(byte[] bArr, b bVar) {
            this.f24489c = bArr;
            this.f24490d = bVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        /* renamed from: a */
        public Class mo4051a() {
            return this.f24490d.mo21428a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        /* renamed from: c */
        public void mo4057c(Priority priority, InterfaceC5824d.a aVar) {
            aVar.mo4063d(this.f24490d.mo21429b(this.f24489c));
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public void cleanup() {
        }
    }
}
