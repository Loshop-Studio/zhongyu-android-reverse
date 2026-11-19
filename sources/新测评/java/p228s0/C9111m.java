package p228s0;

import java.util.Queue;
import p117i1.AbstractC7652k;
import p117i1.C7648g;

/* renamed from: s0.m */
/* loaded from: classes3.dex */
public class C9111m {

    /* renamed from: a */
    public final C7648g f15778a;

    /* renamed from: s0.m$a */
    public class a extends C7648g {
        public a(long j10) {
            super(j10);
        }

        @Override // p117i1.C7648g
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void mo12673j(b bVar, Object obj) {
            bVar.m15415c();
        }
    }

    /* renamed from: s0.m$b */
    public static final class b {

        /* renamed from: d */
        public static final Queue f15780d = AbstractC7652k.m12690f(0);

        /* renamed from: a */
        public int f15781a;

        /* renamed from: b */
        public int f15782b;

        /* renamed from: c */
        public Object f15783c;

        /* renamed from: a */
        public static b m15413a(Object obj, int i10, int i11) {
            b bVar;
            Queue queue = f15780d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.m15414b(obj, i10, i11);
            return bVar;
        }

        /* renamed from: b */
        public final void m15414b(Object obj, int i10, int i11) {
            this.f15783c = obj;
            this.f15782b = i10;
            this.f15781a = i11;
        }

        /* renamed from: c */
        public void m15415c() {
            Queue queue = f15780d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f15782b == bVar.f15782b && this.f15781a == bVar.f15781a && this.f15783c.equals(bVar.f15783c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f15781a * 31) + this.f15782b) * 31) + this.f15783c.hashCode();
        }
    }

    public C9111m(long j10) {
        this.f15778a = new a(j10);
    }

    /* renamed from: a */
    public Object m15410a(Object obj, int i10, int i11) {
        b bVarM15413a = b.m15413a(obj, i10, i11);
        Object objM12670g = this.f15778a.m12670g(bVarM15413a);
        bVarM15413a.m15415c();
        return objM12670g;
    }

    /* renamed from: b */
    public void m15411b(Object obj, int i10, int i11, Object obj2) {
        this.f15778a.m12674k(b.m15413a(obj, i10, i11), obj2);
    }
}
