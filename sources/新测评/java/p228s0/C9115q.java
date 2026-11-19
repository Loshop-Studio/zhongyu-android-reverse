package p228s0;

import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5356d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p117i1.AbstractC7651j;
import p162m0.C8539d;
import p162m0.InterfaceC8537b;
import p228s0.InterfaceC9112n;

/* renamed from: s0.q */
/* loaded from: classes3.dex */
public class C9115q implements InterfaceC9112n {

    /* renamed from: a */
    public final List f15791a;

    /* renamed from: b */
    public final Pools.Pool f15792b;

    /* renamed from: s0.q$a */
    public static class a implements InterfaceC5356d, InterfaceC5356d.a {

        /* renamed from: a */
        public final List f15793a;

        /* renamed from: b */
        public final Pools.Pool f15794b;

        /* renamed from: c */
        public int f15795c;

        /* renamed from: d */
        public Priority f15796d;

        /* renamed from: e */
        public InterfaceC5356d.a f15797e;

        /* renamed from: f */
        public List f15798f;

        /* renamed from: g */
        public boolean f15799g;

        public a(List list, Pools.Pool pool) {
            this.f15794b = pool;
            AbstractC7651j.m12682c(list);
            this.f15793a = list;
            this.f15795c = 0;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: a */
        public Class mo3399a() {
            return ((InterfaceC5356d) this.f15793a.get(0)).mo3399a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: b */
        public void mo3404b() {
            List list = this.f15798f;
            if (list != null) {
                this.f15794b.release(list);
            }
            this.f15798f = null;
            Iterator it = this.f15793a.iterator();
            while (it.hasNext()) {
                ((InterfaceC5356d) it.next()).mo3404b();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d.a
        /* renamed from: c */
        public void mo3412c(Exception exc) {
            ((List) AbstractC7651j.m12683d(this.f15798f)).add(exc);
            m15424g();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        public void cancel() {
            this.f15799g = true;
            Iterator it = this.f15793a.iterator();
            while (it.hasNext()) {
                ((InterfaceC5356d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: d */
        public DataSource mo3406d() {
            return ((InterfaceC5356d) this.f15793a.get(0)).mo3406d();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d
        /* renamed from: e */
        public void mo3407e(Priority priority, InterfaceC5356d.a aVar) {
            this.f15796d = priority;
            this.f15797e = aVar;
            this.f15798f = (List) this.f15794b.acquire();
            ((InterfaceC5356d) this.f15793a.get(this.f15795c)).mo3407e(priority, this);
            if (this.f15799g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d.a
        /* renamed from: f */
        public void mo3413f(Object obj) {
            if (obj != null) {
                this.f15797e.mo3413f(obj);
            } else {
                m15424g();
            }
        }

        /* renamed from: g */
        public final void m15424g() {
            if (this.f15799g) {
                return;
            }
            if (this.f15795c < this.f15793a.size() - 1) {
                this.f15795c++;
                mo3407e(this.f15796d, this.f15797e);
            } else {
                AbstractC7651j.m12683d(this.f15798f);
                this.f15797e.mo3412c(new GlideException("Fetch failed", new ArrayList(this.f15798f)));
            }
        }
    }

    public C9115q(List list, Pools.Pool pool) {
        this.f15791a = list;
        this.f15792b = pool;
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: a */
    public boolean mo15354a(Object obj) {
        Iterator it = this.f15791a.iterator();
        while (it.hasNext()) {
            if (((InterfaceC9112n) it.next()).mo15354a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: b */
    public InterfaceC9112n.a mo15355b(Object obj, int i10, int i11, C8539d c8539d) {
        InterfaceC9112n.a aVarMo15355b;
        int size = this.f15791a.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC8537b interfaceC8537b = null;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC9112n interfaceC9112n = (InterfaceC9112n) this.f15791a.get(i12);
            if (interfaceC9112n.mo15354a(obj) && (aVarMo15355b = interfaceC9112n.mo15355b(obj, i10, i11, c8539d)) != null) {
                interfaceC8537b = aVarMo15355b.f15784a;
                arrayList.add(aVarMo15355b.f15786c);
            }
        }
        if (arrayList.isEmpty() || interfaceC8537b == null) {
            return null;
        }
        return new InterfaceC9112n.a(interfaceC8537b, new a(arrayList, this.f15792b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f15791a.toArray()) + '}';
    }
}
