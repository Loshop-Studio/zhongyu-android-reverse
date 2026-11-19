package p133i6;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import p026b6.AbstractC5208a;
import p111g6.InterfaceC8653c;
import p155k6.AbstractC9061c;
import p155k6.InterfaceC9060b;

/* renamed from: i6.f */
/* loaded from: classes5.dex */
public class C8764f implements InterfaceC9060b {

    /* renamed from: a */
    public volatile Object f16437a;

    /* renamed from: b */
    public final Object f16438b = new Object();

    /* renamed from: c */
    public final Fragment f16439c;

    /* renamed from: i6.f$a */
    public interface a {
        /* renamed from: e */
        InterfaceC8653c mo9809e();
    }

    public C8764f(Fragment fragment) {
        this.f16439c = fragment;
    }

    /* renamed from: a */
    private Object m14469a() {
        AbstractC9061c.m15862b(this.f16439c.getHost(), "Hilt Fragments must be attached before creating the component.");
        AbstractC9061c.m15863c(this.f16439c.getHost() instanceof InterfaceC9060b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f16439c.getHost().getClass());
        m14473e(this.f16439c);
        return ((a) AbstractC5208a.m2103a(this.f16439c.getHost(), a.class)).mo9809e().mo9819a(this.f16439c).build();
    }

    /* renamed from: b */
    public static ContextWrapper m14470b(Context context, Fragment fragment) {
        return new C8766h(context, fragment);
    }

    /* renamed from: c */
    public static ContextWrapper m14471c(LayoutInflater layoutInflater, Fragment fragment) {
        return new C8766h(layoutInflater, fragment);
    }

    /* renamed from: d */
    public static final Context m14472d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // p155k6.InterfaceC9060b
    public Object generatedComponent() {
        if (this.f16437a == null) {
            synchronized (this.f16438b) {
                try {
                    if (this.f16437a == null) {
                        this.f16437a = m14469a();
                    }
                } finally {
                }
            }
        }
        return this.f16437a;
    }

    /* renamed from: e */
    public void m14473e(Fragment fragment) {
    }
}
