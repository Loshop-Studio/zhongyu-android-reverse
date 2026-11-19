package p097l0;

import java.util.Queue;
import p016b1.AbstractC4409k;
import p016b1.C4405g;

/* renamed from: l0.m */
/* loaded from: classes3.dex */
public class C7279m {

    /* renamed from: a */
    public final C4405g f9224a;

    /* renamed from: l0.m$a */
    public class a extends C4405g {
        public a(long j6) {
            super(j6);
        }

        @Override // p016b1.C4405g
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void mo1428j(b bVar, Object obj) {
            bVar.m8251c();
        }
    }

    /* renamed from: l0.m$b */
    public static final class b {

        /* renamed from: d */
        public static final Queue f9226d = AbstractC4409k.m1445f(0);

        /* renamed from: a */
        public int f9227a;

        /* renamed from: b */
        public int f9228b;

        /* renamed from: c */
        public Object f9229c;

        /* renamed from: a */
        public static b m8249a(Object obj, int i6, int i7) {
            b bVar;
            Queue queue = f9226d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.m8250b(obj, i6, i7);
            return bVar;
        }

        /* renamed from: b */
        public final void m8250b(Object obj, int i6, int i7) {
            this.f9229c = obj;
            this.f9228b = i6;
            this.f9227a = i7;
        }

        /* renamed from: c */
        public void m8251c() {
            Queue queue = f9226d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f9228b == bVar.f9228b && this.f9227a == bVar.f9227a && this.f9229c.equals(bVar.f9229c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f9227a * 31) + this.f9228b) * 31) + this.f9229c.hashCode();
        }
    }

    public C7279m(long j6) {
        this.f9224a = new a(j6);
    }

    /* renamed from: a */
    public Object m8246a(Object obj, int i6, int i7) {
        b bVarM8249a = b.m8249a(obj, i6, i7);
        Object objM1425g = this.f9224a.m1425g(bVarM8249a);
        bVarM8249a.m8251c();
        return objM1425g;
    }

    /* renamed from: b */
    public void m8247b(Object obj, int i6, int i7, Object obj2) {
        this.f9224a.m1429k(b.m8249a(obj, i6, i7), obj2);
    }
}
