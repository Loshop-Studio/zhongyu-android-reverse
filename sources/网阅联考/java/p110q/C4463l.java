package p110q;

import java.util.Queue;
import p062g0.AbstractC3750j;
import p062g0.C3746f;

/* renamed from: q.l */
/* loaded from: classes2.dex */
public class C4463l {

    /* renamed from: a */
    public final C3746f f5187a;

    /* renamed from: q.l$a */
    public class a extends C3746f {
        public a(long j4) {
            super(j4);
        }

        @Override // p062g0.C3746f
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void mo4758j(b bVar, Object obj) {
            bVar.m5718c();
        }
    }

    /* renamed from: q.l$b */
    public static final class b {

        /* renamed from: d */
        public static final Queue f5189d = AbstractC3750j.m4774e(0);

        /* renamed from: a */
        public int f5190a;

        /* renamed from: b */
        public int f5191b;

        /* renamed from: c */
        public Object f5192c;

        /* renamed from: a */
        public static b m5716a(Object obj, int i4, int i5) {
            b bVar;
            Queue queue = f5189d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.m5717b(obj, i4, i5);
            return bVar;
        }

        /* renamed from: b */
        public final void m5717b(Object obj, int i4, int i5) {
            this.f5192c = obj;
            this.f5191b = i4;
            this.f5190a = i5;
        }

        /* renamed from: c */
        public void m5718c() {
            Queue queue = f5189d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f5191b == bVar.f5191b && this.f5190a == bVar.f5190a && this.f5192c.equals(bVar.f5192c);
        }

        public int hashCode() {
            return (((this.f5190a * 31) + this.f5191b) * 31) + this.f5192c.hashCode();
        }
    }

    public C4463l(long j4) {
        this.f5187a = new a(j4);
    }

    /* renamed from: a */
    public Object m5713a(Object obj, int i4, int i5) {
        b bVarM5716a = b.m5716a(obj, i4, i5);
        Object objM4755g = this.f5187a.m4755g(bVarM5716a);
        bVarM5716a.m5718c();
        return objM4755g;
    }

    /* renamed from: b */
    public void m5714b(Object obj, int i4, int i5, Object obj2) {
        this.f5187a.m4759k(b.m5716a(obj, i4, i5), obj2);
    }
}
