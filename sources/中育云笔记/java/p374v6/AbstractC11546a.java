package p374v6;

import java.util.LinkedList;

/* renamed from: v6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC11546a {

    /* renamed from: a */
    public final LinkedList f27419a = new LinkedList();

    /* renamed from: a */
    public Object mo25405a() {
        return this.f27419a.poll();
    }

    /* renamed from: b */
    public void mo25406b() {
        this.f27419a.clear();
    }

    /* renamed from: c */
    public final boolean m25407c(Object obj) {
        return this.f27419a.contains(obj);
    }

    /* renamed from: d */
    public boolean mo25408d(Object obj) {
        if (m25407c(obj)) {
            return false;
        }
        return this.f27419a.add(obj);
    }
}
