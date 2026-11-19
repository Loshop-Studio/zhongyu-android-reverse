package p240t1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import p011a9.AbstractC0063z;
import p011a9.C0059v;
import p011a9.C0060w;
import p011a9.C0062y;
import p207q1.AbstractC8880e;
import p240t1.InterfaceC9377a;

/* renamed from: t1.b */
/* loaded from: classes4.dex */
public class C9378b implements InterfaceC9377a, InterfaceC9377a.a {

    /* renamed from: a */
    public final C0059v f16281a;

    /* renamed from: b */
    public final C0060w.a f16282b;

    /* renamed from: c */
    public C0060w f16283c;

    /* renamed from: d */
    public C0062y f16284d;

    /* renamed from: t1.b$a */
    public static class a implements InterfaceC9377a.b {

        /* renamed from: a */
        public C0059v.a f16285a;

        /* renamed from: b */
        public volatile C0059v f16286b;

        @Override // p240t1.InterfaceC9377a.b
        /* renamed from: a */
        public InterfaceC9377a mo15679a(String str) {
            if (this.f16286b == null) {
                synchronized (a.class) {
                    try {
                        if (this.f16286b == null) {
                            C0059v.a aVar = this.f16285a;
                            this.f16286b = aVar != null ? aVar.m346c() : new C0059v();
                            this.f16285a = null;
                        }
                    } finally {
                    }
                }
            }
            return new C9378b(this.f16286b, str);
        }
    }

    public C9378b(C0059v c0059v, C0060w.a aVar) {
        this.f16281a = c0059v;
        this.f16282b = aVar;
    }

    @Override // p240t1.InterfaceC9377a.a
    /* renamed from: a */
    public String mo15674a() {
        C0062y c0062yM428t = this.f16284d.m428t();
        if (c0062yM428t != null && this.f16284d.m424p() && AbstractC8880e.m14918b(c0062yM428t.m418i())) {
            return this.f16284d.m431w().m381j().toString();
        }
        return null;
    }

    @Override // p240t1.InterfaceC9377a
    /* renamed from: b */
    public void mo15671b(String str, String str2) {
        this.f16282b.m383a(str, str2);
    }

    @Override // p240t1.InterfaceC9377a.a
    /* renamed from: c */
    public String mo15675c(String str) {
        C0062y c0062y = this.f16284d;
        if (c0062y == null) {
            return null;
        }
        return c0062y.m421l(str);
    }

    @Override // p240t1.InterfaceC9377a
    /* renamed from: d */
    public boolean mo15672d(String str) {
        this.f16282b.m391j(str, null);
        return true;
    }

    @Override // p240t1.InterfaceC9377a.a
    /* renamed from: e */
    public InputStream mo15676e() throws IOException {
        C0062y c0062y = this.f16284d;
        if (c0062y == null) {
            throw new IOException("Please invoke execute first!");
        }
        AbstractC0063z abstractC0063zM414a = c0062y.m414a();
        if (abstractC0063zM414a != null) {
            return abstractC0063zM414a.byteStream();
        }
        throw new IOException("no body found on response!");
    }

    @Override // p240t1.InterfaceC9377a
    public InterfaceC9377a.a execute() {
        C0060w c0060wM384b = this.f16282b.m384b();
        this.f16283c = c0060wM384b;
        this.f16284d = this.f16281a.mo109b(c0060wM384b).execute();
        return this;
    }

    @Override // p240t1.InterfaceC9377a
    /* renamed from: f */
    public Map mo15673f() {
        C0060w c0060w = this.f16283c;
        return c0060w != null ? c0060w.m376e().m183e() : this.f16282b.m384b().m376e().m183e();
    }

    @Override // p240t1.InterfaceC9377a.a
    /* renamed from: g */
    public Map mo15677g() {
        C0062y c0062y = this.f16284d;
        if (c0062y == null) {
            return null;
        }
        return c0062y.m423o().m183e();
    }

    @Override // p240t1.InterfaceC9377a.a
    /* renamed from: h */
    public int mo15678h() throws IOException {
        C0062y c0062y = this.f16284d;
        if (c0062y != null) {
            return c0062y.m418i();
        }
        throw new IOException("Please invoke execute first!");
    }

    @Override // p240t1.InterfaceC9377a
    public void release() {
        this.f16283c = null;
        C0062y c0062y = this.f16284d;
        if (c0062y != null) {
            c0062y.close();
        }
        this.f16284d = null;
    }

    public C9378b(C0059v c0059v, String str) {
        this(c0059v, new C0060w.a().m396o(str));
    }
}
