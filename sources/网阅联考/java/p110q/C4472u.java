package p110q;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import p057f0.C3731b;
import p076j.C3794d;
import p081k.InterfaceC3843d;
import p110q.InterfaceC4464m;

/* renamed from: q.u */
/* loaded from: classes2.dex */
public class C4472u implements InterfaceC4464m {

    /* renamed from: a */
    public static final C4472u f5226a = new C4472u();

    /* renamed from: q.u$a */
    public static class a implements InterfaceC4465n {

        /* renamed from: a */
        public static final a f5227a = new a();

        /* renamed from: a */
        public static a m5747a() {
            return f5227a;
        }

        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return C4472u.m5746c();
        }
    }

    /* renamed from: q.u$b */
    public static class b implements InterfaceC3843d {

        /* renamed from: a */
        public final Object f5228a;

        public b(Object obj) {
            this.f5228a = obj;
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: a */
        public Class mo5114a() {
            return this.f5228a.getClass();
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: b */
        public void mo5119b() {
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
            aVar.mo1830e(this.f5228a);
        }
    }

    /* renamed from: c */
    public static C4472u m5746c() {
        return f5226a;
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: a */
    public boolean mo5670a(Object obj) {
        return true;
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: b */
    public InterfaceC4464m.a mo5671b(Object obj, int i4, int i5, C3794d c3794d) {
        return new InterfaceC4464m.a(new C3731b(obj), new b(obj));
    }
}
