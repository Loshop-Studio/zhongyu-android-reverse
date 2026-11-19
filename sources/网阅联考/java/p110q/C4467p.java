package p110q;

import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p062g0.AbstractC3749i;
import p076j.C3794d;
import p076j.InterfaceC3792b;
import p081k.InterfaceC3843d;
import p110q.InterfaceC4464m;

/* renamed from: q.p */
/* loaded from: classes2.dex */
public class C4467p implements InterfaceC4464m {

    /* renamed from: a */
    public final List f5200a;

    /* renamed from: b */
    public final Pools.Pool f5201b;

    /* renamed from: q.p$a */
    public static class a implements InterfaceC3843d, InterfaceC3843d.a {

        /* renamed from: a */
        public final List f5202a;

        /* renamed from: b */
        public final Pools.Pool f5203b;

        /* renamed from: c */
        public int f5204c;

        /* renamed from: d */
        public Priority f5205d;

        /* renamed from: e */
        public InterfaceC3843d.a f5206e;

        /* renamed from: f */
        public List f5207f;

        /* renamed from: g */
        public boolean f5208g;

        public a(List list, Pools.Pool pool) {
            this.f5203b = pool;
            AbstractC3749i.m4767c(list);
            this.f5202a = list;
            this.f5204c = 0;
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: a */
        public Class mo5114a() {
            return ((InterfaceC3843d) this.f5202a.get(0)).mo5114a();
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: b */
        public void mo5119b() {
            List list = this.f5207f;
            if (list != null) {
                this.f5203b.release(list);
            }
            this.f5207f = null;
            Iterator it = this.f5202a.iterator();
            while (it.hasNext()) {
                ((InterfaceC3843d) it.next()).mo5119b();
            }
        }

        @Override // p081k.InterfaceC3843d.a
        /* renamed from: c */
        public void mo1829c(Exception exc) {
            ((List) AbstractC3749i.m4768d(this.f5207f)).add(exc);
            m5727g();
        }

        @Override // p081k.InterfaceC3843d
        public void cancel() {
            this.f5208g = true;
            Iterator it = this.f5202a.iterator();
            while (it.hasNext()) {
                ((InterfaceC3843d) it.next()).cancel();
            }
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: d */
        public DataSource mo5121d() {
            return ((InterfaceC3843d) this.f5202a.get(0)).mo5121d();
        }

        @Override // p081k.InterfaceC3843d.a
        /* renamed from: e */
        public void mo1830e(Object obj) {
            if (obj != null) {
                this.f5206e.mo1830e(obj);
            } else {
                m5727g();
            }
        }

        @Override // p081k.InterfaceC3843d
        /* renamed from: f */
        public void mo5123f(Priority priority, InterfaceC3843d.a aVar) {
            this.f5205d = priority;
            this.f5206e = aVar;
            this.f5207f = (List) this.f5203b.acquire();
            ((InterfaceC3843d) this.f5202a.get(this.f5204c)).mo5123f(priority, this);
            if (this.f5208g) {
                cancel();
            }
        }

        /* renamed from: g */
        public final void m5727g() {
            if (this.f5208g) {
                return;
            }
            if (this.f5204c < this.f5202a.size() - 1) {
                this.f5204c++;
                mo5123f(this.f5205d, this.f5206e);
            } else {
                AbstractC3749i.m4768d(this.f5207f);
                this.f5206e.mo1829c(new GlideException("Fetch failed", new ArrayList(this.f5207f)));
            }
        }
    }

    public C4467p(List list, Pools.Pool pool) {
        this.f5200a = list;
        this.f5201b = pool;
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: a */
    public boolean mo5670a(Object obj) {
        Iterator it = this.f5200a.iterator();
        while (it.hasNext()) {
            if (((InterfaceC4464m) it.next()).mo5670a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: b */
    public InterfaceC4464m.a mo5671b(Object obj, int i4, int i5, C3794d c3794d) {
        InterfaceC4464m.a aVarMo5671b;
        int size = this.f5200a.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC3792b interfaceC3792b = null;
        for (int i6 = 0; i6 < size; i6++) {
            InterfaceC4464m interfaceC4464m = (InterfaceC4464m) this.f5200a.get(i6);
            if (interfaceC4464m.mo5670a(obj) && (aVarMo5671b = interfaceC4464m.mo5671b(obj, i4, i5, c3794d)) != null) {
                interfaceC3792b = aVarMo5671b.f5193a;
                arrayList.add(aVarMo5671b.f5195c);
            }
        }
        if (arrayList.isEmpty() || interfaceC3792b == null) {
            return null;
        }
        return new InterfaceC4464m.a(interfaceC3792b, new a(arrayList, this.f5201b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f5200a.toArray()) + '}';
    }
}
