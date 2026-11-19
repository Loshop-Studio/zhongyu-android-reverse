package p185x4;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import p199z4.AbstractC7950d;

/* renamed from: x4.j */
/* loaded from: classes4.dex */
public final class C7865j extends ContextWrapper {

    /* renamed from: a */
    public Fragment f10482a;

    /* renamed from: b */
    public LayoutInflater f10483b;

    /* renamed from: c */
    public LayoutInflater f10484c;

    /* renamed from: d */
    public final LifecycleEventObserver f10485d;

    /* renamed from: x4.j$a */
    public class a implements LifecycleEventObserver {
        public a() {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                C7865j.this.f10482a = null;
                C7865j.this.f10483b = null;
                C7865j.this.f10484c = null;
            }
        }
    }

    public C7865j(Context context, Fragment fragment) {
        super((Context) AbstractC7950d.m9746b(context));
        a aVar = new a();
        this.f10485d = aVar;
        this.f10483b = null;
        Fragment fragment2 = (Fragment) AbstractC7950d.m9746b(fragment);
        this.f10482a = fragment2;
        fragment2.getLifecycle().addObserver(aVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f10484c == null) {
            if (this.f10483b == null) {
                this.f10483b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f10484c = this.f10483b.cloneInContext(this);
        }
        return this.f10484c;
    }

    public C7865j(LayoutInflater layoutInflater, Fragment fragment) {
        super((Context) AbstractC7950d.m9746b(((LayoutInflater) AbstractC7950d.m9746b(layoutInflater)).getContext()));
        a aVar = new a();
        this.f10485d = aVar;
        this.f10483b = layoutInflater;
        Fragment fragment2 = (Fragment) AbstractC7950d.m9746b(fragment);
        this.f10482a = fragment2;
        fragment2.getLifecycle().addObserver(aVar);
    }
}
