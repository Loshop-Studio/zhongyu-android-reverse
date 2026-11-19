package p097l0;

import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC4692d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p016b1.AbstractC4408j;
import p053f0.C6285d;
import p053f0.InterfaceC6283b;
import p097l0.InterfaceC7280n;

/* renamed from: l0.q */
/* loaded from: classes3.dex */
public class C7283q implements InterfaceC7280n {

    /* renamed from: a */
    public final List f9237a;

    /* renamed from: b */
    public final Pools.Pool f9238b;

    /* renamed from: l0.q$a */
    public static class a implements InterfaceC4692d, InterfaceC4692d.a {

        /* renamed from: a */
        public final List f9239a;

        /* renamed from: b */
        public final Pools.Pool f9240b;

        /* renamed from: c */
        public int f9241c;

        /* renamed from: d */
        public Priority f9242d;

        /* renamed from: e */
        public InterfaceC4692d.a f9243e;

        /* renamed from: f */
        public List f9244f;

        /* renamed from: g */
        public boolean f9245g;

        public a(List list, Pools.Pool pool) {
            this.f9240b = pool;
            AbstractC4408j.m1437c(list);
            this.f9239a = list;
            this.f9241c = 0;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: a */
        public Class mo2580a() {
            return ((InterfaceC4692d) this.f9239a.get(0)).mo2580a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: b */
        public void mo2585b() {
            List list = this.f9244f;
            if (list != null) {
                this.f9240b.release(list);
            }
            this.f9244f = null;
            Iterator it = this.f9239a.iterator();
            while (it.hasNext()) {
                ((InterfaceC4692d) it.next()).mo2585b();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d.a
        /* renamed from: c */
        public void mo2593c(Exception exc) {
            ((List) AbstractC4408j.m1438d(this.f9244f)).add(exc);
            m8260g();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        public void cancel() {
            this.f9245g = true;
            Iterator it = this.f9239a.iterator();
            while (it.hasNext()) {
                ((InterfaceC4692d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: d */
        public DataSource mo2587d() {
            return ((InterfaceC4692d) this.f9239a.get(0)).mo2587d();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d
        /* renamed from: e */
        public void mo2588e(Priority priority, InterfaceC4692d.a aVar) {
            this.f9242d = priority;
            this.f9243e = aVar;
            this.f9244f = (List) this.f9240b.acquire();
            ((InterfaceC4692d) this.f9239a.get(this.f9241c)).mo2588e(priority, this);
            if (this.f9245g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d.a
        /* renamed from: f */
        public void mo2594f(Object obj) {
            if (obj != null) {
                this.f9243e.mo2594f(obj);
            } else {
                m8260g();
            }
        }

        /* renamed from: g */
        public final void m8260g() {
            if (this.f9245g) {
                return;
            }
            if (this.f9241c < this.f9239a.size() - 1) {
                this.f9241c++;
                mo2588e(this.f9242d, this.f9243e);
            } else {
                AbstractC4408j.m1438d(this.f9244f);
                this.f9243e.mo2593c(new GlideException("Fetch failed", new ArrayList(this.f9244f)));
            }
        }
    }

    public C7283q(List list, Pools.Pool pool) {
        this.f9237a = list;
        this.f9238b = pool;
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: a */
    public boolean mo8190a(Object obj) {
        Iterator it = this.f9237a.iterator();
        while (it.hasNext()) {
            if (((InterfaceC7280n) it.next()).mo8190a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: b */
    public InterfaceC7280n.a mo8191b(Object obj, int i6, int i7, C6285d c6285d) {
        InterfaceC7280n.a aVarMo8191b;
        int size = this.f9237a.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC6283b interfaceC6283b = null;
        for (int i8 = 0; i8 < size; i8++) {
            InterfaceC7280n interfaceC7280n = (InterfaceC7280n) this.f9237a.get(i8);
            if (interfaceC7280n.mo8190a(obj) && (aVarMo8191b = interfaceC7280n.mo8191b(obj, i6, i7, c6285d)) != null) {
                interfaceC6283b = aVarMo8191b.f9230a;
                arrayList.add(aVarMo8191b.f9232c);
            }
        }
        if (arrayList.isEmpty() || interfaceC6283b == null) {
            return null;
        }
        return new InterfaceC7280n.a(interfaceC6283b, new a(arrayList, this.f9238b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f9237a.toArray()) + '}';
    }
}
