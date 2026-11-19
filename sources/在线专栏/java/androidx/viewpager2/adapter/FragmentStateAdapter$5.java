package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.AbstractC0496f;
import androidx.lifecycle.InterfaceC0501i;
import androidx.lifecycle.InterfaceC0504l;

/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements InterfaceC0501i {

    /* renamed from: a */
    final /* synthetic */ Handler f4663a;

    /* renamed from: b */
    final /* synthetic */ Runnable f4664b;

    @Override // androidx.lifecycle.InterfaceC0501i
    /* renamed from: d */
    public void mo63d(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar) {
        if (bVar == AbstractC0496f.b.ON_DESTROY) {
            this.f4663a.removeCallbacks(this.f4664b);
            interfaceC0504l.getLifecycle().mo2869c(this);
        }
    }
}
