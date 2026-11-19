package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import javax.inject.Inject;
import p135i8.AbstractC8839h;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9271h;
import p169l8.InterfaceC9280q;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class NotifyDataChangedViewModel extends ViewModel {

    /* renamed from: a */
    public final InterfaceC9271h f14310a;

    /* renamed from: b */
    public final InterfaceC9280q f14311b;

    @Inject
    public NotifyDataChangedViewModel() {
        InterfaceC9271h interfaceC9271hM17054a = AbstractC9281r.m17054a(Boolean.FALSE);
        this.f14310a = interfaceC9271hM17054a;
        this.f14311b = AbstractC9268e.m17012b(interfaceC9271hM17054a);
    }

    /* renamed from: b */
    public final InterfaceC9280q m12235b() {
        return this.f14311b;
    }

    /* renamed from: c */
    public final void m12236c(boolean z10) {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new NotifyDataChangedViewModel$setRefreshLessonList$1(this, z10, null), 3, null);
    }
}
