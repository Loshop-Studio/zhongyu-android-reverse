package p159l8;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import p181n8.AbstractC8672c;

/* renamed from: l8.h */
/* loaded from: classes5.dex */
public final class C8523h extends ContextWrapper {

    /* renamed from: a */
    public Fragment f14150a;

    /* renamed from: b */
    public LayoutInflater f14151b;

    /* renamed from: c */
    public LayoutInflater f14152c;

    /* renamed from: d */
    public final LifecycleEventObserver f14153d;

    /* renamed from: l8.h$a */
    public class a implements LifecycleEventObserver {
        public a() {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                C8523h.this.f14150a = null;
                C8523h.this.f14151b = null;
                C8523h.this.f14152c = null;
            }
        }
    }

    public C8523h(Context context, Fragment fragment) {
        super((Context) AbstractC8672c.m14275a(context));
        a aVar = new a();
        this.f14153d = aVar;
        this.f14151b = null;
        Fragment fragment2 = (Fragment) AbstractC8672c.m14275a(fragment);
        this.f14150a = fragment2;
        fragment2.getLifecycle().addObserver(aVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f14152c == null) {
            if (this.f14151b == null) {
                this.f14151b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f14152c = this.f14151b.cloneInContext(this);
        }
        return this.f14152c;
    }

    public C8523h(LayoutInflater layoutInflater, Fragment fragment) {
        super((Context) AbstractC8672c.m14275a(((LayoutInflater) AbstractC8672c.m14275a(layoutInflater)).getContext()));
        a aVar = new a();
        this.f14153d = aVar;
        this.f14151b = layoutInflater;
        Fragment fragment2 = (Fragment) AbstractC8672c.m14275a(fragment);
        this.f14150a = fragment2;
        fragment2.getLifecycle().addObserver(aVar);
    }
}
