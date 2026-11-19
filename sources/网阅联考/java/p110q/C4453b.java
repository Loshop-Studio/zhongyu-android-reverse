package p110q;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p057f0.C3731b;
import p076j.C3794d;
import p081k.InterfaceC3843d;
import p110q.InterfaceC4464m;

/* renamed from: q.b */
/* loaded from: classes2.dex */
public class C4453b implements InterfaceC4464m {

    /* renamed from: a */
    public final b f5148a;

    /* renamed from: q.b$a */
    public static class a implements InterfaceC4465n {

        /* renamed from: q.b$a$a, reason: collision with other inner class name */
        public class C4764a implements b {
            public C4764a() {
            }

            @Override // p110q.C4453b.b
            /* renamed from: a */
            public Class mo5678a() {
                return ByteBuffer.class;
            }

            @Override // p110q.C4453b.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer mo5679b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4453b(new C4764a());
        }
    }

    /* renamed from: q.b$b */
    public interface b {
        /* renamed from: a */
        Class mo5678a();

        /* renamed from: b */
        Object mo5679b(byte[] bArr);
    }

    /* renamed from: q.b$c */
    public static class c implements InterfaceC3843d {

        /* renamed from: a */
        public final byte[] f5150a;

        /* renamed from: b */
        public final b f5151b;

        public c(byte[] bArr, b bVar) {
            this.f5150a = bArr;
            this.f5151b = bVar;
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: a */
        public Class mo5114a() {
            return this.f5151b.mo5678a();
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: b */
        public void mo5119b() {
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
            aVar.mo1830e(this.f5151b.mo5679b(this.f5150a));
        }
    }

    /* renamed from: q.b$d */
    public static class d implements InterfaceC4465n {

        /* renamed from: q.b$d$a */
        public class a implements b {
            public a() {
            }

            @Override // p110q.C4453b.b
            /* renamed from: a */
            public Class mo5678a() {
                return InputStream.class;
            }

            @Override // p110q.C4453b.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream mo5679b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4453b(new a());
        }
    }

    public C4453b(b bVar) {
        this.f5148a = bVar;
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4464m.a mo5671b(byte[] bArr, int i4, int i5, C3794d c3794d) {
        return new InterfaceC4464m.a(new C3731b(bArr), new c(bArr, this.f5148a));
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5670a(byte[] bArr) {
        return true;
    }
}
