package p088g;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: g.b */
/* loaded from: classes.dex */
public abstract class AbstractC2620b {

    /* renamed from: a */
    private Object f10325a;

    /* renamed from: b */
    private boolean f10326b;

    /* renamed from: g.b$a */
    public interface a {
        /* renamed from: a */
        boolean mo253a(AbstractC2620b abstractC2620b, Menu menu);

        /* renamed from: b */
        boolean mo254b(AbstractC2620b abstractC2620b, Menu menu);

        /* renamed from: c */
        boolean mo255c(AbstractC2620b abstractC2620b, MenuItem menuItem);

        /* renamed from: d */
        void mo256d(AbstractC2620b abstractC2620b);
    }

    /* renamed from: a */
    public abstract void mo327a();

    /* renamed from: b */
    public abstract View mo328b();

    /* renamed from: c */
    public abstract Menu mo329c();

    /* renamed from: d */
    public abstract MenuInflater mo330d();

    /* renamed from: e */
    public abstract CharSequence mo331e();

    /* renamed from: f */
    public Object m8779f() {
        return this.f10325a;
    }

    /* renamed from: g */
    public abstract CharSequence mo332g();

    /* renamed from: h */
    public boolean m8780h() {
        return this.f10326b;
    }

    /* renamed from: i */
    public abstract void mo333i();

    /* renamed from: j */
    public abstract boolean mo334j();

    /* renamed from: k */
    public abstract void mo335k(View view);

    /* renamed from: l */
    public abstract void mo336l(int i4);

    /* renamed from: m */
    public abstract void mo337m(CharSequence charSequence);

    /* renamed from: n */
    public void m8781n(Object obj) {
        this.f10325a = obj;
    }

    /* renamed from: o */
    public abstract void mo338o(int i4);

    /* renamed from: p */
    public abstract void mo339p(CharSequence charSequence);

    /* renamed from: q */
    public void mo340q(boolean z3) {
        this.f10326b = z3;
    }
}
