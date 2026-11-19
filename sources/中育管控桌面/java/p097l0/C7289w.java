package p097l0;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC4692d;
import p002a1.C0007b;
import p053f0.C6285d;
import p097l0.InterfaceC7280n;

/* renamed from: l0.w */
/* loaded from: classes3.dex */
public class C7289w implements InterfaceC7280n {

    /* renamed from: a */
    public static final C7289w f9266a = new C7289w();

    /* renamed from: l0.w$a */
    public static class a implements InterfaceC7281o {

        /* renamed from: a */
        public static final a f9267a = new a();

        /* renamed from: a */
        public static a m8286a() {
            return f9267a;
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return C7289w.m8285c();
        }
    }

    /* renamed from: c */
    public static C7289w m8285c() {
        return f9266a;
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: a */
    public boolean mo8190a(Object obj) {
        return true;
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: b */
    public InterfaceC7280n.a mo8191b(Object obj, int i6, int i7, C6285d c6285d) {
        return new InterfaceC7280n.a(new C0007b(obj), new b(obj));
    }

    /* renamed from: l0.w$b */
    public static class b implements InterfaceC4692d {

        /* renamed from: a */
        public final Object f9268a;

        public b(Object obj) {
            this.f9268a = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: a */
        public Class mo2580a() {
            return this.f9268a.getClass();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: d */
        public DataSource mo2587d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: e */
        public void mo2588e(Priority priority, InterfaceC4692d.a aVar) {
            aVar.mo2594f(this.f9268a);
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: b */
        public void mo2585b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        public void cancel() {
        }
    }
}
