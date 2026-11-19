package p226r;

import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5405d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p116h0.AbstractC8706j;
import p160l.C9230d;
import p160l.InterfaceC9228b;
import p226r.InterfaceC9888n;

/* renamed from: r.q */
/* loaded from: classes3.dex */
public class C9891q implements InterfaceC9888n {

    /* renamed from: a */
    public final List f19826a;

    /* renamed from: b */
    public final Pools.Pool f19827b;

    /* renamed from: r.q$a */
    public static class a implements InterfaceC5405d, InterfaceC5405d.a {

        /* renamed from: a */
        public final List f19828a;

        /* renamed from: b */
        public final Pools.Pool f19829b;

        /* renamed from: c */
        public int f19830c;

        /* renamed from: d */
        public Priority f19831d;

        /* renamed from: e */
        public InterfaceC5405d.a f19832e;

        /* renamed from: f */
        public List f19833f;

        /* renamed from: g */
        public boolean f19834g;

        public a(List list, Pools.Pool pool) {
            this.f19829b = pool;
            AbstractC8706j.m14180c(list);
            this.f19828a = list;
            this.f19830c = 0;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: a */
        public Class mo2846a() {
            return ((InterfaceC5405d) this.f19828a.get(0)).mo2846a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: b */
        public void mo2851b() {
            List list = this.f19833f;
            if (list != null) {
                this.f19829b.release(list);
            }
            this.f19833f = null;
            Iterator it = this.f19828a.iterator();
            while (it.hasNext()) {
                ((InterfaceC5405d) it.next()).mo2851b();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d.a
        /* renamed from: c */
        public void mo2858c(Exception exc) {
            ((List) AbstractC8706j.m14181d(this.f19833f)).add(exc);
            m18515f();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        public void cancel() {
            this.f19834g = true;
            Iterator it = this.f19828a.iterator();
            while (it.hasNext()) {
                ((InterfaceC5405d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        /* renamed from: d */
        public void mo2853d(Priority priority, InterfaceC5405d.a aVar) {
            this.f19831d = priority;
            this.f19832e = aVar;
            this.f19833f = (List) this.f19829b.acquire();
            ((InterfaceC5405d) this.f19828a.get(this.f19830c)).mo2853d(priority, this);
            if (this.f19834g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d.a
        /* renamed from: e */
        public void mo2859e(Object obj) {
            if (obj != null) {
                this.f19832e.mo2859e(obj);
            } else {
                m18515f();
            }
        }

        /* renamed from: f */
        public final void m18515f() {
            if (this.f19834g) {
                return;
            }
            if (this.f19830c < this.f19828a.size() - 1) {
                this.f19830c++;
                mo2853d(this.f19831d, this.f19832e);
            } else {
                AbstractC8706j.m14181d(this.f19833f);
                this.f19832e.mo2858c(new GlideException("Fetch failed", new ArrayList(this.f19833f)));
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d
        public DataSource getDataSource() {
            return ((InterfaceC5405d) this.f19828a.get(0)).getDataSource();
        }
    }

    public C9891q(List list, Pools.Pool pool) {
        this.f19826a = list;
        this.f19827b = pool;
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: a */
    public boolean mo18445a(Object obj) {
        Iterator it = this.f19826a.iterator();
        while (it.hasNext()) {
            if (((InterfaceC9888n) it.next()).mo18445a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: b */
    public InterfaceC9888n.a mo18446b(Object obj, int i10, int i11, C9230d c9230d) {
        InterfaceC9888n.a aVarMo18446b;
        int size = this.f19826a.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC9228b interfaceC9228b = null;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC9888n interfaceC9888n = (InterfaceC9888n) this.f19826a.get(i12);
            if (interfaceC9888n.mo18445a(obj) && (aVarMo18446b = interfaceC9888n.mo18446b(obj, i10, i11, c9230d)) != null) {
                interfaceC9228b = aVarMo18446b.f19819a;
                arrayList.add(aVarMo18446b.f19821c);
            }
        }
        if (arrayList.isEmpty() || interfaceC9228b == null) {
            return null;
        }
        return new InterfaceC9888n.a(interfaceC9228b, new a(arrayList, this.f19827b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f19826a.toArray()) + '}';
    }
}
