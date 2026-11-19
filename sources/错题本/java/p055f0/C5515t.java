package p055f0;

import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.List;
import p185v7.AbstractC6675d;
import p208z.InterfaceC6799d;
import p208z.InterfaceC6800e;

/* renamed from: f0.t */
/* loaded from: classes2.dex */
public final class C5515t implements InterfaceC6800e, InterfaceC6799d {

    /* renamed from: a */
    public final ArrayList f8535a;

    /* renamed from: b */
    public final Pools.Pool f8536b;

    /* renamed from: c */
    public int f8537c;

    /* renamed from: d */
    public Priority f8538d;

    /* renamed from: e */
    public InterfaceC6799d f8539e;

    /* renamed from: f */
    public List f8540f;

    /* renamed from: g */
    public boolean f8541g;

    public C5515t(ArrayList arrayList, Pools.Pool pool) {
        this.f8536b = pool;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f8535a = arrayList;
        this.f8537c = 0;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: a */
    public final void mo21a() {
        List list = this.f8540f;
        if (list != null) {
            this.f8536b.release(list);
        }
        this.f8540f = null;
        ArrayList arrayList = this.f8535a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((InterfaceC6800e) obj).mo21a();
        }
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: b */
    public final Class mo22b() {
        return ((InterfaceC6800e) this.f8535a.get(0)).mo22b();
    }

    @Override // p208z.InterfaceC6799d
    /* renamed from: c */
    public final void mo109c(Exception exc) {
        List list = this.f8540f;
        AbstractC6675d.m6344f(list, "Argument must not be null");
        list.add(exc);
        m4888f();
    }

    @Override // p208z.InterfaceC6800e
    public final void cancel() {
        this.f8541g = true;
        ArrayList arrayList = this.f8535a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((InterfaceC6800e) obj).cancel();
        }
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: d */
    public final DataSource mo23d() {
        return ((InterfaceC6800e) this.f8535a.get(0)).mo23d();
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: e */
    public final void mo24e(Priority priority, InterfaceC6799d interfaceC6799d) {
        this.f8538d = priority;
        this.f8539e = interfaceC6799d;
        this.f8540f = (List) this.f8536b.acquire();
        ((InterfaceC6800e) this.f8535a.get(this.f8537c)).mo24e(priority, this);
        if (this.f8541g) {
            cancel();
        }
    }

    /* renamed from: f */
    public final void m4888f() {
        if (this.f8541g) {
            return;
        }
        if (this.f8537c < this.f8535a.size() - 1) {
            this.f8537c++;
            mo24e(this.f8538d, this.f8539e);
        } else {
            AbstractC6675d.m6343e(this.f8540f);
            this.f8539e.mo109c(new GlideException("Fetch failed", new ArrayList(this.f8540f)));
        }
    }

    @Override // p208z.InterfaceC6799d
    /* renamed from: o */
    public final void mo121o(Object obj) {
        if (obj != null) {
            this.f8539e.mo121o(obj);
        } else {
            m4888f();
        }
    }
}
