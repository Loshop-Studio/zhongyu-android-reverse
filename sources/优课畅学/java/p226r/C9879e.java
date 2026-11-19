package p226r;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5405d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p105g0.C8514b;
import p160l.C9230d;
import p226r.InterfaceC9888n;

/* renamed from: r.e */
/* loaded from: classes3.dex */
public final class C9879e implements InterfaceC9888n {

    /* renamed from: a */
    public final a f19770a;

    /* renamed from: r.e$a */
    public interface a {
        /* renamed from: a */
        Class mo18460a();

        /* renamed from: b */
        void mo18461b(Object obj);

        Object decode(String str);
    }

    /* renamed from: r.e$c */
    public static final class c implements InterfaceC9889o {

        /* renamed from: a */
        public final a f19774a = new a();

        /* renamed from: r.e$c$a */
        public class a implements a {
            public a() {
            }

            @Override // p226r.C9879e.a
            /* renamed from: a */
            public Class mo18460a() {
                return InputStream.class;
            }

            @Override // p226r.C9879e.a
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void mo18461b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p226r.C9879e.a
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

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9879e(this.f19774a);
        }
    }

    public C9879e(a aVar) {
        this.f19770a = aVar;
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: a */
    public boolean mo18445a(Object obj) {
        return obj.toString().startsWith("data:image");
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: b */
    public InterfaceC9888n.a mo18446b(Object obj, int i10, int i11, C9230d c9230d) {
        return new InterfaceC9888n.a(new C8514b(obj), new b(obj.toString(), this.f19770a));
    }

    /* renamed from: r.e$b */
    public static final class b implements InterfaceC5405d {

        /* renamed from: a */
        public final String f19771a;

        /* renamed from: b */
        public final a f19772b;

        /* renamed from: c */
        public Object f19773c;

        public b(String str, a aVar) {
            this.f19771a = str;
            this.f19772b = aVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: a */
        public Class mo2846a() {
            return this.f19772b.mo18460a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: b */
        public void mo2851b() {
            try {
                this.f19772b.mo18461b(this.f19773c);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: d */
        public void mo2853d(Priority priority, InterfaceC5405d.a aVar) {
            try {
                Object objDecode = this.f19772b.decode(this.f19771a);
                this.f19773c = objDecode;
                aVar.mo2859e(objDecode);
            } catch (IllegalArgumentException e10) {
                aVar.mo2858c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        public void cancel() {
        }
    }
}
