package p097l0;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC4692d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p002a1.C0007b;
import p053f0.C6285d;
import p097l0.InterfaceC7280n;

/* renamed from: l0.e */
/* loaded from: classes3.dex */
public final class C7271e implements InterfaceC7280n {

    /* renamed from: a */
    public final a f9181a;

    /* renamed from: l0.e$a */
    public interface a {
        /* renamed from: a */
        Class mo8205a();

        /* renamed from: b */
        void mo8206b(Object obj);

        Object decode(String str);
    }

    /* renamed from: l0.e$c */
    public static final class c implements InterfaceC7281o {

        /* renamed from: a */
        public final a f9185a = new a();

        /* renamed from: l0.e$c$a */
        public class a implements a {
            public a() {
            }

            @Override // p097l0.C7271e.a
            /* renamed from: a */
            public Class mo8205a() {
                return InputStream.class;
            }

            @Override // p097l0.C7271e.a
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void mo8206b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p097l0.C7271e.a
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

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7271e(this.f9185a);
        }
    }

    public C7271e(a aVar) {
        this.f9181a = aVar;
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: a */
    public boolean mo8190a(Object obj) {
        return obj.toString().startsWith("data:image");
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: b */
    public InterfaceC7280n.a mo8191b(Object obj, int i6, int i7, C6285d c6285d) {
        return new InterfaceC7280n.a(new C0007b(obj), new b(obj.toString(), this.f9181a));
    }

    /* renamed from: l0.e$b */
    public static final class b implements InterfaceC4692d {

        /* renamed from: a */
        public final String f9182a;

        /* renamed from: b */
        public final a f9183b;

        /* renamed from: c */
        public Object f9184c;

        public b(String str, a aVar) {
            this.f9182a = str;
            this.f9183b = aVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: a */
        public Class mo2580a() {
            return this.f9183b.mo8205a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: b */
        public void mo2585b() {
            try {
                this.f9183b.mo8206b(this.f9184c);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: d */
        public DataSource mo2587d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: e */
        public void mo2588e(Priority priority, InterfaceC4692d.a aVar) {
            try {
                Object objDecode = this.f9183b.decode(this.f9182a);
                this.f9184c = objDecode;
                aVar.mo2594f(objDecode);
            } catch (IllegalArgumentException e6) {
                aVar.mo2593c(e6);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        public void cancel() {
        }
    }
}
