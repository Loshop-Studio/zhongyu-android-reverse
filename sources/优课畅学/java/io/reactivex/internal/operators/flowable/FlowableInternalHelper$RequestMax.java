package io.reactivex.internal.operators.flowable;

import ba.InterfaceC5219c;
import p299x6.InterfaceC10555c;

/* loaded from: classes5.dex */
public enum FlowableInternalHelper$RequestMax implements InterfaceC10555c {
    INSTANCE;

    @Override // p299x6.InterfaceC10555c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(InterfaceC5219c interfaceC5219c) {
        interfaceC5219c.request(Long.MAX_VALUE);
    }
}
