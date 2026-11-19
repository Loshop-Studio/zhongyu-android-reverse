package p159l8;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import p080e8.AbstractC7415a;
import p135j8.InterfaceC7817c;
import p181n8.AbstractC8672c;
import p181n8.InterfaceC8671b;

/* renamed from: l8.f */
/* loaded from: classes5.dex */
public class C8521f implements InterfaceC8671b {

    /* renamed from: a */
    public volatile Object f14144a;

    /* renamed from: b */
    public final Object f14145b = new Object();

    /* renamed from: c */
    public final Fragment f14146c;

    /* renamed from: l8.f$a */
    public interface a {
        /* renamed from: e */
        InterfaceC7817c mo13474e();
    }

    public C8521f(Fragment fragment) {
        this.f14146c = fragment;
    }

    /* renamed from: a */
    private Object m14005a() {
        AbstractC8672c.m14276b(this.f14146c.getHost(), "Hilt Fragments must be attached before creating the component.");
        AbstractC8672c.m14277c(this.f14146c.getHost() instanceof InterfaceC8671b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f14146c.getHost().getClass());
        m14009e(this.f14146c);
        return ((a) AbstractC7415a.m11910a(this.f14146c.getHost(), a.class)).mo13474e().mo13242a(this.f14146c).build();
    }

    /* renamed from: b */
    public static ContextWrapper m14006b(Context context, Fragment fragment) {
        return new C8523h(context, fragment);
    }

    /* renamed from: c */
    public static ContextWrapper m14007c(LayoutInflater layoutInflater, Fragment fragment) {
        return new C8523h(layoutInflater, fragment);
    }

    /* renamed from: d */
    public static final Context m14008d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // p181n8.InterfaceC8671b
    public Object generatedComponent() {
        if (this.f14144a == null) {
            synchronized (this.f14145b) {
                try {
                    if (this.f14144a == null) {
                        this.f14144a = m14005a();
                    }
                } finally {
                }
            }
        }
        return this.f14144a;
    }

    /* renamed from: e */
    public void m14009e(Fragment fragment) {
    }
}
