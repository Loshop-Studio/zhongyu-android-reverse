package p090e9;

import p010a9.C0053d;
import p102f9.AbstractC8485b;
import p323z8.AbstractC10732c;
import p323z8.InterfaceC10740k;
import p323z8.InterfaceC10742m;

/* renamed from: e9.b */
/* loaded from: classes5.dex */
public class C8390b {

    /* renamed from: a */
    public e f15907a = null;

    /* renamed from: b */
    public e f15908b = null;

    /* renamed from: c */
    public e f15909c = null;

    /* renamed from: d */
    public e f15910d = null;

    /* renamed from: e9.b$b */
    public static class b extends d {

        /* renamed from: c */
        public C0053d f15911c;

        public b() {
            super();
            this.f15911c = new C0053d(2);
        }

        @Override // p090e9.C8390b.c, p090e9.C8390b.e
        /* renamed from: a */
        public void mo13684a(AbstractC10732c abstractC10732c, InterfaceC10742m interfaceC10742m, f fVar) {
            int i10;
            boolean z10;
            AbstractC10732c abstractC10732c2;
            AbstractC10732c abstractC10732c3;
            AbstractC10732c abstractC10732c4 = abstractC10732c;
            if (abstractC10732c4.m20060s()) {
                return;
            }
            boolean zMo20063v = abstractC10732c4.mo20063v();
            float fMo20053l = zMo20063v ? abstractC10732c4.mo20053l() : -1.0f;
            int i11 = 1;
            boolean z11 = false;
            boolean z12 = (zMo20063v || this.f15911c.isEmpty()) ? false : true;
            if (fMo20053l < 0.0f) {
                fMo20053l = interfaceC10742m.getHeight() - abstractC10732c4.f21309p;
            }
            AbstractC10732c abstractC10732c5 = null;
            if (zMo20063v) {
                i11 = 0;
            } else {
                this.f15913b = false;
                InterfaceC10740k it = this.f15911c.iterator();
                float fMo20053l2 = fMo20053l;
                int i12 = 0;
                AbstractC10732c abstractC10732c6 = null;
                while (!this.f15913b && it.hasNext()) {
                    i10 = i12 + 1;
                    AbstractC10732c next = it.next();
                    if (next != abstractC10732c4) {
                        if (abstractC10732c6 != null) {
                            abstractC10732c3 = abstractC10732c6;
                        } else {
                            if (next.mo20045d() != interfaceC10742m.getHeight()) {
                                abstractC10732c2 = next;
                                z10 = z12;
                                break;
                            }
                            abstractC10732c3 = next;
                        }
                        if (fMo20053l2 < 0.0f) {
                            z10 = z12;
                        } else {
                            AbstractC10732c abstractC10732c7 = abstractC10732c4;
                            boolean zM13878h = AbstractC8485b.m13878h(interfaceC10742m, next, abstractC10732c7, abstractC10732c4.m20047f(), abstractC10732c4.m20052k().f21320a);
                            abstractC10732c4 = abstractC10732c7;
                            if (zM13878h) {
                                fMo20053l2 = next.mo20053l() - abstractC10732c4.f21309p;
                                z12 = zM13878h;
                                i12 = i10;
                                abstractC10732c6 = abstractC10732c3;
                            } else {
                                abstractC10732c5 = next;
                                z10 = zM13878h;
                            }
                        }
                        abstractC10732c2 = abstractC10732c3;
                        break;
                    }
                    abstractC10732c2 = abstractC10732c6;
                    z10 = false;
                    break;
                }
                i10 = i12;
                z10 = z12;
                abstractC10732c2 = abstractC10732c6;
                float f10 = fMo20053l2;
                boolean zMo13685b = mo13685b(false, abstractC10732c4, interfaceC10742m, f10, abstractC10732c2, null);
                if (zMo13685b) {
                    z11 = zMo13685b;
                    fMo20053l = interfaceC10742m.getHeight() - abstractC10732c4.f21309p;
                    z12 = true;
                } else {
                    boolean z13 = f10 >= 0.0f ? false : z10;
                    if (abstractC10732c5 != null) {
                        boolean z14 = z13;
                        i11 = i10 - 1;
                        z12 = z14;
                        z11 = zMo13685b;
                        fMo20053l = f10;
                    } else {
                        z11 = zMo13685b;
                        fMo20053l = f10;
                        z12 = z13;
                        i11 = i10;
                    }
                }
            }
            if (fVar == null || !fVar.mo13679a(abstractC10732c4, fMo20053l, i11, z12)) {
                if (z11) {
                    clear();
                }
                abstractC10732c4.mo20066y(interfaceC10742m, abstractC10732c4.mo20048g(), fMo20053l);
                if (zMo20063v) {
                    return;
                }
                this.f15911c.mo179b(abstractC10732c5);
                this.f15911c.mo182e(abstractC10732c4);
            }
        }

        @Override // p090e9.C8390b.d, p090e9.C8390b.c
        /* renamed from: b */
        public boolean mo13685b(boolean z10, AbstractC10732c abstractC10732c, InterfaceC10742m interfaceC10742m, float f10, AbstractC10732c abstractC10732c2, AbstractC10732c abstractC10732c3) {
            if (f10 >= 0.0f) {
                return (abstractC10732c2 == null || abstractC10732c2.mo20045d() == ((float) interfaceC10742m.getHeight())) ? false : true;
            }
            return true;
        }

        @Override // p090e9.C8390b.c, p090e9.C8390b.e
        public void clear() {
            this.f15913b = true;
            this.f15911c.clear();
        }
    }

    /* renamed from: e9.b$c */
    public static class c implements e {

        /* renamed from: a */
        public C0053d f15912a;

        /* renamed from: b */
        public boolean f15913b;

        public c() {
            this.f15912a = new C0053d(1);
            this.f15913b = false;
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0107  */
        @Override // p090e9.C8390b.e
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo13684a(p323z8.AbstractC10732c r20, p323z8.InterfaceC10742m r21, p090e9.C8390b.f r22) {
            /*
                Method dump skipped, instructions count: 304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p090e9.C8390b.c.mo13684a(z8.c, z8.m, e9.b$f):void");
        }

        /* renamed from: b */
        public boolean mo13685b(boolean z10, AbstractC10732c abstractC10732c, InterfaceC10742m interfaceC10742m, float f10, AbstractC10732c abstractC10732c2, AbstractC10732c abstractC10732c3) {
            if (f10 >= 0.0f) {
                return (abstractC10732c2 != null && abstractC10732c2.mo20053l() > 0.0f) || f10 + abstractC10732c.f21309p > ((float) interfaceC10742m.getHeight());
            }
            return true;
        }

        @Override // p090e9.C8390b.e
        public void clear() {
            this.f15913b = true;
            this.f15912a.clear();
        }
    }

    /* renamed from: e9.b$d */
    public static class d extends c {
        public d() {
            super();
        }

        @Override // p090e9.C8390b.c
        /* renamed from: b */
        public boolean mo13685b(boolean z10, AbstractC10732c abstractC10732c, InterfaceC10742m interfaceC10742m, float f10, AbstractC10732c abstractC10732c2, AbstractC10732c abstractC10732c3) {
            return f10 + abstractC10732c.f21309p > ((float) interfaceC10742m.getHeight());
        }
    }

    /* renamed from: e9.b$e */
    public interface e {
        /* renamed from: a */
        void mo13684a(AbstractC10732c abstractC10732c, InterfaceC10742m interfaceC10742m, f fVar);

        void clear();
    }

    /* renamed from: e9.b$f */
    public interface f {
        /* renamed from: a */
        boolean mo13679a(AbstractC10732c abstractC10732c, float f10, int i10, boolean z10);
    }

    public C8390b(boolean z10) {
        m13680a(z10);
    }

    /* renamed from: a */
    public void m13680a(boolean z10) {
        this.f15907a = z10 ? new b() : new c();
        this.f15908b = z10 ? new b() : new c();
        if (this.f15909c == null) {
            this.f15909c = new d();
        }
        if (this.f15910d == null) {
            this.f15910d = new b();
        }
    }

    /* renamed from: b */
    public void m13681b() {
        e eVar = this.f15907a;
        if (eVar != null) {
            eVar.clear();
        }
        e eVar2 = this.f15908b;
        if (eVar2 != null) {
            eVar2.clear();
        }
        e eVar3 = this.f15909c;
        if (eVar3 != null) {
            eVar3.clear();
        }
        e eVar4 = this.f15910d;
        if (eVar4 != null) {
            eVar4.clear();
        }
    }

    /* renamed from: c */
    public void m13682c(AbstractC10732c abstractC10732c, InterfaceC10742m interfaceC10742m, f fVar) {
        int iMo20054m = abstractC10732c.mo20054m();
        if (iMo20054m == 1) {
            this.f15907a.mo13684a(abstractC10732c, interfaceC10742m, fVar);
            return;
        }
        if (iMo20054m == 4) {
            this.f15910d.mo13684a(abstractC10732c, interfaceC10742m, fVar);
            return;
        }
        if (iMo20054m == 5) {
            this.f15909c.mo13684a(abstractC10732c, interfaceC10742m, fVar);
        } else if (iMo20054m == 6) {
            this.f15908b.mo13684a(abstractC10732c, interfaceC10742m, fVar);
        } else {
            if (iMo20054m != 7) {
                return;
            }
            abstractC10732c.mo20066y(interfaceC10742m, 0.0f, 0.0f);
        }
    }

    /* renamed from: d */
    public void m13683d() {
        m13681b();
    }
}
