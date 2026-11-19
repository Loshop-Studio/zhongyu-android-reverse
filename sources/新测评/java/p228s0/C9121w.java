package p228s0;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5356d;
import p106h1.C7617b;
import p162m0.C8539d;
import p228s0.InterfaceC9112n;

/* renamed from: s0.w */
/* loaded from: classes3.dex */
public class C9121w implements InterfaceC9112n {

    /* renamed from: a */
    public static final C9121w f15820a = new C9121w();

    /* renamed from: s0.w$a */
    public static class a implements InterfaceC9113o {

        /* renamed from: a */
        public static final a f15821a = new a();

        /* renamed from: a */
        public static a m15450a() {
            return f15821a;
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return C9121w.m15449c();
        }
    }

    /* renamed from: c */
    public static C9121w m15449c() {
        return f15820a;
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: a */
    public boolean mo15354a(Object obj) {
        return true;
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: b */
    public InterfaceC9112n.a mo15355b(Object obj, int i10, int i11, C8539d c8539d) {
        return new InterfaceC9112n.a(new C7617b(obj), new b(obj));
    }

    /* renamed from: s0.w$b */
    public static class b implements InterfaceC5356d {

        /* renamed from: a */
        public final Object f15822a;

        public b(Object obj) {
            this.f15822a = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: a */
        public Class mo3399a() {
            return this.f15822a.getClass();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: d */
        public DataSource mo3406d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: e */
        public void mo3407e(Priority priority, InterfaceC5356d.a aVar) {
            aVar.mo3413f(this.f15822a);
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: b */
        public void mo3404b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        public void cancel() {
        }
    }
}
