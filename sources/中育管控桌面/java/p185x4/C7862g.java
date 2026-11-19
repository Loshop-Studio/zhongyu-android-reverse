package p185x4;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import p136q4.AbstractC7625a;
import p171v4.InterfaceC7797c;
import p199z4.AbstractC7950d;
import p199z4.InterfaceC7948b;

/* renamed from: x4.g */
/* loaded from: classes4.dex */
public class C7862g implements InterfaceC7948b {

    /* renamed from: a */
    public volatile Object f10474a;

    /* renamed from: b */
    public final Object f10475b = new Object();

    /* renamed from: c */
    public final Fragment f10476c;

    /* renamed from: x4.g$a */
    public interface a {
        /* renamed from: h */
        InterfaceC7797c mo5219h();
    }

    public C7862g(Fragment fragment) {
        this.f10476c = fragment;
    }

    /* renamed from: a */
    private Object m9536a() {
        AbstractC7950d.m9747c(this.f10476c.getHost(), "Hilt Fragments must be attached before creating the component.");
        AbstractC7950d.m9748d(this.f10476c.getHost() instanceof InterfaceC7948b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f10476c.getHost().getClass());
        m9540e(this.f10476c);
        return ((a) AbstractC7625a.m9065a(this.f10476c.getHost(), a.class)).mo5219h().mo5228a(this.f10476c).build();
    }

    /* renamed from: b */
    public static ContextWrapper m9537b(Context context, Fragment fragment) {
        return new C7865j(context, fragment);
    }

    /* renamed from: c */
    public static ContextWrapper m9538c(LayoutInflater layoutInflater, Fragment fragment) {
        return new C7865j(layoutInflater, fragment);
    }

    /* renamed from: d */
    public static final Context m9539d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // p199z4.InterfaceC7948b
    public Object generatedComponent() {
        if (this.f10474a == null) {
            synchronized (this.f10475b) {
                try {
                    if (this.f10474a == null) {
                        this.f10474a = m9536a();
                    }
                } finally {
                }
            }
        }
        return this.f10474a;
    }

    /* renamed from: e */
    public void m9540e(Fragment fragment) {
    }
}
