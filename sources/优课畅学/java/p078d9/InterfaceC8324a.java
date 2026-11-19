package p078d9;

import p010a9.C0053d;
import p323z8.AbstractC10732c;
import p323z8.C10734e;
import p323z8.InterfaceC10739j;
import p323z8.InterfaceC10741l;
import p323z8.InterfaceC10742m;

/* renamed from: d9.a */
/* loaded from: classes5.dex */
public interface InterfaceC8324a {

    /* renamed from: d9.a$a */
    public interface a {
        /* renamed from: a */
        void mo13531a(AbstractC10732c abstractC10732c);
    }

    /* renamed from: d9.a$b */
    public static class b {

        /* renamed from: a */
        public boolean f15786a;

        /* renamed from: c */
        public int f15788c;

        /* renamed from: d */
        public int f15789d;

        /* renamed from: e */
        public AbstractC10732c f15790e;

        /* renamed from: f */
        public int f15791f;

        /* renamed from: g */
        public int f15792g;

        /* renamed from: h */
        public int f15793h;

        /* renamed from: i */
        public int f15794i;

        /* renamed from: j */
        public int f15795j;

        /* renamed from: k */
        public int f15796k;

        /* renamed from: l */
        public int f15797l;

        /* renamed from: m */
        public long f15798m;

        /* renamed from: n */
        public long f15799n;

        /* renamed from: o */
        public long f15800o;

        /* renamed from: p */
        public boolean f15801p;

        /* renamed from: q */
        public long f15802q;

        /* renamed from: r */
        public long f15803r;

        /* renamed from: s */
        public long f15804s;

        /* renamed from: u */
        public boolean f15806u;

        /* renamed from: b */
        public C10734e f15787b = new C10734e();

        /* renamed from: t */
        public InterfaceC10741l f15805t = new C0053d(4);

        /* renamed from: a */
        public int m13532a(int i10, int i11) {
            if (i10 == 1) {
                int i12 = this.f15791f + i11;
                this.f15791f = i12;
                return i12;
            }
            if (i10 == 4) {
                int i13 = this.f15794i + i11;
                this.f15794i = i13;
                return i13;
            }
            if (i10 == 5) {
                int i14 = this.f15793h + i11;
                this.f15793h = i14;
                return i14;
            }
            if (i10 == 6) {
                int i15 = this.f15792g + i11;
                this.f15792g = i15;
                return i15;
            }
            if (i10 != 7) {
                return 0;
            }
            int i16 = this.f15795j + i11;
            this.f15795j = i16;
            return i16;
        }

        /* renamed from: b */
        public int m13533b(int i10) {
            int i11 = this.f15796k + i10;
            this.f15796k = i11;
            return i11;
        }

        /* renamed from: c */
        public void m13534c(AbstractC10732c abstractC10732c) {
            if (this.f15806u) {
                return;
            }
            this.f15805t.mo182e(abstractC10732c);
        }

        /* renamed from: d */
        public void m13535d() {
            this.f15797l = this.f15796k;
            this.f15796k = 0;
            this.f15795j = 0;
            this.f15794i = 0;
            this.f15793h = 0;
            this.f15792g = 0;
            this.f15791f = 0;
            this.f15798m = 0L;
            this.f15800o = 0L;
            this.f15799n = 0L;
            this.f15802q = 0L;
            this.f15801p = false;
            synchronized (this) {
                this.f15805t.clear();
            }
        }

        /* renamed from: e */
        public void m13536e(b bVar) {
            if (bVar == null) {
                return;
            }
            this.f15797l = bVar.f15797l;
            this.f15791f = bVar.f15791f;
            this.f15792g = bVar.f15792g;
            this.f15793h = bVar.f15793h;
            this.f15794i = bVar.f15794i;
            this.f15795j = bVar.f15795j;
            this.f15796k = bVar.f15796k;
            this.f15798m = bVar.f15798m;
            this.f15799n = bVar.f15799n;
            this.f15800o = bVar.f15800o;
            this.f15801p = bVar.f15801p;
            this.f15802q = bVar.f15802q;
            this.f15803r = bVar.f15803r;
            this.f15804s = bVar.f15804s;
        }
    }

    /* renamed from: a */
    void mo13526a(InterfaceC10742m interfaceC10742m, InterfaceC10741l interfaceC10741l, long j10, b bVar);

    /* renamed from: b */
    void mo13527b(InterfaceC10739j interfaceC10739j);

    /* renamed from: c */
    void mo13528c(a aVar);

    void clear();

    /* renamed from: d */
    void mo13529d(boolean z10);

    /* renamed from: e */
    void mo13530e();

    void release();
}
