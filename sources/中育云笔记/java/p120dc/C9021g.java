package p120dc;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import p036bc.InterfaceC5186c;
import p151fc.AbstractC9221d;
import p151fc.InterfaceC9219b;
import p392wb.AbstractC11724a;

/* renamed from: dc.g */
/* loaded from: classes6.dex */
public class C9021g implements InterfaceC9219b {

    /* renamed from: c */
    public volatile Object f21006c;

    /* renamed from: d */
    public final Object f21007d = new Object();

    /* renamed from: e */
    public final Fragment f21008e;

    /* renamed from: dc.g$a */
    public interface a {
        /* renamed from: w */
        InterfaceC5186c mo17624w();
    }

    public C9021g(Fragment fragment) {
        this.f21008e = fragment;
    }

    /* renamed from: a */
    private Object m17619a() {
        AbstractC9221d.m18139c(this.f21008e.getHost(), "Hilt Fragments must be attached before creating the component.");
        AbstractC9221d.m18140d(this.f21008e.getHost() instanceof InterfaceC9219b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f21008e.getHost().getClass());
        m17623e(this.f21008e);
        return ((a) AbstractC11724a.m25951a(this.f21008e.getHost(), a.class)).mo17624w().mo2736a(this.f21008e).build();
    }

    /* renamed from: b */
    public static ContextWrapper m17620b(Context context, Fragment fragment) {
        return new C9023i(context, fragment);
    }

    /* renamed from: c */
    public static ContextWrapper m17621c(LayoutInflater layoutInflater, Fragment fragment) {
        return new C9023i(layoutInflater, fragment);
    }

    /* renamed from: d */
    public static final Context m17622d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // p151fc.InterfaceC9219b
    public Object generatedComponent() {
        if (this.f21006c == null) {
            synchronized (this.f21007d) {
                try {
                    if (this.f21006c == null) {
                        this.f21006c = m17619a();
                    }
                } finally {
                }
            }
        }
        return this.f21006c;
    }

    /* renamed from: e */
    public void m17623e(Fragment fragment) {
    }
}
