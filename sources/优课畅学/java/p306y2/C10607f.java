package p306y2;

import com.yanzhenjie.recyclerview.SwipeMenuLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: y2.f */
/* loaded from: classes4.dex */
public class C10607f {

    /* renamed from: a */
    public SwipeMenuLayout f21020a;

    /* renamed from: b */
    public int f21021b = 0;

    /* renamed from: c */
    public List f21022c = new ArrayList(2);

    public C10607f(SwipeMenuLayout swipeMenuLayout) {
        this.f21020a = swipeMenuLayout;
    }

    /* renamed from: a */
    public void m19788a(C10610i c10610i) {
        this.f21022c.add(c10610i);
    }

    /* renamed from: b */
    public List m19789b() {
        return this.f21022c;
    }

    /* renamed from: c */
    public int m19790c() {
        return this.f21021b;
    }

    /* renamed from: d */
    public boolean m19791d() {
        return !this.f21022c.isEmpty();
    }
}
