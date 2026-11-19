package p133i6;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import p155k6.AbstractC9061c;

/* renamed from: i6.h */
/* loaded from: classes5.dex */
public final class C8766h extends ContextWrapper {

    /* renamed from: a */
    public Fragment f16443a;

    /* renamed from: b */
    public LayoutInflater f16444b;

    /* renamed from: c */
    public LayoutInflater f16445c;

    /* renamed from: d */
    public final LifecycleEventObserver f16446d;

    /* renamed from: i6.h$a */
    public class a implements LifecycleEventObserver {
        public a() {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                C8766h.this.f16443a = null;
                C8766h.this.f16444b = null;
                C8766h.this.f16445c = null;
            }
        }
    }

    public C8766h(Context context, Fragment fragment) {
        super((Context) AbstractC9061c.m15861a(context));
        a aVar = new a();
        this.f16446d = aVar;
        this.f16444b = null;
        Fragment fragment2 = (Fragment) AbstractC9061c.m15861a(fragment);
        this.f16443a = fragment2;
        fragment2.getLifecycle().addObserver(aVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f16445c == null) {
            if (this.f16444b == null) {
                this.f16444b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f16445c = this.f16444b.cloneInContext(this);
        }
        return this.f16445c;
    }

    public C8766h(LayoutInflater layoutInflater, Fragment fragment) {
        super((Context) AbstractC9061c.m15861a(((LayoutInflater) AbstractC9061c.m15861a(layoutInflater)).getContext()));
        a aVar = new a();
        this.f16446d = aVar;
        this.f16444b = layoutInflater;
        Fragment fragment2 = (Fragment) AbstractC9061c.m15861a(fragment);
        this.f16443a = fragment2;
        fragment2.getLifecycle().addObserver(aVar);
    }
}
