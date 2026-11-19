package com.friday.document.sync;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.sync.SyncStateOne", m26211f = "SyncStateOne.kt", m26212l = {TypedValues.PositionType.TYPE_SIZE_PERCENT, 511, InputDeviceCompat.SOURCE_DPAD}, m26213m = "checkResourceCanUpload")
/* loaded from: classes3.dex */
public final class SyncStateOne$checkResourceCanUpload$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f6924c;

    /* renamed from: d */
    public Object f6925d;

    /* renamed from: e */
    public int f6926e;

    /* renamed from: f */
    public /* synthetic */ Object f6927f;

    /* renamed from: g */
    public final /* synthetic */ SyncStateOne f6928g;

    /* renamed from: h */
    public int f6929h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncStateOne$checkResourceCanUpload$1(SyncStateOne syncStateOne, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f6928g = syncStateOne;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6927f = obj;
        this.f6929h |= Integer.MIN_VALUE;
        return this.f6928g.m5642m(null, null, this);
    }
}
