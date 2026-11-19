package p239s1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import p172l8.AbstractC8927z;
import p172l8.C8923v;
import p172l8.C8924w;
import p172l8.C8926y;
import p209p1.AbstractC9316e;
import p239s1.InterfaceC9465a;

/* renamed from: s1.b */
/* loaded from: classes4.dex */
public class C9466b implements InterfaceC9465a, InterfaceC9465a.a {

    /* renamed from: a */
    public final C8923v f16496a;

    /* renamed from: b */
    public final C8924w.a f16497b;

    /* renamed from: c */
    public C8924w f16498c;

    /* renamed from: d */
    public C8926y f16499d;

    /* renamed from: s1.b$a */
    public static class a implements InterfaceC9465a.b {

        /* renamed from: a */
        public C8923v.a f16500a;

        /* renamed from: b */
        public volatile C8923v f16501b;

        @Override // p239s1.InterfaceC9465a.b
        /* renamed from: a */
        public InterfaceC9465a mo15643a(String str) {
            if (this.f16501b == null) {
                synchronized (a.class) {
                    try {
                        if (this.f16501b == null) {
                            C8923v.a aVar = this.f16500a;
                            this.f16501b = aVar != null ? aVar.m14102c() : new C8923v();
                            this.f16500a = null;
                        }
                    } finally {
                    }
                }
            }
            return new C9466b(this.f16501b, str);
        }
    }

    public C9466b(C8923v c8923v, C8924w.a aVar) {
        this.f16496a = c8923v;
        this.f16497b = aVar;
    }

    @Override // p239s1.InterfaceC9465a.a
    /* renamed from: a */
    public String mo15638a() {
        C8926y c8926yM14184t = this.f16499d.m14184t();
        if (c8926yM14184t != null && this.f16499d.m14180p() && AbstractC9316e.m15195b(c8926yM14184t.m14174i())) {
            return this.f16499d.m14187w().m14137j().toString();
        }
        return null;
    }

    @Override // p239s1.InterfaceC9465a
    /* renamed from: b */
    public void mo15635b(String str, String str2) {
        this.f16497b.m14139a(str, str2);
    }

    @Override // p239s1.InterfaceC9465a.a
    /* renamed from: c */
    public String mo15639c(String str) {
        C8926y c8926y = this.f16499d;
        if (c8926y == null) {
            return null;
        }
        return c8926y.m14177l(str);
    }

    @Override // p239s1.InterfaceC9465a
    /* renamed from: d */
    public boolean mo15636d(String str) {
        this.f16497b.m14147j(str, null);
        return true;
    }

    @Override // p239s1.InterfaceC9465a.a
    /* renamed from: e */
    public InputStream mo15640e() throws IOException {
        C8926y c8926y = this.f16499d;
        if (c8926y == null) {
            throw new IOException("Please invoke execute first!");
        }
        AbstractC8927z abstractC8927zM14170a = c8926y.m14170a();
        if (abstractC8927zM14170a != null) {
            return abstractC8927zM14170a.byteStream();
        }
        throw new IOException("no body found on response!");
    }

    @Override // p239s1.InterfaceC9465a
    public InterfaceC9465a.a execute() {
        C8924w c8924wM14140b = this.f16497b.m14140b();
        this.f16498c = c8924wM14140b;
        this.f16499d = this.f16496a.mo13868b(c8924wM14140b).execute();
        return this;
    }

    @Override // p239s1.InterfaceC9465a
    /* renamed from: f */
    public Map mo15637f() {
        C8924w c8924w = this.f16498c;
        return c8924w != null ? c8924w.m14132e().m13939e() : this.f16497b.m14140b().m14132e().m13939e();
    }

    @Override // p239s1.InterfaceC9465a.a
    /* renamed from: g */
    public Map mo15641g() {
        C8926y c8926y = this.f16499d;
        if (c8926y == null) {
            return null;
        }
        return c8926y.m14179o().m13939e();
    }

    @Override // p239s1.InterfaceC9465a.a
    /* renamed from: h */
    public int mo15642h() throws IOException {
        C8926y c8926y = this.f16499d;
        if (c8926y != null) {
            return c8926y.m14174i();
        }
        throw new IOException("Please invoke execute first!");
    }

    @Override // p239s1.InterfaceC9465a
    public void release() {
        this.f16498c = null;
        C8926y c8926y = this.f16499d;
        if (c8926y != null) {
            c8926y.close();
        }
        this.f16499d = null;
    }

    public C9466b(C8923v c8923v, String str) {
        this(c8923v, new C8924w.a().m14151n(str));
    }
}
