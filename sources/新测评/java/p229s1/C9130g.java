package p229s1;

import android.util.SparseArray;
import com.liulishuo.okdownload.C6327a;
import com.liulishuo.okdownload.core.cause.EndCause;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p218r1.AbstractC8997a;

/* renamed from: s1.g */
/* loaded from: classes4.dex */
public class C9130g implements InterfaceC9132i {

    /* renamed from: a */
    public final SparseArray f15853a;

    /* renamed from: b */
    public final HashMap f15854b;

    /* renamed from: c */
    public final C9133j f15855c;

    /* renamed from: d */
    public final SparseArray f15856d;

    /* renamed from: e */
    public final List f15857e;

    /* renamed from: f */
    public final List f15858f;

    public C9130g() {
        this(new SparseArray(), new ArrayList(), new HashMap());
    }

    @Override // p229s1.InterfaceC9132i
    /* renamed from: a */
    public void mo15506a(C9126c c9126c, int i10, long j10) throws IOException {
        C9126c c9126c2 = (C9126c) this.f15853a.get(c9126c.f15837a);
        if (c9126c != c9126c2) {
            throw new IOException("Info not on store!");
        }
        c9126c2.m15468c(i10).m15462g(j10);
    }

    @Override // p229s1.InterfaceC9129f
    /* renamed from: b */
    public boolean mo15499b(C9126c c9126c) {
        String strM15472g = c9126c.m15472g();
        if (c9126c.m15480o() && strM15472g != null) {
            this.f15854b.put(c9126c.m15477l(), strM15472g);
        }
        C9126c c9126c2 = (C9126c) this.f15853a.get(c9126c.f15837a);
        if (c9126c2 == null) {
            return false;
        }
        if (c9126c2 == c9126c) {
            return true;
        }
        synchronized (this) {
            this.f15853a.put(c9126c.f15837a, c9126c.m15467b());
        }
        return true;
    }

    @Override // p229s1.InterfaceC9129f
    /* renamed from: c */
    public C9126c mo15500c(C6327a c6327a) {
        int iMo4385c = c6327a.mo4385c();
        C9126c c9126c = new C9126c(iMo4385c, c6327a.mo4388f(), c6327a.mo4386d(), c6327a.mo4384b());
        synchronized (this) {
            this.f15853a.put(iMo4385c, c9126c);
            this.f15856d.remove(iMo4385c);
        }
        return c9126c;
    }

    @Override // p229s1.InterfaceC9129f
    /* renamed from: d */
    public C9126c mo15501d(C6327a c6327a, C9126c c9126c) {
        SparseArray sparseArrayClone;
        synchronized (this) {
            sparseArrayClone = this.f15853a.clone();
        }
        int size = sparseArrayClone.size();
        for (int i10 = 0; i10 < size; i10++) {
            C9126c c9126c2 = (C9126c) sparseArrayClone.valueAt(i10);
            if (c9126c2 != c9126c && c9126c2.m15479n(c6327a)) {
                return c9126c2;
            }
        }
        return null;
    }

    @Override // p229s1.InterfaceC9129f
    /* renamed from: e */
    public boolean mo15502e(int i10) {
        return this.f15858f.contains(Integer.valueOf(i10));
    }

    @Override // p229s1.InterfaceC9129f
    /* renamed from: f */
    public synchronized int mo15503f(C6327a c6327a) {
        Integer numM15515c = this.f15855c.m15515c(c6327a);
        if (numM15515c != null) {
            return numM15515c.intValue();
        }
        int size = this.f15853a.size();
        for (int i10 = 0; i10 < size; i10++) {
            C9126c c9126c = (C9126c) this.f15853a.valueAt(i10);
            if (c9126c != null && c9126c.m15479n(c6327a)) {
                return c9126c.f15837a;
            }
        }
        int size2 = this.f15856d.size();
        for (int i11 = 0; i11 < size2; i11++) {
            AbstractC8997a abstractC8997a = (AbstractC8997a) this.f15856d.valueAt(i11);
            if (abstractC8997a != null && abstractC8997a.m15113a(c6327a)) {
                return abstractC8997a.mo4385c();
            }
        }
        int iM15512n = m15512n();
        this.f15856d.put(iM15512n, c6327a.m4380F(iM15512n));
        this.f15855c.m15513a(c6327a, iM15512n);
        return iM15512n;
    }

    @Override // p229s1.InterfaceC9129f
    public C9126c get(int i10) {
        return (C9126c) this.f15853a.get(i10);
    }

    @Override // p229s1.InterfaceC9132i
    /* renamed from: h */
    public void mo15508h(int i10, EndCause endCause, Exception exc) {
        if (endCause == EndCause.COMPLETED) {
            remove(i10);
        }
    }

    @Override // p229s1.InterfaceC9129f
    /* renamed from: i */
    public String mo15504i(String str) {
        return (String) this.f15854b.get(str);
    }

    @Override // p229s1.InterfaceC9132i
    /* renamed from: j */
    public boolean mo15509j(int i10) {
        if (this.f15858f.contains(Integer.valueOf(i10))) {
            return false;
        }
        synchronized (this.f15858f) {
            try {
                if (this.f15858f.contains(Integer.valueOf(i10))) {
                    return false;
                }
                this.f15858f.add(Integer.valueOf(i10));
                return true;
            } finally {
            }
        }
    }

    @Override // p229s1.InterfaceC9132i
    /* renamed from: k */
    public C9126c mo15510k(int i10) {
        return null;
    }

    @Override // p229s1.InterfaceC9129f
    /* renamed from: l */
    public boolean mo15505l() {
        return true;
    }

    @Override // p229s1.InterfaceC9132i
    /* renamed from: m */
    public boolean mo15511m(int i10) {
        boolean zRemove;
        synchronized (this.f15858f) {
            zRemove = this.f15858f.remove(Integer.valueOf(i10));
        }
        return zRemove;
    }

    /* renamed from: n */
    public synchronized int m15512n() {
        int iIntValue;
        int i10 = 0;
        int size = 0;
        int i11 = 0;
        while (true) {
            try {
                iIntValue = 1;
                if (size >= this.f15857e.size()) {
                    size = 0;
                    break;
                }
                Integer num = (Integer) this.f15857e.get(size);
                if (num == null) {
                    i10 = i11 + 1;
                    break;
                }
                int iIntValue2 = num.intValue();
                if (i11 != 0) {
                    int i12 = i11 + 1;
                    if (iIntValue2 != i12) {
                        i10 = i12;
                        break;
                    }
                    size++;
                    i11 = iIntValue2;
                } else {
                    if (iIntValue2 != 1) {
                        size = 0;
                        i10 = 1;
                        break;
                    }
                    size++;
                    i11 = iIntValue2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i10 != 0) {
            iIntValue = i10;
        } else if (!this.f15857e.isEmpty()) {
            List list = this.f15857e;
            iIntValue = 1 + ((Integer) list.get(list.size() - 1)).intValue();
            size = this.f15857e.size();
        }
        this.f15857e.add(size, Integer.valueOf(iIntValue));
        return iIntValue;
    }

    @Override // p229s1.InterfaceC9129f
    public synchronized void remove(int i10) {
        try {
            this.f15853a.remove(i10);
            if (this.f15856d.get(i10) == null) {
                this.f15857e.remove(Integer.valueOf(i10));
            }
            this.f15855c.m15516d(i10);
        } catch (Throwable th) {
            throw th;
        }
    }

    public C9130g(SparseArray sparseArray, List list, HashMap map) {
        this.f15856d = new SparseArray();
        this.f15853a = sparseArray;
        this.f15858f = list;
        this.f15854b = map;
        this.f15855c = new C9133j();
        int size = sparseArray.size();
        this.f15857e = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            this.f15857e.add(Integer.valueOf(((C9126c) sparseArray.valueAt(i10)).f15837a));
        }
        Collections.sort(this.f15857e);
    }

    @Override // p229s1.InterfaceC9132i
    /* renamed from: g */
    public void mo15507g(int i10) {
    }
}
