package p254n0;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5824d;
import p039c1.C5222d;
import p168h0.C9438e;
import p254n0.InterfaceC10300n;

/* renamed from: n0.w */
/* loaded from: classes3.dex */
public class C10309w implements InterfaceC10300n {

    /* renamed from: a */
    public static final C10309w f24578a = new C10309w();

    /* renamed from: n0.w$a */
    public static class a implements InterfaceC10301o {

        /* renamed from: a */
        public static final a f24579a = new a();

        /* renamed from: a */
        public static a m21512a() {
            return f24579a;
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return C10309w.m21511c();
        }
    }

    /* renamed from: c */
    public static C10309w m21511c() {
        return f24578a;
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: a */
    public boolean mo21420a(Object obj) {
        return true;
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: b */
    public InterfaceC10300n.a mo21421b(Object obj, int i10, int i11, C9438e c9438e) {
        return new InterfaceC10300n.a(new C5222d(obj), new b(obj));
    }

    /* renamed from: n0.w$b */
    public static class b implements InterfaceC5824d {

        /* renamed from: c */
        public final Object f24580c;

        public b(Object obj) {
            this.f24580c = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        /* renamed from: a */
        public Class mo4051a() {
            return this.f24580c.getClass();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        /* renamed from: c */
        public void mo4057c(Priority priority, InterfaceC5824d.a aVar) {
            aVar.mo4063d(this.f24580c);
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public void cleanup() {
        }
    }
}
