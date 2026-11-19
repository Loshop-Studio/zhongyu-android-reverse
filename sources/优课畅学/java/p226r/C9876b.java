package p226r;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5405d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p105g0.C8514b;
import p160l.C9230d;
import p226r.InterfaceC9888n;

/* renamed from: r.b */
/* loaded from: classes3.dex */
public class C9876b implements InterfaceC9888n {

    /* renamed from: a */
    public final b f19764a;

    /* renamed from: r.b$a */
    public static class a implements InterfaceC9889o {

        /* renamed from: r.b$a$a, reason: collision with other inner class name */
        public class C10813a implements b {
            public C10813a() {
            }

            @Override // p226r.C9876b.b
            /* renamed from: a */
            public Class mo18453a() {
                return ByteBuffer.class;
            }

            @Override // p226r.C9876b.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer mo18454b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9876b(new C10813a());
        }
    }

    /* renamed from: r.b$b */
    public interface b {
        /* renamed from: a */
        Class mo18453a();

        /* renamed from: b */
        Object mo18454b(byte[] bArr);
    }

    /* renamed from: r.b$d */
    public static class d implements InterfaceC9889o {

        /* renamed from: r.b$d$a */
        public class a implements b {
            public a() {
            }

            @Override // p226r.C9876b.b
            /* renamed from: a */
            public Class mo18453a() {
                return InputStream.class;
            }

            @Override // p226r.C9876b.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream mo18454b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9876b(new a());
        }
    }

    public C9876b(b bVar) {
        this.f19764a = bVar;
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9888n.a mo18446b(byte[] bArr, int i10, int i11, C9230d c9230d) {
        return new InterfaceC9888n.a(new C8514b(bArr), new c(bArr, this.f19764a));
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18445a(byte[] bArr) {
        return true;
    }

    /* renamed from: r.b$c */
    public static class c implements InterfaceC5405d {

        /* renamed from: a */
        public final byte[] f19766a;

        /* renamed from: b */
        public final b f19767b;

        public c(byte[] bArr, b bVar) {
            this.f19766a = bArr;
            this.f19767b = bVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: a */
        public Class mo2846a() {
            return this.f19767b.mo18453a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: d */
        public void mo2853d(Priority priority, InterfaceC5405d.a aVar) {
            aVar.mo2859e(this.f19767b.mo18454b(this.f19766a));
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: b */
        public void mo2851b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        public void cancel() {
        }
    }
}
