package p125o;

import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p121n.C2868d;
import p121n.C2869e;
import p121n.C2870f;
import p121n.C2872h;
import p121n.C2874j;
import p125o.C2892b;

/* renamed from: o.e */
/* loaded from: classes.dex */
public class C2895e {

    /* renamed from: a */
    private C2870f f11317a;

    /* renamed from: d */
    private C2870f f11320d;

    /* renamed from: b */
    private boolean f11318b = true;

    /* renamed from: c */
    private boolean f11319c = true;

    /* renamed from: e */
    private ArrayList<AbstractC2903m> f11321e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<C2901k> f11322f = new ArrayList<>();

    /* renamed from: g */
    private C2892b.b f11323g = null;

    /* renamed from: h */
    private C2892b.a f11324h = new C2892b.a();

    /* renamed from: i */
    ArrayList<C2901k> f11325i = new ArrayList<>();

    public C2895e(C2870f c2870f) {
        this.f11317a = c2870f;
        this.f11320d = c2870f;
    }

    /* renamed from: a */
    private void m9936a(C2896f c2896f, int i4, int i5, C2896f c2896f2, ArrayList<C2901k> arrayList, C2901k c2901k) {
        AbstractC2903m abstractC2903m = c2896f.f11329d;
        if (abstractC2903m.f11363c == null) {
            C2870f c2870f = this.f11317a;
            if (abstractC2903m == c2870f.f11146e || abstractC2903m == c2870f.f11148f) {
                return;
            }
            if (c2901k == null) {
                c2901k = new C2901k(abstractC2903m, i5);
                arrayList.add(c2901k);
            }
            abstractC2903m.f11363c = c2901k;
            c2901k.m9959a(abstractC2903m);
            for (InterfaceC2894d interfaceC2894d : abstractC2903m.f11368h.f11336k) {
                if (interfaceC2894d instanceof C2896f) {
                    m9936a((C2896f) interfaceC2894d, i4, 0, c2896f2, arrayList, c2901k);
                }
            }
            for (InterfaceC2894d interfaceC2894d2 : abstractC2903m.f11369i.f11336k) {
                if (interfaceC2894d2 instanceof C2896f) {
                    m9936a((C2896f) interfaceC2894d2, i4, 1, c2896f2, arrayList, c2901k);
                }
            }
            if (i4 == 1 && (abstractC2903m instanceof C2902l)) {
                for (InterfaceC2894d interfaceC2894d3 : ((C2902l) abstractC2903m).f11358k.f11336k) {
                    if (interfaceC2894d3 instanceof C2896f) {
                        m9936a((C2896f) interfaceC2894d3, i4, 2, c2896f2, arrayList, c2901k);
                    }
                }
            }
            for (C2896f c2896f3 : abstractC2903m.f11368h.f11337l) {
                if (c2896f3 == c2896f2) {
                    c2901k.f11352b = true;
                }
                m9936a(c2896f3, i4, 0, c2896f2, arrayList, c2901k);
            }
            for (C2896f c2896f4 : abstractC2903m.f11369i.f11337l) {
                if (c2896f4 == c2896f2) {
                    c2901k.f11352b = true;
                }
                m9936a(c2896f4, i4, 1, c2896f2, arrayList, c2901k);
            }
            if (i4 == 1 && (abstractC2903m instanceof C2902l)) {
                Iterator<C2896f> it = ((C2902l) abstractC2903m).f11358k.f11337l.iterator();
                while (it.hasNext()) {
                    m9936a(it.next(), i4, 2, c2896f2, arrayList, c2901k);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m9937b(C2870f c2870f) {
        int iM9718Q;
        C2869e.b bVar;
        int iM9763w;
        C2869e.b bVar2;
        C2869e.b bVar3;
        C2869e.b bVar4;
        Iterator<C2869e> it = c2870f.f11286G0.iterator();
        while (it.hasNext()) {
            C2869e next = it.next();
            C2869e.b[] bVarArr = next.f11126O;
            C2869e.b bVar5 = bVarArr[0];
            C2869e.b bVar6 = bVarArr[1];
            if (next.m9717P() == 8) {
                next.f11138a = true;
            } else {
                if (next.f11170q < 1.0f && bVar5 == C2869e.b.MATCH_CONSTRAINT) {
                    next.f11160l = 2;
                }
                if (next.f11176t < 1.0f && bVar6 == C2869e.b.MATCH_CONSTRAINT) {
                    next.f11162m = 2;
                }
                if (next.m9759u() > IGoodView.DEFAULT_TO_ALPHA) {
                    C2869e.b bVar7 = C2869e.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == C2869e.b.WRAP_CONTENT || bVar6 == C2869e.b.FIXED)) {
                        next.f11160l = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == C2869e.b.WRAP_CONTENT || bVar5 == C2869e.b.FIXED)) {
                        next.f11162m = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (next.f11160l == 0) {
                            next.f11160l = 3;
                        }
                        if (next.f11162m == 0) {
                            next.f11162m = 3;
                        }
                    }
                }
                C2869e.b bVar8 = C2869e.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && next.f11160l == 1 && (next.f11113D.f11091d == null || next.f11117F.f11091d == null)) {
                    bVar5 = C2869e.b.WRAP_CONTENT;
                }
                C2869e.b bVar9 = bVar5;
                if (bVar6 == bVar8 && next.f11162m == 1 && (next.f11115E.f11091d == null || next.f11118G.f11091d == null)) {
                    bVar6 = C2869e.b.WRAP_CONTENT;
                }
                C2869e.b bVar10 = bVar6;
                C2900j c2900j = next.f11146e;
                c2900j.f11364d = bVar9;
                int i4 = next.f11160l;
                c2900j.f11361a = i4;
                C2902l c2902l = next.f11148f;
                c2902l.f11364d = bVar10;
                int i5 = next.f11162m;
                c2902l.f11361a = i5;
                C2869e.b bVar11 = C2869e.b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == C2869e.b.FIXED || bVar9 == C2869e.b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == C2869e.b.FIXED || bVar10 == C2869e.b.WRAP_CONTENT)) {
                    int iM9718Q2 = next.m9718Q();
                    if (bVar9 == bVar11) {
                        iM9718Q = (c2870f.m9718Q() - next.f11113D.f11092e) - next.f11117F.f11092e;
                        bVar = C2869e.b.FIXED;
                    } else {
                        iM9718Q = iM9718Q2;
                        bVar = bVar9;
                    }
                    int iM9763w2 = next.m9763w();
                    if (bVar10 == bVar11) {
                        iM9763w = (c2870f.m9763w() - next.f11115E.f11092e) - next.f11118G.f11092e;
                        bVar2 = C2869e.b.FIXED;
                    } else {
                        iM9763w = iM9763w2;
                        bVar2 = bVar10;
                    }
                    m9940l(next, bVar, iM9718Q, bVar2, iM9763w);
                    next.f11146e.f11365e.mo9952d(next.m9718Q());
                    next.f11148f.f11365e.mo9952d(next.m9763w());
                    next.f11138a = true;
                } else {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = C2869e.b.WRAP_CONTENT) || bVar10 == C2869e.b.FIXED)) {
                        if (i4 == 3) {
                            if (bVar10 == bVar4) {
                                m9940l(next, bVar4, 0, bVar4, 0);
                            }
                            int iM9763w3 = next.m9763w();
                            int i6 = (int) ((iM9763w3 * next.f11130S) + 0.5f);
                            C2869e.b bVar12 = C2869e.b.FIXED;
                            m9940l(next, bVar12, i6, bVar12, iM9763w3);
                            next.f11146e.f11365e.mo9952d(next.m9718Q());
                            next.f11148f.f11365e.mo9952d(next.m9763w());
                            next.f11138a = true;
                        } else if (i4 == 1) {
                            m9940l(next, bVar4, 0, bVar10, 0);
                            next.f11146e.f11365e.f11347m = next.m9718Q();
                        } else if (i4 == 2) {
                            C2869e.b[] bVarArr2 = c2870f.f11126O;
                            C2869e.b bVar13 = bVarArr2[0];
                            C2869e.b bVar14 = C2869e.b.FIXED;
                            if (bVar13 == bVar14 || bVarArr2[0] == bVar11) {
                                m9940l(next, bVar14, (int) ((next.f11170q * c2870f.m9718Q()) + 0.5f), bVar10, next.m9763w());
                                next.f11146e.f11365e.mo9952d(next.m9718Q());
                                next.f11148f.f11365e.mo9952d(next.m9763w());
                                next.f11138a = true;
                            }
                        } else {
                            C2868d[] c2868dArr = next.f11123L;
                            if (c2868dArr[0].f11091d == null || c2868dArr[1].f11091d == null) {
                                m9940l(next, bVar4, 0, bVar10, 0);
                                next.f11146e.f11365e.mo9952d(next.m9718Q());
                                next.f11148f.f11365e.mo9952d(next.m9763w());
                                next.f11138a = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = C2869e.b.WRAP_CONTENT) || bVar9 == C2869e.b.FIXED)) {
                        if (i5 == 3) {
                            if (bVar9 == bVar3) {
                                m9940l(next, bVar3, 0, bVar3, 0);
                            }
                            int iM9718Q3 = next.m9718Q();
                            float f4 = next.f11130S;
                            if (next.m9761v() == -1) {
                                f4 = 1.0f / f4;
                            }
                            C2869e.b bVar15 = C2869e.b.FIXED;
                            m9940l(next, bVar15, iM9718Q3, bVar15, (int) ((iM9718Q3 * f4) + 0.5f));
                            next.f11146e.f11365e.mo9952d(next.m9718Q());
                            next.f11148f.f11365e.mo9952d(next.m9763w());
                            next.f11138a = true;
                        } else if (i5 == 1) {
                            m9940l(next, bVar9, 0, bVar3, 0);
                            next.f11148f.f11365e.f11347m = next.m9763w();
                        } else if (i5 == 2) {
                            C2869e.b[] bVarArr3 = c2870f.f11126O;
                            C2869e.b bVar16 = bVarArr3[1];
                            C2869e.b bVar17 = C2869e.b.FIXED;
                            if (bVar16 == bVar17 || bVarArr3[1] == bVar11) {
                                m9940l(next, bVar9, next.m9718Q(), bVar17, (int) ((next.f11176t * c2870f.m9763w()) + 0.5f));
                                next.f11146e.f11365e.mo9952d(next.m9718Q());
                                next.f11148f.f11365e.mo9952d(next.m9763w());
                                next.f11138a = true;
                            }
                        } else {
                            C2868d[] c2868dArr2 = next.f11123L;
                            if (c2868dArr2[2].f11091d == null || c2868dArr2[3].f11091d == null) {
                                m9940l(next, bVar3, 0, bVar10, 0);
                                next.f11146e.f11365e.mo9952d(next.m9718Q());
                                next.f11148f.f11365e.mo9952d(next.m9763w());
                                next.f11138a = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i4 == 1 || i5 == 1) {
                            C2869e.b bVar18 = C2869e.b.WRAP_CONTENT;
                            m9940l(next, bVar18, 0, bVar18, 0);
                            next.f11146e.f11365e.f11347m = next.m9718Q();
                            next.f11148f.f11365e.f11347m = next.m9763w();
                        } else if (i5 == 2 && i4 == 2) {
                            C2869e.b[] bVarArr4 = c2870f.f11126O;
                            C2869e.b bVar19 = bVarArr4[0];
                            C2869e.b bVar20 = C2869e.b.FIXED;
                            if (bVar19 == bVar20 || bVarArr4[0] == bVar20) {
                                if (bVarArr4[1] == bVar20 || bVarArr4[1] == bVar20) {
                                    m9940l(next, bVar20, (int) ((next.f11170q * c2870f.m9718Q()) + 0.5f), bVar20, (int) ((next.f11176t * c2870f.m9763w()) + 0.5f));
                                    next.f11146e.f11365e.mo9952d(next.m9718Q());
                                    next.f11148f.f11365e.mo9952d(next.m9763w());
                                    next.f11138a = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private int m9938e(C2870f c2870f, int i4) {
        int size = this.f11325i.size();
        long jMax = 0;
        for (int i5 = 0; i5 < size; i5++) {
            jMax = Math.max(jMax, this.f11325i.get(i5).m9960b(c2870f, i4));
        }
        return (int) jMax;
    }

    /* renamed from: i */
    private void m9939i(AbstractC2903m abstractC2903m, int i4, ArrayList<C2901k> arrayList) {
        for (InterfaceC2894d interfaceC2894d : abstractC2903m.f11368h.f11336k) {
            if (interfaceC2894d instanceof C2896f) {
                m9936a((C2896f) interfaceC2894d, i4, 0, abstractC2903m.f11369i, arrayList, null);
            } else if (interfaceC2894d instanceof AbstractC2903m) {
                m9936a(((AbstractC2903m) interfaceC2894d).f11368h, i4, 0, abstractC2903m.f11369i, arrayList, null);
            }
        }
        for (InterfaceC2894d interfaceC2894d2 : abstractC2903m.f11369i.f11336k) {
            if (interfaceC2894d2 instanceof C2896f) {
                m9936a((C2896f) interfaceC2894d2, i4, 1, abstractC2903m.f11368h, arrayList, null);
            } else if (interfaceC2894d2 instanceof AbstractC2903m) {
                m9936a(((AbstractC2903m) interfaceC2894d2).f11369i, i4, 1, abstractC2903m.f11368h, arrayList, null);
            }
        }
        if (i4 == 1) {
            for (InterfaceC2894d interfaceC2894d3 : ((C2902l) abstractC2903m).f11358k.f11336k) {
                if (interfaceC2894d3 instanceof C2896f) {
                    m9936a((C2896f) interfaceC2894d3, i4, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: l */
    private void m9940l(C2869e c2869e, C2869e.b bVar, int i4, C2869e.b bVar2, int i5) {
        C2892b.a aVar = this.f11324h;
        aVar.f11305a = bVar;
        aVar.f11306b = bVar2;
        aVar.f11307c = i4;
        aVar.f11308d = i5;
        this.f11323g.mo1622b(c2869e, aVar);
        c2869e.m9702F0(this.f11324h.f11309e);
        c2869e.m9737i0(this.f11324h.f11310f);
        c2869e.m9735h0(this.f11324h.f11312h);
        c2869e.m9729c0(this.f11324h.f11311g);
    }

    /* renamed from: c */
    public void m9941c() {
        m9942d(this.f11321e);
        this.f11325i.clear();
        C2901k.f11350h = 0;
        m9939i(this.f11317a.f11146e, 0, this.f11325i);
        m9939i(this.f11317a.f11148f, 1, this.f11325i);
        this.f11318b = false;
    }

    /* renamed from: d */
    public void m9942d(ArrayList<AbstractC2903m> arrayList) {
        arrayList.clear();
        this.f11320d.f11146e.mo9933f();
        this.f11320d.f11148f.mo9933f();
        arrayList.add(this.f11320d.f11146e);
        arrayList.add(this.f11320d.f11148f);
        Iterator<C2869e> it = this.f11320d.f11286G0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C2869e next = it.next();
            if (next instanceof C2872h) {
                arrayList.add(new C2898h(next));
            } else {
                if (next.m9723W()) {
                    if (next.f11142c == null) {
                        next.f11142c = new C2893c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f11142c);
                } else {
                    arrayList.add(next.f11146e);
                }
                if (next.m9725Y()) {
                    if (next.f11144d == null) {
                        next.f11144d = new C2893c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f11144d);
                } else {
                    arrayList.add(next.f11148f);
                }
                if (next instanceof C2874j) {
                    arrayList.add(new C2899i(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<AbstractC2903m> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo9933f();
        }
        Iterator<AbstractC2903m> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC2903m next2 = it3.next();
            if (next2.f11362b != this.f11320d) {
                next2.mo9931d();
            }
        }
    }

    /* renamed from: f */
    public boolean m9943f(boolean z3) {
        boolean z4;
        boolean z5 = true;
        boolean z6 = z3 & true;
        if (this.f11318b || this.f11319c) {
            Iterator<C2869e> it = this.f11317a.f11286G0.iterator();
            while (it.hasNext()) {
                C2869e next = it.next();
                next.f11138a = false;
                next.f11146e.m9956r();
                next.f11148f.m9961q();
            }
            C2870f c2870f = this.f11317a;
            c2870f.f11138a = false;
            c2870f.f11146e.m9956r();
            this.f11317a.f11148f.m9961q();
            this.f11319c = false;
        }
        if (m9937b(this.f11320d)) {
            return false;
        }
        this.f11317a.m9704G0(0);
        this.f11317a.m9706H0(0);
        C2869e.b bVarM9757t = this.f11317a.m9757t(0);
        C2869e.b bVarM9757t2 = this.f11317a.m9757t(1);
        if (this.f11318b) {
            m9941c();
        }
        int iM9719R = this.f11317a.m9719R();
        int iM9720S = this.f11317a.m9720S();
        this.f11317a.f11146e.f11368h.mo9952d(iM9719R);
        this.f11317a.f11148f.f11368h.mo9952d(iM9720S);
        m9948m();
        C2869e.b bVar = C2869e.b.WRAP_CONTENT;
        if (bVarM9757t == bVar || bVarM9757t2 == bVar) {
            if (z6) {
                Iterator<AbstractC2903m> it2 = this.f11321e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().mo9935m()) {
                        z6 = false;
                        break;
                    }
                }
            }
            if (z6 && bVarM9757t == C2869e.b.WRAP_CONTENT) {
                this.f11317a.m9744m0(C2869e.b.FIXED);
                C2870f c2870f2 = this.f11317a;
                c2870f2.m9702F0(m9938e(c2870f2, 0));
                C2870f c2870f3 = this.f11317a;
                c2870f3.f11146e.f11365e.mo9952d(c2870f3.m9718Q());
            }
            if (z6 && bVarM9757t2 == C2869e.b.WRAP_CONTENT) {
                this.f11317a.m9694B0(C2869e.b.FIXED);
                C2870f c2870f4 = this.f11317a;
                c2870f4.m9737i0(m9938e(c2870f4, 1));
                C2870f c2870f5 = this.f11317a;
                c2870f5.f11148f.f11365e.mo9952d(c2870f5.m9763w());
            }
        }
        C2870f c2870f6 = this.f11317a;
        C2869e.b[] bVarArr = c2870f6.f11126O;
        C2869e.b bVar2 = bVarArr[0];
        C2869e.b bVar3 = C2869e.b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == C2869e.b.MATCH_PARENT) {
            int iM9718Q = c2870f6.m9718Q() + iM9719R;
            this.f11317a.f11146e.f11369i.mo9952d(iM9718Q);
            this.f11317a.f11146e.f11365e.mo9952d(iM9718Q - iM9719R);
            m9948m();
            C2870f c2870f7 = this.f11317a;
            C2869e.b[] bVarArr2 = c2870f7.f11126O;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == C2869e.b.MATCH_PARENT) {
                int iM9763w = c2870f7.m9763w() + iM9720S;
                this.f11317a.f11148f.f11369i.mo9952d(iM9763w);
                this.f11317a.f11148f.f11365e.mo9952d(iM9763w - iM9720S);
            }
            m9948m();
            z4 = true;
        } else {
            z4 = false;
        }
        Iterator<AbstractC2903m> it3 = this.f11321e.iterator();
        while (it3.hasNext()) {
            AbstractC2903m next2 = it3.next();
            if (next2.f11362b != this.f11317a || next2.f11367g) {
                next2.mo9932e();
            }
        }
        Iterator<AbstractC2903m> it4 = this.f11321e.iterator();
        while (it4.hasNext()) {
            AbstractC2903m next3 = it4.next();
            if (z4 || next3.f11362b != this.f11317a) {
                if (!next3.f11368h.f11335j || ((!next3.f11369i.f11335j && !(next3 instanceof C2898h)) || (!next3.f11365e.f11335j && !(next3 instanceof C2893c) && !(next3 instanceof C2898h)))) {
                    z5 = false;
                    break;
                }
            }
        }
        this.f11317a.m9744m0(bVarM9757t);
        this.f11317a.m9694B0(bVarM9757t2);
        return z5;
    }

    /* renamed from: g */
    public boolean m9944g(boolean z3) {
        if (this.f11318b) {
            Iterator<C2869e> it = this.f11317a.f11286G0.iterator();
            while (it.hasNext()) {
                C2869e next = it.next();
                next.f11138a = false;
                C2900j c2900j = next.f11146e;
                c2900j.f11365e.f11335j = false;
                c2900j.f11367g = false;
                c2900j.m9956r();
                C2902l c2902l = next.f11148f;
                c2902l.f11365e.f11335j = false;
                c2902l.f11367g = false;
                c2902l.m9961q();
            }
            C2870f c2870f = this.f11317a;
            c2870f.f11138a = false;
            C2900j c2900j2 = c2870f.f11146e;
            c2900j2.f11365e.f11335j = false;
            c2900j2.f11367g = false;
            c2900j2.m9956r();
            C2902l c2902l2 = this.f11317a.f11148f;
            c2902l2.f11365e.f11335j = false;
            c2902l2.f11367g = false;
            c2902l2.m9961q();
            m9941c();
        }
        if (m9937b(this.f11320d)) {
            return false;
        }
        this.f11317a.m9704G0(0);
        this.f11317a.m9706H0(0);
        this.f11317a.f11146e.f11368h.mo9952d(0);
        this.f11317a.f11148f.f11368h.mo9952d(0);
        return true;
    }

    /* renamed from: h */
    public boolean m9945h(boolean z3, int i4) {
        boolean z4;
        C2869e.b bVar;
        boolean z5 = true;
        boolean z6 = z3 & true;
        C2869e.b bVarM9757t = this.f11317a.m9757t(0);
        C2869e.b bVarM9757t2 = this.f11317a.m9757t(1);
        int iM9719R = this.f11317a.m9719R();
        int iM9720S = this.f11317a.m9720S();
        if (z6 && (bVarM9757t == (bVar = C2869e.b.WRAP_CONTENT) || bVarM9757t2 == bVar)) {
            Iterator<AbstractC2903m> it = this.f11321e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC2903m next = it.next();
                if (next.f11366f == i4 && !next.mo9935m()) {
                    z6 = false;
                    break;
                }
            }
            if (i4 == 0) {
                if (z6 && bVarM9757t == C2869e.b.WRAP_CONTENT) {
                    this.f11317a.m9744m0(C2869e.b.FIXED);
                    C2870f c2870f = this.f11317a;
                    c2870f.m9702F0(m9938e(c2870f, 0));
                    C2870f c2870f2 = this.f11317a;
                    c2870f2.f11146e.f11365e.mo9952d(c2870f2.m9718Q());
                }
            } else if (z6 && bVarM9757t2 == C2869e.b.WRAP_CONTENT) {
                this.f11317a.m9694B0(C2869e.b.FIXED);
                C2870f c2870f3 = this.f11317a;
                c2870f3.m9737i0(m9938e(c2870f3, 1));
                C2870f c2870f4 = this.f11317a;
                c2870f4.f11148f.f11365e.mo9952d(c2870f4.m9763w());
            }
        }
        if (i4 == 0) {
            C2870f c2870f5 = this.f11317a;
            C2869e.b[] bVarArr = c2870f5.f11126O;
            if (bVarArr[0] == C2869e.b.FIXED || bVarArr[0] == C2869e.b.MATCH_PARENT) {
                int iM9718Q = c2870f5.m9718Q() + iM9719R;
                this.f11317a.f11146e.f11369i.mo9952d(iM9718Q);
                this.f11317a.f11146e.f11365e.mo9952d(iM9718Q - iM9719R);
                z4 = true;
            }
            z4 = false;
        } else {
            C2870f c2870f6 = this.f11317a;
            C2869e.b[] bVarArr2 = c2870f6.f11126O;
            if (bVarArr2[1] == C2869e.b.FIXED || bVarArr2[1] == C2869e.b.MATCH_PARENT) {
                int iM9763w = c2870f6.m9763w() + iM9720S;
                this.f11317a.f11148f.f11369i.mo9952d(iM9763w);
                this.f11317a.f11148f.f11365e.mo9952d(iM9763w - iM9720S);
                z4 = true;
            }
            z4 = false;
        }
        m9948m();
        Iterator<AbstractC2903m> it2 = this.f11321e.iterator();
        while (it2.hasNext()) {
            AbstractC2903m next2 = it2.next();
            if (next2.f11366f == i4 && (next2.f11362b != this.f11317a || next2.f11367g)) {
                next2.mo9932e();
            }
        }
        Iterator<AbstractC2903m> it3 = this.f11321e.iterator();
        while (it3.hasNext()) {
            AbstractC2903m next3 = it3.next();
            if (next3.f11366f == i4 && (z4 || next3.f11362b != this.f11317a)) {
                if (!next3.f11368h.f11335j || !next3.f11369i.f11335j || (!(next3 instanceof C2893c) && !next3.f11365e.f11335j)) {
                    z5 = false;
                    break;
                }
            }
        }
        this.f11317a.m9744m0(bVarM9757t);
        this.f11317a.m9694B0(bVarM9757t2);
        return z5;
    }

    /* renamed from: j */
    public void m9946j() {
        this.f11318b = true;
    }

    /* renamed from: k */
    public void m9947k() {
        this.f11319c = true;
    }

    /* renamed from: m */
    public void m9948m() {
        C2897g c2897g;
        Iterator<C2869e> it = this.f11317a.f11286G0.iterator();
        while (it.hasNext()) {
            C2869e next = it.next();
            if (!next.f11138a) {
                C2869e.b[] bVarArr = next.f11126O;
                boolean z3 = false;
                C2869e.b bVar = bVarArr[0];
                C2869e.b bVar2 = bVarArr[1];
                int i4 = next.f11160l;
                int i5 = next.f11162m;
                C2869e.b bVar3 = C2869e.b.WRAP_CONTENT;
                boolean z4 = bVar == bVar3 || (bVar == C2869e.b.MATCH_CONSTRAINT && i4 == 1);
                if (bVar2 == bVar3 || (bVar2 == C2869e.b.MATCH_CONSTRAINT && i5 == 1)) {
                    z3 = true;
                }
                C2897g c2897g2 = next.f11146e.f11365e;
                boolean z5 = c2897g2.f11335j;
                C2897g c2897g3 = next.f11148f.f11365e;
                boolean z6 = c2897g3.f11335j;
                if (z5 && z6) {
                    C2869e.b bVar4 = C2869e.b.FIXED;
                    m9940l(next, bVar4, c2897g2.f11332g, bVar4, c2897g3.f11332g);
                    next.f11138a = true;
                } else if (z5 && z3) {
                    m9940l(next, C2869e.b.FIXED, c2897g2.f11332g, bVar3, c2897g3.f11332g);
                    if (bVar2 == C2869e.b.MATCH_CONSTRAINT) {
                        next.f11148f.f11365e.f11347m = next.m9763w();
                    } else {
                        next.f11148f.f11365e.mo9952d(next.m9763w());
                        next.f11138a = true;
                    }
                } else if (z6 && z4) {
                    m9940l(next, bVar3, c2897g2.f11332g, C2869e.b.FIXED, c2897g3.f11332g);
                    if (bVar == C2869e.b.MATCH_CONSTRAINT) {
                        next.f11146e.f11365e.f11347m = next.m9718Q();
                    } else {
                        next.f11146e.f11365e.mo9952d(next.m9718Q());
                        next.f11138a = true;
                    }
                }
                if (next.f11138a && (c2897g = next.f11148f.f11359l) != null) {
                    c2897g.mo9952d(next.m9747o());
                }
            }
        }
    }

    /* renamed from: n */
    public void m9949n(C2892b.b bVar) {
        this.f11323g = bVar;
    }
}
