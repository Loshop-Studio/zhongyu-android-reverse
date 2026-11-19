package p254n0;

import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5824d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p109d1.AbstractC8909j;
import p168h0.C9438e;
import p168h0.InterfaceC9435b;
import p254n0.InterfaceC10300n;

/* renamed from: n0.q */
/* loaded from: classes3.dex */
public class C10303q implements InterfaceC10300n {

    /* renamed from: a */
    public final List f24549a;

    /* renamed from: b */
    public final Pools.Pool f24550b;

    /* renamed from: n0.q$a */
    public static class a implements InterfaceC5824d, InterfaceC5824d.a {

        /* renamed from: c */
        public final List f24551c;

        /* renamed from: d */
        public final Pools.Pool f24552d;

        /* renamed from: e */
        public int f24553e;

        /* renamed from: f */
        public Priority f24554f;

        /* renamed from: g */
        public InterfaceC5824d.a f24555g;

        /* renamed from: h */
        public List f24556h;

        /* renamed from: i */
        public boolean f24557i;

        public a(List list, Pools.Pool pool) {
            this.f24552d = pool;
            AbstractC8909j.m17467c(list);
            this.f24551c = list;
            this.f24553e = 0;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        /* renamed from: a */
        public Class mo4051a() {
            return ((InterfaceC5824d) this.f24551c.get(0)).mo4051a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d.a
        /* renamed from: b */
        public void mo4062b(Exception exc) {
            ((List) AbstractC8909j.m17468d(this.f24556h)).add(exc);
            m21486e();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        /* renamed from: c */
        public void mo4057c(Priority priority, InterfaceC5824d.a aVar) {
            this.f24554f = priority;
            this.f24555g = aVar;
            this.f24556h = (List) this.f24552d.acquire();
            ((InterfaceC5824d) this.f24551c.get(this.f24553e)).mo4057c(priority, this);
            if (this.f24557i) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public void cancel() {
            this.f24557i = true;
            Iterator it = this.f24551c.iterator();
            while (it.hasNext()) {
                ((InterfaceC5824d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public void cleanup() {
            List list = this.f24556h;
            if (list != null) {
                this.f24552d.release(list);
            }
            this.f24556h = null;
            Iterator it = this.f24551c.iterator();
            while (it.hasNext()) {
                ((InterfaceC5824d) it.next()).cleanup();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d.a
        /* renamed from: d */
        public void mo4063d(Object obj) {
            if (obj != null) {
                this.f24555g.mo4063d(obj);
            } else {
                m21486e();
            }
        }

        /* renamed from: e */
        public final void m21486e() {
            if (this.f24557i) {
                return;
            }
            if (this.f24553e < this.f24551c.size() - 1) {
                this.f24553e++;
                mo4057c(this.f24554f, this.f24555g);
            } else {
                AbstractC8909j.m17468d(this.f24556h);
                this.f24555g.mo4062b(new GlideException("Fetch failed", new ArrayList(this.f24556h)));
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d
        public DataSource getDataSource() {
            return ((InterfaceC5824d) this.f24551c.get(0)).getDataSource();
        }
    }

    public C10303q(List list, Pools.Pool pool) {
        this.f24549a = list;
        this.f24550b = pool;
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: a */
    public boolean mo21420a(Object obj) {
        Iterator it = this.f24549a.iterator();
        while (it.hasNext()) {
            if (((InterfaceC10300n) it.next()).mo21420a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: b */
    public InterfaceC10300n.a mo21421b(Object obj, int i10, int i11, C9438e c9438e) {
        InterfaceC10300n.a aVarMo21421b;
        int size = this.f24549a.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC9435b interfaceC9435b = null;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC10300n interfaceC10300n = (InterfaceC10300n) this.f24549a.get(i12);
            if (interfaceC10300n.mo21420a(obj) && (aVarMo21421b = interfaceC10300n.mo21421b(obj, i10, i11, c9438e)) != null) {
                interfaceC9435b = aVarMo21421b.f24542a;
                arrayList.add(aVarMo21421b.f24544c);
            }
        }
        if (arrayList.isEmpty() || interfaceC9435b == null) {
            return null;
        }
        return new InterfaceC10300n.a(interfaceC9435b, new a(arrayList, this.f24550b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f24549a.toArray()) + '}';
    }
}
