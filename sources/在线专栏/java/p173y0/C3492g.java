package p173y0;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p090g1.RunnableC2630b;
import p169x0.AbstractC3445n;
import p169x0.AbstractC3452u;
import p169x0.AbstractC3456y;
import p169x0.EnumC3439h;
import p169x0.InterfaceC3448q;

/* renamed from: y0.g */
/* loaded from: classes.dex */
public class C3492g extends AbstractC3452u {

    /* renamed from: j */
    private static final String f12179j = AbstractC3445n.m10503f("WorkContinuationImpl");

    /* renamed from: a */
    private final C3494i f12180a;

    /* renamed from: b */
    private final String f12181b;

    /* renamed from: c */
    private final EnumC3439h f12182c;

    /* renamed from: d */
    private final List<? extends AbstractC3456y> f12183d;

    /* renamed from: e */
    private final List<String> f12184e;

    /* renamed from: f */
    private final List<String> f12185f;

    /* renamed from: g */
    private final List<C3492g> f12186g;

    /* renamed from: h */
    private boolean f12187h;

    /* renamed from: i */
    private InterfaceC3448q f12188i;

    public C3492g(C3494i c3494i, List<? extends AbstractC3456y> list) {
        this(c3494i, null, EnumC3439h.KEEP, list, null);
    }

    /* renamed from: i */
    private static boolean m10578i(C3492g c3492g, Set<String> set) {
        set.addAll(c3492g.m10582c());
        Set<String> setM10579l = m10579l(c3492g);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (setM10579l.contains(it.next())) {
                return true;
            }
        }
        List<C3492g> listM10584e = c3492g.m10584e();
        if (listM10584e != null && !listM10584e.isEmpty()) {
            Iterator<C3492g> it2 = listM10584e.iterator();
            while (it2.hasNext()) {
                if (m10578i(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(c3492g.m10582c());
        return false;
    }

    /* renamed from: l */
    public static Set<String> m10579l(C3492g c3492g) {
        HashSet hashSet = new HashSet();
        List<C3492g> listM10584e = c3492g.m10584e();
        if (listM10584e != null && !listM10584e.isEmpty()) {
            Iterator<C3492g> it = listM10584e.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().m10582c());
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public InterfaceC3448q m10580a() {
        if (this.f12187h) {
            AbstractC3445n.m10501c().mo10508h(f12179j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f12184e)), new Throwable[0]);
        } else {
            RunnableC2630b runnableC2630b = new RunnableC2630b(this);
            this.f12180a.m10615u().mo8914b(runnableC2630b);
            this.f12188i = runnableC2630b.m8826d();
        }
        return this.f12188i;
    }

    /* renamed from: b */
    public EnumC3439h m10581b() {
        return this.f12182c;
    }

    /* renamed from: c */
    public List<String> m10582c() {
        return this.f12184e;
    }

    /* renamed from: d */
    public String m10583d() {
        return this.f12181b;
    }

    /* renamed from: e */
    public List<C3492g> m10584e() {
        return this.f12186g;
    }

    /* renamed from: f */
    public List<? extends AbstractC3456y> m10585f() {
        return this.f12183d;
    }

    /* renamed from: g */
    public C3494i m10586g() {
        return this.f12180a;
    }

    /* renamed from: h */
    public boolean m10587h() {
        return m10578i(this, new HashSet());
    }

    /* renamed from: j */
    public boolean m10588j() {
        return this.f12187h;
    }

    /* renamed from: k */
    public void m10589k() {
        this.f12187h = true;
    }

    public C3492g(C3494i c3494i, String str, EnumC3439h enumC3439h, List<? extends AbstractC3456y> list, List<C3492g> list2) {
        this.f12180a = c3494i;
        this.f12181b = str;
        this.f12182c = enumC3439h;
        this.f12183d = list;
        this.f12186g = list2;
        this.f12184e = new ArrayList(list.size());
        this.f12185f = new ArrayList();
        if (list2 != null) {
            Iterator<C3492g> it = list2.iterator();
            while (it.hasNext()) {
                this.f12185f.addAll(it.next().f12185f);
            }
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            String strM10543b = list.get(i4).m10543b();
            this.f12184e.add(strM10543b);
            this.f12185f.add(strM10543b);
        }
    }
}
