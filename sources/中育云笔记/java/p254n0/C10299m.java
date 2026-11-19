package p254n0;

import java.util.Queue;
import p109d1.AbstractC8910k;
import p109d1.C8906g;

/* renamed from: n0.m */
/* loaded from: classes3.dex */
public class C10299m {

    /* renamed from: a */
    public final C8906g f24536a;

    /* renamed from: n0.m$a */
    public class a extends C8906g {
        public a(long j10) {
            super(j10);
        }

        @Override // p109d1.C8906g
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void mo17458j(b bVar, Object obj) {
            bVar.m21477c();
        }
    }

    /* renamed from: n0.m$b */
    public static final class b {

        /* renamed from: d */
        public static final Queue f24538d = AbstractC8910k.m17475f(0);

        /* renamed from: a */
        public int f24539a;

        /* renamed from: b */
        public int f24540b;

        /* renamed from: c */
        public Object f24541c;

        /* renamed from: a */
        public static b m21475a(Object obj, int i10, int i11) {
            b bVar;
            Queue queue = f24538d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.m21476b(obj, i10, i11);
            return bVar;
        }

        /* renamed from: b */
        public final void m21476b(Object obj, int i10, int i11) {
            this.f24541c = obj;
            this.f24540b = i10;
            this.f24539a = i11;
        }

        /* renamed from: c */
        public void m21477c() {
            Queue queue = f24538d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f24540b == bVar.f24540b && this.f24539a == bVar.f24539a && this.f24541c.equals(bVar.f24541c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f24539a * 31) + this.f24540b) * 31) + this.f24541c.hashCode();
        }
    }

    public C10299m(long j10) {
        this.f24536a = new a(j10);
    }

    /* renamed from: a */
    public Object m21472a(Object obj, int i10, int i11) {
        b bVarM21475a = b.m21475a(obj, i10, i11);
        Object objM17455g = this.f24536a.m17455g(bVarM21475a);
        bVarM21475a.m21477c();
        return objM17455g;
    }

    /* renamed from: b */
    public void m21473b(Object obj, int i10, int i11, Object obj2) {
        this.f24536a.m17459k(b.m21475a(obj, i10, i11), obj2);
    }
}
