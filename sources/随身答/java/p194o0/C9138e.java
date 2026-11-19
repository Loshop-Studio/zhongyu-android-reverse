package p194o0;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p080d1.C7737b;
import p122h0.C8084d;
import p132i0.InterfaceC8115d;
import p194o0.InterfaceC9146m;

/* renamed from: o0.e */
/* loaded from: classes3.dex */
public final class C9138e implements InterfaceC9146m {

    /* renamed from: a */
    public final a f15385a;

    /* renamed from: o0.e$a */
    public interface a {
        /* renamed from: a */
        Class mo14670a();

        /* renamed from: b */
        void mo14671b(Object obj);

        Object decode(String str);
    }

    /* renamed from: o0.e$c */
    public static final class c implements InterfaceC9147n {

        /* renamed from: a */
        public final a f15389a = new a();

        /* renamed from: o0.e$c$a */
        public class a implements a {
            public a() {
            }

            @Override // p194o0.C9138e.a
            /* renamed from: a */
            public Class mo14670a() {
                return InputStream.class;
            }

            @Override // p194o0.C9138e.a
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void mo14671b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p194o0.C9138e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public InputStream decode(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9138e(this.f15389a);
        }
    }

    public C9138e(a aVar) {
        this.f15385a = aVar;
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: a */
    public boolean mo14655a(Object obj) {
        return obj.toString().startsWith("data:image");
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: b */
    public InterfaceC9146m.a mo14656b(Object obj, int i9, int i10, C8084d c8084d) {
        return new InterfaceC9146m.a(new C7737b(obj), new b(obj.toString(), this.f15385a));
    }

    /* renamed from: o0.e$b */
    public static final class b implements InterfaceC8115d {

        /* renamed from: a */
        public final String f15386a;

        /* renamed from: b */
        public final a f15387b;

        /* renamed from: c */
        public Object f15388c;

        public b(String str, a aVar) {
            this.f15386a = str;
            this.f15387b = aVar;
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: a */
        public Class mo12978a() {
            return this.f15387b.mo14670a();
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: b */
        public void mo12983b() {
            try {
                this.f15387b.mo14671b(this.f15388c);
            } catch (IOException unused) {
            }
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: d */
        public void mo12985d(Priority priority, InterfaceC8115d.a aVar) {
            try {
                Object objDecode = this.f15387b.decode(this.f15386a);
                this.f15388c = objDecode;
                aVar.mo3155f(objDecode);
            } catch (IllegalArgumentException e10) {
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
