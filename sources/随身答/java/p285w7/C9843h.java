package p285w7;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import p305y7.AbstractC9967c;

/* renamed from: w7.h */
/* loaded from: classes5.dex */
public final class C9843h extends ContextWrapper {

    /* renamed from: a */
    public Fragment f17570a;

    /* renamed from: b */
    public LayoutInflater f17571b;

    /* renamed from: c */
    public LayoutInflater f17572c;

    /* renamed from: d */
    public final LifecycleEventObserver f17573d;

    /* renamed from: w7.h$a */
    public class a implements LifecycleEventObserver {
        public a() {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                C9843h.this.f17570a = null;
                C9843h.this.f17571b = null;
                C9843h.this.f17572c = null;
            }
        }
    }

    public C9843h(Context context, Fragment fragment) {
        super((Context) AbstractC9967c.m17237a(context));
        a aVar = new a();
        this.f17573d = aVar;
        this.f17571b = null;
        Fragment fragment2 = (Fragment) AbstractC9967c.m17237a(fragment);
        this.f17570a = fragment2;
        fragment2.getLifecycle().addObserver(aVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f17572c == null) {
            if (this.f17571b == null) {
                this.f17571b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f17572c = this.f17571b.cloneInContext(this);
        }
        return this.f17572c;
    }

    public C9843h(LayoutInflater layoutInflater, Fragment fragment) {
        super((Context) AbstractC9967c.m17237a(((LayoutInflater) AbstractC9967c.m17237a(layoutInflater)).getContext()));
        a aVar = new a();
        this.f17573d = aVar;
        this.f17571b = layoutInflater;
        Fragment fragment2 = (Fragment) AbstractC9967c.m17237a(fragment);
        this.f17570a = fragment2;
        fragment2.getLifecycle().addObserver(aVar);
    }
}
