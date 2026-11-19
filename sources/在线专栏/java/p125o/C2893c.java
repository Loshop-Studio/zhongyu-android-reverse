package p125o;

import java.util.ArrayList;
import java.util.Iterator;
import p121n.C2868d;
import p121n.C2869e;
import p121n.C2870f;

/* renamed from: o.c */
/* loaded from: classes.dex */
public class C2893c extends AbstractC2903m {

    /* renamed from: k */
    ArrayList<AbstractC2903m> f11315k;

    /* renamed from: l */
    private int f11316l;

    public C2893c(C2869e c2869e, int i4) {
        super(c2869e);
        this.f11315k = new ArrayList<>();
        this.f11366f = i4;
        m9927q();
    }

    /* renamed from: q */
    private void m9927q() {
        C2869e c2869e;
        C2869e c2869e2 = this.f11362b;
        C2869e c2869eM9707I = c2869e2.m9707I(this.f11366f);
        while (true) {
            C2869e c2869e3 = c2869eM9707I;
            c2869e = c2869e2;
            c2869e2 = c2869e3;
            if (c2869e2 == null) {
                break;
            } else {
                c2869eM9707I = c2869e2.m9707I(this.f11366f);
            }
        }
        this.f11362b = c2869e;
        this.f11315k.add(c2869e.m9711K(this.f11366f));
        C2869e c2869eM9703G = c2869e.m9703G(this.f11366f);
        while (c2869eM9703G != null) {
            this.f11315k.add(c2869eM9703G.m9711K(this.f11366f));
            c2869eM9703G = c2869eM9703G.m9703G(this.f11366f);
        }
        Iterator<AbstractC2903m> it = this.f11315k.iterator();
        while (it.hasNext()) {
            AbstractC2903m next = it.next();
            int i4 = this.f11366f;
            if (i4 == 0) {
                next.f11362b.f11142c = this;
            } else if (i4 == 1) {
                next.f11362b.f11144d = this;
            }
        }
        if ((this.f11366f == 0 && ((C2870f) this.f11362b.m9705H()).m9786c1()) && this.f11315k.size() > 1) {
            ArrayList<AbstractC2903m> arrayList = this.f11315k;
            this.f11362b = arrayList.get(arrayList.size() - 1).f11362b;
        }
        this.f11316l = this.f11366f == 0 ? this.f11362b.m9767y() : this.f11362b.m9714M();
    }

    /* renamed from: r */
    private C2869e m9928r() {
        for (int i4 = 0; i4 < this.f11315k.size(); i4++) {
            AbstractC2903m abstractC2903m = this.f11315k.get(i4);
            if (abstractC2903m.f11362b.m9717P() != 8) {
                return abstractC2903m.f11362b;
            }
        }
        return null;
    }

    /* renamed from: s */
    private C2869e m9929s() {
        for (int size = this.f11315k.size() - 1; size >= 0; size--) {
            AbstractC2903m abstractC2903m = this.f11315k.get(size);
            if (abstractC2903m.f11362b.m9717P() != 8) {
                return abstractC2903m.f11362b;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ce A[PHI: r1 r22 r23 r24
      0x01ce: PHI (r1v61 int) = (r1v59 int), (r1v67 int) binds: [B:119:0x01cc, B:110:0x01a6] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r22v3 float) = (r22v2 float), (r22v5 float) binds: [B:119:0x01cc, B:110:0x01a6] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r23v6 boolean) = (r23v5 boolean), (r23v8 boolean) binds: [B:119:0x01cc, B:110:0x01a6] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r24v6 int) = (r24v5 int), (r24v8 int) binds: [B:119:0x01cc, B:110:0x01a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    @Override // p125o.AbstractC2903m, p125o.InterfaceC2894d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo9930a(p125o.InterfaceC2894d r26) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p125o.C2893c.mo9930a(o.d):void");
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: d */
    void mo9931d() {
        Iterator<AbstractC2903m> it = this.f11315k.iterator();
        while (it.hasNext()) {
            it.next().mo9931d();
        }
        int size = this.f11315k.size();
        if (size < 1) {
            return;
        }
        C2869e c2869e = this.f11315k.get(0).f11362b;
        C2869e c2869e2 = this.f11315k.get(size - 1).f11362b;
        if (this.f11366f == 0) {
            C2868d c2868d = c2869e.f11113D;
            C2868d c2868d2 = c2869e2.f11117F;
            C2896f c2896fM9967i = m9967i(c2868d, 0);
            int iM9676c = c2868d.m9676c();
            C2869e c2869eM9928r = m9928r();
            if (c2869eM9928r != null) {
                iM9676c = c2869eM9928r.f11113D.m9676c();
            }
            if (c2896fM9967i != null) {
                m9963b(this.f11368h, c2896fM9967i, iM9676c);
            }
            C2896f c2896fM9967i2 = m9967i(c2868d2, 0);
            int iM9676c2 = c2868d2.m9676c();
            C2869e c2869eM9929s = m9929s();
            if (c2869eM9929s != null) {
                iM9676c2 = c2869eM9929s.f11117F.m9676c();
            }
            if (c2896fM9967i2 != null) {
                m9963b(this.f11369i, c2896fM9967i2, -iM9676c2);
            }
        } else {
            C2868d c2868d3 = c2869e.f11115E;
            C2868d c2868d4 = c2869e2.f11118G;
            C2896f c2896fM9967i3 = m9967i(c2868d3, 1);
            int iM9676c3 = c2868d3.m9676c();
            C2869e c2869eM9928r2 = m9928r();
            if (c2869eM9928r2 != null) {
                iM9676c3 = c2869eM9928r2.f11115E.m9676c();
            }
            if (c2896fM9967i3 != null) {
                m9963b(this.f11368h, c2896fM9967i3, iM9676c3);
            }
            C2896f c2896fM9967i4 = m9967i(c2868d4, 1);
            int iM9676c4 = c2868d4.m9676c();
            C2869e c2869eM9929s2 = m9929s();
            if (c2869eM9929s2 != null) {
                iM9676c4 = c2869eM9929s2.f11118G.m9676c();
            }
            if (c2896fM9967i4 != null) {
                m9963b(this.f11369i, c2896fM9967i4, -iM9676c4);
            }
        }
        this.f11368h.f11326a = this;
        this.f11369i.f11326a = this;
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: e */
    public void mo9932e() {
        for (int i4 = 0; i4 < this.f11315k.size(); i4++) {
            this.f11315k.get(i4).mo9932e();
        }
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: f */
    void mo9933f() {
        this.f11363c = null;
        Iterator<AbstractC2903m> it = this.f11315k.iterator();
        while (it.hasNext()) {
            it.next().mo9933f();
        }
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: j */
    public long mo9934j() {
        int size = this.f11315k.size();
        long jMo9934j = 0;
        for (int i4 = 0; i4 < size; i4++) {
            jMo9934j = jMo9934j + r4.f11368h.f11331f + this.f11315k.get(i4).mo9934j() + r4.f11369i.f11331f;
        }
        return jMo9934j;
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: m */
    boolean mo9935m() {
        int size = this.f11315k.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!this.f11315k.get(i4).mo9935m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f11366f == 0 ? "horizontal : " : "vertical : ");
        String string = sb.toString();
        Iterator<AbstractC2903m> it = this.f11315k.iterator();
        while (it.hasNext()) {
            String str = string + "<";
            string = (str + it.next()) + "> ";
        }
        return string;
    }
}
