package p229r1;

import android.util.SparseArray;
import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.core.cause.EndCause;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p219q1.AbstractC9351a;

/* renamed from: r1.g */
/* loaded from: classes4.dex */
public class C9423g implements InterfaceC9425i {

    /* renamed from: a */
    public final SparseArray f16440a;

    /* renamed from: b */
    public final HashMap f16441b;

    /* renamed from: c */
    public final C9426j f16442c;

    /* renamed from: d */
    public final SparseArray f16443d;

    /* renamed from: e */
    public final List f16444e;

    /* renamed from: f */
    public final List f16445f;

    public C9423g() {
        this(new SparseArray(), new ArrayList(), new HashMap());
    }

    @Override // p229r1.InterfaceC9422f
    /* renamed from: a */
    public C9419c mo15553a(C6593a c6593a) {
        int iMo4589c = c6593a.mo4589c();
        C9419c c9419c = new C9419c(iMo4589c, c6593a.mo4592f(), c6593a.mo4590d(), c6593a.mo4588b());
        synchronized (this) {
            this.f16440a.put(iMo4589c, c9419c);
            this.f16443d.remove(iMo4589c);
        }
        return c9419c;
    }

    @Override // p229r1.InterfaceC9422f
    /* renamed from: b */
    public boolean mo15554b(int i9) {
        return this.f16445f.contains(Integer.valueOf(i9));
    }

    @Override // p229r1.InterfaceC9422f
    /* renamed from: c */
    public synchronized int mo15555c(C6593a c6593a) {
        Integer numM15569c = this.f16442c.m15569c(c6593a);
        if (numM15569c != null) {
            return numM15569c.intValue();
        }
        int size = this.f16440a.size();
        for (int i9 = 0; i9 < size; i9++) {
            C9419c c9419c = (C9419c) this.f16440a.valueAt(i9);
            if (c9419c != null && c9419c.m15533n(c6593a)) {
                return c9419c.f16424a;
            }
        }
        int size2 = this.f16443d.size();
        for (int i10 = 0; i10 < size2; i10++) {
            AbstractC9351a abstractC9351a = (AbstractC9351a) this.f16443d.valueAt(i10);
            if (abstractC9351a != null && abstractC9351a.m15294a(c6593a)) {
                return abstractC9351a.mo4589c();
            }
        }
        int iM15566n = m15566n();
        this.f16443d.put(iM15566n, c6593a.m4584F(iM15566n));
        this.f16442c.m15567a(c6593a, iM15566n);
        return iM15566n;
    }

    @Override // p229r1.InterfaceC9422f
    /* renamed from: e */
    public C9419c mo15556e(C6593a c6593a, C9419c c9419c) {
        SparseArray sparseArrayClone;
        synchronized (this) {
            sparseArrayClone = this.f16440a.clone();
        }
        int size = sparseArrayClone.size();
        for (int i9 = 0; i9 < size; i9++) {
            C9419c c9419c2 = (C9419c) sparseArrayClone.valueAt(i9);
            if (c9419c2 != c9419c && c9419c2.m15533n(c6593a)) {
                return c9419c2;
            }
        }
        return null;
    }

    @Override // p229r1.InterfaceC9425i
    /* renamed from: f */
    public void mo15561f(int i9, EndCause endCause, Exception exc) {
        if (endCause == EndCause.COMPLETED) {
            remove(i9);
        }
    }

    @Override // p229r1.InterfaceC9422f
    /* renamed from: g */
    public String mo15557g(String str) {
        return (String) this.f16441b.get(str);
    }

    @Override // p229r1.InterfaceC9422f
    public C9419c get(int i9) {
        return (C9419c) this.f16440a.get(i9);
    }

    @Override // p229r1.InterfaceC9425i
    /* renamed from: h */
    public boolean mo15562h(int i9) {
        if (this.f16445f.contains(Integer.valueOf(i9))) {
            return false;
        }
        synchronized (this.f16445f) {
            try {
                if (this.f16445f.contains(Integer.valueOf(i9))) {
                    return false;
                }
                this.f16445f.add(Integer.valueOf(i9));
                return true;
            } finally {
            }
        }
    }

    @Override // p229r1.InterfaceC9425i
    /* renamed from: i */
    public C9419c mo15563i(int i9) {
        return null;
    }

    @Override // p229r1.InterfaceC9425i
    /* renamed from: j */
    public void mo15564j(C9419c c9419c, int i9, long j9) throws IOException {
        C9419c c9419c2 = (C9419c) this.f16440a.get(c9419c.f16424a);
        if (c9419c != c9419c2) {
            throw new IOException("Info not on store!");
        }
        c9419c2.m15522c(i9).m15516g(j9);
    }

    @Override // p229r1.InterfaceC9422f
    /* renamed from: k */
    public boolean mo15558k(C9419c c9419c) {
        String strM15526g = c9419c.m15526g();
        if (c9419c.m15534o() && strM15526g != null) {
            this.f16441b.put(c9419c.m15531l(), strM15526g);
        }
        C9419c c9419c2 = (C9419c) this.f16440a.get(c9419c.f16424a);
        if (c9419c2 == null) {
            return false;
        }
        if (c9419c2 == c9419c) {
            return true;
        }
        synchronized (this) {
            this.f16440a.put(c9419c.f16424a, c9419c.m15521b());
        }
        return true;
    }

    @Override // p229r1.InterfaceC9422f
    /* renamed from: l */
    public boolean mo15559l() {
        return true;
    }

    @Override // p229r1.InterfaceC9425i
    /* renamed from: m */
    public boolean mo15565m(int i9) {
        boolean zRemove;
        synchronized (this.f16445f) {
            zRemove = this.f16445f.remove(Integer.valueOf(i9));
        }
        return zRemove;
    }

    /* renamed from: n */
    public synchronized int m15566n() {
        int iIntValue;
        int i9 = 0;
        int size = 0;
        int i10 = 0;
        while (true) {
            try {
                iIntValue = 1;
                if (size >= this.f16444e.size()) {
                    size = 0;
                    break;
                }
                Integer num = (Integer) this.f16444e.get(size);
                if (num == null) {
                    i9 = i10 + 1;
                    break;
                }
                int iIntValue2 = num.intValue();
                if (i10 != 0) {
                    int i11 = i10 + 1;
                    if (iIntValue2 != i11) {
                        i9 = i11;
                        break;
                    }
                    size++;
                    i10 = iIntValue2;
                } else {
                    if (iIntValue2 != 1) {
                        size = 0;
                        i9 = 1;
                        break;
                    }
                    size++;
                    i10 = iIntValue2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i9 != 0) {
            iIntValue = i9;
        } else if (!this.f16444e.isEmpty()) {
            List list = this.f16444e;
            iIntValue = 1 + ((Integer) list.get(list.size() - 1)).intValue();
            size = this.f16444e.size();
        }
        this.f16444e.add(size, Integer.valueOf(iIntValue));
        return iIntValue;
    }

    @Override // p229r1.InterfaceC9422f
    public synchronized void remove(int i9) {
        try {
            this.f16440a.remove(i9);
            if (this.f16443d.get(i9) == null) {
                this.f16444e.remove(Integer.valueOf(i9));
            }
            this.f16442c.m15570d(i9);
        } catch (Throwable th) {
            throw th;
        }
    }

    public C9423g(SparseArray sparseArray, List list, HashMap map) {
        this.f16443d = new SparseArray();
        this.f16440a = sparseArray;
        this.f16445f = list;
        this.f16441b = map;
        this.f16442c = new C9426j();
        int size = sparseArray.size();
        this.f16444e = new ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            this.f16444e.add(Integer.valueOf(((C9419c) sparseArray.valueAt(i9)).f16424a));
        }
        Collections.sort(this.f16444e);
    }

    @Override // p229r1.InterfaceC9425i
    /* renamed from: d */
    public void mo15560d(int i9) {
    }
}
