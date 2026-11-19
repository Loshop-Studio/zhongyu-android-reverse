package p226r;

import java.util.Queue;
import p116h0.AbstractC8707k;
import p116h0.C8703g;

/* renamed from: r.m */
/* loaded from: classes3.dex */
public class C9887m {

    /* renamed from: a */
    public final C8703g f19813a;

    /* renamed from: r.m$a */
    public class a extends C8703g {
        public a(long j10) {
            super(j10);
        }

        @Override // p116h0.C8703g
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo14171i(b bVar, Object obj) {
            bVar.m18506c();
        }
    }

    /* renamed from: r.m$b */
    public static final class b {

        /* renamed from: d */
        public static final Queue f19815d = AbstractC8707k.m14188f(0);

        /* renamed from: a */
        public int f19816a;

        /* renamed from: b */
        public int f19817b;

        /* renamed from: c */
        public Object f19818c;

        /* renamed from: a */
        public static b m18504a(Object obj, int i10, int i11) {
            b bVar;
            Queue queue = f19815d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.m18505b(obj, i10, i11);
            return bVar;
        }

        /* renamed from: b */
        public final void m18505b(Object obj, int i10, int i11) {
            this.f19818c = obj;
            this.f19817b = i10;
            this.f19816a = i11;
        }

        /* renamed from: c */
        public void m18506c() {
            Queue queue = f19815d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f19817b == bVar.f19817b && this.f19816a == bVar.f19816a && this.f19818c.equals(bVar.f19818c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f19816a * 31) + this.f19817b) * 31) + this.f19818c.hashCode();
        }
    }

    public C9887m(long j10) {
        this.f19813a = new a(j10);
    }

    /* renamed from: a */
    public Object m18501a(Object obj, int i10, int i11) {
        b bVarM18504a = b.m18504a(obj, i10, i11);
        Object objM14168f = this.f19813a.m14168f(bVarM18504a);
        bVarM18504a.m18506c();
        return objM14168f;
    }

    /* renamed from: b */
    public void m18502b(Object obj, int i10, int i11, Object obj2) {
        this.f19813a.m14172j(b.m18504a(obj, i10, i11), obj2);
    }
}
