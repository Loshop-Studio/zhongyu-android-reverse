package p194o0;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p080d1.C7737b;
import p122h0.C8084d;
import p132i0.InterfaceC8115d;
import p194o0.InterfaceC9146m;

/* renamed from: o0.b */
/* loaded from: classes3.dex */
public class C9135b implements InterfaceC9146m {

    /* renamed from: a */
    public final b f15379a;

    /* renamed from: o0.b$a */
    public static class a implements InterfaceC9147n {

        /* renamed from: o0.b$a$a, reason: collision with other inner class name */
        public class C10082a implements b {
            public C10082a() {
            }

            @Override // p194o0.C9135b.b
            /* renamed from: a */
            public Class mo14663a() {
                return ByteBuffer.class;
            }

            @Override // p194o0.C9135b.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer mo14664b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9135b(new C10082a());
        }
    }

    /* renamed from: o0.b$b */
    public interface b {
        /* renamed from: a */
        Class mo14663a();

        /* renamed from: b */
        Object mo14664b(byte[] bArr);
    }

    /* renamed from: o0.b$d */
    public static class d implements InterfaceC9147n {

        /* renamed from: o0.b$d$a */
        public class a implements b {
            public a() {
            }

            @Override // p194o0.C9135b.b
            /* renamed from: a */
            public Class mo14663a() {
                return InputStream.class;
            }

            @Override // p194o0.C9135b.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream mo14664b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9135b(new a());
        }
    }

    public C9135b(b bVar) {
        this.f15379a = bVar;
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9146m.a mo14656b(byte[] bArr, int i9, int i10, C8084d c8084d) {
        return new InterfaceC9146m.a(new C7737b(bArr), new c(bArr, this.f15379a));
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo14655a(byte[] bArr) {
        return true;
    }

    /* renamed from: o0.b$c */
    public static class c implements InterfaceC8115d {

        /* renamed from: a */
        public final byte[] f15381a;

        /* renamed from: b */
        public final b f15382b;

        public c(byte[] bArr, b bVar) {
            this.f15381a = bArr;
            this.f15382b = bVar;
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: a */
        public Class mo12978a() {
            return this.f15382b.mo14663a();
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: d */
        public void mo12985d(Priority priority, InterfaceC8115d.a aVar) {
            aVar.mo3155f(this.f15382b.mo14664b(this.f15381a));
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: e */
        public DataSource mo12986e() {
            return DataSource.LOCAL;
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: b */
        public void mo12983b() {
        }

        @Override // p132i0.InterfaceC8115d
        public void cancel() {
        }
    }
}
