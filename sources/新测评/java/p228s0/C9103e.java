package p228s0;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5356d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p106h1.C7617b;
import p162m0.C8539d;
import p228s0.InterfaceC9112n;

/* renamed from: s0.e */
/* loaded from: classes3.dex */
public final class C9103e implements InterfaceC9112n {

    /* renamed from: a */
    public final a f15735a;

    /* renamed from: s0.e$a */
    public interface a {
        /* renamed from: a */
        Class mo15369a();

        /* renamed from: b */
        void mo15370b(Object obj);

        Object decode(String str);
    }

    /* renamed from: s0.e$c */
    public static final class c implements InterfaceC9113o {

        /* renamed from: a */
        public final a f15739a = new a();

        /* renamed from: s0.e$c$a */
        public class a implements a {
            public a() {
            }

            @Override // p228s0.C9103e.a
            /* renamed from: a */
            public Class mo15369a() {
                return InputStream.class;
            }

            @Override // p228s0.C9103e.a
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void mo15370b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p228s0.C9103e.a
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

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9103e(this.f15739a);
        }
    }

    public C9103e(a aVar) {
        this.f15735a = aVar;
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: a */
    public boolean mo15354a(Object obj) {
        return obj.toString().startsWith("data:image");
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: b */
    public InterfaceC9112n.a mo15355b(Object obj, int i10, int i11, C8539d c8539d) {
        return new InterfaceC9112n.a(new C7617b(obj), new b(obj.toString(), this.f15735a));
    }

    /* renamed from: s0.e$b */
    public static final class b implements InterfaceC5356d {

        /* renamed from: a */
        public final String f15736a;

        /* renamed from: b */
        public final a f15737b;

        /* renamed from: c */
        public Object f15738c;

        public b(String str, a aVar) {
            this.f15736a = str;
            this.f15737b = aVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: a */
        public Class mo3399a() {
            return this.f15737b.mo15369a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: b */
        public void mo3404b() {
            try {
                this.f15737b.mo15370b(this.f15738c);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: d */
        public DataSource mo3406d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: e */
        public void mo3407e(Priority priority, InterfaceC5356d.a aVar) {
            try {
                Object objDecode = this.f15737b.decode(this.f15736a);
                this.f15738c = objDecode;
                aVar.mo3413f(objDecode);
            } catch (IllegalArgumentException e10) {
                aVar.mo3412c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        public void cancel() {
        }
    }
}
