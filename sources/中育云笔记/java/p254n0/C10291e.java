package p254n0;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5824d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p039c1.C5222d;
import p168h0.C9438e;
import p254n0.InterfaceC10300n;

/* renamed from: n0.e */
/* loaded from: classes3.dex */
public final class C10291e implements InterfaceC10300n {

    /* renamed from: a */
    public final a f24493a;

    /* renamed from: n0.e$a */
    public interface a {
        /* renamed from: a */
        Class mo21435a();

        void close(Object obj);

        Object decode(String str);
    }

    /* renamed from: n0.e$c */
    public static final class c implements InterfaceC10301o {

        /* renamed from: a */
        public final a f24497a = new a();

        /* renamed from: n0.e$c$a */
        public class a implements a {
            public a() {
            }

            @Override // p254n0.C10291e.a
            /* renamed from: a */
            public Class mo21435a() {
                return InputStream.class;
            }

            @Override // p254n0.C10291e.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void close(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p254n0.C10291e.a
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
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

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10291e(this.f24497a);
        }
    }

    public C10291e(a aVar) {
        this.f24493a = aVar;
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: a */
    public boolean mo21420a(Object obj) {
        return obj.toString().startsWith("data:image");
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: b */
    public InterfaceC10300n.a mo21421b(Object obj, int i10, int i11, C9438e c9438e) {
        return new InterfaceC10300n.a(new C5222d(obj), new b(obj.toString(), this.f24493a));
    }

    /* renamed from: n0.e$b */
    public static final class b implements InterfaceC5824d {

        /* renamed from: c */
        public final String f24494c;

        /* renamed from: d */
        public final a f24495d;

        /* renamed from: e */
        public Object f24496e;

        public b(String str, a aVar) {
            this.f24494c = str;
            this.f24495d = aVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        /* renamed from: a */
        public Class mo4051a() {
            return this.f24495d.mo21435a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        /* renamed from: c */
        public void mo4057c(Priority priority, InterfaceC5824d.a aVar) {
            try {
                Object objDecode = this.f24495d.decode(this.f24494c);
                this.f24496e = objDecode;
                aVar.mo4063d(objDecode);
            } catch (IllegalArgumentException e10) {
                aVar.mo4062b(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public void cleanup() {
            try {
                this.f24495d.close(this.f24496e);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public void cancel() {
        }
    }
}
