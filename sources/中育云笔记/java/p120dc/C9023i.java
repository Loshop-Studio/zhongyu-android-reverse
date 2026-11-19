package p120dc;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import p151fc.AbstractC9221d;

/* renamed from: dc.i */
/* loaded from: classes6.dex */
public final class C9023i extends ContextWrapper {

    /* renamed from: a */
    public Fragment f21012a;

    /* renamed from: b */
    public LayoutInflater f21013b;

    /* renamed from: c */
    public LayoutInflater f21014c;

    /* renamed from: d */
    public final LifecycleEventObserver f21015d;

    /* renamed from: dc.i$a */
    public class a implements LifecycleEventObserver {
        public a() {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                C9023i.this.f21012a = null;
                C9023i.this.f21013b = null;
                C9023i.this.f21014c = null;
            }
        }
    }

    public C9023i(Context context, Fragment fragment) {
        super((Context) AbstractC9221d.m18138b(context));
        a aVar = new a();
        this.f21015d = aVar;
        this.f21013b = null;
        Fragment fragment2 = (Fragment) AbstractC9221d.m18138b(fragment);
        this.f21012a = fragment2;
        fragment2.getLifecycle().addObserver(aVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f21014c == null) {
            if (this.f21013b == null) {
                this.f21013b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f21014c = this.f21013b.cloneInContext(this);
        }
        return this.f21014c;
    }

    public C9023i(LayoutInflater layoutInflater, Fragment fragment) {
        super((Context) AbstractC9221d.m18138b(((LayoutInflater) AbstractC9221d.m18138b(layoutInflater)).getContext()));
        a aVar = new a();
        this.f21015d = aVar;
        this.f21013b = layoutInflater;
        Fragment fragment2 = (Fragment) AbstractC9221d.m18138b(fragment);
        this.f21012a = fragment2;
        fragment2.getLifecycle().addObserver(aVar);
    }
}
