package com.friday.document.sync;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.sync.SyncStateOne", m26211f = "SyncStateOne.kt", m26212l = {535, 538}, m26213m = "restoreMissingResourceFromOss")
/* loaded from: classes3.dex */
public final class SyncStateOne$restoreMissingResourceFromOss$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6948c;

    /* renamed from: d */
    public Object f6949d;

    /* renamed from: e */
    public boolean f6950e;

    /* renamed from: f */
    public /* synthetic */ Object f6951f;

    /* renamed from: g */
    public final /* synthetic */ SyncStateOne f6952g;

    /* renamed from: h */
    public int f6953h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncStateOne$restoreMissingResourceFromOss$1(SyncStateOne syncStateOne, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6952g = syncStateOne;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6951f = obj;
        this.f6953h |= Integer.MIN_VALUE;
        return this.f6952g.m5652w(null, null, this);
    }
}
