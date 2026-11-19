package p194o0;

import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p091e1.AbstractC7837i;
import p122h0.C8084d;
import p122h0.InterfaceC8082b;
import p132i0.InterfaceC8115d;
import p194o0.InterfaceC9146m;

/* renamed from: o0.p */
/* loaded from: classes3.dex */
public class C9149p implements InterfaceC9146m {

    /* renamed from: a */
    public final List f15431a;

    /* renamed from: b */
    public final Pools.Pool f15432b;

    /* renamed from: o0.p$a */
    public static class a implements InterfaceC8115d, InterfaceC8115d.a {

        /* renamed from: a */
        public final List f15433a;

        /* renamed from: b */
        public final Pools.Pool f15434b;

        /* renamed from: c */
        public int f15435c;

        /* renamed from: d */
        public Priority f15436d;

        /* renamed from: e */
        public InterfaceC8115d.a f15437e;

        /* renamed from: f */
        public List f15438f;

        /* renamed from: g */
        public boolean f15439g;

        public a(List list, Pools.Pool pool) {
            this.f15434b = pool;
            AbstractC7837i.m12255c(list);
            this.f15433a = list;
            this.f15435c = 0;
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: a */
        public Class mo12978a() {
            return ((InterfaceC8115d) this.f15433a.get(0)).mo12978a();
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: b */
        public void mo12983b() {
            List list = this.f15438f;
            if (list != null) {
                this.f15434b.release(list);
            }
            this.f15438f = null;
            Iterator it = this.f15433a.iterator();
            while (it.hasNext()) {
                ((InterfaceC8115d) it.next()).mo12983b();
            }
        }

        @Override // p132i0.InterfaceC8115d.a
        /* renamed from: c */
        public void mo3154c(Exception exc) {
            ((List) AbstractC7837i.m12256d(this.f15438f)).add(exc);
            m14711g();
        }

        @Override // p132i0.InterfaceC8115d
        public void cancel() {
            this.f15439g = true;
            Iterator it = this.f15433a.iterator();
            while (it.hasNext()) {
                ((InterfaceC8115d) it.next()).cancel();
            }
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: d */
        public void mo12985d(Priority priority, InterfaceC8115d.a aVar) {
            this.f15436d = priority;
            this.f15437e = aVar;
            this.f15438f = (List) this.f15434b.acquire();
            ((InterfaceC8115d) this.f15433a.get(this.f15435c)).mo12985d(priority, this);
            if (this.f15439g) {
                cancel();
            }
        }

        @Override // p132i0.InterfaceC8115d
        /* renamed from: e */
        public DataSource mo12986e() {
            return ((InterfaceC8115d) this.f15433a.get(0)).mo12986e();
        }

        @Override // p132i0.InterfaceC8115d.a
        /* renamed from: f */
        public void mo3155f(Object obj) {
            if (obj != null) {
                this.f15437e.mo3155f(obj);
            } else {
                m14711g();
            }
        }

        /* renamed from: g */
        public final void m14711g() {
            if (this.f15439g) {
                return;
            }
            if (this.f15435c < this.f15433a.size() - 1) {
                this.f15435c++;
                mo12985d(this.f15436d, this.f15437e);
            } else {
                AbstractC7837i.m12256d(this.f15438f);
                this.f15437e.mo3154c(new GlideException("Fetch failed", new ArrayList(this.f15438f)));
            }
        }
    }

    public C9149p(List list, Pools.Pool pool) {
        this.f15431a = list;
        this.f15432b = pool;
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: a */
    public boolean mo14655a(Object obj) {
        Iterator it = this.f15431a.iterator();
        while (it.hasNext()) {
            if (((InterfaceC9146m) it.next()).mo14655a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: b */
    public InterfaceC9146m.a mo14656b(Object obj, int i9, int i10, C8084d c8084d) {
        InterfaceC9146m.a aVarMo14656b;
        int size = this.f15431a.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC8082b interfaceC8082b = null;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC9146m interfaceC9146m = (InterfaceC9146m) this.f15431a.get(i11);
            if (interfaceC9146m.mo14655a(obj) && (aVarMo14656b = interfaceC9146m.mo14656b(obj, i9, i10, c8084d)) != null) {
                interfaceC8082b = aVarMo14656b.f15424a;
                arrayList.add(aVarMo14656b.f15426c);
            }
        }
        if (arrayList.isEmpty() || interfaceC8082b == null) {
            return null;
        }
        return new InterfaceC9146m.a(interfaceC8082b, new a(arrayList, this.f15432b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f15431a.toArray()) + '}';
    }
}
