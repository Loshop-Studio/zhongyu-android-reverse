package p097l0;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC4692d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p002a1.C0007b;
import p053f0.C6285d;
import p097l0.InterfaceC7280n;

/* renamed from: l0.b */
/* loaded from: classes3.dex */
public class C7268b implements InterfaceC7280n {

    /* renamed from: a */
    public final b f9175a;

    /* renamed from: l0.b$a */
    public static class a implements InterfaceC7281o {

        /* renamed from: l0.b$a$a, reason: collision with other inner class name */
        public class C8033a implements b {
            public C8033a() {
            }

            @Override // p097l0.C7268b.b
            /* renamed from: a */
            public Class mo8198a() {
                return ByteBuffer.class;
            }

            @Override // p097l0.C7268b.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer mo8199b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7268b(new C8033a());
        }
    }

    /* renamed from: l0.b$b */
    public interface b {
        /* renamed from: a */
        Class mo8198a();

        /* renamed from: b */
        Object mo8199b(byte[] bArr);
    }

    /* renamed from: l0.b$d */
    public static class d implements InterfaceC7281o {

        /* renamed from: l0.b$d$a */
        public class a implements b {
            public a() {
            }

            @Override // p097l0.C7268b.b
            /* renamed from: a */
            public Class mo8198a() {
                return InputStream.class;
            }

            @Override // p097l0.C7268b.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream mo8199b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7268b(new a());
        }
    }

    public C7268b(b bVar) {
        this.f9175a = bVar;
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC7280n.a mo8191b(byte[] bArr, int i6, int i7, C6285d c6285d) {
        return new InterfaceC7280n.a(new C0007b(bArr), new c(bArr, this.f9175a));
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo8190a(byte[] bArr) {
        return true;
    }

    /* renamed from: l0.b$c */
    public static class c implements InterfaceC4692d {

        /* renamed from: a */
        public final byte[] f9177a;

        /* renamed from: b */
        public final b f9178b;

        public c(byte[] bArr, b bVar) {
            this.f9177a = bArr;
            this.f9178b = bVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: a */
        public Class mo2580a() {
            return this.f9178b.mo8198a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: d */
        public DataSource mo2587d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: e */
        public void mo2588e(Priority priority, InterfaceC4692d.a aVar) {
            aVar.mo2594f(this.f9178b.mo8199b(this.f9177a));
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: b */
        public void mo2585b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        public void cancel() {
        }
    }
}
