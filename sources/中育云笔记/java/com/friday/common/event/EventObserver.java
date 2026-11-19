package com.friday.common.event;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.AbstractC9979u;
import p126e2.C9072a;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 2)
/* loaded from: classes3.dex */
public final class EventObserver<T> implements Observer<C9072a> {

    /* renamed from: c */
    public final InterfaceC9540l f6035c;

    @Override // androidx.lifecycle.Observer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onChanged(C9072a value) {
        AbstractC9979u.m20294g(value, "value");
        Object objM17873a = value.m17873a();
        if (objM17873a != null) {
            this.f6035c.invoke(objM17873a);
        }
    }
}
