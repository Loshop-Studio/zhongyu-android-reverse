package p110q;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p057f0.C3731b;
import p076j.C3794d;
import p081k.InterfaceC3843d;
import p110q.InterfaceC4464m;

/* renamed from: q.e */
/* loaded from: classes2.dex */
public final class C4456e implements InterfaceC4464m {

    /* renamed from: a */
    public final a f5154a;

    /* renamed from: q.e$a */
    public interface a {
        /* renamed from: a */
        Class mo5685a();

        /* renamed from: b */
        void mo5686b(Object obj);

        /* renamed from: c */
        Object mo5687c(String str);
    }

    /* renamed from: q.e$b */
    public static final class b implements InterfaceC3843d {

        /* renamed from: a */
        public final String f5155a;

        /* renamed from: b */
        public final a f5156b;

        /* renamed from: c */
        public Object f5157c;

        public b(String str, a aVar) {
            this.f5155a = str;
            this.f5156b = aVar;
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: a */
        public Class mo5114a() {
            return this.f5156b.mo5685a();
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: b */
        public void mo5119b() {
            try {
                this.f5156b.mo5686b(this.f5157c);
            } catch (IOException unused) {
            }
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
            try {
                Object objMo5687c = this.f5156b.mo5687c(this.f5155a);
                this.f5157c = objMo5687c;
                aVar.mo1830e(objMo5687c);
            } catch (IllegalArgumentException e4) {
                aVar.mo1829c(e4);
            }
        }
    }

    /* renamed from: q.e$c */
    public static final class c implements InterfaceC4465n {

        /* renamed from: a */
        public final a f5158a = new a();

        /* renamed from: q.e$c$a */
        public class a implements a {
            public a() {
            }

            @Override // p110q.C4456e.a
            /* renamed from: a */
            public Class mo5685a() {
                return InputStream.class;
            }

            @Override // p110q.C4456e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo5686b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p110q.C4456e.a
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream mo5687c(String str) {
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

        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4456e(this.f5158a);
        }
    }

    public C4456e(a aVar) {
        this.f5154a = aVar;
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: a */
    public boolean mo5670a(Object obj) {
        return obj.toString().startsWith("data:image");
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: b */
    public InterfaceC4464m.a mo5671b(Object obj, int i4, int i5, C3794d c3794d) {
        return new InterfaceC4464m.a(new C3731b(obj), new b(obj.toString(), this.f5154a));
    }
}
