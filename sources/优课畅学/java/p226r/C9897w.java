package p226r;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5405d;
import p105g0.C8514b;
import p160l.C9230d;
import p226r.InterfaceC9888n;

/* renamed from: r.w */
/* loaded from: classes3.dex */
public class C9897w implements InterfaceC9888n {

    /* renamed from: a */
    public static final C9897w f19855a = new C9897w();

    /* renamed from: r.w$a */
    public static class a implements InterfaceC9889o {

        /* renamed from: a */
        public static final a f19856a = new a();

        /* renamed from: a */
        public static a m18541a() {
            return f19856a;
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return C9897w.m18540c();
        }
    }

    /* renamed from: c */
    public static C9897w m18540c() {
        return f19855a;
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: a */
    public boolean mo18445a(Object obj) {
        return true;
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: b */
    public InterfaceC9888n.a mo18446b(Object obj, int i10, int i11, C9230d c9230d) {
        return new InterfaceC9888n.a(new C8514b(obj), new b(obj));
    }

    /* renamed from: r.w$b */
    public static class b implements InterfaceC5405d {

        /* renamed from: a */
        public final Object f19857a;

        public b(Object obj) {
            this.f19857a = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: a */
        public Class mo2846a() {
            return this.f19857a.getClass();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: d */
        public void mo2853d(Priority priority, InterfaceC5405d.a aVar) {
            aVar.mo2859e(this.f19857a);
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: b */
        public void mo2851b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        public void cancel() {
        }
    }
}
