package p228s0;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5356d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p106h1.C7617b;
import p162m0.C8539d;
import p228s0.InterfaceC9112n;

/* renamed from: s0.b */
/* loaded from: classes3.dex */
public class C9100b implements InterfaceC9112n {

    /* renamed from: a */
    public final b f15729a;

    /* renamed from: s0.b$a */
    public static class a implements InterfaceC9113o {

        /* renamed from: s0.b$a$a, reason: collision with other inner class name */
        public class C10157a implements b {
            public C10157a() {
            }

            @Override // p228s0.C9100b.b
            /* renamed from: a */
            public Class mo15362a() {
                return ByteBuffer.class;
            }

            @Override // p228s0.C9100b.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer mo15363b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9100b(new C10157a());
        }
    }

    /* renamed from: s0.b$b */
    public interface b {
        /* renamed from: a */
        Class mo15362a();

        /* renamed from: b */
        Object mo15363b(byte[] bArr);
    }

    /* renamed from: s0.b$d */
    public static class d implements InterfaceC9113o {

        /* renamed from: s0.b$d$a */
        public class a implements b {
            public a() {
            }

            @Override // p228s0.C9100b.b
            /* renamed from: a */
            public Class mo15362a() {
                return InputStream.class;
            }

            @Override // p228s0.C9100b.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream mo15363b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9100b(new a());
        }
    }

    public C9100b(b bVar) {
        this.f15729a = bVar;
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9112n.a mo15355b(byte[] bArr, int i10, int i11, C8539d c8539d) {
        return new InterfaceC9112n.a(new C7617b(bArr), new c(bArr, this.f15729a));
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo15354a(byte[] bArr) {
        return true;
    }

    /* renamed from: s0.b$c */
    public static class c implements InterfaceC5356d {

        /* renamed from: a */
        public final byte[] f15731a;

        /* renamed from: b */
        public final b f15732b;

        public c(byte[] bArr, b bVar) {
            this.f15731a = bArr;
            this.f15732b = bVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: a */
        public Class mo3399a() {
            return this.f15732b.mo15362a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: d */
        public DataSource mo3406d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: e */
        public void mo3407e(Priority priority, InterfaceC5356d.a aVar) {
            aVar.mo3413f(this.f15732b.mo15363b(this.f15731a));
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: b */
        public void mo3404b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        public void cancel() {
        }
    }
}
