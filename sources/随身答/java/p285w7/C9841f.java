package p285w7;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import p215p7.AbstractC9337a;
import p265u7.InterfaceC9723c;
import p305y7.AbstractC9967c;
import p305y7.InterfaceC9966b;

/* renamed from: w7.f */
/* loaded from: classes5.dex */
public class C9841f implements InterfaceC9966b {

    /* renamed from: a */
    public volatile Object f17564a;

    /* renamed from: b */
    public final Object f17565b = new Object();

    /* renamed from: c */
    public final Fragment f17566c;

    /* renamed from: w7.f$a */
    public interface a {
        /* renamed from: e */
        InterfaceC9723c mo12817e();
    }

    public C9841f(Fragment fragment) {
        this.f17566c = fragment;
    }

    /* renamed from: a */
    private Object m16772a() {
        AbstractC9967c.m17238b(this.f17566c.getHost(), "Hilt Fragments must be attached before creating the component.");
        AbstractC9967c.m17239c(this.f17566c.getHost() instanceof InterfaceC9966b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f17566c.getHost().getClass());
        m16776e(this.f17566c);
        return ((a) AbstractC9337a.m15247a(this.f17566c.getHost(), a.class)).mo12817e().mo12826a(this.f17566c).build();
    }

    /* renamed from: b */
    public static ContextWrapper m16773b(Context context, Fragment fragment) {
        return new C9843h(context, fragment);
    }

    /* renamed from: c */
    public static ContextWrapper m16774c(LayoutInflater layoutInflater, Fragment fragment) {
        return new C9843h(layoutInflater, fragment);
    }

    /* renamed from: d */
    public static final Context m16775d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // p305y7.InterfaceC9966b
    public Object generatedComponent() {
        if (this.f17564a == null) {
            synchronized (this.f17565b) {
                try {
                    if (this.f17564a == null) {
                        this.f17564a = m16772a();
                    }
                } finally {
                }
            }
        }
        return this.f17564a;
    }

    /* renamed from: e */
    public void m16776e(Fragment fragment) {
    }
}
