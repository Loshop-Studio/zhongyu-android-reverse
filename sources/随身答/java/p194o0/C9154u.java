package p194o0;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import p080d1.C7737b;
import p122h0.C8084d;
import p132i0.InterfaceC8115d;
import p194o0.InterfaceC9146m;

/* renamed from: o0.u */
/* loaded from: classes3.dex */
public class C9154u implements InterfaceC9146m {

    /* renamed from: a */
    public static final C9154u f15457a = new C9154u();

    /* renamed from: o0.u$a */
    public static class a implements InterfaceC9147n {

        /* renamed from: a */
        public static final a f15458a = new a();

        /* renamed from: a */
        public static a m14731a() {
            return f15458a;
        }

        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return C9154u.m14730c();
        }
    }

    /* renamed from: c */
    public static C9154u m14730c() {
        return f15457a;
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: a */
    public boolean mo14655a(Object obj) {
        return true;
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: b */
    public InterfaceC9146m.a mo14656b(Object obj, int i9, int i10, C8084d c8084d) {
        return new InterfaceC9146m.a(new C7737b(obj), new b(obj));
    }

    /* renamed from: o0.u$b */
    public static class b implements InterfaceC8115d {

        /* renamed from: a */
        public final Object f15459a;

        public b(Object obj) {
            this.f15459a = obj;
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: a */
        public Class mo12978a() {
            return this.f15459a.getClass();
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: d */
        public void mo12985d(Priority priority, InterfaceC8115d.a aVar) {
            aVar.mo3155f(this.f15459a);
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: e */
        public DataSource mo12986e() {
            return DataSource.LOCAL;
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: b */
        public void mo12983b() {
        }

        @Override // p132i0.InterfaceC8115d
        public void cancel() {
        }
    }
}
