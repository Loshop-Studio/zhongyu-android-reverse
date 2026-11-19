package com.friday.common.base;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import sd.AbstractC11117h;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public abstract class BaseViewModel extends ViewModel {

    /* renamed from: a */
    public static final int f5618a = 8;

    /* renamed from: c */
    public static /* synthetic */ void m4802c(BaseViewModel baseViewModel, InterfaceC9544p interfaceC9544p, InterfaceC9544p interfaceC9544p2, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launch");
        }
        if ((i10 & 2) != 0) {
            interfaceC9544p2 = new BaseViewModel$launch$1(null);
        }
        if ((i10 & 4) != 0) {
            interfaceC9529a = new InterfaceC9529a() { // from class: com.friday.common.base.a
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return BaseViewModel.m4803d();
                }
            };
        }
        baseViewModel.m4804b(interfaceC9544p, interfaceC9544p2, interfaceC9529a);
    }

    /* renamed from: d */
    public static final C10786q m4803d() {
        return C10786q.f26013a;
    }

    /* renamed from: b */
    public final void m4804b(InterfaceC9544p block, InterfaceC9544p onError, InterfaceC9529a onComplete) {
        AbstractC9979u.m20294g(block, "block");
        AbstractC9979u.m20294g(onError, "onError");
        AbstractC9979u.m20294g(onComplete, "onComplete");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new BaseViewModel$launch$3(block, onError, onComplete, null), 3, null);
    }
}
