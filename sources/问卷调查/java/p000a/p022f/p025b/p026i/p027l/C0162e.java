package p000a.p022f.p025b.p026i.p027l;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p000a.p022f.p025b.p026i.C0150d;
import p000a.p022f.p025b.p026i.C0151e;
import p000a.p022f.p025b.p026i.C0152f;
import p000a.p022f.p025b.p026i.C0154h;
import p000a.p022f.p025b.p026i.p027l.C0159b;

/* renamed from: a.f.b.i.l.e */
/* loaded from: classes.dex */
public class C0162e {

    /* renamed from: a */
    public C0151e f1171a;

    /* renamed from: d */
    public C0151e f1174d;

    /* renamed from: f */
    public C0159b.b f1176f;

    /* renamed from: g */
    public C0159b.a f1177g;

    /* renamed from: h */
    public ArrayList<C0168k> f1178h;

    /* renamed from: b */
    public boolean f1172b = true;

    /* renamed from: c */
    public boolean f1173c = true;

    /* renamed from: e */
    public ArrayList<AbstractC0170m> f1175e = new ArrayList<>();

    public C0162e(C0151e c0151e) {
        new ArrayList();
        this.f1176f = null;
        this.f1177g = new C0159b.a();
        this.f1178h = new ArrayList<>();
        this.f1171a = c0151e;
        this.f1174d = c0151e;
    }

    /* renamed from: a */
    public final void m635a(C0163f c0163f, int i, int i2, C0163f c0163f2, ArrayList<C0168k> arrayList, C0168k c0168k) {
        AbstractC0170m abstractC0170m = c0163f.f1182d;
        if (abstractC0170m.f1209c == null) {
            C0151e c0151e = this.f1171a;
            if (abstractC0170m == c0151e.f1104d || abstractC0170m == c0151e.f1106e) {
                return;
            }
            if (c0168k == null) {
                c0168k = new C0168k(abstractC0170m, i2);
                arrayList.add(c0168k);
            }
            abstractC0170m.f1209c = c0168k;
            c0168k.f1204b.add(abstractC0170m);
            for (InterfaceC0161d interfaceC0161d : abstractC0170m.f1214h.f1189k) {
                if (interfaceC0161d instanceof C0163f) {
                    m635a((C0163f) interfaceC0161d, i, 0, c0163f2, arrayList, c0168k);
                }
            }
            for (InterfaceC0161d interfaceC0161d2 : abstractC0170m.f1215i.f1189k) {
                if (interfaceC0161d2 instanceof C0163f) {
                    m635a((C0163f) interfaceC0161d2, i, 1, c0163f2, arrayList, c0168k);
                }
            }
            if (i == 1 && (abstractC0170m instanceof C0169l)) {
                for (InterfaceC0161d interfaceC0161d3 : ((C0169l) abstractC0170m).f1205k.f1189k) {
                    if (interfaceC0161d3 instanceof C0163f) {
                        m635a((C0163f) interfaceC0161d3, i, 2, c0163f2, arrayList, c0168k);
                    }
                }
            }
            Iterator<C0163f> it = abstractC0170m.f1214h.f1190l.iterator();
            while (it.hasNext()) {
                m635a(it.next(), i, 0, c0163f2, arrayList, c0168k);
            }
            Iterator<C0163f> it2 = abstractC0170m.f1215i.f1190l.iterator();
            while (it2.hasNext()) {
                m635a(it2.next(), i, 1, c0163f2, arrayList, c0168k);
            }
            if (i == 1 && (abstractC0170m instanceof C0169l)) {
                Iterator<C0163f> it3 = ((C0169l) abstractC0170m).f1205k.f1190l.iterator();
                while (it3.hasNext()) {
                    m635a(it3.next(), i, 2, c0163f2, arrayList, c0168k);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m636b(p000a.p022f.p025b.p026i.C0151e r20) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p022f.p025b.p026i.p027l.C0162e.m636b(a.f.b.i.e):boolean");
    }

    /* renamed from: c */
    public void m637c() {
        AbstractC0170m c0165h;
        ArrayList<AbstractC0170m> arrayList = this.f1175e;
        arrayList.clear();
        this.f1174d.f1104d.mo630f();
        this.f1174d.f1106e.mo630f();
        arrayList.add(this.f1174d.f1104d);
        arrayList.add(this.f1174d.f1106e);
        Iterator<C0150d> it = this.f1174d.f1155e0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0150d next = it.next();
            if (next instanceof C0152f) {
                c0165h = new C0165h(next);
            } else {
                if (next.m608s()) {
                    if (next.f1100b == null) {
                        next.f1100b = new C0160c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f1100b);
                } else {
                    arrayList.add(next.f1104d);
                }
                if (next.m609t()) {
                    if (next.f1102c == null) {
                        next.f1102c = new C0160c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f1102c);
                } else {
                    arrayList.add(next.f1106e);
                }
                if (next instanceof C0154h) {
                    c0165h = new C0166i(next);
                }
            }
            arrayList.add(c0165h);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<AbstractC0170m> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo630f();
        }
        Iterator<AbstractC0170m> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC0170m next2 = it3.next();
            if (next2.f1208b != this.f1174d) {
                next2.mo628d();
            }
        }
        this.f1178h.clear();
        C0168k.f1202c = 0;
        m639e(this.f1171a.f1104d, 0, this.f1178h);
        m639e(this.f1171a.f1106e, 1, this.f1178h);
        this.f1172b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m638d(p000a.p022f.p025b.p026i.C0151e r17, int r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p022f.p025b.p026i.p027l.C0162e.m638d(a.f.b.i.e, int):int");
    }

    /* renamed from: e */
    public final void m639e(AbstractC0170m abstractC0170m, int i, ArrayList<C0168k> arrayList) {
        for (InterfaceC0161d interfaceC0161d : abstractC0170m.f1214h.f1189k) {
            if (interfaceC0161d instanceof C0163f) {
                m635a((C0163f) interfaceC0161d, i, 0, abstractC0170m.f1215i, arrayList, null);
            } else if (interfaceC0161d instanceof AbstractC0170m) {
                m635a(((AbstractC0170m) interfaceC0161d).f1214h, i, 0, abstractC0170m.f1215i, arrayList, null);
            }
        }
        for (InterfaceC0161d interfaceC0161d2 : abstractC0170m.f1215i.f1189k) {
            if (interfaceC0161d2 instanceof C0163f) {
                m635a((C0163f) interfaceC0161d2, i, 1, abstractC0170m.f1214h, arrayList, null);
            } else if (interfaceC0161d2 instanceof AbstractC0170m) {
                m635a(((AbstractC0170m) interfaceC0161d2).f1215i, i, 1, abstractC0170m.f1214h, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC0161d interfaceC0161d3 : ((C0169l) abstractC0170m).f1205k.f1189k) {
                if (interfaceC0161d3 instanceof C0163f) {
                    m635a((C0163f) interfaceC0161d3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: f */
    public final void m640f(C0150d c0150d, C0150d.a aVar, int i, C0150d.a aVar2, int i2) {
        C0159b.a aVar3 = this.f1177g;
        aVar3.f1159a = aVar;
        aVar3.f1160b = aVar2;
        aVar3.f1161c = i;
        aVar3.f1162d = i2;
        ((ConstraintLayout.C0500b) this.f1176f).m1643a(c0150d, aVar3);
        c0150d.m590B(this.f1177g.f1163e);
        c0150d.m612w(this.f1177g.f1164f);
        C0159b.a aVar4 = this.f1177g;
        c0150d.f1124w = aVar4.f1166h;
        int i3 = aVar4.f1165g;
        c0150d.f1089R = i3;
        c0150d.f1124w = i3 > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (r12 == r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        r0.f1200m = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        r0.mo643c(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r10 == r7) goto L28;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m641g() {
        /*
            r14 = this;
            a.f.b.i.d$a r6 = p000a.p022f.p025b.p026i.C0150d.a.FIXED
            a.f.b.i.d$a r7 = p000a.p022f.p025b.p026i.C0150d.a.MATCH_CONSTRAINT
            a.f.b.i.e r0 = r14.f1171a
            java.util.ArrayList<a.f.b.i.d> r0 = r0.f1155e0
            java.util.Iterator r8 = r0.iterator()
        Lc:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto La5
            java.lang.Object r0 = r8.next()
            r9 = r0
            a.f.b.i.d r9 = (p000a.p022f.p025b.p026i.C0150d) r9
            boolean r0 = r9.f1098a
            if (r0 == 0) goto L1e
            goto Lc
        L1e:
            a.f.b.i.d$a[] r0 = r9.f1081J
            r1 = 0
            r10 = r0[r1]
            r11 = 1
            r12 = r0[r11]
            int r0 = r9.f1111j
            int r2 = r9.f1112k
            a.f.b.i.d$a r4 = p000a.p022f.p025b.p026i.C0150d.a.WRAP_CONTENT
            if (r10 == r4) goto L35
            if (r10 != r7) goto L33
            if (r0 != r11) goto L33
            goto L35
        L33:
            r0 = r1
            goto L36
        L35:
            r0 = r11
        L36:
            if (r12 == r4) goto L3c
            if (r12 != r7) goto L3d
            if (r2 != r11) goto L3d
        L3c:
            r1 = r11
        L3d:
            a.f.b.i.l.j r2 = r9.f1104d
            a.f.b.i.l.g r2 = r2.f1211e
            boolean r3 = r2.f1188j
            a.f.b.i.l.l r5 = r9.f1106e
            a.f.b.i.l.g r5 = r5.f1211e
            boolean r13 = r5.f1188j
            if (r3 == 0) goto L5b
            if (r13 == 0) goto L5b
            int r3 = r2.f1185g
            int r5 = r5.f1185g
            r0 = r14
            r1 = r9
            r2 = r6
            r4 = r6
            r0.m640f(r1, r2, r3, r4, r5)
        L58:
            r9.f1098a = r11
            goto L94
        L5b:
            if (r3 == 0) goto L7a
            if (r1 == 0) goto L7a
            int r3 = r2.f1185g
            int r5 = r5.f1185g
            r0 = r14
            r1 = r9
            r2 = r6
            r0.m640f(r1, r2, r3, r4, r5)
            a.f.b.i.l.l r0 = r9.f1106e
            a.f.b.i.l.g r0 = r0.f1211e
            int r1 = r9.m598i()
            if (r12 != r7) goto L76
        L73:
            r0.f1200m = r1
            goto L94
        L76:
            r0.mo643c(r1)
            goto L58
        L7a:
            if (r13 == 0) goto L94
            if (r0 == 0) goto L94
            int r3 = r2.f1185g
            int r5 = r5.f1185g
            r0 = r14
            r1 = r9
            r2 = r4
            r4 = r6
            r0.m640f(r1, r2, r3, r4, r5)
            a.f.b.i.l.j r0 = r9.f1104d
            a.f.b.i.l.g r0 = r0.f1211e
            int r1 = r9.m604o()
            if (r10 != r7) goto L76
            goto L73
        L94:
            boolean r0 = r9.f1098a
            if (r0 == 0) goto Lc
            a.f.b.i.l.l r0 = r9.f1106e
            a.f.b.i.l.g r0 = r0.f1206l
            if (r0 == 0) goto Lc
            int r1 = r9.f1089R
            r0.mo643c(r1)
            goto Lc
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p022f.p025b.p026i.p027l.C0162e.m641g():void");
    }
}
