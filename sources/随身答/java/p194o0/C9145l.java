package p194o0;

import java.util.Queue;
import p091e1.AbstractC7838j;
import p091e1.C7834f;

/* renamed from: o0.l */
/* loaded from: classes3.dex */
public class C9145l {

    /* renamed from: a */
    public final C7834f f15418a;

    /* renamed from: o0.l$a */
    public class a extends C7834f {
        public a(long j9) {
            super(j9);
        }

        @Override // p091e1.C7834f
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void mo12246j(b bVar, Object obj) {
            bVar.m14702c();
        }
    }

    /* renamed from: o0.l$b */
    public static final class b {

        /* renamed from: d */
        public static final Queue f15420d = AbstractC7838j.m12262e(0);

        /* renamed from: a */
        public int f15421a;

        /* renamed from: b */
        public int f15422b;

        /* renamed from: c */
        public Object f15423c;

        /* renamed from: a */
        public static b m14700a(Object obj, int i9, int i10) {
            b bVar;
            Queue queue = f15420d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.m14701b(obj, i9, i10);
            return bVar;
        }

        /* renamed from: b */
        public final void m14701b(Object obj, int i9, int i10) {
            this.f15423c = obj;
            this.f15422b = i9;
            this.f15421a = i10;
        }

        /* renamed from: c */
        public void m14702c() {
            Queue queue = f15420d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f15422b == bVar.f15422b && this.f15421a == bVar.f15421a && this.f15423c.equals(bVar.f15423c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f15421a * 31) + this.f15422b) * 31) + this.f15423c.hashCode();
        }
    }

    public C9145l(long j9) {
        this.f15418a = new a(j9);
    }

    /* renamed from: a */
    public Object m14697a(Object obj, int i9, int i10) {
        b bVarM14700a = b.m14700a(obj, i9, i10);
        Object objM12243g = this.f15418a.m12243g(bVarM14700a);
        bVarM14700a.m14702c();
        return objM12243g;
    }

    /* renamed from: b */
    public void m14698b(Object obj, int i9, int i10, Object obj2) {
        this.f15418a.m12247k(b.m14700a(obj, i9, i10), obj2);
    }
}
