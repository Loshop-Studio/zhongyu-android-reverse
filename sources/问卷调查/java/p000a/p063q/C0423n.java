package p000a.p063q;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p063q.AbstractC0417h;

/* renamed from: a.q.n */
/* loaded from: classes.dex */
public class C0423n extends AbstractC0417h {

    /* renamed from: A */
    public int f2446A;

    /* renamed from: y */
    public ArrayList<AbstractC0417h> f2449y = new ArrayList<>();

    /* renamed from: z */
    public boolean f2450z = true;

    /* renamed from: B */
    public boolean f2447B = false;

    /* renamed from: C */
    public int f2448C = 0;

    /* renamed from: a.q.n$a */
    public class a extends C0420k {

        /* renamed from: a */
        public final /* synthetic */ AbstractC0417h f2451a;

        public a(C0423n c0423n, AbstractC0417h abstractC0417h) {
            this.f2451a = abstractC0417h;
        }

        @Override // p000a.p063q.AbstractC0417h.d
        /* renamed from: c */
        public void mo1434c(AbstractC0417h abstractC0417h) {
            this.f2451a.mo1470y();
            abstractC0417h.mo1467v(this);
        }
    }

    /* renamed from: a.q.n$b */
    public static class b extends C0420k {

        /* renamed from: a */
        public C0423n f2452a;

        public b(C0423n c0423n) {
            this.f2452a = c0423n;
        }

        @Override // p000a.p063q.C0420k, p000a.p063q.AbstractC0417h.d
        /* renamed from: a */
        public void mo1432a(AbstractC0417h abstractC0417h) {
            C0423n c0423n = this.f2452a;
            if (c0423n.f2447B) {
                return;
            }
            c0423n.m1452F();
            this.f2452a.f2447B = true;
        }

        @Override // p000a.p063q.AbstractC0417h.d
        /* renamed from: c */
        public void mo1434c(AbstractC0417h abstractC0417h) {
            C0423n c0423n = this.f2452a;
            int i = c0423n.f2446A - 1;
            c0423n.f2446A = i;
            if (i == 0) {
                c0423n.f2447B = false;
                c0423n.m1462m();
            }
            abstractC0417h.mo1467v(this);
        }
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: A */
    public void mo1447A(AbstractC0417h.c cVar) {
        this.f2429t = cVar;
        this.f2448C |= 8;
        int size = this.f2449y.size();
        for (int i = 0; i < size; i++) {
            this.f2449y.get(i).mo1447A(cVar);
        }
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: B */
    public AbstractC0417h mo1448B(TimeInterpolator timeInterpolator) {
        this.f2448C |= 1;
        ArrayList<AbstractC0417h> arrayList = this.f2449y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f2449y.get(i).mo1448B(timeInterpolator);
            }
        }
        this.f2414e = timeInterpolator;
        return this;
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: C */
    public void mo1449C(AbstractC0414e abstractC0414e) {
        this.f2430u = abstractC0414e == null ? AbstractC0417h.f2409w : abstractC0414e;
        this.f2448C |= 4;
        if (this.f2449y != null) {
            for (int i = 0; i < this.f2449y.size(); i++) {
                this.f2449y.get(i).mo1449C(abstractC0414e);
            }
        }
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: D */
    public void mo1450D(AbstractC0422m abstractC0422m) {
        this.f2448C |= 2;
        int size = this.f2449y.size();
        for (int i = 0; i < size; i++) {
            this.f2449y.get(i).mo1450D(abstractC0422m);
        }
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: E */
    public AbstractC0417h mo1451E(long j) {
        this.f2412c = j;
        return this;
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: G */
    public String mo1453G(String str) {
        String strMo1453G = super.mo1453G(str);
        for (int i = 0; i < this.f2449y.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strMo1453G);
            sb.append("\n");
            sb.append(this.f2449y.get(i).mo1453G(str + "  "));
            strMo1453G = sb.toString();
        }
        return strMo1453G;
    }

    /* renamed from: H */
    public C0423n m1473H(AbstractC0417h abstractC0417h) {
        this.f2449y.add(abstractC0417h);
        abstractC0417h.f2419j = this;
        long j = this.f2413d;
        if (j >= 0) {
            abstractC0417h.mo1471z(j);
        }
        if ((this.f2448C & 1) != 0) {
            abstractC0417h.mo1448B(this.f2414e);
        }
        if ((this.f2448C & 2) != 0) {
            abstractC0417h.mo1450D(null);
        }
        if ((this.f2448C & 4) != 0) {
            abstractC0417h.mo1449C(this.f2430u);
        }
        if ((this.f2448C & 8) != 0) {
            abstractC0417h.mo1447A(this.f2429t);
        }
        return this;
    }

    /* renamed from: I */
    public AbstractC0417h m1474I(int i) {
        if (i < 0 || i >= this.f2449y.size()) {
            return null;
        }
        return this.f2449y.get(i);
    }

    /* renamed from: J */
    public C0423n m1475J(int i) {
        if (i == 0) {
            this.f2450z = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
            }
            this.f2450z = false;
        }
        return this;
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: a */
    public AbstractC0417h mo1454a(AbstractC0417h.d dVar) {
        super.mo1454a(dVar);
        return this;
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: b */
    public AbstractC0417h mo1455b(View view) {
        for (int i = 0; i < this.f2449y.size(); i++) {
            this.f2449y.get(i).mo1455b(view);
        }
        this.f2416g.add(view);
        return this;
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: d */
    public void mo1428d(C0425p c0425p) {
        if (m1465s(c0425p.f2457b)) {
            Iterator<AbstractC0417h> it = this.f2449y.iterator();
            while (it.hasNext()) {
                AbstractC0417h next = it.next();
                if (next.m1465s(c0425p.f2457b)) {
                    next.mo1428d(c0425p);
                    c0425p.f2458c.add(next);
                }
            }
        }
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: f */
    public void mo1457f(C0425p c0425p) {
        int size = this.f2449y.size();
        for (int i = 0; i < size; i++) {
            this.f2449y.get(i).mo1457f(c0425p);
        }
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: g */
    public void mo1440g(C0425p c0425p) {
        if (m1465s(c0425p.f2457b)) {
            Iterator<AbstractC0417h> it = this.f2449y.iterator();
            while (it.hasNext()) {
                AbstractC0417h next = it.next();
                if (next.m1465s(c0425p.f2457b)) {
                    next.mo1440g(c0425p);
                    c0425p.f2458c.add(next);
                }
            }
        }
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: j */
    public AbstractC0417h clone() {
        C0423n c0423n = (C0423n) super.clone();
        c0423n.f2449y = new ArrayList<>();
        int size = this.f2449y.size();
        for (int i = 0; i < size; i++) {
            AbstractC0417h abstractC0417hClone = this.f2449y.get(i).clone();
            c0423n.f2449y.add(abstractC0417hClone);
            abstractC0417hClone.f2419j = c0423n;
        }
        return c0423n;
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: l */
    public void mo1461l(ViewGroup viewGroup, C0426q c0426q, C0426q c0426q2, ArrayList<C0425p> arrayList, ArrayList<C0425p> arrayList2) {
        long j = this.f2412c;
        int size = this.f2449y.size();
        for (int i = 0; i < size; i++) {
            AbstractC0417h abstractC0417h = this.f2449y.get(i);
            if (j > 0 && (this.f2450z || i == 0)) {
                long j2 = abstractC0417h.f2412c;
                if (j2 > 0) {
                    abstractC0417h.mo1451E(j2 + j);
                } else {
                    abstractC0417h.mo1451E(j);
                }
            }
            abstractC0417h.mo1461l(viewGroup, c0426q, c0426q2, arrayList, arrayList2);
        }
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: u */
    public void mo1466u(View view) {
        super.mo1466u(view);
        int size = this.f2449y.size();
        for (int i = 0; i < size; i++) {
            this.f2449y.get(i).mo1466u(view);
        }
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: v */
    public AbstractC0417h mo1467v(AbstractC0417h.d dVar) {
        super.mo1467v(dVar);
        return this;
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: w */
    public AbstractC0417h mo1468w(View view) {
        for (int i = 0; i < this.f2449y.size(); i++) {
            this.f2449y.get(i).mo1468w(view);
        }
        this.f2416g.remove(view);
        return this;
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: x */
    public void mo1469x(View view) {
        super.mo1469x(view);
        int size = this.f2449y.size();
        for (int i = 0; i < size; i++) {
            this.f2449y.get(i).mo1469x(view);
        }
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: y */
    public void mo1470y() {
        if (this.f2449y.isEmpty()) {
            m1452F();
            m1462m();
            return;
        }
        b bVar = new b(this);
        Iterator<AbstractC0417h> it = this.f2449y.iterator();
        while (it.hasNext()) {
            it.next().mo1454a(bVar);
        }
        this.f2446A = this.f2449y.size();
        if (this.f2450z) {
            Iterator<AbstractC0417h> it2 = this.f2449y.iterator();
            while (it2.hasNext()) {
                it2.next().mo1470y();
            }
            return;
        }
        for (int i = 1; i < this.f2449y.size(); i++) {
            this.f2449y.get(i - 1).mo1454a(new a(this, this.f2449y.get(i)));
        }
        AbstractC0417h abstractC0417h = this.f2449y.get(0);
        if (abstractC0417h != null) {
            abstractC0417h.mo1470y();
        }
    }

    @Override // p000a.p063q.AbstractC0417h
    /* renamed from: z */
    public AbstractC0417h mo1471z(long j) {
        ArrayList<AbstractC0417h> arrayList;
        this.f2413d = j;
        if (j >= 0 && (arrayList = this.f2449y) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f2449y.get(i).mo1471z(j);
            }
        }
        return this;
    }
}
